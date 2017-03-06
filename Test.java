/**
 * Test JSON
 * Created by ckcz123 on 2017/3/6.
 */
public class Test {
    public static void main(String[] args){
        String test="{ " +
                "'int': 3, " +
                "'double': -2.88 ,  " +
                "'boolean':  false , " +
                "'string' : 'abc +-*/\\%22 ',"+
                "'list': ['test1', -33, 2.2, true, {'k':'v'}]," +
                "'sub': {'int': 5, 'string': 'str', 'list':[]} , " +
                " }";
        JSON json=JSON.decode(test, true);
        System.out.println(JSON.toStringHumanReadable(json));
    }
}
