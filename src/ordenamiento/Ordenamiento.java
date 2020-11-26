package ordenamiento;
import java.util.Arrays;
import javax.swing.JOptionPane;
/*@Ramon*/
public class Ordenamiento {

    
    public static void main(String[] args) {
        String options [] = {"Nombres", "Números"};
        int op = JOptionPane.showOptionDialog(null, "Bienvenido, haga click en el tipo de datos que desea ordenar",
                "Ordenamiento de arreglos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if(op==0){
            ordenarString();
        }
        if(op==1){
            ordenarNumeros();
        }
    }
   
    public static void ordenarString(){
        String[] nombres = {"Ete", "Sech", "Jose",
            "Ramon", "Luis", "Sharon"};
        JOptionPane.showMessageDialog(null, "Se van a ordenar los siguientes nombres: "+nombres[0]+", "+nombres[1]+", "+nombres[2]+", "+nombres[3]+", "+nombres[4]+", "+nombres[5]);
        Arrays.sort(nombres);
        for (String i : nombres) {
            System.out.print(i + ", ");
        }
    }    
    public static void ordenarNumeros(){        
        int[] numeros = {2, 7, 9, -5, 4, 9, 22, 1};
        JOptionPane.showMessageDialog(null, "Se van a ordenar los siguientes números: "+numeros[0]+", "+numeros[1]+", "+numeros[2]+", "+numeros[3]+", "+numeros[4]+", "+numeros[5]+", "+numeros[6]+", "+numeros[7]);      
        Arrays.sort(numeros);
        for (int i : numeros) {
            System.out.print(i + ", ");       
        }   
    }    
}