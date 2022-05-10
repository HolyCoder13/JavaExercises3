public class Publication {
    private String title;
    public String ident;
    private double price;
    private int quantity;

    public Publication(){

    }

    public Publication(String title,String ident,double price,int quantity){
        this.title=title;
        this.ident=ident;
        this.price=price;
        this.quantity=quantity;
    }


    public String getTitle(){return title;}
    public String getIdent(){return ident;}
    public double getPrice(){return price;}
    public int getQuantity(){return quantity;}

    public void setTitle(String title){this.title=title;}
    public void setIdent(String ident){this.ident=ident;}
    public void setPrice(double price){this.price=price;}
    public void setQuantity(int quantity){this.quantity=quantity;}


    public void buy(int n){quantity+=n;}

    public String toString(){
        return "Publikacja: "+"tytul"+title+", ident="+ident+", cena"+price;
    }


}
