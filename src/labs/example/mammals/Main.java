package labs.example.mammals;

public class Main {
    public static void main(String[] args){
        Mammal mammal = new Mammal("land");
        mammal.sit();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The mammal is no longer sitting.");
    }
}