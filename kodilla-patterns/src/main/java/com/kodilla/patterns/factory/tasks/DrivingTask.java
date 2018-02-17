package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public int executeTask() {
        Boolean taskexecuted = true;
        if(taskexecuted) {
            System.out.println("Drive using " + using + " to " + where);
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
