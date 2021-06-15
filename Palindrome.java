public class Palindrome 
{
  

  public static Boolean isPalindrome(int x) 
    {
        if(x < 0)
        {
            return false;
        }
        
        int rev = 0, rem, temp = x;
        
        while(x != 0)
        {
            rem = x % 10;
            rev = rev*10 + rem;
            x /= 10;
        }
        
        return temp == rev;
      
    }

    public static void main(String[] args)
    {
      boolean Palin = isPalindrome(121);
      System.out.println(Palin);
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

