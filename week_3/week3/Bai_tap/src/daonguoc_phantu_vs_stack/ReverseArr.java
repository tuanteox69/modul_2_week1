package daonguoc_phantu_vs_stack;
import java.util.Stack;

public class ReverseArr {
    public static void main(String[] args) {

        Integer []arr=new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        String str=" oahc nix " ;
        reverseInt(arr);
        for (int a:arr
        ) {
            System.out.print(a+", ");
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(reverseStr(str));

    }
    public static void reverseInt(Integer[] arr){
        Stack<Integer> stack=new Stack<>();
        for (int a:arr
        ) {
            stack.push(a);
        }
        for (int i=0;i< arr.length;i++){
            arr[i]=stack.pop();
        }
    }


    public  static  String reverseStr(String str){
        Stack<String> stack=new Stack<>();
        for (int i=0;i<str.length();i++) {
            stack.push(Character.toString(str.charAt(i)));
        }
        str="";
        while (!stack.isEmpty()){
            str+=stack.pop();
        }
        return str;
    }


}