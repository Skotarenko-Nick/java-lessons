package org.example;

public enum AgeManagment {
    MAX_AGE(150),
    MIN_AGE(0);


    private int age;
    AgeManagment(int i) {
        this.age = i;
    }

    public int getAge() {
        return age;
    }
}
