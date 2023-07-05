import java.util.Scanner;
import java.lang.Math;

public class Guessnumber1{
  public static void main(String[] args) {
    int answer = (int)(Math.random() * 100) + 1;
    int k = 5;
    Scanner input = new Scanner(System.in);
    boolean correct = false;
    System.out.println("I'm thinking of a number between 1 and 100.\nYou have "+k+" tries to guess the number.");
    while (k > 0) {
      System.out.println("Enter your guess: ");
     int guess = input.nextInt();
      if (guess == answer) {
        System.out.println("You guessed the number!\nYou win!");
        correct=true;
        System.out.println("\nWell Done!! Your score is "+(k-1));
        break;
      }
      else if (guess > answer) {
        System.out.println("Your guess is too high.\nYou have " + (k-1) + " tries left.");
       
      }
      else {
        System.out.println("Your guess is too low.\nYou have " + (k-1) + " tries left.");
     
      }
      k--;
  
    }
    if(correct==false){
    System.out.println("You ran out of tries.\nYou lose!");
    System.out.println("\nOops! your score is "+k);
    }
  }
}
