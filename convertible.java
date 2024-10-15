public class convertible extends car {
    String roofType;
    public int diskonya;

    public String getRoofType() {
        return this.roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public int getDiskonya() {
        return this.diskonya;
    }

    public void setDiskonya(int diskonya) {
        this.diskonya = diskonya;
    }

    public convertible() {
        super();
        roofType = "";
    }
    @Override
    public void print () {
        super.print();
        System.out.println("Roof Type of the car: "+ roofType);
    }
}
