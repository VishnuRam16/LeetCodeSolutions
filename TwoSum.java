

class TwoSum
{
    public static void twoSum(int[] nums, int target) 
    { 
      
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                if(target == nums[i] + nums [j])
                {
                    System.out.println(i+","+j);
                }
                else
                {
                  System.out.println("No Solution");
                }
            }
        }
        
      
    }

    public static void main(String[] args)
    {
      int[] array = {2,7,11,19};

      twoSum(array, 18);
    }
    
}