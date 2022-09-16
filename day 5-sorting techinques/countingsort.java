public class Main
{
    private final int[] arr;
    public countingsort(int[] arr){
        this.arr=arr;
    }
   
    public void sort(){
        int min=Arrays.stream(arr).min().orElse(0);
        int max=Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
        int countarray[]=new int[max-min+1];
        for(int value:arr){
            countarray[value-min]++;
        }
        int arrayindex=0;
        for(int i=0;i<max-min+1;i++){
            while(countarray[i]>0){
                arr[arrayindex]=i+min;
                countarray[i]--;
                arrayindex++;
            }
        }
    }
	public static void main(String[] args) {
		int arr[]={5,2,8,7,-2,2,3,3};
		System.out.println(Arrays.toString(arr));
		new countingsort(arr).sort();
		System.out.println(Arrays.toString(arr));
	}
}

