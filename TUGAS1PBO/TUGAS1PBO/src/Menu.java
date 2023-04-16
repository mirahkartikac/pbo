public class Menu{

    String food;
    String drink;
    double priceFood;
    double priceDrink;

    public Menu(String food, String drink, double priceFood, double priceDrink){

        this.food = food;
        this.drink = drink;
        this.priceFood = priceFood;
        this.priceDrink = priceDrink;
    }

    public String getFood(){

        return this.food;
    }

    public String getDrink(){

        return this.drink;
    }

    public double getPriceFood(){

        return this.priceFood;
    }

    public double getPriceDrink(){

        return this.priceDrink;
    }
}