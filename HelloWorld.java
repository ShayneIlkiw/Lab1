public class HelloWorld 
{
 public static void main(String[] args) 
    {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");

        // MyAgeIs code
        int currentYear;
        int yearOfBirth;
        int age;

        currentYear = 2020;
        yearOfBirth = 2000;
        age = (currentYear - yearOfBirth);

        System.out.println ("Your age is " + age);

        // Units of distance code
        double meters;
        double metersToFeet;

        meters = 10;
        metersToFeet = (meters * 3.281);
       
        System.out.println ("The distance in feet is " + metersToFeet);

        // Currency conversion code

        int cad;
        double usd;
        double eur;

        cad = 10;
        usd = (cad * 0.75);
        eur = (cad * 0.68);

        System.out.println ("This amount in CAD is " + cad);
        System.out.println ("This amount in USD is " + usd);
        System.out.println ("This amount in EUR is " + eur); 

    }

}









