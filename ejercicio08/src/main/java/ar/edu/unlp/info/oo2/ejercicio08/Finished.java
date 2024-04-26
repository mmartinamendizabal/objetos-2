package ar.edu.unlp.info.oo2.ejercicio08;

import java.time.Duration;
import java.time.LocalDateTime;

public class Finished extends State{

	public Finished(ToDoItem task) {
		super(task);
		this.getTask().setEnd(LocalDateTime.now());
	}

	@Override
	public void start() {	
	}

	@Override
	public void togglePause() {
		throw new RuntimeException("Error: The task cannot be paused or unpaused because it has already finished");
	}

	@Override
	public void finish() {	
	}
	
	@Override
	public Duration workedTime() {
		return Duration.between(this.getTask().getStart(),this.getTask().getEnd());
	}
	
	@Override
	public void addComment(String comment) {
		
	}
}
