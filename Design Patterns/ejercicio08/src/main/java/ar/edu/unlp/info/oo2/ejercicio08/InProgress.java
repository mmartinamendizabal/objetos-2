package ar.edu.unlp.info.oo2.ejercicio08;


public class InProgress extends State{

	public InProgress(ToDoItem task) {
		super(task);
	}

	@Override
	public void start() {
	}

	@Override
	public void togglePause() {
		this.getTask().setState(new Paused(this.getTask()));
	}

	@Override
	public void finish() {
		this.getTask().setState(new Finished(this.getTask())); 
	}

}
