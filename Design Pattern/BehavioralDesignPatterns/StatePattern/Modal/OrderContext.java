package Modal;

public class OrderContext {
    private  OrderState ordrState;

    public OrderState getOrderState() {
        return ordrState;
    }

    public void setOrderState(OrderState ordrState) {
        this.ordrState = ordrState;
    }

    public OrderContext() {
        this.ordrState=new IdleOrderState(); 
    }
   

  
}
