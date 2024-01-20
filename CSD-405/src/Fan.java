/*
Anthony Williams
1/13/24
Module 1 Assignment

This code generates descriptions of different fans from a fan class that's been 
set to some initial default conditions. 
 */

public class Fan {
    // Constants for fan speed
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fields
    private int speed;
    private boolean on;
    private double radius;
    String color;

    // Default constructor
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6.0;
        color = "white";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and setter methods for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter and setter methods for power
    public boolean getPower() {
        return on;
    }

    public void setPower(boolean on) {
        this.on = on;
    }

    // Getter and setter methods for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter and setter methods for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method to describe the fan's state
    public String toString() {
        String fanState = "Status\n";
        fanState += "Speed: " + speed + "\n";
        fanState += "Power: " + (on ? "On" : "Off") + "\n";
        fanState += "Radius: " + radius + " inches\n";
        fanState += "Color: " + color;
        return fanState;
    }

    public static void main(String[] args) {
        // Create a fan using the default constructor
        Fan fan1 = new Fan();

        // Create a fan using the argument constructor
        Fan fan2 = new Fan(Fan.MEDIUM, true, 8.0, "blue");

        // Display the state of the fans
        System.out.println("Fan 1");
        System.out.println(fan1.toString());

        System.out.println("\nFan 2");
	        System.out.println(fan2.toString());
	    }
	}



