import java.util.*;

public class Homework12 {

    private static int [] getInputArray(String text, int n){
        System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        int [] arr =  new int [n];
        for (int i = 0; i < n ; i ++){
            System.out.print(i+1 + ". -> ");
            arr[i] = scanner.nextInt();
            //System.out.println();
        }
        return arr;
    }
    /*
    ---------------------- First Problem ----------------------
 . შემოგვდის რიცხვი. შექმენით შემოსული რიცხვების ტოლი ორი მასივი.
   ორივე შეავსეთ რაღაც ელემენტებით.
   ⁃ შეამოწმეთ:
   ⁃ ეს ორი მასივი ტოლია თუ არა (ანუ ზუსტად იგივე თანმიმდევრობით
   იგივე ელემენტების არის თუ არა შევსებული)
   ⁃ მაგალითად:
   ⁃ მასივი {1, 2, 3} და მასივი {1, 2, 3} ტოლია.
   ⁃ მასივი {1, 2, 3} და მასივი {1, 3, 2} არ არის ტოლია.
   ⁃ მასივი {1, 2, 3} და მასივი {4, 5} არ არის ტოლია.
   ⁃ შემდეგ დაბეჭდეთ ამ მასივების საერთო ელემენტები
   ⁃ მაგალითად:
   ⁃ {1, 2, 3, 4} და {2, 3, 5, 6} მასივებს საერთო ექნებოდათ 2 და 3.
*/
    private static void firstProblem(){
        System.out.println("---------------------- First Problem ----------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("შემოიტანეთ მასივის სიგრძე:");
        int n= scanner.nextInt();
        int [] firstArray = getInputArray("პირველი მასივის წევრები",n);
        int [] secondArray =getInputArray("მეორე მასივის წვერები", n);
        Set<Integer> setOfSimilars = new HashSet<>();
        if(isEqual(firstArray,secondArray)){
            System.out.println("მოცემული მასივები ტოლია");
        }
        else {
            for (int elem : secondArray){
                if(sameElements(firstArray,elem)){
                    setOfSimilars.add(elem);
                }
            }
            System.out.println("მოცემული მასივები არ არის ტოლი");
            System.out.println("საერთო ელემნტებია:" + setOfSimilars);
        }
    }

    private static boolean isEqual(int[] firstArray, int[] secondArray){
        String stringOfFirstArray = Arrays.toString(firstArray);
        String stringOfSecondArray = Arrays.toString(secondArray);
        return stringOfSecondArray.equals(stringOfFirstArray);
    }

    private static boolean sameElements(int[] firstArray, int givenElem){
        for (int elem : firstArray){
            if(elem == givenElem){
                return true;
            }
        }
        return false;
    }
    /*
    ---------------------- Second Problem ----------------------
    დაწერეთ პროგრამა, რომელიც გამოიტანს მასივში მეორე ყველაზე დიდ
    რიცხვს. მაგალითად, მასივში {3, 2, 1 4} პასუხი იქნებოდა 3. რადგან
    მაქსიმალური რიცხვი არის 4 და მაგის შემდეგ ყველაზე დიდი რიცხვი
    არის 3. მასივი შეგიძლიათ ხელით კოდშივე (hard-coded) შეავსოთ.
    აუცილებელი არ არის რომ მისი ზომა და ელემენტები კონსოლიდან
    შეიყვანოთ (როგორც წინა ამოცანაში).
    */

    private static void secondProblem(){
        System.out.println("---------------------- Second Problem ----------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("შემოიტანეთ მასივის სიგრძე");
        int n = scanner.nextInt();
        int [] arr = getInputArray("შემოიტანეთ მასივის წევრები",n);
        System.out.println("მასივში მეორე ყველაზე დიდი ელემენტია -> " + secondMax(arr));
    }

    private static int secondMax(int [] arr){
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }




    public static void main(String[] args) {
        firstProblem();
        secondProblem();
    }
}
