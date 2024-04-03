
/**
 * class Main
 *
 * @author (202200131 && 202200130)
 * @version (03-04-2024)
 */
public class Main {
    public static void main(String[] args) {
        ShippingCompany company = new ShippingCompany("RELIABLE-MOVING");

        GroundTransportation groundTransport = new GroundTransportation("ABC123");
        AirTransportation airTransport1 = new AirTransportation("Boeing 747", 10);
        AirTransportation airTransport2 = new AirTransportation("Airbus A380", 20);
        Lorry lorry = new Lorry("XYZ789", 50, 2);
        Van van = new Van("DEF456", 100);

        company.add(groundTransport);
        company.add(airTransport1);
        company.add(airTransport2);
        company.add(lorry);
        company.add(van);

        System.out.println("Transportes criados:");
        System.out.println(company.toString());

        company.makeTransportation(groundTransport.getId(), "Origin1", "Destination1", 200.0);
        company.makeTransportation(airTransport1.getId(), "Origin2", "Destination2", 300.0);
        company.makeTransportation(airTransport2.getId(), "Origin3", "Destination3", 400.0);
        company.makeTransportation(lorry.getId(), "Origin4", "Destination4", 500.0);
        company.makeTransportation(van.getId(), "Origin5", "Destination5", 600.0);

        System.out.println("Transportes depois de fazerem o transporte:");
        System.out.println(company.toString());

        company.finalizeTransportation(groundTransport.getId());
        company.finalizeTransportation(airTransport1.getId());

        System.out.println("Transportes após finalizar o transporte:");
        System.out.println(company.toString());
    }
}

