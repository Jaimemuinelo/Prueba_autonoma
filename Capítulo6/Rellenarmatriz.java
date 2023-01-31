package Capítulo6;
public class Rellenarmatriz {
    public static void main(String args[]){
        int t[][] = new int[5][5];

        for(int i=0;i<5;i++){
            System.out.println();
            for(int j=0;j<5;j++){
                t[i][j]= i+j;
                System.out.print(t[i][j]+ " ");
            }
        }
    }
}
