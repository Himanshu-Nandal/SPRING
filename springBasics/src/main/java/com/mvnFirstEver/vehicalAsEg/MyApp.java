package com.mvnFirstEver.vehicalAsEg;

/**
 * WITHOUT SPRING
 */
public class MyApp 
{
    public static void main( String[] args )
    {
        Vehicle vehicleObj = new Car();
        String mileage = vehicleObj.getMileage();
        System.out.println(mileage);
    }
}