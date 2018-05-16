package lab8;
//1. engine size
//2. hores power
public class Engine {
    private  int engSize;
    private  int horsePower;


    //constructor
    public  void Engint (){}

    public Engine(int engSize, int horsePower) {
        this.engSize = engSize;
        this.horsePower = horsePower;
    }

    //toString

    @Override
    public String toString() {
        return "Engine{" +
                "engSize=" + engSize +
                ", horsePower=" + horsePower +
                '}';
    }

    public int getEngSize() {
        return engSize;
    }

    public void setEngSize(int engSize) {
        this.engSize = engSize;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
