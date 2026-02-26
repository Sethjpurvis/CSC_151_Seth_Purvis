package labs.example.loops;

public class ForLoop{
    public static void main(String[] args){
        executeForLoop();
    }

    private static void executeForLoop(){
        for (int counter = 0; counter < 20; counter++){
            System.out.println("Counter value: " + counter); //sum++
        }
    }

    public static int sumTwoNumbers(int int1, int int2){
        return int1 + int2; 
    }

    public static int sumLoopCounter(int int1){
        int sum=0;
        for (int counter = 0; counter >= int1; counter++){
            System.out.println(sum + counter);
        }
        return sum;
    }

    public static void printMultipicationTable(int int1){
        
        for(int i = 0; i <= 12; i++)
        {
            System.out.println(int1  +" * " + i + " = " + int1*i);
        }

    }
//int sum = --ForLoop.SumTwoNumbers(x , y);
}