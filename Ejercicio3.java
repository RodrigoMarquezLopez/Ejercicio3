public class Ejercicio3
{
    //Metodo
    public int Separar(String numero){
        //Declaracion de variable y arreglo auxiliares
        String result1="";
        String result2="";
        char a[]=new char[numero.length()];
        int i;
        //Ciclo for para asignar valores al arreglo que se terminara cuando encuetre un espacio " "
        for( i=0;i<numero.length();i++){
            a[i]=numero.charAt(i);
         }
         //Asignar a la variable resultado cada uno de los elementos del arreglo 
         for( i=0;i<(a.length)-1;i++){
             if(a[i]==' ')
             break;
             else
             result1=result1+a[i];
            }
         //Ciclo for para asignar el segundo numero que comenzara en una posicion mas adelante donde termino el primero
         for(int x=i+1;x<(a.length);x++){
            result2=result2+a[x];
         }
        //Se realiza la operacion usando el valor absoluto
           int total=Math.abs(Integer.parseInt(result1)-Integer.parseInt(result2)); 
            
            return total;
    }
}
