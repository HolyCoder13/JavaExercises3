public class tabF {
    public static int nieParzyste(int[]t){
        int il =0;
        for(int i=0;i<t.length;i++){
            if(t[i]%2==0){
                il++;
                t[i]++;
            }
//            return il;
        }
        return il;
    }





    public static void run(){
        int[]tab = {1,-3,4,0,-2};
        int ilenp = nieParzyste(tab);
        System.out.println("\nNie Parzytych elementow w tabl jest"+ilenp);
        System.out.println("Po zmianie ");
        for (int el:tab){
            System.out.println(el+",");
        }

    }


}


