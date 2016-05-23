package folder1;

public class TwoSum 
{
	public static void main(String[] args) 
	{
		int []exam = {1,3,7,5,8};
  		int []b = twoSum1(exam, 11);
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


}
