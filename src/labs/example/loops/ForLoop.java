package labs.example.loops;

public class ForLoop{
    public static void main(String[] args){
        executeForLoop();
    }

    private static void executeForLoop(){
        for (int counter = 0; counter < 20; counter++){
            System.out.println("Counter value: " + counter);
        }
    }

}