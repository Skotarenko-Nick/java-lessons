package org.example;

public record Pool(int capacity) {

    @Override
    public int capacity() {
        System.out.println("Use capacity method with passing EarthPerson...");
        return -1;
    }

    public int capacity(EarthPerson person) {
        if (person instanceof PoolInstructor) {
            System.out.println("Hi instructor!");
            return capacity;
        }
        System.out.println("Not authorized person to know ...");
        return -1;
    }
}
