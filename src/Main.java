
public class Main {
    public static void main(String[] args) {

        //wywolanie zadania 1
        tabF.run();

        //wywolanie zadania 2
        Publication[] tabPub = new Publication[3];

        tabPub[0] = new Publication("Psy", "ISBN4354", 21, 10);
        tabPub[1] = new Publication("Moja java", "adssdadsdsds3", 51, 5);
        //dodany przykład
        tabPub[2] = new Publication("javaaaa","numer",200,3);
        //KUPOWANIE JAVY
        tabPub[1].buy(15);

        System.out.println("Lista Publikacji ");
        ArrayOfPublicationsMethod.showPublications(tabPub);
        System.out.println("calkowity koszt publikacji " + ArrayOfPublicationsMethod.calculateTotalIncome(tabPub));

    }
}
