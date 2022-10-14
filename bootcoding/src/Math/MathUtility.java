package Math;

public class MathUtility {
    public static void main(String[] args) {
        MathUtility S1=new MathUtility();
        System.out.println("\nProblem-1");
        S1.getASquareMinusBSquare(4,2);

        System.out.println("\nProblem-2");
        S1.getAPlusBWholeSquare(2,6);

        System.out.println("\nProblem-3");
        S1.getASquarePlusBSquare(6,3);

        System.out.println("\nProblem-4");
        S1.getAMinusBWholeSquare(10,5);

        System.out.println("\nProblem-5");
        S1.getAPlusBPlusCWholeSquare(2,4,6);

        System.out.println("\nProblem-6");
        S1.getAMinusBMinusCWholeSquare(8,1,3);

        System.out.println("\nProblem-7");
        S1.getAPlusBCube(3,5);

        System.out.println("\nProblem-8");
        S1.getAMinuBCube(3,5);


    }

    public int getASquareMinusBSquare(int a,int b){
        //Problem 1
        // a2 – b2 = (a – b)(a + b)
//        int a = 4;
//        int b = 2;
       //int c = (a - b);
        //int d = (a + b);
        //e=a to the power 2 - b to the power 2
       int  c = (a-b)*(a+b);
        System.out.println(c);
        /* for(int i=0;i<100;i++){
            int result=getASquareMinusBSquare(i+4,i+2);
        }*/
        return c;
    }
    public int getAPlusBWholeSquare(int a,int b){
        //Problem 2
        // (a + b)2 = a2 + 2ab + b2.
       //int a=3;
       //int b=6 ;
       //int c=a*a;
       //int d=b*b;
       //int e=2*a*b;
       //i=(a+b)to the power 2
        int c=(a*a)+(2*a*b)+(b*b);
        System.out.println(c);
        return c;
    }
    public int getASquarePlusBSquare(int a,int b){
        //Problem 3
        // a2+ b2 = (a + b)2 – 2ab
        //int a=6;
        //int b=3;
        //int c=2*a*b;
        //int d=(a+b)*(a+b);
        //i=a to the power 2 + b to the power 2
        int c=(a+b)*(a+b)-2*a*b;
        System.out.println(c);
        return c;
    }
    public int getAMinusBWholeSquare(int a,int b){
        //Problem 4
        // (a – b)2 = a2 – 2ab + b2.
        //int a=10;
        //int b=5;
        //int c=a*a;
        //int d=b*b;
        //int e=2*a*b;
        //c=(a-b)to the power 2
        int c=a*a-2*a*b+b*b;
        System.out.println(c);
        return c;
    }
    public int getAPlusBPlusCWholeSquare(int a,int b,int c){
        //Problem 5
        // (a + b + c)2 = a2 + b2 + c2 + 2ab + 2bc + 2ca
        //int a=2;
        //int b=4;
        //int c=6;
        //int d=a*a+b*b+c*c;
        //int e=2*a*b+2*b*c+2*c*a;
        //d=(a+b+c)to the power 2
        int d=a*a+b*b+c*c+2*a*b+2*b*c+2*c*a;
        System.out.println(d);
        return d;
    }
    public int getAMinusBMinusCWholeSquare(int a,int b,int c){
        //Problem 6
        // (a – b – c)2 = a2 + b2 + c2 – 2ab + 2bc – 2ca
        //int a=8;
        //int b=1;
        //int c=3;
        //int d=(a*a)+(b*b)+(c*c);
        //int e=(2*a*b+2*b*c-2*c*a);
        //d=(a-b-c)to the power 2
        int d=a*a+b*b+c*c-2*a*b+2*b*c-2*c*a;
        System.out.println(d);
        return d;

    }
    public int getAPlusBCube(int a,int b){
        //Problem 7
        // (a + b)3 = a3 + 3a2b + 3ab2 + b3
        //int a=3;
        //int b=5;
        //int c=a*a*a;
        //int d=b*b*b;
        //int e=3*a*a*b+3*a*b*b;
        //d=(a+b)to the power3
        int d=a*a*a+3*a*a*b+3*a*b*b+b*b*b;
        System.out.println(d);
        return d;

    }
    public int getAMinuBCube(int a,int b){
        //Problem 8
        // (a – b)3 = a3 – 3a2b + 3ab2 – b3
        //int a=3;
        //int b=5;
        //int c=a*a*a;
        //int d=b*b*b;
        //int e=-3*a*a*b+3*a*b*b;
        //d=(a-b)to the power 3
        int d=a*a*a-3*a*a*b+3*a*b*b-b*b*b;
        System.out.println(d);
        return  d;
    }


}