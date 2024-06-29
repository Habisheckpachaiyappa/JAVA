public class Box {
    private int length, width, height;

    public Box() {
        this.length = 10;
        this.width = 10;
        this.height = 10;
    }

    public void calculateVolume() {
        int volume = length * width * height;
        System.out.println("Volume of the box: " + volume);
    }

    public static void main(String[] args) {
        Box box = new Box();
        box.calculateVolume();
    }
}