public class Ejercicio3
{
    //Metodo
    public String Separar(String numero){
        //Declaracion de variable y arreglo auxiliares
        String result="";
        char a[]=new char[numero.length()];
        //Ciclo for para asignar valores al arreglo que se terminara cuando encuetre un espacio " "
        for(int i=0;i<numero.length();i++){
            a[i]=numero.charAt(i);
            if(a[i]== ' '){
                break;
            }
         }
         //Asignar a la variable resultado cada uno de los elementos del arreglo 
         for(int i=0;i<(a.length)-1;i++){
             if(a[i]==' ')
             break;
             else
             result=result+a[i];
            }
            return result;
    }
}
