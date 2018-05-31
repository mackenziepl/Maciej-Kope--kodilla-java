package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

public class CrudAppTestSuite {

        private static final String BASE_URL = "https://mackenziepl.github.io/";
        private WebDriver driver;
        private Random generator;

        @Before
        public void initTests() {
            driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
            driver.get(BASE_URL);
            generator = new Random();
        }

        @After
        public void cleanUpAfterTest() {
            driver.close();
        }

        private String createCrudAppTestTask() throws InterruptedException {
            final String XPATH_TASK_NAME = "//form[contains(@action, \"createTask\")]/fieldset[1]/input";
            final String XPATH_TASK_CONTENT = "//form[contains(@action, \"createTask\")]/fieldset[2]/textarea";
            final String XPATH_ADD_BUTTON = "//form[contains(@action, \"createTask\")]/fieldset[3]/button";
            String taskName = "Task number " + generator.nextInt(100000);
            String taskContent = taskName + " content";

            WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
            name.sendKeys(taskName);

            WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
            content.sendKeys(taskContent);

            WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
            addButton.click();
            Thread.sleep(2000);

            return taskName;
        }

        private void sendTestTaskTrello(String taskName) throws InterruptedException {
            driver.navigate().refresh();

            while (!driver.findElement(By.xpath("//select[1]")).isDisplayed()) ;

            driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                    .filter(anyForm ->
                            anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                    .getText().equals(taskName))
                    .forEach(theForm -> {
                        WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                        Select select = new Select(selectElement);
                        select.selectByIndex(1);

                        WebElement buttonCreateCard =
                                theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                        buttonCreateCard.click();
                    });

            Thread.sleep(10000);
            driver.switchTo().alert().accept();
            //Alert alert = driver.switchTo().alert(); alert.accept();
        }


        private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException {
            final String TRELLO_URL = "https://trello.com/login";
            final String TRELLO_BOARDS = "https://trello.com/mack191/boards";
            boolean result = false;
            WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
            driverTrello.get(TRELLO_URL);

            driverTrello.findElement(By.id("user")).sendKeys("mackenziepl@poczta.onet.pl");
            driverTrello.findElement(By.id("password")).sendKeys("kodillaTRELLO");
            driverTrello.findElement(By.id("login")).submit();

            Thread.sleep(10000);

            driverTrello.get(TRELLO_BOARDS);

            String tab = "tablice";
            while (!result) {
                try {
                    Thread.sleep(30000);

                    driverTrello.findElements(By.xpath("//a[@class=\"board-tile\"]")).stream()
                            .filter(aHref -> aHref.findElements(By.xpath(".//span[@title=\"Kodilla Application\"]")).size() >0)
                            .forEach(aHref -> aHref.click());

                    Thread.sleep(30000);

                    result = driverTrello.findElements(By.xpath("//span")).stream()
                            .filter(theSpan -> theSpan.getText().contains(taskName))
                            .collect(Collectors.toList())
                            .size() > 0;

                    //System.out.println(result + " trello");

                    if(result)
                        break;
                } catch (Exception e) {
                    System.out.println("Error");
                }
            }

            Thread.sleep(1000);
            driverTrello.close();

            return result;
        }

        private void deleteCrudAppTestTask(String taskName) throws InterruptedException {

            driver.navigate().refresh();
            while (!driver.findElement(By.xpath("//section[2]")).isDisplayed()) ;

            boolean results = false;
            while (!results) {
                try {
                    Thread.sleep(3000);
                    driver.findElements(By.xpath("//div[@class=\"datatable__tasks-container\"]")).stream()
                            .filter(anyForm ->
                                    anyForm.findElement(By.xpath("//p[@class=\"datatable__field-value\"]"))
                                            .getText().contains(taskName))
                            .forEach(theForm -> theForm.findElement(By.xpath("//div[@class=\"datatable__row-section-wrapper\"]/fieldset[1]/button[4]")).click());

                    Thread.sleep(3000);
                    results = driver.findElements(By.xpath("//div[@class=\"datatable__tasks-container\"]")).stream()
                            .filter(anyForm -> anyForm.findElement(By.xpath("//p[@class=\"datatable__field-value\"]"))
                                    .getText().contains(taskName))
                            .collect(Collectors.toList()).size()==0;

                    //System.out.println(results + " delete");

                    if(results)
                        break;
                } catch (Exception e) {
                    System.out.println("Error");
                }
            }

            Thread.sleep(1000);

//        /html/body/main/section[2]/div/form[3]/fieldset[1]/p
//        /html/body/main/section[2]/div/form[3]/div/fieldset[1]/button[4]
        }

        @Test
        public void shouldCreateTrelloCard() throws InterruptedException {
            String taskName = createCrudAppTestTask();
            sendTestTaskTrello(taskName);
            assertTrue(checkTaskExistsInTrello(taskName));
            deleteCrudAppTestTask(taskName);
        }
}
