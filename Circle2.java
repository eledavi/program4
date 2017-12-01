public class Circle2 extends Circle
{

public Circle2(double x, double y, double radius)
{
   // ERROR: x and y variables were in the
   // wrong order (y,x instead of x,y).
   super(x,y,radius);
}

public boolean intersects(Circle other)
{
   // ERROR: Incorrect formula for determining
   // if the two circles intersect.
   double d;
   d = Math.pow(center.x - other.center.x, 2) + Math.pow(center.y - other.center.y, 2);
   double r;
   r = Math.pow(radius + other.radius, 2);
   if (d <= r)
      return true;
   else
      return false;
}

}

