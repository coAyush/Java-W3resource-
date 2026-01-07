import java.util.Arrays;
public class Sortable{
    static void main() {

        new BubbleSort().sort(Sort.arr);
    }
}
class BubbleSort implements Sort{
    public void sort(int [] arr){
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}