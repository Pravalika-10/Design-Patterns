package com.example.mainClass;

import com.example.phone.Android;
import com.example.phone.IOS;
import com.example.phone.OS;
import com.example.phone.OSFactory;

public class DriverClass
{
        public static void main(String args[])
        {
                OSFactory osFactory = new OSFactory();
                OS obj = osFactory.getInstance("Closed");
                obj.specs();

        }
}
