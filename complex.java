import java.util.*;
class complex
{
double real;
double imag;
public complex(double real,double imag)
{
this.real=real;
this.imag=imag;
}
public static void main(String args[])
{
complex n1=new complex(1.4,3.2),
        n2=new complex(6.1,5.3),
        temp;
temp=add(n1,n2);
System.out.printf("sum=%.1f+%.1fi\n",temp.real,temp.imag);
}
public static complex add(complex n1,complex n2)
{
complex temp=new complex(0.0,0.0);
temp.real=n1.real+n2.real;
temp.imag=n2.imag+n2.imag;
return(temp);
}
}
