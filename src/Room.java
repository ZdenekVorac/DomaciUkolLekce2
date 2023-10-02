public class Room {
    private String room;
    private int numberOfBed;
    private int price;
    private Boolean balcony;
    private Boolean sea;


    //region constructor
    public Room(String room, int numberOfBed, int price, Boolean balcony, Boolean sea) {
        this.room = room;
        this.numberOfBed = numberOfBed;
        this.price = price;
        this.balcony = balcony;
        this.sea = sea;
    }
    //endregion


    //region getter and setter
    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(int numberOfBed) {
        this.numberOfBed = numberOfBed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getBalcony() {
        return balcony;
    }

    public void setBalcony(Boolean balcony) {
        this.balcony = balcony;
    }

    public Boolean getSea() {
        return sea;
    }

    public void setSea(Boolean sea) {
        this.sea = sea;
    }
    //endregion

}
