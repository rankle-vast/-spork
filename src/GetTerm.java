public class GetTerm {
    public static void main(String[] args){
        int x = 20;
        if(x>30){
            System.out.println("x>30");
        }else if(x>10){
            System.out.println("10<x<30");
        }else if(x>0){
            System.out.println("0<x<10");
        }else{
            System.out.println("x<0");
        }
        int arr[]={7,5,6,58,56};
        System.out.println("一维数组中的元素分别为：");
        for(int y : arr){
            if(y==5){
                continue;
            }
            System.out.println(y);
        }
    }
}
