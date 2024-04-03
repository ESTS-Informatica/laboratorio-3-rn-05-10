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
    private static double fees = 0.4;
    /**
     * Constructor for objects of class AirTransportation
     */
    public AirTransportation(String airPlaneName, int numContainers)
    {
        this.name = airPlaneName;
        this.numberOfContainers = numContainers;
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
    
    public double getFees(){
        return fees;
    }
}
