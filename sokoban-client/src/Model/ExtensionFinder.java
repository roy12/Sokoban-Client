package Model;

public class ExtensionFinder {
	private String str2;
public ExtensionFinder(String str) {
	if(str.contains("."))
	{
		int counter = 0;
		char[] charArr = str.toCharArray();
		for(int i=0;charArr[str.length()-1-i]!='.';i++)
		{
			counter++;
		}
		str2=new String();
		while(counter!=0)
		{
				str2=str2+charArr[str.length()-counter];
				counter--;
		}
	}
	else
	{
		System.out.println("cant find type");
		str2=null;
	}
	
}
public String getStr2() {
	return str2;
}
public void setStr2(String str2) {
	this.str2 = str2;
}

public ExtensionFinder() {
	// TODO Auto-generated constructor stub
}

}
