package com.example.model;

public class Director
{
        public void buildMac(PhoneBuilder builder)
        {
                builder.setBattery(3000)
                        .setCamera(16)
                        .setOS("MAC")
                        .setProcessor("Qualcomm");
        }

        public void buildAndroid(PhoneBuilder builder)
        {
                builder.setBattery(3000)
                        .setCamera(16)
                        .setOS("Android")
                        .setScreenSize(66.6);
        }
}
