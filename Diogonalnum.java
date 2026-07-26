

public class Diogonalnum{

    public static void main(String[] args){
       
       int n=0;
       
       n=Integer.parseInt(IO.readln());

       char[] arr=new char[n];

       for(int i=0;i<n;i++){

        arr[i]=(char)('A'+i);
        
       }

       for(int i=0;i<n;i++){
      
        for(int j=0;j<n;j++){

            if(i==j){
              IO.print(i+1);

            }

            else{
                IO.print(arr[j]);

            }


        }

        IO.println();


    }

}

}