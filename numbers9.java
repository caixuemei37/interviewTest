public class numbers9 {
	public static void main(String[] args) {  
        numbers9 f = new numbers9();  
        int[] arr = { -1, -2, 3, -10, 4, 7, -2, -5 };  
        System.out.println("MaxSum:" + f.findMaxSum(arr));  
    }  
  
    public Integer findMaxSum(int[] arr) {  
        int curSum = 0;  
        int maxSum = 0;  
        int len = arr.length;  
        int count = 0;
        int position = 0;
  
        if (arr == null || len == 0) {  
            return null;  
        }  
  
        for (int i = 0; i < len; i++) {  
            curSum += arr[i];  
            if (curSum < 0) {  
                curSum = 0;  
                count = 0;
            }  
            if (curSum > maxSum) {  
                maxSum = curSum;  
                count++;
                position = i;
            }  
        }  
  
        // all data are negative  
        if (maxSum == 0) {  
            for (int i = 0; i < len; i++) {  
                if (i == 0) {  
                    maxSum = arr[i];  
                }  
                if (arr[i] > maxSum) {  
                    maxSum = arr[i]; 
                }  
            }
            System.out.println("the numbers are:" + maxSum);
        }  
        if(maxSum > 0){
        System.out.println("the numbers are:");
         for(int i = position - count +1; i <= position; i++){
        	System.out.print(arr[i] + " ");
        }
         System.out.println();
        }
        return maxSum;  
    }  
}  
