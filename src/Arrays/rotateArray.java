package Arrays;

public class rotateArray {
    public static void reverse(int[] nums,int st,int end){
        while(st<end){
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }
    }

    public static void rotate(int[] nums,int k){
        if(k==0||k==nums.length) return ;
        k = k%nums.length ;
        System.out.println("value of k1"+k);
        k = ((nums.length)-k);
        System.out.println("value of k2"+k);
        reverse(nums,k,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,0,nums.length-1);
    }


    public static void main(String[] args) {
        int [] num = {-1};
        int k = 3;

        rotate(num,k);
        for(int i : num){
            System.out.println(i+" ");
        }
    }

}
