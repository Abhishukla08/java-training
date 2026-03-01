import java.util.HashMap;

public class hashing_2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=6;
                String str="hello";
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length; j++){
                if(arr[1]+arr[j]==target){
                    System.out.println(i+" "+j);
                }
            }
        }

    }
}
