public class Restaurant{

    String name;
    String address;
    Menu menu;
    int id = 1;
    public Restaurant(String name, String address, Menu menu) {

        this.name = name;
        this.address = address;
        this.menu = menu;
        id++;
    }

    public String getName() {

        return this.name;
    }
}