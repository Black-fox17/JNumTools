//import src.JArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import src.JArray;
import Lrtool.LinearRegression;
import java.util.Random;
//import Lrtool.LinearRegression;
public class test {
    public static void main(String[] args){
        double[][] test_array = {{20, 20, 45},
        {28,54,22},
        {90,120,30},
        {27,55,65}};
        JArray test = new JArray(test_array);
        // System.out.println(test.reshape(6, 2));
        double[][] new_test = {{2,3},
    {3,4},
{8,7}};
        double[][] test_b = {{4,3},
    {2,8},
{9,7},
{12,23}};
        //System.out.println(test.shape()[1]);
        System.out.println(test.sin());
        System.out.println(test.cos());
        System.out.println(test.tan());
        System.out.println(test.sinh());
        System.out.println(test.cosh());
        System.out.println(test.tanh());
        System.out.println(test.arcsin());
        System.out.println(test.arccos());
        System.out.println(test.arctan());
        System.out.println(test.arcsin());
        System.out.println(test.arccos());
        System.out.println(test.arcsinh());
        // System.out.println("Hello world");
        // JArray test_arr = new JArray().sample_rand(27,10);
        // System.out.println(test_arr.mean());
        // System.out.println(test_arr.std());
    }
}
