/*
Enter a noun: dog
Enter a verb: walk
Enter an adjective: blue
Enter an adverb: quickly
Do you walk your blue dog quickly? That's hilarious!
*/

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Luis Andres Acosta Mejia
 */

import java.util.*;

public class App {
    public static void main(String[] args) {
        //Now we start to declare the variables that are going to be using for this program
        String noun;
        String verb;
        String adjective;
        String adverb;

        Scanner in = new Scanner(System.in); //Here is the method scanner declared

        System.out.print("Enter a noun: ");
        noun = in.next(); //Now we are going to input the strings

        System.out.print("Enter a verb: ");
        verb = in.next(); //Enter vern

        System.out.print("Enter an adjective: ");
        adjective = in.next(); //Enter adjective

        System.out.print("Enter an adverb: ");
        adverb = in.next(); //Enter adverb

        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
        //Now we are printing the results.
    }
}
