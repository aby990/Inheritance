public class car extends vehicle{
    int numDoor;
    boolean iselectric;

    public int getNumDoor() {
        return this.numDoor;
    }

    public void setNumDoor(int numDoor) {
        this.numDoor = numDoor;
    }

    public boolean isIselectric() {
        return this.iselectric;
    }

    public void setIselectric(boolean iselectric) {
        this.iselectric = iselectric;
    }

    public car() {
       super();
    }
    @Override
    public void print() {
        super.print();
        System.out.println("number door : "+ this.numDoor);
        System.out.println("electric:  "+ this.iselectric);
        hargakhir = price-price*discount/100;
        System.out.println("Harga Akhir   : " + hargakhir);
    }
}