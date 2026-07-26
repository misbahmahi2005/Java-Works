
public class QSolve{

    public static void main(String[] args){
    
        int n=0;

        n=Integer.parseInt(IO.readln());

        for(int i=1;i<=n;i++){
            
            int m=3*(n-i);

            for(int j=1;j<=m;j++){
                IO.print("*"+" ");

            }

      int p=i*(i+1)/2;

      for(int k=1;k<=i;k++){

        IO.print(String.format("%02d",p));
        IO.print(" ");

     if(k<i){
        IO.print("**"+" ");
     }
       

        p--;

      }

      IO.println();


  }

    }


}