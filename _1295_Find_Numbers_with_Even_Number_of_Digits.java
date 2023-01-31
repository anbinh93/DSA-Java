public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumber(int[] nums){
        int res = 0;
        for (int a : nums){
            //check if digit numbers of i are even or not
            //if digit number is odd, add 1 for res
            int digits_numbers = digitsNumber(a);
                if(digits_numbers % 2 == 0) 
                    res++;
                
        }
        return res;
    }

    private static int digitsNumber(int i) {
        int biendem = 0;
        int ket_qua = i;
        while(ket_qua != 0){
            ket_qua = i/10;
            i = ket_qua;
            biendem++;
        }
        return biendem;
    }

    public static void main(String[] args) {
        int[] nums = {1,22,3,44};
        System.out.println(findNumber(nums));
    }
}
