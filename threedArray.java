class ThreeSdArray{
public static void main(String args[]){
int i,j,k;
int Array[][][]=new int [5][5][5];
for(i=0;i<5;i++){
    for(j=0;j<5;j++){
	    for(k=0;k<5;k++){
		    Array[i][j][k]=i*j*k;
		}
	}
}
for(i=0;i<5;i++){
    for(j=0;j<5;j++){
	    for(k=0;k<5;k++){
		System.out.println(Array[i][j][k] +" ");
		System.out.println();
		}
		System.out.println();
	}
}
}
}
