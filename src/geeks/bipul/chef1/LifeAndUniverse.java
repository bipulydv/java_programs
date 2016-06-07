package geeks.bipul.chef1;



public class LifeAndUniverse 
{
	public static void main(String[] args) 
	{
		 java.io.BufferedReader br = new  java.io.BufferedReader(new java.io.InputStreamReader(System.in));
//		boolean flag= true;
		String num= "1";
		while(!num.equals("42"))
		{
			try
			{
			num=br.readLine();
			}
			catch(java.io.IOException  e)
			{
				e.printStackTrace();
			}
		}
		try 
		{
			br.close();
		} catch (java.io.IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
