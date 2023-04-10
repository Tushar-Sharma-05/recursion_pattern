public class Main {
    public static void main(String[] args) {

//        int n = 5;
//        for(int i = 0;i<n;i++){
//            for(int j = n;j>i;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        upperTriangle(5,0);
        print(5,0);
    }

    static void print(int r,int c){

        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            print(r,c+1);
        }
        else{
            System.out.println();
            print(r-1,0);
        }



    }

    static void upperTriangle(int r,int c){

        if(r==0){
            return;
        }
        if(c<r){

            upperTriangle(r,c+1);
            System.out.print("*");
        }
        else{

            upperTriangle(r-1,0);
            System.out.println();
        }



    }
}