package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;



    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    //Metoda isTaskExecuted powinna zwracać wartość flagi typu boolean (trzeba utworzyć dodatkową zmienną).
    //Wartość flagi powinna być zmieniana w w metodzie executeTask()
    //Po dodaniu flagi w klasach dziedziczących po Task, sprawdź czy wartość flagi jest zmieniana
    //po wykonaniu metody executeTask()

    @Override
    public int executeTask() {
        Boolean taskexecuted = true;
        if(taskexecuted) {
            System.out.println("Buy " + quantity + " " + whatToBuy);
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted(int x) {
        if(x==1) return true;
        else return false;
    }
}
