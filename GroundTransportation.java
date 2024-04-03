/**
 * class GroundTransportation
 *
 * @author (202200131 && 202200130)
 * @version (03-04-2024)
 */
public class GroundTransportation extends Transport
{
    private String licensePlate;
    private static double fees = 0.3;
    
    /**
     * Constructor for objects of class GroundTransportation
     */
    public GroundTransportation(String plate)
    {
        this.licensePlate = plate;
    }

    public String getLicensePlate(){
        return this.licensePlate;
    }
    
    public void setLicensePlate(String plate){
        this.licensePlate = plate;
    }
    
    public double getFees(){
        return fees;
    }
}
