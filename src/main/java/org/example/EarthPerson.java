package org.example;

public class EarthPerson extends Person implements Sweamble{
    @Override
    public int getAge() {
        return super.getAge()/2;
    }

    @Override
    public void dive() {
        System.out.println("I'm diving");
        super.setAge(getAge() - 1);
    }
}
