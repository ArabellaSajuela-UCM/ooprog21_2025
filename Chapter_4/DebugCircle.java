public class DebugCircle
{
   private int radius;
   private int diameter;
   private final double PI = 3.14159;
   private double area;
   public DebugCircle(int r)
   {
      radius = r;
      diameter = 2 * r;
      area = PI * r * r;
   }
   public int getRadius()
   {
      return radius;
   }
   public int getDiameter()
   {
      return diameter;
   }
   public double getArea()
   {
      return area;
   }
   public static void main(String[] args)
   {
   DebugCircle newCircle = new DebugCircle(10);
   System.out.println("The radius of the circle is " + newCircle.getRadius());
   System.out.println("The diameter of the circle is " + newCircle.getDiameter());
   System.out.println("The area of the circle is " + newCircle.getArea());
   }
}

//cannot commit to githug because I am not the author in gitbash (:( > /__) orz