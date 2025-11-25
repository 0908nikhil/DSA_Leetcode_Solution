class Solution {
    public int maxSumDivThree(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int sum=0;;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int rem=0;
        rem = sum % 3;
        if(rem==0){
            return sum;
        }
        int remove=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]%3==rem){
                remove=nums[i];
                break;
        }
    }
        int removetwo=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((nums[i]+nums[j])%3==rem){
                    removetwo=Math.min (removetwo, nums[i]+nums[j]);
                    break;
                }
            }
        }
        int bestremove=Math.min(remove,removetwo);
        return sum - bestremove;
        
    }
}