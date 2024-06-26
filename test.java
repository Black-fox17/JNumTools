//import src.JArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import src.JArray;
//import Lrtool.LinearRegression;
public class test {
    public static void main(String[] args){
        double[] test_array = {2,5,6,8,9,5,5,7,8,28,12,19};
        JArray test = new JArray(test_array);
        // System.out.println(test.reshape(6, 2));
        double[][] new_test = {{2,3},
    {3,4},
{8,7}};
        double[][] test_b = {{4,3},
    {2,8},
{9,7},
{12,23}};


        JArray new_test_b = new JArray(test_b).reshape(2, 4);
        JArray c = new JArray(new_test);
        JArray res = c.mul(new_test_b).flatten();
        System.out.println(res);
        // for(int i = 0; i < new_test.length;i++){
        //     double [] new_row = new double[new_test_b[0].length];
        //     int u = 0;
        //     for (int k = 0; k < new_test_b[0].length;k++){
        //         double[] test_row = new_test[i];;
        //         int j = 0;
        //         double sum = 0;
        //         for (double x: test_row){
        //             sum += x * new_test_b[j][u];
        //             j += 1;
        //         }
        //         u += 1;
        //         new_row[k] = sum;
        //     }
        //     result[i] = new_row;
        // }
        // JArray a = new JArray(new_test);
        // JArray b = new JArray(test_b);
        // JArray result = a.sub(b).reshape(2, 3);

        // ArrayList<double[]> test_g = new ArrayList<>();
        // for (double[] v : new_test){
        //     test_g.add(v);
        // }
        //System.out.println(new_test + test_b);
        // JArray test_array = new JArray(new_test);
        // System.out.println(test_array.reshape(1,6));
        // System.out.println(model.getWeight());
        // System.out.println(model.getBias());
        
    }
}
