//DO NOT MODIFY
//Designed to test DivisorFinder
public class DivisorFinderTest {
    public static void main(String[] args){
        DivisorFinder d = new DivisorFinder();
        if(args[0].equals( "cF")) {
            System.out.println(d.countFactors(8)); //4
            System.out.println(d.countFactors(24));//8
            System.out.println(d.countFactors(1));//1
            System.out.println(d.countFactors(0));//0
            System.out.println(d.countFactors(7));//2
        }
        if(args[0].equals("iP")) {
            System.out.println(d.isPrime(27));//false
            System.out.println(d.isPrime(47));//true
            System.out.println(d.isPrime(0));//false
            System.out.println(d.isPrime(1));//false
            System.out.println(d.isPrime(2));//true
            System.out.println(d.isPrime(4));//false
        }
        if(args[0].equals("cP")) {
            System.out.println(d.countPrimes(24));//9
            System.out.println(d.countPrimes(1));//0
            System.out.println(d.countPrimes(2));//1
            System.out.println(d.countPrimes(3));//2
        }
    }
}
