import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isValid = true;

        //System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to see a dog or a cat?");
        String animal = scanner.nextLine();
        //System.out.println(animal);
        //while(isValid){
            if(animal.equals("cat")){
                System.out.println("            _       \n" +
                        "   ___ __ _| |_ ___ \n" +
                        "  / __/ _` | __/ __|\n" +
                        " | (_| (_| | |_\\__ \\\n" +
                        "  \\___\\__,_|\\__|___/");
                //animal = scanner.nextLine();
            }
            else if(animal.equals("dog")){
                System.out.println("            _       \n   ___ __ _| |_ ___ \n  / __/ _` | __/ __|\n | (_| (_| | |_\\__ \\\n  \\___\\__,_|\\__|___/");

            }
            else if(!animal.equals("dog") && !animal.equals("cat")) isValid = false;
            while(!isValid){
                System.out.println("ERROR: INVALID INPUT");
                System.out.println("PLEASE ENTER A VALID INPUT");
                isValid = true;
                animal = scanner.nextLine();
            }

        //}

    }

}