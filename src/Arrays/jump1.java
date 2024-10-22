package Arrays;

public class jump1 {
    public static boolean canjump(int[]nums){
        int farthest = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) {
                return false;
            }
            farthest = Math.max(farthest, i + nums[i]);
            if (farthest >= nums.length - 1) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int [] nums = {2,3,1,1,4};
        int [] num2 = {3,2,1,0,4};
        System.out.println(canjump(num2));
    }

}
/*
This greedy approach maintains a variable farthest that tracks the farthest index that can be reached while iterating through the array. The idea is to always check whether we can jump further from the current index, and if at any point we can't move beyond the current index, we return false.

Steps:
Initialize a variable farthest to 0, which represents the farthest index we can reach so far.
Loop through each index i in the array:
If i is greater than farthest, it means we are at a position that is unreachable, so we return false.
Otherwise, update farthest as the maximum of farthest and i + nums[i] (i.e., the farthest point we can reach from the current index).
If at any point farthest is greater than or equal to the last index, return true.
If the loop completes and we never reach the last index, return false.
Example Walkthrough:
Let's take the array nums = [2, 3, 1, 1, 4] as an example and walk through the code execution step by step.

Initial State:

farthest = 0 (initially, the farthest we can reach is index 0).
Iteration 1 (i = 0):

nums[0] = 2 (we can jump up to 2 steps from index 0).
Update farthest: farthest = Math.max(0, 0 + 2) = 2.
Now, the farthest we can reach is index 2.
We haven't reached the last index yet, so we continue.
Iteration 2 (i = 1):

nums[1] = 3 (we can jump up to 3 steps from index 1).
Update farthest: farthest = Math.max(2, 1 + 3) = 4.
Now, the farthest we can reach is index 4.
Since farthest >= nums.length - 1 (which is 4), we can already reach or surpass the last index, so we return true.
Conclusion:
In this example, the function returns true because we can reach the last index by following this jump pattern:

From index 0, jump to index 1.
From index 1, jump directly to the last index 4.
Another Example:
Let’s take another example: nums = [3, 2, 1, 0, 4].

Initial State:

farthest = 0 (initially, the farthest we can reach is index 0).
Iteration 1 (i = 0):

nums[0] = 3 (we can jump up to 3 steps from index 0).
Update farthest: farthest = Math.max(0, 0 + 3) = 3.
Now, the farthest we can reach is index 3.
We haven't reached the last index yet, so we continue.
Iteration 2 (i = 1):

nums[1] = 2 (we can jump up to 2 steps from index 1).
Update farthest: farthest = Math.max(3, 1 + 2) = 3.
The farthest remains 3.
We haven't reached the last index yet, so we continue.
Iteration 3 (i = 2):

nums[2] = 1 (we can jump up to 1 step from index 2).
Update farthest: farthest = Math.max(3, 2 + 1) = 3.
The farthest remains 3.
We haven't reached the last index yet, so we continue.
Iteration 4 (i = 3):

nums[3] = 0 (we can't jump at all from index 3).
Update farthest: farthest = Math.max(3, 3 + 0) = 3.
The farthest remains 3.
We haven't reached the last index yet, so we continue.
Iteration 5 (i = 4):

At this point, i = 4 is greater than farthest = 3. This means index 4 is unreachable from any previous jumps.
The function returns false.

*/