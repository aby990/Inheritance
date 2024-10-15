public class bicycle extends vehicle {
    String biketype;
    double discount;

    public String getBiketype() {
        return this.biketype;
    }

    public void setBiketype(String biketype) {
        this.biketype = biketype;
    }

    public double getDiscount() {
        return this.discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


    public bicycle() {
        super();
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Bike type: "+this.biketype);
        hargakhir = price-price*discount/100;
        System.out.println("Harga Akhir   : " + hargakhir);
    }
}
