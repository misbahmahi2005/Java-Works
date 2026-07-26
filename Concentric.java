public class Concentric{

    public static void main(String[] args){

        int n = Integer.parseInt(IO.readln());

        char[] arr = new char[n];

        for(int i=0;i<n;i++){
            arr[i] = (char)('A'+i);
        }

        int rows = 2*n-3;
        int cols = 2*n-4;

        for(int r=0;r<rows;r++){

            for(int c=0;c<cols;c++){

                int layer = Math.min(Math.min(r, rows-1-r), Math.min(c, cols-1-c));

                char ch = arr[n-2-layer];

                if(r==rows/2 && c==cols/2){
                    ch = arr[0];
                }

                IO.print(ch);
            }

            IO.println();

        }

    }

 }