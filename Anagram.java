import java.util.*;
public class Anagram
{
	public static void main(String args[]){
    	Scanner sc= new Scanner(System.in);
	String a;
	String b;
        System.out.println("Enter first String");
        a=sc.nextLine(); 
	System.out.println("Enter Second String");
        b=sc.nextLine(); 
	boolean isAnagram=false;
        boolean isVisited[]= new boolean[b.length()];

	if(a.length()==b.length())
	{
		for(int i=0;i<a.length();i++){
		char c=a.charAt(i);
		isAnagram=false;
			for(int j=0;j<b.length();j++)
			{
				if(b.charAt(j)==c && !isVisited[j])
				{
					isVisited[j]=true;
 					isAnagram=true;
					break;
				}
			}
				if(!isAnagram)
					break;
			}
	}
		if(isAnagram)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
}
}