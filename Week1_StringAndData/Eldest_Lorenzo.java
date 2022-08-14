
/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Eldest_Lorenzo {
    public static void main(String[] args) {
        Ownership.Introduction();

        String name;
        String species;
        String sex;
        String age;
        String again;
        int i = 0;

        ArrayList<ArrayList<String>> dogList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter dog's name\t: ");
            name = input.nextLine();
            System.out.print("Enter dog's species\t: ");
            species = input.nextLine();
            System.out.print("Enter dog's sex (F/M)\t: ");
            sex = input.nextLine();
            if (!sex.equalsIgnoreCase("f") && !sex.equalsIgnoreCase("m")) {
                System.out.println("\nError. Invalid Input. Input either F or M (not case sensitive).\n");
                continue;
            }
            System.out.print("Enter dog's age\t\t: ");
            age = input.nextLine();
            if (Integer.parseInt(age) < 1 || Integer.parseInt(age) > 100) {
                System.out.println("\nError. Invalid Input. Please input a number between 1 and 100.");
                continue;
            }

            dogList.add(new ArrayList<>());
            dogList.get(i).add(name);
            dogList.get(i).add(species);
            dogList.get(i).add(sex);
            dogList.get(i).add(age);
            i++;

            System.out.print("Add another dog? (Y/N)\t: ");
            again = input.nextLine();

            if (again.equalsIgnoreCase("y") || again.equalsIgnoreCase("yes")) {
                System.out.print("\n");
                continue;
            } else {
                break;
            }
        }

        input.close();

        for (int x = 0; x < dogList.size(); x++) {
            for (int y = x + 1; y < dogList.size(); y++) {
                ArrayList<String> tmp;
                if (Integer.parseInt(dogList.get(x).get(3)) > Integer.parseInt(dogList.get(y).get(3))) {
                    tmp = dogList.get(x);
                    dogList.set(x, dogList.get(y));
                    dogList.set(y, tmp);
                }
            }
        }

        for (int index = 0; index < dogList.size(); index++) {
            if (index == 0) {
                System.out.println("\nName\t: " + dogList.get(index).get(0) + "\nSpecies\t: "
                        + dogList.get(index).get(1) + "\nSex\t: " + dogList.get(index).get(2).toUpperCase()
                        + "\nAge\t: "
                        + dogList.get(index).get(3) + " - Youngest\n");
            } else if (index == dogList.size() - 1) {
                System.out.println("\nName\t: " + dogList.get(index).get(0) + "\nSpecies\t: "
                        + dogList.get(index).get(1) + "\nSex\t: " + dogList.get(index).get(2).toUpperCase()
                        + "\nAge\t: "
                        + dogList.get(index).get(3) + " - Eldest\n");
            } else {
                System.out.println("\nName\t: " + dogList.get(index).get(0) + "\nSpecies\t: "
                        + dogList.get(index).get(1) + "\nSex\t: " + dogList.get(index).get(2).toUpperCase()
                        + "\nAge\t: "
                        + dogList.get(index).get(3) + "\n");
            }
        }
    }
}
