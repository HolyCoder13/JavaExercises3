public class ArrayOfPublicationsMethod {
    public static void showPublications(Publication[] tabP){
        for(Publication p:tabP){
            System.out.println(p);//wyyolanie to string
        }
    }
    public static double calculateTotalIncome(Publication[] tabP){
        double total=0.0;
        for(Publication p:tabP){
            total+=p.getPrice()*p.getQuantity();
        }
        return total;
    }

}
