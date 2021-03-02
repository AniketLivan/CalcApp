import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int[] sumString(String[] arr){
        int[]  newInt = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            newInt[i] = Integer.parseInt(arr[i]);
        }
        return newInt;
    }

    public static int sumArray(int[] arr){
        int sum =0;
        for(int i =0; i< arr.length;i++){
            sum+= arr[i];
        }
        return sum;
    }

    public static String[] specialSplit(String newString){
        String [] newArray = new String[newString.length()];
        for(int i = 0; i< newString.length(); i++){
            String temp = "";
            if(newString.charAt(i)!=','){
                temp= temp + newString.charAt(i);
            }
            if(newString.charAt(i)==','){
                continue;
            }
        }
        return newArray;
    }

    public static

    public static int parseString(String a){
        List<String> tempList = new ArrayList<String>();
        String[] arr = specialSplit(a);
        System.out.println(arr[0]);
        int[] array = sumString(arr);
        int sum = sumArray(array);

        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a= scan.next();
        int sum = parseString(a);
        System.out.print(sum);

    }
}
