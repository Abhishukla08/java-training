//1732 LEETCODE PROBLEM
 public class array2 {
    public static void main(String[] args) {
        int []arr={-5,1,5,0,-7};
        int[]ar=new int[arr.length+1];
        int sum=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            sum=arr[i];
            arr[i]=sum;
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]<max){
                sum=arr[j];
            }

        }
        System.out.println("the highest is" + max);
    }
}
