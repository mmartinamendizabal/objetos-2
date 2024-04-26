package ar.edu.unlp.info.oo2.ejercicio08;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class State {
	
	private ToDoItem task;
	
	public State (ToDoItem task) {
		this.task = task;
	}
	protected ToDoItem getTask() {
		return this.task;
	}
	
	public abstract void start();
	public abstract void togglePause();
	public abstract void finish();
	
	public Duration workedTime() {
		return Duration.between(this.getTask().getStart(), LocalDateTime.now());
	}
	public void addComment(String comment) {
		this.task.getComments().add(comment);
	}
	

}
