package ru.seniorkot.testing.lab1.task3;

public class Eyes {
    boolean blinking;

    Eyes() {
        blinking = false;
    }
    boolean seeObject(Object object) {
        return object == null ? false : true;
    }
}
