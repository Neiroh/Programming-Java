public class TresE{

	public static void main(String[] args) {
		
		for (int i = 0;i<10;i++){
			for (int j = 0;j<10;j++) {
				for (int k = 0;k<10;k++){
					for (int l = 0;l<10;l++) {
						for (int m = 0;m<10;m++) {
							if (i==3){
								System.out.print("E");
							}else{
								System.out.print(i);
							}
							if (j==3){
								System.out.print("E");
							}else{
								System.out.print(j);
							}
							if (k==3){
								System.out.print("E");
							}else{
								System.out.print(k);
							}
							if (l==3){
								System.out.print("E");
							}else{
								System.out.print(l);
							}
							if (m==3){
								System.out.println("E");
							}else{
								System.out.println(m);
							}
						}
					}
				}
			}
		}
	}
}