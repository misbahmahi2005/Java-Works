public class Diamond{

    public static void main(String[] args){
       
      int m=0;

      m=Integer.parseInt(IO.readln());

       char[] arr= new char[m];

      
      for(int i=0;i<m;i++){

        arr[i]=(char)('A'+i);


      }


      for(int i=1;i<=m;i++){

        int n=0;

        for(int p=1;p<=(m-i);p++){
            IO.print(" ");

        }

     if(n<i){

        for(int j=0;j<i;j++){
            IO.print(arr[j]);
            n++;

        }
      

        if(n>=(i)){
           
            for(int k=n-2;k>=0;k--){
               IO.print(arr[k]);

            }

        }

        IO.println();

     }

        
      }

      
      for(int i=m-1;i>=1;i--){
        
        int n=0;

        for(int p=m-1;p>=i;p--){
            IO.print(" ");
            
        }

     if(n<i){

        for(int j=0;j<i;j++){
            IO.print(arr[j]);
            n++;

        }
      

        if(n>=i){
           
            for(int k=n-2;k>=0;k--){
               IO.print(arr[k]);

            }

        }

        IO.println();

     }

        
      }


    }

 }