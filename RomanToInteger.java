public class RomanToInteger 
{
  public static void romanToInt(String s) 
    {
        int result = 0;
        
        s=s.replace("IV","IIII");
        s=s.replace("IX","IIIIIIIII");
        s=s.replace("XL","XXXX");
        s=s.replace("XC","XXXXXXXXX");
        s=s.replace("CD","CCCC");
        s=s.replace("CM","CCCCCCCCC");
        
        for(int i=0;i<s.length();i++)
        {
            
            switch(s.charAt(i))
            {
                case 'I':
                    result+=1;
                    break;
                case 'V':
                    result+=5;
                    break;
                case 'X':
                    result+=10;
                    break;
                case 'L':
                    result+=50;
                    break;
                case 'C':
                    result+=100;
                    break;
                case 'D':
                    result+=500;
                    break;
                case 'M':
                    result+=1000;
                    break;
                    
            }
         
        }
        System.out.println(result);
    
    }

    public static void main(String[] args)
    {
      romanToInt("III");
    }
}
