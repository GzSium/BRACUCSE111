// Song class
public class Song {
    String title;
    String a_name;
    double min;
    Song nextSong;
    public Song(String s,String a,double m){
        title = s;
        a_name = a;
        min = m;
    }
    public void songInfo(){
        System.out.println("Title: "+title);
        System.out.println("Artist: "+a_name);
        System.out.println("Length: "+min);
   
    }
}




// Playlist class


class Playlist{
    String p_name;
    Song firstSong;
    Song currentSong;
    int total;
    public Playlist(String n){
        p_name = n;
        totalSong = 0;
        System.out.println(p_name+ " created.");
    }
    int count =1;
    public void info(){
        System.out.println(p_name+ " has the following songs:");
        if(firstSong == null){
            System.out.println("No songs in " +p_name+ ".");
        }
        else{
            currentSong = firstSong;
            count++;
        while(currentSong != null){
            System.out.println("Song- "+count);
            currentSong.songInfo();
            currentSong = currentSong.nextSong;
            count++;
        }
        }
    }
    public void addSong(Song x){
        if(firstSong == null){
            firstSong = x;
        }
        else{
            Song currentSong = firstSong;
            while(currentSong.nextSong != null){
                currentSong = currentSong.nextSong;

            }
            currentSong.nextSong = x;
        }
total++;
System.out.println(x.title + " added to " +p_name+ ".");
    }
}
