
public class ArrayPractice
{

	public static void main(String[] args)
	{

		
		//print an array
		System.out.println("print an array");
		 double l[]= {3.4,9.8,54.54,876.5};
	
		for(double a:l)
		{
			System.out.println(a);
		}
		
		
		
		
		
		
		//print even number in array
		System.out.println("print even numbers in an array");
		int even[]= {11,6,78,33,60};
		for(int a=0;a<even.length;a++)
		{
		if(even[a]%2==0)
		{
			System.out.println(even[a]);
		}
		}
		
		
		
		
		
		
		//print odd numbers in array
		System.out.println("print odd numbers in an array");
		int odd[]= {9,65,8,86,7,1};
		for(int i=0;i<odd.length;i++)
		{
			if(odd[i]%2!=0)
			{
				System.out.println(odd[i]);
			}
		}
		
		
		
		
		//print elements at even index
		System.out.println("elements at even index in  array");
		int num[]= {15,61,354,334,2};
		for(int i=0;i<num.length;i++)
		{
		if(i%2==0)
		{
			System.out.println(num[i]);
		}
		}
		
		
		
		
		
		
		//print elements at odd index
System.out.println("elements at odd index in array");
	int sum[]= {55,7,9,2,48,4};
	for(int i=0;i<sum.length;i++)
	{
		if(i%2!=0)
		{
			System.out.println(sum[i]);
			
			
		}
	}
	
	
	
	
	//print elements left to right and right to left from middle
	System.out.println("left to right and right to left from middle");
	int to[]= {7,6,8,1,0,6,4,6,1};
	System.out.println(to.length/2);
	for(int i=to.length/2;i<to.length;i++)
	{
		System.out.println(to[i]);
	}
	for(int i=to.length/2;i>=0;i--)
	{
		System.out.println(to[i]);
	}
	
	
	
	
	//print the alternate elements in array
	System.out.println("alternate elements in array");
	int alternate[]= {5,7,6,3,1,9,4,2};
	for(int i=0;i<alternate.length;i++)
	{
		if(i%2==0)
		{
			System.out.println(alternate[i]);
		}
		
	}
	
	
	
	
	//find the index of a given element
	System.out.println("index of a element");
	int index[]= {10,60,90,70,30,20};
	int v=90;
	for(int i=0;i<index.length;i++)
	
		
		if(index[i]==v)
		{
			System.out.println(i);	
		}
	
	
	
	
	//calculate sum and average of an array
	
	System.out.println("calculate sum and avg of an array");
	int some[]= {10,90,40,10,30,10,20};
	int z=0;
	for(int i=0;i<some.length;i++)
	{
	
	 z=some[i]+z;
	}
	System.out.println(z);
	System.out.println(z/some.length);
	
	
	
	}
}
