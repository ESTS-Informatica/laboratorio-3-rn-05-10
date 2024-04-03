/**
 * class GroundTransportation
 *
 * @author (202200131 && 202200130)
 * @version (03-04-2024)
 */
public class GroundTransportation extends Transport
{
    private String licensePlate;
    private static double fees = 3.00;
    
    /**
     * Constructor for objects of class GroundTransportation
     */
    public GroundTransportation(String plate)
    {
        super();
        this.licensePlate = plate;
        super.setFees(fees);
    }

    public String getLicensePlate(){
        return this.licensePlate;
    }
    
    public void setLicensePlate(String plate){
        this.licensePlate = plate;
    }
    
    public double getPriceWithFees(){
        return (100.00+fees)*getPrice()/100;
    }
    
    public String getTransportType(){
        return "Transporte Terrestre";
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format("%15s: %s\n", "Matricula", this.licensePlate);
    }
}
