package v1;
class Main
{
    public static void main(String[] args)
    {
      OrderProcess storeOrder = new StoreOrder();
      storeOrder.processOrder(true,false);
      System.out.println();
      OrderProcess netOrder = new InternetOrder();
      netOrder.processOrder(true,true);
    }
}
