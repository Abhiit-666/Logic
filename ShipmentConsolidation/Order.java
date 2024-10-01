package ShipmentConsolidation;

import java.util.List;

public class Order {
    private int id;
    private String destination;
    private double volume;
    private double weight;
    private int priority;
    private int[] timeWindow;


    Order(int id, String destination,double volume,double weight,int priority,int[] timeWindow){
        this.id=id;
        this.destination=destination;
        this.volume=volume;
        this.weight=weight;
        this.priority=priority;
        this.timeWindow=timeWindow;
    }

    
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }


    public int[] getTimeWindow() {
        return this.timeWindow;
    }

    public void setTimeWindow(int[] timeWindow) {
        this.timeWindow = timeWindow;
    }
  

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", destination='" + getDestination() + "'" +
            ", volume='" + getVolume() + "'" +
            ", weight='" + getWeight() + "'" +
            ", priority='" + getPriority() + "'" +
            ", timeWindow='" + getTimeWindow() + "'" +
            "}";
    }

    
    
}
