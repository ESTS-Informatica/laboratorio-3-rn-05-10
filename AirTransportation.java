/**
 * class AirTransportation
 *
 * @author (202200131 && 202200130)
 * @version (03-04-2024)
 */
public class AirTransportation extends Transport
{
    private String name;
    private int numberOfContainers;
    private static double fees = 4.00;
    
    /**
     * Constructor for objects of class AirTransportation
     */
    public AirTransportation(String airPlaneName, int numContainers)
    {
        super();
        this.name = airPlaneName;
        this.numberOfContainers = numContainers;
        super.setFees(fees);
    }

    public String getName(){
        return this.name;
    }
    
    public void setName(String airPlaneName){
        this.name = airPlaneName;
    }
    
    public int getNumberOfContainers(){
        return this.numberOfContainers; 
    }
    
    public void setNumberOfContainers(int numContainers){
        this.numberOfContainers = numContainers;
    }
    
    public double getPriceWithFees(){
        return (100.00+fees)*getPrice()/100;
    }

    public String getTransportType(){
        return "Transporte Aereo";
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format("%15s: %s\n", "Nome", this.name) + String.format("%15s: %s\n", "NºContentores", numberOfContainers);
    }
}
