public class Palindrome 
{
  

  public static void isPalindrome(int x) 
    {
        if(x < 0)
        {
            System.out.println("false");
        }
        
        int rev = 0, rem, temp = x;
        
        while(x != 0)
        {
            rem = x % 10;
            rev = rev*10 + rem;
            x /= 10;
        }
        
        if(temp == rev)
        {
          System.out.println("true");
        }
        else
        {
          System.out.println("false");
        }
      
    }

    public static void main(String[] args)
    {
      isPalindrome(121);
    }
}

//For solution to be accepted in LeetCode:
//class Solution
//{
// public static Boolean isPalindrome(int x) 
//     {
//         if(x < 0)
//         {
//             return false;
//         }
        
//         int rev = 0, rem, temp = x;
        
//         while(x != 0)
//         {
//             rem = x % 10;
//             rev = rev*10 + rem;
//             x /= 10;
//         }
        
//         return temp == rev;
//       }
//}

