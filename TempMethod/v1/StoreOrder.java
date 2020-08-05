package v1;
public class StoreOrder extends OrderProcess
{
  @Override
  public void select()
  {
      System.out.println("Chooses products from shelf in the store.");
  }

  @Override
  public void payment()
  {
      System.out.println("Pays at cashier counter by cash or credit card.");
  }

  @Override
  public void delivery()
  {
      System.out.println("Customer pick up products");
  }
}
