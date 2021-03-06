package arrays.arrangementOfArrays;

/**
 * Rearrange array in alternating positive & negative items with O(1) extra space | Set 1
 * Last Updated: 13-08-2019
 * Given an array of positive and negative numbers, arrange them in an alternate fashion such that every positive number is followed by negative and vice-versa maintaining the order of appearance.
 * Number of positive and negative numbers need not be equal. If there are more positive numbers they appear at the end of the array. If there are more negative numbers, they too appear in the end of the array.
 * <p>
 * Examples :
 * <p>
 * Input:  arr[] = {1, 2, 3, -4, -1, 4}
 * Output: arr[] = {-4, 1, -1, 2, 3, 4}
 * <p>
 * Input:  arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
 * output: arr[] = {-5, 5, -2, 2, -8, 4, 7, 1, 8, 0}
 * This question has been asked at many places (See this and this)
 * <p>
 * The above problem can be easily solved if O(n) extra space is allowed. It becomes interesting due to the limitations that O(1) extra space and order of appearances.
 * The idea is to process array from left to right. While processing, find the first out of place element in the remaining unprocessed array. An element is out of place if it is negative and at odd index, or it is positive and at even index. Once we find an out of place element, we find the first element after it with opposite sign. We right rotate the subarray between these two elements (including these two).
 * <p>
 * Following is the implementation of above idea.
 */
public class ArrangePossitiveNegativeOptimised {

}
