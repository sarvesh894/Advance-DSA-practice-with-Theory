public class print_substrings01 {
    public static void main(String[]args){
         String str="abcd";
         int n=str.length();
         for(int i=0;i<n+1;i++){
            for(int j=i+1;j<n+1;j++){
                System.out.print(str.substring(i,j)+" ");

            }
         }
    }
}