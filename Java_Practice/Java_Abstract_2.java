interface Camera{
    void record4K();
    void takeSnap();
}
interface GPS{
    void currentLocation();
    void liveLocation();
}
interface mediaPlayer{
    void playSong();
    void stopSong();
}
class smartPhone implements Camera,GPS,mediaPlayer{
    public void record4K(){
        System.out.println("Recording 4K Video");
    }
   public void takeSnap(){
       System.out.println("Taking Photo");
   }
    public void currentLocation(){
        System.out.println("Sending Current Location");
    }
    public void liveLocation(){
        System.out.println("Sending Live Location");
    }
    public void playSong(){
        System.out.println("Playing Song");
    }
    public void stopSong(){
        System.out.println("Pausing Song");
    }
}
public class Java_Abstract_2 {
    public static void main(String [] args){
        Camera P = new smartPhone();// this is a smartphone but use it as a camera because reference of camera
        //P.playSong --> Not allowed because reference is from Camera so Camera's methods can only be called
        P.record4K();
        P.takeSnap();
    }
}
