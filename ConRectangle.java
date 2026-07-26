

public class ConRectangle{

    public static void main(String[] args){
       
        int n=0;

        int m=0;

        String line=IO.readln();

        String[] parts=line.split(" ");


        n=Integer.parseInt(parts[0]);
        m=Integer.parseInt(parts[1]);

        int k=m*n;

         char[] arr=new char[k];

         int l=0;


         for(int i=0;i<k;i++){
           
            arr[i]=(char)('A'+l);
            l++;
            if(l==26){
                l=0;

            }


         }

         int p=0;

         for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){

                IO.print(arr[p]);
                
                p++;
              
                
                
            }

            IO.println();

         }



    }

}