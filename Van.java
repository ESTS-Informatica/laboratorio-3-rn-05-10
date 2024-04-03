
/**
 * class Van
 *
 * @author (202200131 && 202200130)
 * @version (03-04-2024)
 */
public class Van extends GroundTransportation
{
    private int packages;
    
    /**
     * Constructor for objects of class Van
     */
    public Van(String plate, int numPackages)
    {
        super(plate);
        this.packages = numPackages;
    }
    
    public void setPackages(int numPackages){
        this.packages = numPackages;
    }
    
    public int getPackages(){
        return this.packages;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format("%15s: %d\n", "Numero de Pacotes", this.packages);
    }
}