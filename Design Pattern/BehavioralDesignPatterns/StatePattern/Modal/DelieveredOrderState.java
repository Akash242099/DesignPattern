package Modal;

public class DelieveredOrderState implements OrderState {
    private OrderContext orderContext;
    @Override
    public int placedOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'placedOrder'");
    }

    @Override
    public boolean cancelOrder(int orderId) {
        // TODO Auto-generated method stub
       
    }

    @Override
    public boolean orderDelivered(int orderId) {
        // TODO Auto-generated method stub
      
         throw new UnsupportedOperationException("Unimplemented method 'cancelOrder'");
    }

    @Override
    public boolean placedReturn(int orderId) {
               // TODO Auto-generated method stub
               orderContext.setOrderState(new ReturnOrderState());
               return true;
    }

    @Override
    public boolean cancelReturn(int orderId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelReturn'");
    }
    
}
