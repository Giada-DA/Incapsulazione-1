import java.util.Scanner;


public class Start {
    public static void main(String[] args) {
        House house = new House();
        String[] nomi = new String[3];

        System.out.println("Inserisci i valori: ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indica il numero dei piani: ");
        int floorsNumber = scanner.nextInt();
        System.out.println("Inserisci l'indirizzo: ");
        String address = scanner.nextLine();
        System.out.println("Inserisci i nomi dei residenti(usa la virgola per separare i nomi): ");
        String residentsNames = scanner.nextLine();
        String[] array = residentsNames.split(",");
        house.setResidentsNames(array);
        house.setAddress(address);
        house.setFloorsNumbers(floorsNumber);

        //String a = String.format("%s, %s, %s", house.getResidentsNames(), house.getResidentsNames(), house.getResidentsNames());
        //System.out.println(a);
        //System.out.println("Piani: " + house.getFloorsNumbers() + ", indirizzo: " + house.getAddress() + " e residenti: " + house.getResidentsNames()+ " " + house.getResidentsNames() + " " + house.getResidentsNames());
        System.out.println(house.toString());
    }
}
