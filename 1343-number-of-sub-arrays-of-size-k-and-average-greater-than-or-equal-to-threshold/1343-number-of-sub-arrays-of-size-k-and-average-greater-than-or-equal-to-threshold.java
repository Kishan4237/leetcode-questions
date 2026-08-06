class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        double average = 0;
               int count = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
               average = sum / k;
           
        }
 if (average >= threshold) {
                count++;
            }
 
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            average = sum / k;
            if (average >= threshold) {
                count++;
            }
        }
        return count;
    }
}



// class Solution {
//     public int numOfSubarrays(int[] arr, int k, int threshold) {
//         int sum = 0;

//         for (int i = 0; i < k; i++) {
//             sum += arr[i];
//         }

//         int count = 0;

//         if (sum >= threshold * k) {
//             count++;
//         }

//         for (int i = k; i < arr.length; i++) {
//             sum = sum - arr[i - k] + arr[i];

//             if (sum >= threshold * k) {
//                 count++;
//             }
//         }

//         return count;
//     }
// }