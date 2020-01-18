import java.util.*;

public class CopyVectorElementsToArray
{
	public static void main(String args[])
	{
		Vector<String> vectObject=new Vector<String>();
		
		vectObject.add("123abc");
		vectObject.add("4546Def");
		vectObject.add("Ghi987");
		vectObject.add("789Jkl");
		vectObject.add("Mno321");
		vectObject.add("963Pqr");
		vectObject.add("0Stu98");
		vectObject.add("5Vwx65");
		vectObject.add("8Yz968");
		vectObject.add("Finish");

		System.out.println("Vector elements are :"+vectObject);		

		Object[] objArray=new Object[10];
		
		vectObject.copyInto(objArray);

		System.out.println("**********Vector elements are copied into array**********");
		System.out.println("Array contains following elements: -");
		for(int i=0;i<objArray.length;i++)
		{
			System.out.println(objArray[i]);
		}
	}
}

		