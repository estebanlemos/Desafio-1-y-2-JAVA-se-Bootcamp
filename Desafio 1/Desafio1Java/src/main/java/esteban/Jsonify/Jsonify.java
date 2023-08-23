package esteban.Jsonify;


public class Jsonify {

    public static void main(String[] args) {
        String jsonStringArray="";
       
        for (int i=0; i<args.length; i++) {
                                           
         if (i == 0) {
             jsonStringArray = "\""+ args[i] + "\"";
         } else {
             jsonStringArray += ","+"\""+args[i]+"\"";             
         }
                                 
            
        }
       String output = "{\"data\":["+ jsonStringArray+ "]}";
       System.out.println(output);
    }
}

