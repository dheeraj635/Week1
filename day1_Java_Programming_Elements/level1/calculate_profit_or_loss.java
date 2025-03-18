public class calculate_profit_or_loss {
    public static void main(String[] args) {
        double cost_price = 129;
        double selling_price = 191;
        double profit = selling_price-cost_price;
        double profit_percentage = (profit/cost_price)*100;
        System.out.println("The Cost price is INR "+cost_price+" and Selling price "+selling_price);
        System.out.println("The profit is INR "+profit+" and the profit percentage "+profit_percentage);
    }
    
}
