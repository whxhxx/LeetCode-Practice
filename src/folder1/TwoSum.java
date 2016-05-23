package folder1;

import java.util.HashMap;

// branch b1
public class TwoSum 
{
	public static void main(String[] args) 
	{
		int []exam = {1,3,7,5,8};
  		int []b = twoSum2(exam, 15);
 		System.out.println(b[0]+" "+b[1]);
	}

 	public static int[] twoSum1(int[] nums, int target) 
    {
        int []res = new int[2];
        for(int i = 0; i< nums.length; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

 	public static int[] twoSum2(int[] nums, int target)
 	{
 		 
 		HashMap<Integer, Integer> theMap = new HashMap<Integer, Integer>();
 		for(int i = 0; i < nums.length; i++)
 		{
 			if( theMap.containsKey(target - nums[i]))
 			{
 				return new int[]{theMap.get(target - nums[i]), i};
 			}
 			else 
 			{
 				theMap.put(nums[i], i);
			}
 		}
 		
 		throw new IllegalArgumentException("no matching numbers");
 	}

}
