import java.util.Scanner;

public class tempConvertor {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base unit. \nUse \'K\' for Kelvin,\'C\' for Degree Celsius,\'F\' for Degree Fahrenheit.");

        // receive input as base unit from the user
        String base_unit = input.nextLine();


        //receive the temperature value from user
        System.out.println("Enter Temperature Value.");
        double Temperature = input.nextDouble();


        System.out.println("Enter the unit to convert to. \nUse \'K\' for Kelvin,\'C\' for Degree Celsius,\'F\' for Degree Fahrenheit.");

        // receive input as conversion unit from the user
        Scanner input2 = new Scanner(System.in);
        String conv_unit = input2.nextLine();


        if (base_unit.equals("K")) {
            switch (conv_unit) {
                case ("C"):
                    double K2C = Temperature - 273.15;
                    System.out.println(Temperature + " Kelvin equals "+K2C+" Degree Celsius.");
                    break;

                case ("F"):
                    double K2F = ((Temperature - 273.15) * 1.8) + 32;
                    System.out.println(Temperature + " Kelvin equals "+K2F+" Degree Fahrenheit.");
                    break;

            }
        } else if (base_unit.equals("C")) {
            switch (conv_unit) {
                case ("K"):
                    double C2K = Temperature + 273.15;
                    System.out.println(Temperature + " Degree Celsius equals "+C2K+" Kelvin.");
                    break;

                case ("F"):
                    double C2F = (Temperature * 1.8) + 32;
                    System.out.println(Temperature + " Degree Celsius equals "+C2F+ " Degree Fahrenheit.");
                    break;
            }
        } else if (base_unit.equals("F")) {
            float newconst = 5/9f;
            switch (conv_unit){
                case ("C"):
                    double F2C= (Temperature-32)*newconst;
                    System.out.println(Temperature + " Degree Fahrenheit equals "+F2C+ " Celsius.");
                    break;

                case ("K"):
                    double F2K = ((Temperature-32)*newconst)+273.15;
                    System.out.println(Temperature + " Degree Fahrenheit equals "+F2K+" Kelvin.");
                    break;

        }

    }
    }
}



