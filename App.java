import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        double length;
        double newLength;
        int choice;
        boolean run = true;

        while(run){

        System.out.println("This is a conversion application");
        System.out.println("Option 1: kg to lbs");
        System.out.println("Option 2: grams to ounces");
        System.out.println("Option 3: km to miles");
        System.out.println("Option 4: mm to inch");
        System.out.println("Option -1: exit");
        System.out.print("choose an option: ");

        choice = scanner.nextInt();

       if(choice == 1){
        System.out.print("Enter a weight in kg: ");
        weight = scanner.nextDouble();
        newWeight = weight * 2.20462;
        System.out.printf("Your weight in lbs is %.2flbs\n", newWeight);
       }

       else if(choice == 2){
        System.out.print("Enter your weight grams: ");
        weight = scanner.nextDouble();
        newWeight = weight * 0.035274;
        System.out.printf("Your weight in ounces is %.2foz\n", newWeight);
       }

       else if(choice == 3){
        System.out.print("Enter your distance in Km: ");
        length = scanner.nextDouble();
        newLength = length * 0.621371;
        System.out.printf("Your distance in miles is %.2fm\n", newLength);
       }

       else if(choice == 4){
        System.out.print("Enter your length in mm: ");
        length = scanner.nextDouble();
        newLength = length * 0.0393701;
        System.out.printf("Your new length in inches is %.2fin\n", newLength);
       }

       else if(choice == -1){
        System.out.println("Thank you for your service goodbye!");
        run = false;

       }

       else{
        System.out.println("Not a valid choice type 1, 2, 3, 4, or -1");
       }

     
       }
       scanner.close();
    
    

    }
    }

