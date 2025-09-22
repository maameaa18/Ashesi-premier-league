import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Playerselection {
    public static void main(String[] args) {
    //Declaration of variables
        String name;
        int age;
        double height;
        double weightinpounds;
        int Jerseynumber;
        String position;
        boolean isattacker;
        String category;
        boolean iseligible=true;
        String lineupdecision;
        String finaldecision;
        final double KILO=0.45359237;
        double weightinkg;
        int roundedweight;
        double heightinmeter;
        final double CENTIMETERS=100;
        double heightincm;
        int roundedheight;
        //accepting input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter your height in meter: ");
        heightinmeter = input.nextDouble();
        heightincm = heightinmeter*CENTIMETERS;
        roundedheight=(int) heightincm;
        System.out.print("Enter your weight in in pounds: ");
        weightinpounds = input.nextDouble();
        weightinkg=weightinpounds*KILO;
        roundedweight=(int)weightinkg;
        System.out.println("your weight in kg is " +roundedweight  + "kg");
        System.out.print("Enter your Jerseynumber: ");
        Jerseynumber = input.nextInt();
        System.out.print("Enter your position: ");
        position = input.next();
        //Checking the category in which the player falls
        if(age<20) {
            category = "Rising star";
        }else
            if(age>=20&&age<=30) {
            category = "prime player";
        }else {
            category = "veteran";
        }
        //checking to see if the player is an attacker
        if (position.equals("Attacker")) {
            isattacker = true;
        }else {
            isattacker = false;
        }
         //checking the eligibility of the player
        if(age<18&&age<=35) {
             System.out.println("You are eligible");
         }
             else {
             System.out.println("You are not eligible");
         }
             //finding the position of nthe player based on their jersey number
        switch(Jerseynumber) {
                 case 1:
                     lineupdecision = "goalkeeper";
                     break;
                 case 2:
                 case 5:
                     lineupdecision = "defender";
                     break;
                 case 6:
                 case 8:
                     lineupdecision = "midfielder";
                     break;
                 case 7:
                 case 11:
                     lineupdecision = "winger";
                     break;
                 case 9:
                     lineupdecision = "striker";
                     break;
                 case 10:
                     lineupdecision = "playmaker";
                     break;
                 default:
                     lineupdecision = "player position not known";
             }
             //checking if the player's category is prime player
        if("Prime player".equals(category)) {
                 if (roundedweight < 80) {
                     System.out.println("You are in the starting line up");
                 } else {
                     System.out.println("You are in the starting line up");
                 }
             }else{
                 System.out.println("You are not in the starting lineup");
             }


//making a final decision to check if the player will play based on their eligibility
             finaldecision=(iseligible?"Play":"Rest");

                System.out.println("Player report");

                System.out.println("Name: "+name);

                System.out.println("Age: "+age);

                System.out.println("Height: "+roundedheight);

                System.out.println("weight:"+roundedweight);

                System.out.println("Jerseynumber: "+Jerseynumber);

                System.out.println("Position: "+position);

                System.out.println("isattacker: "+isattacker);

                System.out.println("category: "+category);

                System.out.println("iseligible: "+iseligible);

                System.out.println("lineupdecision: "+lineupdecision);

                System.out.println("finaldecision: "+finaldecision);

                    }



        }
