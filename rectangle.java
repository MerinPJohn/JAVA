class rectangle
{
double length,breadth;
public void setData()
{
length=12.48;
breadth=13;
}
public void getArea()
{
double area=length*breadth;
System.out.println("Area of rectangle is" +area);
}
public static void main(String args[])
{
rectangle obj=new rectangle();
obj.setData();
obj.getArea();
}
}
