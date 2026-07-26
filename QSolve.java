
public class QSolve{

    public static void main(String[] args){
      
        int p=1;

        int q=0;

        int k=0;

        int n=Integer.parseInt(IO.readln());
       
        

        int temp=0;

        int m=3*n-2;
        
        q=m;
        k=m+1;
        int l=0;

        int c=0;

         
        for(int i=1;i<=n;i++){
          
            
            
            l=p+(i-1);
         
           for(int j=1;j<=m;j++){
            
            

            if(q<=j){
                
               
                IO.print(l+" ");
               p+=1;
               l=l-1;

               if(j!=m){

                IO.print("**"+" ");
                 
                 

               }

               

            }

            
            else if((j+2)<q){

                IO.print("*"+" ");

            }

 
            
           }

           k=k-1;

           q=q-1;

           IO.println();


        }

    }

}