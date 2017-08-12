package senac.pos.com.mapaexemplo.model;

/**
 * Created by iossenac on 12/08/17.
 */

public class Room {
    private String name;
    private String description;
    private String address;
    private String cep;
    private String latitude;
    private String longitude;
    private int user_id;
    private double price_day;
    private int category_id;

    public Room(String name, String description, String address, String cep, String latitude, String longitude, int user_id, double price_day, int category_id) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.cep = cep;
        this.latitude = latitude;
        this.longitude = longitude;
        this.user_id = user_id;
        this.price_day = price_day;
        this.category_id = category_id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public double getPrice_day() {
        return price_day;
    }

    public void setPrice_day(double price_day) {
        this.price_day = price_day;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    @Override
    public String toString(){
      return this.getName();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
