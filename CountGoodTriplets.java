
public class CountGoodTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7;
		int b=2;
		int c=3;
		int count=0;
		int[] arr = new int[] {3,0,1,1,9,7};
;		count = countGoodTriplets(arr, a, b, c);
		System.out.println("count is:: "+count);

	}
	
	public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        
        int count = 0;
        for(int i=0;i<arr.length-2;i++){
            
            for(int j=i+1;j<arr.length-1;j++){
                
                for(int k=i+2;k<arr.length;k++){
                    
                	System.out.println("i :: j :: k");
                	System.out.println(i+" :: "+j+" :: "+k);
                	
                    if(Math.abs(arr[i]-arr[j]) <= a && Math.abs(arr[j]-arr[k]) <= b && Math.abs(arr[i]-arr[k]) <= c && i<j && j<k){
                        count++;
                        System.out.println("count "+count);
                        System.out.println("----");
                    }
                    
                }
                
            }
            
        }
        return count;
        
	}

}
