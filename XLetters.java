
public class XLetters{

    public static void main(String[] args){
      
        int n=0;

        n=Integer.parseInt(IO.readln());

        char[] arr= new char[n];

        for(int i=0;i<n;i++){
           arr[i]=(char)('A'+i);

        }

        for(int i=0;i<=n/2;i++){

            for(int k=0;k<i;k++){
                IO.print(" ");

            }

            IO.print(arr[i]);

            if(arr[i]!=arr[n-i-1]&&i!=n/2){

                for(int j=0;j<(n-2*i-2);j++){
                    IO.print(" ");

                }

                 if(n%2==0&&i==n/2-1){
                   IO.print(" ");

                 }

                IO.println(arr[n-i-1]);

            }

            else{

                IO.println();

            }

            
        }
        
        int c=0;

        for(int i=n/2-1;i>=0;i--){
          c=0;
            for(int k=i;k>=1;k--){
                IO.print(" ");
              c++;

            }

            IO.print(arr[i]);
          
            for(int j=0;j<(n-2*i-2);j++){

                IO.print(" ");

            }

            if(n%2==0&&i==n/2-1){
                   IO.print(" ");
                              
             }

            IO.println(arr[n-i-1]);


        }

       
    }

}