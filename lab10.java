package lab5;

public class lab10 implements Mode  {
	
	public  int getMode(int[] values) {
	
	
	 int maxValue = 0, maxCount = 0;
		int[] num = new int[100];
		
		for(int i=0; i<values.length; i++)
		{
			num[i]=values[i];
			
		}
		for (int j=0; j<=values.length; j++) 
		{
			 int count=0;
			for(int k=j; k<=values.length; k++) 
			{
				if (num[j]==num[k]) 
				{
					count++;
					
				}
				if(count>maxCount) 
				{
					maxCount=count;
				maxValue=num[j];
				}
			
				
			}
		}
	
		
		return maxValue; 
	}

	public static void main(String[] args) {
	
		lab10 l = new lab10();
		int[] numbers = {2,2,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		System.out.println(+l.getMode( numbers));

	}

}
