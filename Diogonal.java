
public class Diogonal{

    public static void main(String[] args){
     
      int n=0;
      
      n=Integer.parseInt(IO.readln());

      char[] arr= new char[n];

      for(int i=0;i<n;i++){
         arr[i]=(char)('A'+i);

      }

      for(int i=0;i<n;i++){

        for(int j=0;j<n;j++){
          
            if(i==j){
              IO.print(arr[i]);
            }

            else{
                IO.print(".");

            }


        }

        IO.println();


      }
      

    }


}