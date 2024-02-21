package com.example.model;

public class PhoneBuilder implements Builder
{
        private String OS;
        private String processor;
        private double screenSize;
        private int battery;
        private int camera;

        public PhoneBuilder setOS(String OS) {
                this.OS = OS;
                return this;
        }

        public PhoneBuilder setProcessor(String processor) {
                this.processor = processor;
                return this;
        }

        public PhoneBuilder setScreenSize(double screenSize) {
                this.screenSize = screenSize;
                return this;
        }

        public PhoneBuilder setBattery(int battery) {
                this.battery = battery;
                return this;
        }

        public PhoneBuilder setCamera(int camera) {
               this.camera = camera;
               return this;
        }

        public Phone getPhone()
        {
                return new Phone(OS, processor, screenSize, battery, camera);
        }


}
