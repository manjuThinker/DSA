public class car {
    private int price;
    private int year;

    public car(int p,int y){
        price=p;
        year=y;
    }

    public int price(){
        return price;
    }
    public int year(){
        return year;
    }

    public void testmethod(int a){
        if (a==0){
            System.out.println("forloop");
            return ;
        }
        price=price+a;
        System.out.println(price);
    }

    public void print(){
        String  z= "car";
        String u= "uyt";
        String temp=z;
        z=u;
        u=temp;

        System.out.println(z);
    }

    public static void main (String[] args){
        car c = new car(8, 8765);
        System.out.println(c.year);
        c.testmethod(9);
        System.out.println(c.price);
        c.print();


    }

}
