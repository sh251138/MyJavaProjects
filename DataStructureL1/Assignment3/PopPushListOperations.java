import java.util.*;

public class PopPushListOperations
{
	public static void main(String args[])
	{
		LinkedList<String> linkedList=new LinkedList<String>();

		linkedList.add("First");
		linkedList.add("Second");
		linkedList.add("Third");
		linkedList.add("Random");

		System.out.println("The Original Elements in linked list are: - "+linkedList);

System.out.println("**** Pushed Zero into LinkedList ****");
		linkedList.push("Zero");

		System.out.println("Elements in linked list after using push operation are: - "+linkedList);

System.out.println("Applying pop operation on LinkedList.");
		linkedList.pop();

		System.out.println("Elements in linked list after using pop operation are: - "+linkedList);
	}
}