package com;

import java.io.*;

public class Assignment // class name here, same as file name
{
    public Assignment() throws Exception
    {

    }

    public static void DoIt()
    {

        try
        {
            int xIn = 0;
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        for (int x = 0; x < 3; x++)
        {                
             System.out.print("Enter a number: ");
             xIn = Integer.parseInt(input.readLine());

             int iSquare = xIn * xIn;
             int iCube = iSquare * xIn;

             System.out.println(x == 0 ? " Your number squared is ("+ iSquare + ") your number cubed is (" + iCube: ") Your number squared is (" + iSquare+ ") your number cubed is (" + iCube + ")");
        }

        }
        catch (NumberFormatException e)
        {
            System.out.print("The character's you entered are not integers.. this application will now close. ");
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e)
        {
            System.out.print("There was an IOException.. this application will now close. ");
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws Exception
    {
    Assignment.DoIt();
    }
}