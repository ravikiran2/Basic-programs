
 class ObjectReturn 
 {
int x;
int y;
ObjectReturn(int a)
{
	x=a;
	System.out.println(x);
	System.out.println("constructor");
}
	 
//return class object in a method as method parameter
ObjectReturn display(ObjectReturn s)
{
	x=x+20;
	return s;
	
}
}
