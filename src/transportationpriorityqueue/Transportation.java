package transportationpriorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Transportation {
	
	private String type;
    private int capacity;
    private double speed;

    public Transportation(String type, int capacity, double speed) {
        this.type = type;
        this.capacity = capacity;
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Transportation{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity +
                ", speed=" + speed +
                '}';
    }
}

class TransportationComparator implements Comparator<Transportation> 
{
    @Override
    public int compare(Transportation t1, Transportation t2) {
        // Sort by speed in descending order
        return Double.compare(t2.getSpeed(), t1.getSpeed());
    }
}

 class PriorityQueueExample {
    public static void main(String[] args) {
    	Comparator<Transportation> comparator = new TransportationComparator();
        PriorityQueue<Transportation> queue = new PriorityQueue<>(comparator);


        // Add transportation objects to the priority queue
        queue.add(new Transportation("Airplane", 300, 800.0));
        queue.add(new Transportation("Train", 500, 300.0));
        queue.add(new Transportation("Car", 5, 120.0));
        queue.add(new Transportation("Bicycle", 1, 20.0));

        System.out.println("Processing transportation requests:");

        while (!queue.isEmpty())
        {
            Transportation trans = queue.poll();
            System.out.println(trans);
        }
    }
}




