# JSON
A JSON handler written by myself.

## Sample Usage

Test code:


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

Output:


    {
      "sub": {
               "string": "str",
               "list": [],
               "int": 5
             },
      "boolean": false,
      "string": "abc +-*/\" ",
      "double": -2.88,
      "list": [
                "test1",
                -33,
                2.2,
                true,
                {
                  "k": "v"
                }
              ],
      "int": 3
    }
    
## Contact me
If there is any problem, please contact ckcz12345@gmail.com, thanks!

