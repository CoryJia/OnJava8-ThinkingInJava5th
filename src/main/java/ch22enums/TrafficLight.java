package ch22enums;// enums/TrafficLight.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Enums in switch statements

import lombok.SneakyThrows;

// Define an enum type:
enum Signal {GREEN, YELLOW, RED,}

public class TrafficLight {
    Signal color = Signal.RED;

    public void change() {
        switch (color) {
            // Note you don't have to say Signal.RED
            // in the case statement:
            case RED:
                color = Signal.GREEN;
                break;
            case GREEN:
                color = Signal.YELLOW;
                break;
            case YELLOW:
                color = Signal.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return "The traffic light is " + color;
    }

    @SneakyThrows
    public static void main(String[] args) {
        TrafficLight t = new TrafficLight();
        Thread thread = new Thread();
        for (int i = 0; i < 7; i++) {
            System.out.println(t);
            thread.sleep(3000);
            t.change();
        }
    }
}
/* Output:
The traffic light is RED
The traffic light is GREEN
The traffic light is YELLOW
The traffic light is RED
The traffic light is GREEN
The traffic light is YELLOW
The traffic light is RED
*/
