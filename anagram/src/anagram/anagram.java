package anagram;

import java.util.Arrays;

public class anagram 
{
static void isAnagram(String s1, String s2)
{
		

	//Removing all white spaces from s1 and s2
String copys1 = s1.replaceAll("s", "");
String copys2 = s2.replaceAll("s", "");
//setting bolean to true
boolean status = true;
//comparing if they have same lenght
if(copys1.length() != copys2.length())
{
	status = false;
}
else 
{
	

//change to lower case
char [] s1array= copys1.toLowerCase().toCharArray();
char [] s2array = copys2.toLowerCase().toCharArray();
//sorting both arrays
Arrays.sort(s1array);
Arrays.sort(s2array);
status = Arrays.equals(s1array, s2array);

	}

	if(status) 
	{
		System.out.println(s1 + " and " +  s2 + "   are anagrams");
	}
	else
	{
		System.out.println(s1 + " and " + s2 + " are not anagrams");
	}
	}


	public static void main(String[] args)
	{
//	isAnagram("mother in Law", "hittler woman");
//	isAnagram("keEP", "peek"); 
	isAnagram(" joy", "enjoy");
	isAnagram("ASTRONOMERS", "NO MORE STARS");
	
		
	}

}

