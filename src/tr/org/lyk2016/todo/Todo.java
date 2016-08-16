package tr.org.lyk2016.todo;

public class Todo {

	private String description;
	private boolean done;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public Todo(String description) {
		super();
		this.description = description;
	}
	
	public String getCheckbox(){
		return done ? "☑" : "☐";
	}

}
