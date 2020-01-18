import java.util.*;

public class MyElementCheck
{
	public static void main(String args[])
	{

  System.out.println("******Program Started*******");
Vector<String> vecObject=new Vector<String>();
		vecObject.add("First");
		vecObject.add("Second");
		vecObject.add("Third");
		vecObject.add("Random");

System.out.println("The whole vector is :"+vecObject);

		boolean flag1=vecObject.contains("First") && vecObject.contains("Random");
		System.out.println("Does the created vector contains element First and Random both?(True/False) : "+flag1);

		boolean flag2=vecObject.contains("One") && vecObject.contains("Random");
		System.out.println("Does the created vector contains element One and Random both?(True/False) : "+flag2);

}
}