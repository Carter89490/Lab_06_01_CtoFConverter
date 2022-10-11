import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        double celcius = 0;
        double farinheight = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);

        System.out.print("What is the temperature in celcius");

        if(in.hasNextInt())
        {
            celcius = in.nextInt();
            in.nextLine();
            farinheight = celcius * 1.8 + 32;
            System.out.println("The temperature in farinheight is "+ farinheight);

        }
        else
        {
            // Not a double can’t use nextDouble() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("\nYou said the temperature was: " + trash);
        }



    }
}