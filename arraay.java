

public class arraay {
    public static void main(String[] args) {
        int [] aar={1,2,3,4,5,6,7,8,9};
        int k=4;
        int sum =0;
        for( int i=0; i<k;i++){
            sum=aar[i];
        }
        int max=sum;
        for (int i=k;i<aar.length;i++){
            sum=aar[i];
            sum=aar[i-k];
            if (sum>max) max=sum;

            }
        System.out.println(max);
        }

    }

