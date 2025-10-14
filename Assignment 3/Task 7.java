//Task7
public class Cart {
    int num ;
    String [] name;
    double [] price;
    int count =0;
    public void create_cart(int n){
        num = n;
        name = new String[3];
        price = new double[3];
    }
    double sum = 0;
    public void addItem(String n, double p){
        if(count<3){
           name[count] =n;
           price[count] =p;
           sum = sum + p;
           count++;
           System.out.println(n+" added to cart "+num+".");
           System.out.println("You have "+count+" item(s) in your cart now.");
    }else{
        System.out.println("You already have 3 items on your cart.");
    }
}
public void addItem(double pi, String na){
    if(count<3){
       name[count] =na;
       price[count] =pi;
       sum = sum + pi;
       count++;
       System.out.println(na+" added to cart "+num+".");
       System.out.println("You have "+count+" item(s) in your cart now.");
}else{
    System.out.println("You already have 3 items on your cart.");
}
}
double disValue;
public void giveDiscount(double dis){
    disValue = dis;
    sum = sum - sum*(dis/100);
}
public void cartDetails(){
    System.out.println("Your card (c"+num+") :");
    for(int i=0;i<count;i++){
        System.out.println(name[i]+" - "+price[i]);
    }
    System.out.println("Disccount Applied: "+disValue+"%");
    System.out.println("Total price: "+sum);
}
}

