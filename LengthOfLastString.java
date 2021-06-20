public class LengthOfLastString
{

  public static int lengthOfLastWord(String s) 
    {

        if(s == null)
        {
            return 0;
        }
        
		String[] arrOfStr = s.split(" ");

		int a = arrOfStr.length;
        if(a == 0)
        {
            return 0;
        }
		return (arrOfStr[a-1].length());
        
    }

    public static void main(String[] args)
    {
      int str = lengthOfLastWord("Hello World");
      System.out.println(str);
    }
}
