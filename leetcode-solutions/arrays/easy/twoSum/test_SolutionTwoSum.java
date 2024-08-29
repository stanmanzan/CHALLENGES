public class test_SolutionTwoSum {

    public static void main(String[] args) {
        SolutionTwoSum solution = new SolutionTwoSum();

        // Prueba / test 1
        int[] nums1 = { 2, 7, 11, 15 };
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Prueba 1 - Indices encontrados: [" + result1[0] + ", " + result1[1] + "]"); // Output: [0,1]
                                                                                                       

        // Prueba / test 2
        int[] nums2 = { 3, 2, 4 };
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Prueba 2 - Indices encontrados: [" + result2[0] + ", " + result2[1] + "]"); // Output: [1,2]
                                                                                                        

        // Prueba / test 3
        int[] nums3 = { 3, 3 };
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Prueba 3 - Indices encontrados: [" + result3[0] + ", " + result3[1] + "]"); // Output: [0,1]
          
        // Prueba / test 4
        int[] nums4 = { 1, 8, -10, 28, 35 };
        int target4 = 25;
        int[] result4 = solution.twoSum(nums4, target4);
        System.out.println("Prueba 3 - Indices encontrados: [" + result4[0] + ", " + result4[1] + "]"); // Output: [2,4]

    }

}
