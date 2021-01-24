
public class HighestAltitude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gain = new int[] {-5,1,5,0,-7};
		
		int maxAlt = largestAltitude(gain);
		
		System.out.println("Highest Altitude: "+maxAlt);

	}
	
    public static int largestAltitude(int[] gain) {
        
        int maxAlt = 0;
        int sum = maxAlt;
        for(int i=0;i<gain.length;i++){
            sum = gain[i] + sum;
            if (sum > maxAlt){
                maxAlt = sum;
            }
        }
        return maxAlt;
        
    }

}
