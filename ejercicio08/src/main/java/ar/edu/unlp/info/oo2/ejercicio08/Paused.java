package ar.edu.unlp.info.oo2.ejercicio08;


public class Paused extends State{

	public Paused(ToDoItem task) {
		super(task);
	}

	@Override
	public void start() {
		
	}

	@Override
	public void togglePause() {
		this.getTask().setState(new InProgress(this.getTask()));
		
	}

	@Override
	public void finish() {
		this.getTask().setState(new Finished(this.getTask())); 
	}

}
