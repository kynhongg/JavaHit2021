package bai5;

public class RunMain {
        public static boolean isPrime(int n){
            if(n <= 2){
                return false;
            }
            for(int i = 2; i*i <= n; i++){
                if( n % i == 0){
                    return false;
                }
            }
            return n > 1;
        }
        public static boolean isPrime(long n){
            if(n <= 2){
                return false;
            }
            for(int i = 2; i*i <= n; i++){
                if( n % i == 0){
                    return false;
                }
            }
            return n > 1;
        }
        public static boolean isPrime(float n){
            return true;
        }
        public static boolean isPrime(double n){
            return true;
        }

        public static void main(String[] args) {
            System.out.println(isPrime(4));
            System.out.println(isPrime(10000));
            System.out.println(isPrime(5.3f));
            System.out.println(isPrime(22.4));
        }
    }
