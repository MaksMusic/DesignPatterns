package Builder;

public class Smartphone {
    private String model;
    private double price;
    private String yearOfCreateCompany;
    private double memory;
    private String numberPhone;

    public static class Builder{
        private String model;
        private double price;
        private String yearOfCreateCompany;
        private double memory;
        private String numberPhone;

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setYearOfCreateCompany(String yearOfCreateCompany) {
            this.yearOfCreateCompany = yearOfCreateCompany;
            return this;
        }

        public Builder setMemory(double memory) {
            this.memory = memory;
            return this;
        }

        public Builder setNumberPhone(String numberPhone) {
            this.numberPhone = numberPhone;
            return this;
        }

        public Smartphone build(){
            Smartphone smartphone = new Smartphone();
            smartphone.model = this.model;
            smartphone.price = this.price;
            smartphone.yearOfCreateCompany = this.yearOfCreateCompany;
            smartphone.memory = this.memory;
            smartphone.numberPhone = this.numberPhone;
            return smartphone;


        }

    }

    public void info() {
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Year of creation: " + yearOfCreateCompany);
        System.out.println("Memory: " + memory);
        System.out.println("Phone number: " + numberPhone);
    }



}
