package org.example;

public class PoolInstructor extends EarthPerson{
    Sweamble person;

    public void setPerson(Sweamble person) {
        this.person = person;
    }

    @NotDrunk
    public void teach() {
        System.out.println("Instructor says ...");
        person.dive();
    }
}
