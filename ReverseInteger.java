public class ReverseInteger 
{
  public static int reverse(int x) 
    {
        long rev = 0, rem;
        
        while(x != 0)
        {
            rem = x % 10;
            rev = rev*10 + rem;
            x /= 10;
        }
        
        if ( rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE)
        {
           return 0;
        }
        else
           return (int)rev;
    }

    public static void main(String[] args)
    {
       int revInt =  reverse(123);
       System.out.println(revInt);
    }
}

//Solution that will be accepted by LeetCode:
// class Solution {
//   public int reverse(int x) 
//   {
//       long rev = 0, rem, temp = x; 
      
//       while(x != 0)
//       {
//           rem = x % 10;
//           rev = rev*10 + rem;
//           x /= 10;
//       }
      
//       if ( rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE)
//       {
//       return 0;
//       }
//       else
//       {
//           return (int)rev;
//       }
//   }
// }
