import java.util.Scanner;
class Complex
{
int real,imaginary;
Complex(int real,int imaginary)
{
this.real=real;
this.imaginary=imaginary;
}
void Display()
{
System.out.println(real + "+" + imaginary + "i");
}
}
class Complex1
{
public static void main(String args[])
{
int re,img;
System.out.println("Enter the real number");
Scanner X=new Scanner(System.in);
re=X.nextInt();
System.out.println("Enter the img number");
img=X.nextInt();
Complex C;
C=new Complex(re,img);
C.Display();
}
}