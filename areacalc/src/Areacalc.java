import java.util.Scanner;

public class Areacalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            System.out.println("choose your operation from the list and enter the repective number \n" +
                    "1. Area Of Circle \n" +
                    "2. Area Of Triangle\n" +
                    "3. Area Of Rectangle \n" +
                    "4. Area Of Isosceles Triangle \n" +
                    "5. Area Of Parallelogram\n" +
                    "6. Area Of Rhombus or square\n" +
                    "7. Area Of Equilateral Triangle\n" +
                    "enter 8 to choose operation again" +
                    "enter 0 to exit");
        while(true) {
            System.out.println("choose the operation");
            int op = in.nextInt();

            System.out.println("you choosed " + op);// for checking is it taking right input or not

            if (op == 1 || op == 2 || op == 3 || op == 4 || op == 5 || op == 6 || op == 7  ) {
                if (op == 1) {
                    System.out.println("enter radius of circle");
                    int r = in.nextInt();
                    acricle(r);
                    System.out.println("Area of circle :" + acricle(r));
                }
                if (op == 2) {
                    System.out.println("enter length and breadth of triangle respectfully");
                    int l = in.nextInt();
                    int b = in.nextInt();
                    atriangle(l, b);
                    System.out.println("Area of triangle :" + atriangle(l, b));
                }
                if (op == 3) {
                    System.out.println("enter length and breadth of retriangle respectfully");
                    int l = in.nextInt();
                    int b = in.nextInt();
                    aretriangle(l, b);
                    System.out.println("Area of retriangle :" + aretriangle(l, b));
                }
                if (op == 4) {
                    System.out.println("enter base and hieght of Isosceles triangle respectfully");
                    int b = in.nextInt();
                    int h = in.nextInt();
                    aisotriangle(b, h);
                    System.out.println("Area of Isosceles triangle :" + aisotriangle(b, h));

                }
                if (op == 5) {
                    System.out.println("if you habe hight and base press 1 \n and if you have length and bredth press 2");
                    int o = in.nextInt();
                    if (o == 1) {
                        System.out.println("enter base and height of parallelogram respectfully");
                        int b = in.nextInt();
                        int h = in.nextInt();
                        aparallelogram( b,h);
                        System.out.println("Area of parallelogram :" + aparallelogram(b,h));
                    }
                    if (o ==2) {
                        System.out.println("enter length and breadth of parallelogram respectfully");
                        int l = in.nextInt();
                        int b = in.nextInt();
                        aretriangle(l, b);
                        System.out.println("Area of parallelogram :" + aretriangle(l, b));
                    }
                    else break;

                }
                if (op == 6) {
                    System.out.println("enter side of rhombus or square");
                    int s = in.nextInt();
                    arhombus(s);
                    System.out.println("Area of rhombus :" + arhombus(s));
                }
                if (op == 7) {
                    System.out.println("enter side of triangle");
                    int s = in.nextInt();
                    aequitriangle(s);
                    System.out.println("Area of equilateral triangle :" + aequitriangle(s));
                }

                if (op == 8) {
                    break;
                }

            }
            else if(op ==0){
                break;

            }
            else {
                System.out.println("invalid operation");
            }
        }

    }

    private static float aequitriangle(int s) {
        float t = 3/4f;
        float  A= t*s*s;
        return A;
    }

    static float arhombus( float s ){
        float A = s*s;
        return A;
    }
     static float aparallelogram(float b, float h) {
         float v = 2f;
         float A = ( b*h)/ v;
         return A;
    }

    static float aretriangle(int l, int b) {

        float A = (l * b);
        return A;
    }
    static float aisotriangle(int b, int h) {
        float ha = 1 / 2f;
        float A =  ( ha*b*h);
        return A;
    }

     static float atriangle(int l, int b) {
         float h = 1 / 2f;
         float A =  ( h*l*b);
         return A;
    }

    static float acricle(int r) {
   float A = (float) (3.14159*r*r);
        return A;
    }

}
