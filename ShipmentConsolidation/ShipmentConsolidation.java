package ShipmentConsolidation;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import ShipmentConsolidation.Truck.Capacity;

class ShipmentConsolidation{

    public static void main(String args[]) throws IOException{
        
        ShipmentConsolidation sc=new ShipmentConsolidation();
        Order o1=new Order(1,"A",5.0,200.0,1,new int[] {8,12});
        Order o2=new Order(2,"B",3.0,150,2,new int[] {9,11});
        Order o3=new Order(1,"A",4.0,250.0,1,new int[] {10,14});
        Order o4=new Order(1,"C",7.0,300.0,3,new int[] {8,16});
        Order o5=new Order(1,"D",6.0,250.0,1,new int[] {9,17});
        Order o6=new Order(1,"A",5.0,220.0,2,new int[] {8,12});

        Truck t=new Truck(new Capacity(500, 15),new int[]{7,18});

        List<Order> orders=Arrays.asList(o1,o2,o3,o4,o5,o6);
        sc.ConsolidateShipment(orders,t);
    }

    public void ConsolidateShipment(List<Order> orders,Truck t){

        Map<String,List<Order>> groupedBydestOrders=orders.stream()
            .collect(Collectors.groupingBy(Order::getDestination,
            Collectors.collectingAndThen(Collectors.toList(),
            list-> list.stream()
                    .sorted(Comparator.comparing(Order::getPriority))
                    .collect(Collectors.toList()) )));
        
        for (Map.Entry<String, List<Order>> entries :  groupedBydestOrders.entrySet()){
            String destination=entries.getKey();

        }
    }
}