package v1;
public abstract class OrderProcess
{
  public boolean gift;
  public boolean discount;
  public abstract void select();
  public abstract void payment();
  public abstract void delivery();

  public final void processOrder(boolean gift,boolean discount)
  {
    select();
    payment();
    if (gift)
    {
      System.out.println("Gift wrap successful");
    }
    if (discount)
    {
      System.out.println("Use discount successful");
    }
    delivery();
  }
}
