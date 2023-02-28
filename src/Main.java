import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to see a dog or a cat?");
        String animal = scanner.nextLine();
        System.out.println(animal);
        if(animal.equals("cat")){
            System.out.println("INSTERT CAT ASCII HERE");
        }
        else if(animal.equals("dog")){
            System.out.println("INSTERT DOG ASCII HERE");
        }
    }

}