package test2;

import java.util.Optional;

public class Person {


        private Car car;
        public Car getCar() { return car; }

    public static void main(String[] args) {
        Person person=new Person();

        String insuranceName= Optional.ofNullable(person.getCar())
                .map(car->car.getInsurance())
                .map(insurance -> insurance.getName())
                .orElse("Insurance not found");
    }
}

 class Car {
    private Insurance insurance;
    public Insurance getInsurance() { return insurance; }
}

 class Insurance {
    private String name;
    public String getName() { return name; }
}
