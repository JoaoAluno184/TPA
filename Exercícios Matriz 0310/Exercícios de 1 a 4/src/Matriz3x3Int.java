public class Matriz3x3Int {
	public static void main(String[]args) {
		int m[][]=new int[3][3];
		int i, j, mar=0, mat=0, l=0, c=0, mel=0, mac=0;
		for(i = 0; i <=2; i++) {
			for(j=0; j<=2; j++) {
				m[i][j]=(int)(Math.random()*30);
			}
		}
		for(i=0; i<=2; i++) {
			for(j=0; j<=2; j++) {
				if(i==0 && j==0) {
					 mat=m[i][j];
				}
				if(m[i][j]<mat) {
					mat=m[i][j];
					mel=i;
					mac=j;
				}
				if(m[i][j]>mar) {
					mar=m[i][j];
					l=i;
					c=j;
				}
				System.out.print("[ "+m[i][j]+" ]");
				if(j==2) {
					System.out.print("\n");
				}
			}
		}
		System.out.println(" ");
		System.out.println("O maior n�mero �: "+mar);
		System.out.println("Linha: "+l);
		System.out.println("Coluna: "+c);
		System.out.println("\n");
		System.out.println("O menor n�mero �: "+mat);
		System.out.println("Linha: "+mel);
		System.out.println("Coluna: "+mac);

	}
}
