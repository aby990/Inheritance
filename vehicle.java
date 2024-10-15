public class vehicle {
    int numwheels;
    double price;
    public double discount;
    double hargakhir;

    public int getNumwheels() {
        return this.numwheels;
    }

    public void setNumwheels(int numwheels) {
        this.numwheels = numwheels;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return this.discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getHargakhir() {
        return this.hargakhir;
    }

    public void setHargakhir(double hargakhir) {
        this.hargakhir = hargakhir;
    }


    public vehicle(){
        price = 0;
    }

    public void print() {
        System.out.println("Number wheels: "+ this.numwheels);
        System.out.println("harganya berapa: "+ this.price);
    }
}
