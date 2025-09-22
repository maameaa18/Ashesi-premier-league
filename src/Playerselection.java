import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name;
        int age;
        double height;
        double weight;
        int Jerseynumber;
        String position;
        boolean isattacker;
        String category;
        boolean iseligible;
        String lineupdecision;
        String finaldecision;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter your height in cm: ");
        height = input.nextDouble();
        System.out.print("Enter your weightin kg: ");
        height = input.nextDouble();
        System.out.print("Enter your Jerseynumber: ");
        Jerseynumber = input.nextInt();
        System.out.print("Enter your position: ");
        position = input.next();
        if (position.equalsIgnoreCase("Attacker")) {
            isattacker = true;
        }else {
            isattacker = false;
        }
                if(age<18) {
                    category = "Youth";
                }else if(age<=35) {
                    category = "Adult";
                }else {
                    category = "veteran";
                }
                iseligible=(age>=18&&age<=35);
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
                 finaldecision(iseligible?"Play":"Rest");

                System.out.println("Player report");

                System.out.println("Name: "+name);

                System.out.println("Age: "+age);

                System.out.println("Height: "+height);

                System.out.println("weight"+weight);

                System.out.println("Jerseynumber: "+Jerseynumber);

                System.out.println("Position: "+position);

                System.out.println("isattacker: "+isattacker);

                System.out.println("category: "+category);

                System.out.println("iseligible: "+iseligible);

                System.out.println("lineupdecision: "+lineupdecision);

                System.out.println("finaldecision: "+finaldecision);
        public static void fallthrough(int jerseynumber){
                    System.out.println("Jerseynumber: "+jerseynumber);
                    switch(jerseynumber){
                        case 9:
                            System.out.println("striker");
                        case 10:
                            System.out.println("playmaker");
                        default:
                            System.out.println("player position not known");

                    }



        }
    }
}