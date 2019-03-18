package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task executeTask(final String task) {
        switch (task) {
            case SHOPPING:
                return new ShoppingTask("Shopping task.", "Bread", 3.0);
            case PAINTING:
                return new PaintingTask("Painting task.", "Black", "Wall");
            case DRIVING:
                return new DrivingTask("Driving task.", "Anywhere", "Chopper");
            default:
                return null;
        }
    }
}
