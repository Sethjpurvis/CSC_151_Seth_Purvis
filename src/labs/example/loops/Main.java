package labs.example.loops;

public class Main {
    public static void main(String[] args) {
    //int sum;
    int int1= 2354;
    int int2=567;
    int loopNum = 9;

    int returnedSum = ForLoop.sumTwoNumbers(int1, int2);

    //int x = --returnedSum;
    System.out.println(--returnedSum); 

    System.out.println("The sum of the loop counter is: " + ForLoop.sumLoopCounter(loopNum));
    
    ForLoop.printMultipicationTable(loopNum);

    }
}
