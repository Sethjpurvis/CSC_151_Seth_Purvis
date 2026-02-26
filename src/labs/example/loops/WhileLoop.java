package labs.example.loops;

public class WhileLoop {
    public static void main(String[] args){
        executeWhileLoop();
    }

    private static void executeWhileLoop(){
        int counter = 0;            // initiate counter
        while (counter < 10) {      
            counter++;              // increment up 1
        }
        System.out.println("The loop executed " + counter + " times");
        return;
    }
}

