
/**
 * class Lorry
 *
 * @author (202200131 && 202200130)
 * @version (03-04-2024)
 */
public class Lorry extends GroundTransportation
{
    private int numberOfPallets;
    private int trailers;
    
    /**
     * Constructor for objects of class Lorry
     */
    public Lorry(String plate, int numPallets, int numTrailers)
    {
        super(plate);
        this.numberOfPallets = numPallets;
        this.trailers = numTrailers;
    }

    public void setNumberOfPallets(int numPallets){
        this.numberOfPallets = numPallets;
    }
    
    public void setTrailers(int numTrailers){
        this.trailers = numTrailers;
    }
    
    public int getNumberOfPallets(){
        return this.numberOfPallets;
    }
    
    public int getTrailers(){
        return this.trailers;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%15s: %d\n", "Numero de Paletes", this.numberOfPallets) + 
        String.format("%15s: %d\n", "Numero de Atrelados", this.trailers);
    }
}
