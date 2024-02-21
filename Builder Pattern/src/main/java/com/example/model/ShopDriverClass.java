package com.example.model;

public class ShopDriverClass
{
        public static void main(String[] args) {

                Phone phone = new PhoneBuilder().setOS("Android").setCamera(32).setBattery(5000).getPhone();
                System.out.println(phone);


        }
}
