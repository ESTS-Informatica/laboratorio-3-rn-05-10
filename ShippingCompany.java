import java.util.HashSet;
import java.util.ArrayList;

/**
 * class ShippingCompany
 *
 * @author (202200131 && 202200130)
 * @version (03-04-2024)
 */
public class ShippingCompany extends HashSet<Transport> {
    private String name;
    private ArrayList<Transport> inService;

    public ShippingCompany(String name) {
        this.name = name;
        this.inService = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Transport> getInService() {
        return this.inService;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome da Empresa: ").append(this.name).append("\n");
        sb.append("Transportes em serviço:\n");
        for (Transport transport : inService) {
            sb.append(transport.toString()).append("\n");
        }
        return sb.toString();
    }

    public void makeTransportation(String id, String origin, String destination, double price) {
        Transport transport = getTransportation(id);
        if (transport != null && transport.isAvailable()) {
            transport.setOrigin(origin);
            transport.setDestination(destination);
            transport.setPrice(price);
            transport.setAvailable(false);
            inService.add(transport);
            remove(transport);
        }
    }

    public void finalizeTransportation(String id) {
        Transport transport = null;
        for (Transport t : inService) {
            if (t.getId().equals(id)) {
                transport = t;
                break;
            }
        }
        if (transport != null) {
            inService.remove(transport);
            transport.setOrigin("");
            transport.setDestination("");
            transport.setPrice(0.0);
            transport.setAvailable(true);
            this.add(transport);
        }
    }

    private Transport getTransportation(String id) {
        for (Transport transport : this) {
            if (transport.getId().equals(id)) {
                return transport;
            }
        }
        return null;
    }
}

