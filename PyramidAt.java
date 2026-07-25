
public class PyramidAt{

    public static void main(String[] args){
     
        int n;

        n=Integer.parseInt(IO.readln());

        for(int i=n;i>=1;i--){
          
            if(i==n){

                for(int j=1;j<=n;j++){
                    System.out.print("*");

                }

                System.out.println();

            }

            else{

                int m=0;

                m=n-i;

                for(int k=0;k<m;k++){

                    System.out.print(" ");

                }

                for(int p=i;p>=1;p--){
                  
                    if(p==i||p==1){
                       System.out.print("*");
                    }
                 
                   else{
                    System.out.print(" ");

                   }

                }

                System.out.println();
               
            }


        }


        for(int i=2;i<=n;i++){

            if(i==n){
               for(int j=1;j<=n;j++){
                IO.print("*");

               }
               
               IO.println();

            }

            else{

                int m=0;

                m=n-i;

                for(int k=1;k<=m;k++){
                    IO.print(" ");

                }

                for(int p=1;p<=i;p++){

                    if(p==1||p==i){
                        IO.print("*");

                    }

                    else{
                        
                        IO.print(" ");

                    }

                }

                IO.println();

            }


        }


    }

}