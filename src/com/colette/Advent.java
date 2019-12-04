package com.colette;

import java.io.*;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class Advent {

    public static void main(String[] args) {
	    System.out.println("hello world");
	    //calculateFuel()
        //checkOpCode

    }
    public static void checkOPCode()
    {
        List list = Arrays.asList(1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,1,13,19,1,9,19,23,2,13,23,27,
                2,27,13,31,2,31,10,35,1,6,35,39,1,5,39,43,1,10,43,47,1,5,47,51,1,13,51,
                55,2,55,9,59,1,6,59,63,1,13,63,67,1,6,67,71,1,71,10,75,2,13,75,79,1,5,79,
                83,2,83,6,87,1,6,87,91,1,91,13,95,1,95,13,99,2,99,13,103,1,103,5,107,2,107,
                10,111,1,5,111,115,1,2,115,119,1,119,6,0,99,2,0,14,0);

    }
    public static void calculateFuel()throws FileNotFoundException, IOException {
        FileInputStream fis = getFileInputStream("/Users/colette/IdeaProjects/advent1/src/com/colette/input.txt");
        System.out.println("Total file size to read (in bytes) : "
                + fis.available());
        BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
        String thisLine = null;
        int total = 0;
        while ((thisLine = reader.readLine() )!= null)
        {
            int mass = Integer.parseInt(thisLine);
            total += getFuelForInitialAndFuel(mass);

        }
        System.out.println(total);
    }
    public static int getFuelForInitialAndFuel(int mass)
    {
        int firstFuel = getFuelForMass(mass);
        int fuelForFuel = getFuelForFuel(firstFuel);
        return firstFuel + fuelForFuel;
    }
    public static int getFuelForFuel(int fuel){
        boolean fuelReachedZero = false;
        int total = 0;
        int newFuel = fuel;
        while (newFuel >= 0)
        {
            int newResult = getFuelForMass( newFuel);
            if (newResult > 0){
                total += newResult;

            }
            newFuel = newResult;

        }
        return total;
    }
    public static int getFuelForMass(int mass) {
        //create an int

        int massDividedByThree = mass/3;
        return massDividedByThree - 2;

    }

    private static FileInputStream getFileInputStream(String fileName) throws IOException
    {
        File file = new File(fileName);
       return new FileInputStream(file);
    }

}

