# JSON
A JSON handler written by myself.

## Sample Usage

Test code:


    String test="{ " +
        "'int': 3, " +
        "'double': -2.88 ,  " +
        "'boolean':  false , " +
        "'string' : 'ab12 +-*/\%21%22%27',"+
        "'list': ['test1', -33, 2.2, true, {'k':'v'}]," +
        "'sub': {'int': 5, 'string': 'str', 'list':[]} , " +
        " }";
    JSON json=JSON.decode(test, true);
 
Output:

    >> JSON.toString(json)
    {"sub":{"string":"str","list":[],"int":5},"boolean":false,"string":"ab12%20%2B-*%2F%5C%21%22%27","double":-2.88,"list":["test1",-33,2.2,true,{"k":"v"}],"int":3}
    
    
    >> JSON.toStringHumanReadable(json)
    {
      "sub": {
               "string": "str",
               "list": [],
               "int": 5
             },
      "boolean": false,
      "string": "ab12 +-*/\!"'",
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
    
    >> JSON.toStringHumanReadable(json.getJson("sub"))
    {
      "string": "str",
      "list": [],
      "int": 5
    }
    
    
## Contact me
If there is any problem, please contact ckcz12345@gmail.com, thanks!

