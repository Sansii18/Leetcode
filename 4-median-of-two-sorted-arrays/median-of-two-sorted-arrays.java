class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // MEDIAN -> MIDDLE VALUE AFTER SORTING THE ARRAY

        int size = nums1.length + nums2.length;
        int[] nums = new int[size];
        int i=0, j=0 , k=0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                nums[k++] = nums1[i++];
            } else {
                nums[k++] = nums2[j++];
            }
        }

        while (i < nums1.length) {
            nums[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            nums[k++] = nums2[j++];
        }
        
        int mid = (nums1.length + nums2.length)/2;
        if(size % 2 != 0){
            return nums[mid];
        }else{
            return (nums[mid-1] + nums[mid])/2.0;
        }
    }
}