public class WaterBottle {
    private int volume = 100;

    public int getVolume(){
        return this.volume;
    }
     public void drink(){
        this.volume -= 10;
     }

     public void empty(){
        this.volume = 0;
     }

    public void fill(){
        this.volume = 100;
    }
}
