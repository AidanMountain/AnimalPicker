import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to see a dog or a cat?");
        String animal = scanner.nextLine();

        if(animal == "cat"){
            System.out.println("INSTER CAT ASCII HERE");
        }
        else if(animal == "dog"){
            System.out.println("INSTER DOG ASCII HERE");
        }
    }

}