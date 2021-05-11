class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int[] myArray = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                int myTarget = nums[i] + nums[j];
                if(myTarget == target)
                {

                    myArray[0] =  i;
                    myArray[1] =  j;

                }

            }
        }
        
        return myArray;
    }
}