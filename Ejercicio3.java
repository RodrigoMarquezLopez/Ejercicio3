public class Ejercicio3
{
    public String Separar(String numero){
        String result="";
        char a[]=new char[numero.length()];
        for(int i=0;i<numero.length();i++){
            a[i]=numero.charAt(i);
            if(a[i]== ' '){
                break;
            }
         }
         for(int i=0;i<(a.length);i++){
             result=result+a[i];
            }
            System.out.println(result);
            return result;
    }
}
