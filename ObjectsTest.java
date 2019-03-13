
class ObjectsTest 
{

	public static void main(String[] args) {
		Objects o=new Objects();
		o.addition(10,2);
		o.subtraction(20,5);
		Objects  b=new Objects ();
		b.add(o);
		Objects   c=new Objects  ();
		c.sub(b);
		Objects d=new Objects();
		d.mul(b, c);                   
	
	}
	
	
	
	
	
}
