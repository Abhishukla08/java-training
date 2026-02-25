public class prime {

        void primme(int a){



        boolean isPrime=true;
        if(a<=1){
            isPrime=false;
        } else{
            for(int i=2; i<a;  i++){
                if(a%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("is prime");
        } else {
            System.out.println(" not a prime ");
        }

        }

    public static void main(String[] args) {
        prime pm=new prime();
                pm.primme(45);
    }
    }


