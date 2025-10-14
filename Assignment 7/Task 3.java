
//Task3
public class Dog extends Animal{
    public Dog(String n, int a, String c, String b){
        super(n, a, c);
        bread = b;
    }
    public String bread;
    public void makeSound(){
        System.out.println(super.color+" ccolor "+super.name+" is barking");
    }
    public String info(){
        return super.info()+"Bread: "+bread;
    }
}

