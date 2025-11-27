public class Primes {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[num + 1];

        for (int i = 2; i < arr.length; i++) {
            arr[i] = true;
            if((i != 2) && (i % 2 == 0))
                arr[i] = false;
            if((i != 3) && (i % 3 == 0)) 
                arr[i] = false;
            if((i != 5) && (i % 5 == 0))
                arr[i] = false;
            if((i != 7) && (i % 7 == 0))
                arr[i] = false;
        }
        System.out.println("Prime numbers up to " + num + ":");
        int i = 2;
        int n = 0;
        while(i < arr.length){
            if(arr[i] == true){
                System.out.println(i);
                n++;
            }
            i++;
        }
        double procent = ((double)n / num) * 100;
        System.out.println("There are " + n + " primes between 2 and 30 (" + (int)procent + "% are primes)");
    }        
}
