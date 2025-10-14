//Task8
public class Player {
    public static int total =0;
    public static String p [] = new String[11];
    // class
    String name;
    String country;
    int jersy;
    public Player(String n, String c, int j){
        name = n;
        country = c;
        jersy = j;
        p[total]= n;
        total++;
    }
    // return kora method
    public String player_detail(){
        String s1 =  "Name: "+name+"\nJersey Number: "+jersy+"\nCountry: "+country;
        return s1;
    }
    // method
    public static void info(){
        System.out.println("Total number of players: " + total);
        System.out.print("Player enlisted so far: ");
        for(int i =0; i<total;i++){
            System.out.print(p[i]+" ,");
        }
    }
}
