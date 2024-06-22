import src.JArray;
import java.util.ArrayList;
import java.util.List;
//import Lrtool.LinearRegression;
public class test {
    public static void main(String[] args){
        // double[] test_array = {2,5,6,8,9,5,5,7,8,28,12,19};
        // JArray test = new JArray(test_array);
        // System.out.println(test.reshape(6, 2));
        double[][] new_test = {{2,3},
    {3,4},
{8,7}};
        JArray test_array = new JArray(new_test);
        System.out.println(test_array.reshape(1,6));
        // System.out.println(model.getWeight());
        // System.out.println(model.getBias());
        
    }
}
