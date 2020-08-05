package v1;
public class InternetOrder extends OrderProcess
{
  @Override
  public void select()
  {
      System.out.println("Add products to online shopping cart.");
      System.out.println("Get gift wrap preference");
      System.out.println("Get delivery address.");
      System.out.println("Can use discount if you have.");
  }

  @Override
  public void payment()
  {
      System.out.println("Online Payment through Internetbanking, Paypal or credit card.");
  }

  @Override
  public void delivery()
  {
      System.out.println("Ship products to delivery address");
  }
}
