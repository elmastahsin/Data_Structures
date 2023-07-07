package ETse;

public class FactorsOf3And5 {


        public static void main(String[] args) {
            System.out.println(getIdealNums(200, 405));  // Output: 4
        }

        public static int getIdealNums(int low, int high) {
            int count = 0;
            for (int i = 0; Math.pow(3, i) <= high; i++) {
                for (int j = 0; Math.pow(5, j) <= high; j++) {
                    double number = Math.pow(3, i) * Math.pow(5, j);
                    if (number >= low && number <= high) {
                        count++;
                    }
                    if (number > high) {
                        break;
                    }
                }
            }
            return count;
        }
    }

