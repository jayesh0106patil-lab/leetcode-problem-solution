public class Main {
	public static int prefixinteger(int[] a){
		 int i=0, j=0 ,sum=0;
		 while(j<a.length()){
		 	if(a[j]+1==a[j+1]){
		 		sum+=a[j];
		 		j++;
		 	}
		 	else{
		 		i++;
		 		sum=0;
		 		j=i;
		 	}
		 	
		 }
		 HashSet <Integer> set= new HashSet<>();
		 for(int t=0; t<a.length();t++){
		 	set.add(a[t]);
		 }
		 for(int t=0; t<a.length();t++){
		 	if(set.contain(sum)){
		 		sum++;
		 	}
		 	else{
		 		return sum;
		 		}
		 		
		}
	public static void main(String[] args) {
		int[] a = {1,2,3,2,5};
		prefixinteger( a);
		
	}
}