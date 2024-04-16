package org.example.traffic;

public class TrafficControl {
    private TrafficLight light;

    public void changeLight(TrafficLight newLight){
        switch (newLight){
            case RED:
                System.out.println("STOP");
                light = newLight;
                // light = TrafficLight.RED;
                break;
            case AMBER:
                System.out.println("READY");
                light = newLight;
                // light = TrafficLight.AMBER;
                break;
            case GREEN:
                System.out.println("GO");
                light = newLight;
                // light = TrafficLight.GREEN;
                break;
        }
    }
}
