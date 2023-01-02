class ArraysExample {
    /*void multiArrays() {
        int[][] dob = {{5, 6, 8}, {8, 3, 6}};
        System.out.println(dob[0][0]);
        System.out.println(dob[0][1]);
        System.out.println(dob[0][2]);

        System.out.println(dob[1][0]);
        System.out.println(dob[1][1]);
        System.out.println(dob[1][2]);

        System.out.println(dob[2][0]);
        System.out.println(dob[2][1]);
        System.out.println(dob[2][2]);
        for (int i = 0; i < dob.length; i++) {
            for (int j = 0; j < dob[i].length; j++) {


                System.out.println(dob[i][j]);

            }
        }

    }*/

    void demoArrays() {
        int[] ages = new int[3];
        float[] weights = new float[3];
       String[] Name = new String[3];
        ages[0] = 18;
        ages[1] = 20;
        ages[2] = 22;
        weights[0] = 45.4f;
        weights[1] = 41.1f;
        weights[2] = 60.3f;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        /*System.out.println(ages[2]);
        System.out.printf(weights[0]);
        System.out.printf(weights[1]);
        System.out.printf(weights[2]);*/
        for(int i = 0; i < ages.length; i++){
            System.out.println(ages[i]);
        }


    }


    public class ArraysExample1 {
        public static void main(String[] args) {
            ArraysExample obj = new ArraysExample();
            obj.demoArrays();
            //ArraysExample obj1 = new ArraysExample();
            //obj.multiArrays();
        }

    }
}
