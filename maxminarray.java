public class maxminarray{
    public static void main(String[]args){
        int a[]={45,34,65,223,5};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            
        }
        System.out.println(max);
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
            
        }
        System.out.println(min);
        System.out.println(max+min);
    }
}