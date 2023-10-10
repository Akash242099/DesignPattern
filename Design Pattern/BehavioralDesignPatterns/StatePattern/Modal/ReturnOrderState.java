package Modal;

public class ReturnOrderState implements OrderState {
    private OrderContext orderContext;
    @Override
    public int placedOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'placedOrder'");
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
           throw new UnsupportedOperationException("Unimplemented method 'orderDelivered'");
    }

    @Override
    public boolean cancelReturn(int orderId) {
        // TODO Auto-generated method stub
        orderContext.setOrderState(new DelieveredOrderState());
        return true;
    }
    
}
