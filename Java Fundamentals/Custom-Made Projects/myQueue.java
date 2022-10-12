package projetosFuncionais;

import java.util.*;

public class myQueue {
	//queue structure
		public static void main(String[]args) {
			
			Queue<String> queue = new LinkedList<String>();
			Scanner input = new Scanner(System.in);
				do {
					System.out.println("Insert a value: ");
					queue.add(input.next());
				}while(queue.size() < 2);
				System.out.println("queue size before the methods : "+queue.size());
				while(true){ 
					System.out.println("Would you like to add to, or remove the first element?");
					String answer = new String(input.next());
					if(answer.equals("add")) {
						System.out.println("Insert a value: ");
						queue.add(input.next());
						System.out.println("Queue size: "+queue.size());
					}else if(answer.equals("remove")) {
						queue.remove();
						System.out.println("Queue size: "+queue.size());
					}else {
						break;
					}
				}System.out.println(queue);
			input.close();
		}
}
