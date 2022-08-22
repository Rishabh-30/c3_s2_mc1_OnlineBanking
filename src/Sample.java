public class Sample {


        static int temp;
        int area;

       /* public static int tempCalculation(){
            return temp * area;
        }*/

        public int calculateArea(){
            return temp * area;
        }

        public static void main(String[] args){

            Sample s1 = new Sample();
            Sample s2 = new Sample();

            s1.temp = 10;
            s1.area = 150;

            s2.temp = 20;
            s2.area = 100;
            int s1Calculation = s1.calculateArea();

            int s2Cal = s2.calculateArea();

        }
    }

