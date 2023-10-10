public interface OrderState{

    //idle order state functionality
    public int  placedOrder();
    //create order state functionality
    public boolean cancelOrder(int orderId);
    public boolean orderDelivered(int orderId);

//cancel order state functionality
    //we return to idle state and all the functionality available for idle is used 

    //delievered order state functionality
    public boolean placedReturn(int orderId);

    //return order state functionality


       public boolean cancelReturn(int orderId);





}
