import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("What is your first name?");
    String fname = keyboard.nextLine();
    System.out.println("What is your last name?");
    String lname = keyboard.nextLine();
    System.out.println("What is your favorie animal?");
    String favoriteAnimal = keyboard.nextLine();
    System.out.println("What is your favorite food?");
    String favoriteFood = keyboard.nextLine();
    System.out.println("What is your favorite song?");
    String favoriteSong = keyboard.nextLine();
    System.out.println(" My name is " + fname + " " + lname);
    System.out.println(" My favorite animal is " + favoriteAnimal);
    System.out.println(" My favorite food is " + favoriteFood);
    System.out.println(" My favorite song is " + favoriteSong);
    System.out.println("Thank you for Answering!");

    //TODO prompt the user to get input for all of the String variables.

    //TODO print the output formatted to look like the expected output using String concatenation.

  }
}