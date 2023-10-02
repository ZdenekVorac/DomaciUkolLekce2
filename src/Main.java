import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        Guest guest1 = new Guest("Adéla","Malíková", LocalDate.of(1993,3,13));
        Guest guest2 = new Guest("Jan","Dvořáček", LocalDate.of(1995,5,5));

        System.out.println(guest1.getName()+" "+guest1.getSurname()+" "+guest1.getBirthDate());
        System.out.println(guest2.getName()+" "+guest2.getSurname()+" "+guest2.getBirthDate());

        Room room1 = new Room("pokoj č.1", 1, 1000, true, true);
        Room room2 = new Room("pokoj č.2", 1, 1000, true, true);
        Room room3 = new Room("pokoj č.3", 3, 2400, false, true);

        System.out.println(room1.getRoom()+" - lůžek: "+room1.getNumberOfBed()+", cena: "+room1.getPrice()+"Kč/noc, balkon:"+room1.getBalcony()+", výhled na moře:"+room1.getSea());
        System.out.println(room2.getRoom()+" - lůžek: "+room2.getNumberOfBed()+", cena: "+room2.getPrice()+"Kč/noc, balkon:"+room2.getBalcony()+", výhled na moře:"+room2.getSea());
        System.out.println(room3.getRoom()+" - lůžek: "+room3.getNumberOfBed()+", cena: "+room3.getPrice()+"Kč/noc, balkon:"+room3.getBalcony()+", výhled na moře:"+room3.getSea());

        Booking booking1 = new Booking(guest1, room1, LocalDate.of(2021,7,19), LocalDate.of(2021,7,26));
        Booking booking2 = new Booking(guest1, room3, LocalDate.of(2021,9,1), LocalDate.of(2021,9,14));

        System.out.println(guest1.getName()+" "+guest1.getSurname()+" - "+room1.getRoom()+" od:"+booking1.getStartDate()+" do:"+booking1.getEndDate() );
        System.out.println(guest1.getName()+" "+guest1.getSurname()+" a "+guest2.getName()+" "+guest2.getSurname()+" - "+room3.getRoom()+" od:"+booking2.getStartDate()+" do:"+booking2.getEndDate() );
    }
}