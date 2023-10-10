package MainClass;

import Modal.OrderContext;
import Modal.OrderState;

public class Main {
    public static void main(String[] args){
     OrderContext orderContext=new OrderContext();
     OrderState orderState=orderContext.getOrderState();
     //placing order by client
    int getOrderId= (int)orderState.placedOrder();
      orderState=orderContext.getOrderState();

     // if client wants to cancel the order status change to ideal state
     //orderState.cancleOrder(1);
     //orderState=orderContext.getOrderState();
    
     // ordered is delivered by the campany 
     orderState.orderDelivered(1);

     // if you wants to return the order;
     orderState.placedReturn(1);

     // if you wants to cancle return the order;
     orderState.cancelReturn(1);
    }

}