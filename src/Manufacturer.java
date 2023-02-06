public class Manufacturer {
    private String name;
    private String address;
    private String number;

    public Manufacturer(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public Manufacturer(){
        this.name = "Gosho";
        this.address = "Tsar Ivan 2";
        this.number = "0899813143";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString(){
        return "Importer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone number= " + number + '}';
    }
}
