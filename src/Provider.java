public class Provider {
    private String name;
    private String address;
    private String number;

    public Provider(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public Provider(){
        this.name = "Ivan";
        this.address = "Tsar Gosho 1";
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
        return "Provider{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone number=" + number + '}';
    }
}
