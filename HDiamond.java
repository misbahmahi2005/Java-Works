
public class HDiamond{

    public static void main(String[] args){
    
        int n=0;

        n=Integer.parseInt(IO.readln());
   
        char[] arr= new char[n];

        for(int i=0;i<n;i++){

           arr[i]=(char)('A'+i);

        }

        int k=0;

        k=n+(n-1);
     
        int p=n;

        int r=0;

        int y=0;

      for(int i=1;i<=n;i++){
        
        if(i!=1){
         
          r=k-2*p;

        }

         for(int j=0;j<p;j++){
            
            IO.print(arr[j]);
            
         }

         if(i!=1){

            for(int l=0;l<r;l++){
              IO.print(" ");

            }
           
            

         }

         
         if(i==1){

            for(int q=p-2;q>=0;q--){

              IO.print(arr[q]);


            }


            }

         else{

                for(int q=p-1;q>=0;q--){
                    IO.print(arr[q]);

                }
                

         }

         IO.println();
         p--;

      }

      int h=2;

      int d=0;

      
      for(int i=2;i<=n;i++){

        for(int q=0;q<h;q++){
            IO.print(arr[q]);

        }

        if(i!=n){
           d=k-2*h;

           for(int w=0;w<d;w++){
            IO.print(" ");

           }

        }

        if(i==n){
            for(int e=h-2;e>=0;e--){
              IO.print(arr[e]);

            }
         
        }

        else{

            for(int e=h-1;e>=0;e--){
              IO.print(arr[e]);

            }

        }

        IO.println();

        h++;
        

      }


    }

}