import java.util.*;

public class Nama {
    public static void main(String[] args) {
        String[] data = {"Rich Jie","Sultan","Fadli","Adli"};
        System.out.println(Arrays.toString(data));

        Vector dataVector = new Vector();
        dataVector.add("Vector");


        Stack dataStack = new Stack();
        dataStack.push("Stack");

        Queue<String> dataQueue = new LinkedList<>();
        dataQueue.offer("Queue");

        System.out.println(dataQueue);


    }
}
