//Made by Matt Naganidhi 27 December 2021

import java.util.Scanner;

public class CountingProject
{


    public static void main(String[] args)
    {
        int lineCount = 0;

        Scanner scanIn = new Scanner(System.in);  // Create a Scanner object
        //loop
        while (true)
        {
            try
            {//check to see if the input is valid
                System.out.println("Enter X1 for start of Line 1: (type DONE to exit)");
                String xco1 = scanIn.next();
                if (xco1.compareToIgnoreCase("DONE") == 0)
                    break;
                try
                {
                    int xcoordinate1 = Integer.parseInt(xco1);
                }
                catch (NumberFormatException nfe)
                {//makes user retype input if invalid
                    System.out.println("Invalid input, please try entering it again");
                    continue;
                }

                System.out.println("Enter Y1 for start of Line 1:");
                int ycoordinate1 = scanIn.nextInt();
                System.out.println("Enter X2 for start of Line 1:");
                int xcoordinate2 = scanIn.nextInt();
                System.out.println("Enter Y2 for start of Line 1:");
                lineCount ++;
                int ycoordinate2 = scanIn.nextInt();
                System.out.println("Enter X1 for start of Line 2:");
                int xcoordinate3 = scanIn.nextInt();
                System.out.println("Enter Y1 for start of Line 2:");
                int ycoordinate3 = scanIn.nextInt();
                System.out.println("Enter X2 for start of Line 2:");
                int xcoordinate4 = scanIn.nextInt();
                System.out.println("Enter Y2 for start of Line 2:");
                int ycoordinate4 = scanIn.nextInt();
                lineCount ++;


                System.out.println("Amount of lines so far:" + lineCount );


            }
            catch (Exception e)
            {
                System.out.println("Invalid input");
                continue;
            }
        }
        System.out.println("Number of lines in total:"+ lineCount);

    }
}

