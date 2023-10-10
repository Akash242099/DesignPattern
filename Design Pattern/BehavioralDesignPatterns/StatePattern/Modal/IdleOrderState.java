package Modal;

public class IdleOrderState implements OrderState{
    private OrderContext orderContext;
    @Override
    
    public int placedOrder() {
        // TODO Auto-generated method stub

        orderContext.setOrderState(new CreateOrderState());
        return 0;
    }

    @Override
    public boolean cancelOrder(int orderId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelOrder'");
        
    }

    @Override
    public boolean orderDelivered(int orderId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'orderDelivered'");
    }

    @Override
    public boolean placedReturn(int orderId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'placedReturn'");
    }

    @Override
    public boolean cancelReturn(int orderId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelReturn'");
    }
    
}
