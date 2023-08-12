import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        System.out.println("Welcome to AK Showroom");
        Scanner s=new Scanner(System.in);
        System.out.println("What is your preference 2 wheeler or 4 wheeler:-");
        String vehicle=s.nextLine();
//        System.out.println(vehicle);
        if(vehicle.equals("2 wheeler")) {
            System.out.println("Select the company:-Hero and Royal Enfield");
            String cname = s.nextLine();
            if (cname.equals("Hero")) {
                System.out.println("Select the bike:-hero HF Deluxe   and   hero splendor plus XTEC ");
                String bike = s.nextLine();
                if (bike.equals("hero HF Deluxe")) {
                    System.out.println("Bike-hero HF Deluxe");
                    System.out.println("Price-62000");
                    System.out.println("Mileage-70Kmpl");
                } else if (bike.equals("hero splendor plus XTEC")) {
                    System.out.println("hero splendor plus XTEC ");
                    System.out.println("Price-80000");
                    System.out.println("Mileage-83Kmpl");
                } else {
                    System.out.println("Bike is not available.");
                }
            }
            else if (cname.equals("Royal Enfield")) {
                System.out.println("Select the bike:-royal enfield classic 350   and   royal enfield bullet 350");
                String bike = s.nextLine();
                if (bike.equals("royal enfield classic 350")) {
                    System.out.println("royal enfield classic 350");
                    System.out.println("Price-2 Lakh");
                    System.out.println("Mileage-35Kmpl");
                } else if (bike.equals("royal enfield bullet 350")) {
                    System.out.println("royal enfield bullet 350 ");
                    System.out.println("Price-1.7 Lakh");
                    System.out.println("Mileage-37Kmpl");
                } else {
                    System.out.println("Bike is not available.");
                }
            }
            else{
                System.out.println("This company is not available.");
            }
        }
        else if(vehicle.equals("4 wheeler")){
            System.out.println("Select the company:-Honda  and   Tesla");
            String cname = s.nextLine();
            if (cname.equals("Honda")) {
                System.out.println("Select the car:-honda amaze  and   honda jazz ");
                String bike = s.nextLine();
                if (bike.equals("honda amaze")) {
                    System.out.println("honda amaze");
                    System.out.println("Price-6.22 Lakhs");
                    System.out.println("Mileage-18Kmpl");
                } else if (bike.equals("honda jazz")) {
                    System.out.println("honda jazz ");
                    System.out.println("Price-7.65 Lakhs");
                    System.out.println("Mileage-17Kmpl");
                } else {
                    System.out.println("car is not available.");
                }
            }
            else if (cname.equals("Tesla")) {
                System.out.println("Select the car:- tesla model s  and  tesla model x");
                String bike = s.nextLine();
                if (bike.equals("tesla model s")) {
                    System.out.println("tesla model s");
                    System.out.println("Price-70 Lakh");
                    System.out.println("Mileage-405 miles at full charge");
                } else if (bike.equals("tesla model x")) {
                    System.out.println("tesla model x");
                    System.out.println("Price-2 crore");
                    System.out.println("Mileage-348 miles at full charge");
                } else {
                    System.out.println("car is not available.");
                }
            }
            else{
                System.out.println("This company is not available.");
            }
        }
    }
}