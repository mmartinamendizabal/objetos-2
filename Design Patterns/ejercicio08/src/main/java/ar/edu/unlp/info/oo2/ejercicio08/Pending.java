package ar.edu.unlp.info.oo2.ejercicio08;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending extends State{
	

	public Pending(ToDoItem task) {
		super(task);
	}

	@Override
	public void start() {
		this.getTask().setState(new InProgress(this.getTask()));
		this.getTask().setStart(LocalDateTime.now());
	}

	@Override
	public void togglePause() {
		throw new RuntimeException("Error: The task cannot be paused or unpaused because it has never started");
	}

	@Override
	public void finish() {
	}
	
	@Override
	public Duration workedTime() {
		throw new RuntimeException("Error: The task hs never started");
	}

}
