package com.kodilla.patterns.factory.tasks;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING_TASK";
    public static final String DRIVING = "DRIVING_TASK";
    public static final String PAINTING = "PAINTING_TASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "BottleOfMilk", 2.0);
            case DRIVING:
                return new DrivingTask("Driving", "Driving to Work", "car");
            case PAINTING:
                return new PaintingTask("Painting", "white", "living room");
                default:
                    return null;
        }
    }
}
