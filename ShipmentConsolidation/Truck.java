package ShipmentConsolidation;
import java.util.List;

public class Truck {

    private Capacity capacity;
    private int[] availableTimeWindow;

    Truck(Capacity capacity, int[] availableTimeWindow){
        this.capacity=capacity;
        this.availableTimeWindow=availableTimeWindow;
    }

    public static class Capacity{
        private double weight;
        private double volume;

        Capacity(double weight, double volume){
            this.weight=weight;
            this.volume=volume;
        }

    }


    public Capacity getCapacity() {
        return this.capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }


    public int[] getAvailableTimeWindow() {
        return this.availableTimeWindow;
    }

    public void setAvailableTimeWindow(int[] availableTimeWindow) {
        this.availableTimeWindow = availableTimeWindow;
    }
    


    @Override
    public String toString() {
        return "{" +
            " capacity='" + getCapacity() + "'" +
            ", availableTimeWindow='" + getAvailableTimeWindow() + "'" +
            "}";
    }


    
}
