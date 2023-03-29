package models;

public class Property {
    private String address;
    private Double price;
    private int photo;

    public Property() {
    }

    public Property(String adress, Double price, int photo) {
        this.address = adress;
        this.price = price;
        this.photo = photo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
