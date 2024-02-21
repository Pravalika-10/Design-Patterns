package com.example.phone;

public class OSFactory
{
        public OS getInstance(String type)
        {
                if(type.equalsIgnoreCase("OPen"))
                {
                        return new Android();
                }
                else if (type.equalsIgnoreCase("Closed"))
                {
                        return new IOS();
                }
                else
                {
                        return new Windows();
                }
        }
}
