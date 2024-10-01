package ShipmentConsolidation;
import java.util.List;


public class Shipment {
    private int shipmentId;
    private List<Order> orders;
    private double totalWeight;
    private double totalVolume;
    private String destination;
    

    public int getShipmentId() {
        return this.shipmentId;
    }

    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
    }

    public List<Order> getOrders() {
        return this.orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public double getTotalWeight() {
        return this.totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public double getTotalVolume() {
        return this.totalVolume;
    }

    public void setTotalVolume(double totalVolume) {
        this.totalVolume = totalVolume;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    

    @Override
    public String toString() {
        return "{" +
            " shipmentId='" + getShipmentId() + "'" +
            ", orders='" + getOrders() + "'" +
            ", totalWeight='" + getTotalWeight() + "'" +
            ", totalVolume='" + getTotalVolume() + "'" +
            ", destination='" + getDestination() + "'" +
            "}";
    }


    
}
