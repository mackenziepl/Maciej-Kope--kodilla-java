package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public int executeTask() {
        Boolean taskexecuted = true;
        if(taskexecuted) {
            System.out.println("Paint " + whatToPaint + " in " + color);
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
