package queuesandstacks;

import java.util.*;

public class QueuesAndStacks {

    public static void main(String[] args) {
        System.out.println("Ch. 10 Queues by Kevin Bell");
        //variables
        Scanner computerKeyboardInput = new Scanner(System.in);
        String name, removedName;
        int size;
        ArrayDeque<String> namesQueue = new ArrayDeque<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Type a name: ");
            name = computerKeyboardInput.nextLine();
            namesQueue.add(name);
        }  //end for loop     
        System.out.println(namesQueue);
        removedName = namesQueue.remove();
        System.out.println(namesQueue);
        System.out.println(removedName);
        for (int i = 0; i < 1; i++) {
            System.out.print("Type a name: ");
            name = computerKeyboardInput.nextLine();
            namesQueue.add(name);
        }//end for loop
        System.out.println(namesQueue);
        size = namesQueue.size();
        while (!namesQueue.isEmpty()) {
            namesQueue.pop();
            System.out.println(namesQueue);
        } //end while loop 
        System.out.println("");
        System.out.println("Ch. 10 Stacks by Kevin Bell");
        for (int i = 0; i < 3; i++) {
            System.out.print("Type a name: ");
            name = computerKeyboardInput.nextLine();
            namesQueue.push(name);
        }  //end for loop     
        System.out.println(namesQueue);
        removedName = namesQueue.pop();
        System.out.println(namesQueue);
        System.out.println(removedName);
        for (int i = 0; i < 1; i++) {
            System.out.print("Type a name: ");
            name = computerKeyboardInput.nextLine();
            namesQueue.push(name);
        }//end for loop
        System.out.println(namesQueue);
        size = namesQueue.size();
        while (!namesQueue.isEmpty()) {
            namesQueue.pop();
            System.out.println(namesQueue);
        } //end while loop 
    } //end main method
} //end QueuesAndStacks class
