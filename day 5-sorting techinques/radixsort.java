public class RadixSort{
  private final int arr[];
  public RadixSort(int arr[]){
    this.arr=arr;
  }
  
 public void counting(int exp){
   int countarray[]=new int[10];
   for(int value:arr){
   countarray[(value/exp)%10]++;
   }
   
   for(int i=1;i<10;i++){
     countarray[i+=countarray[i-1];
     }
                
    int output[]=new int[arr.length];
    for(int i=arr.length-1;i>=0;i--){
    int current=arr[i];
    int posinarray=countarray[(current/exp)%10]-1;
    output[posinarray]=current;
     countarray[(current/exp)%10]--;
      }
     System.arraycopy(output,0,arr,0,arr.length);
                
private void sort(){
  int max=Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
  for(int exp=1;max/exp>0;exp*=10){
    countingsort(exp);
  }
}
public static void main(String args[]){
  int arr[]={1012,5221,2212,3234,4734};
  System.out.println(Arrays.toString(arr));
  new RadixSort(arr).sort();
  System.out.println(Arrays.toString(arr));
}
