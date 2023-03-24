public class product
{
int pCode,price;
String pName;
product(int pCde,String pNme,int prce)
{
pCode=pCde;
pName=pNme;
price=prce;
}
public static void main(String args[])
{
product pd1 =new product(110,"Book 1",160);
product pd2 =new product(111,"Book 2",120);
product pd3 =new product(112,"Book 3",130);
if(pd1.price<pd2.price&&pd1.price<pd3.price)
{
System.out.println("The price of "+ pd1.pName+" is lowest");
}
else if(pd2.price<pd1.price&&pd2.price<pd3.price)
{
System.out.println("The price of "+ pd2.pName+" is lowest");
}
else if(pd3.price>pd2.price&&pd3.price<pd1.price)
{
System.out.println("The price of "+ pd3.pName+" is lowest");
}
}
}

