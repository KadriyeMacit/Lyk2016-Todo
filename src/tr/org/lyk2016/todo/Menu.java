package tr.org.lyk2016.todo;

import java.util.Iterator;

public class Menu {

	public static void printMenu(){
		
		StringBuilder menu = new StringBuilder(50);
		
		menu.append("TODOs\n");
		menu.append("=====\n");
		menu.append("\n");

		//TODO use TodoHelper's getIterator method here
		// hint: use a while loop
		
	   Iterator<Todo> it = TodoHelper.getIterator();
	   int index=1;

		while(it.hasNext()){
			
				Todo todo = it.next();
				
				menu.append("(");
				
				menu.append(index);
				
				menu.append(") ");
				menu.append(" ");
				
				menu.append(todo.getCheckbox());
				
				menu.append(" ");
				
				menu.append(todo.getDescription());
				
				menu.append("\n");
				
				index++;
}
		
		
		
		menu.append("\n");
		menu.append("MENU\n");
		menu.append("=====\n");
		menu.append("(0) Exit\n");
		menu.append("(1) Add Todo\n");
		menu.append("(2) Mark as done\n");
		menu.append("(3) Remove todo\n");
		menu.append("\n");
		menu.append("Enter your command: ");
		
		System.out.println(menu.toString());
	}
	
}






