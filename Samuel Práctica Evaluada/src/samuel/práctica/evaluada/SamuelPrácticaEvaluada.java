/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package samuel.práctica.evaluada;
import javax.swing.JOptionPane;
/**
 *
 * @author samu0
 */
public class SamuelPrácticaEvaluada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
    String salarioStr = JOptionPane.showInputDialog("Ingrese el salario individual:");
    double salario = Double.parseDouble(salarioStr); //convertir String a double
    
    /*
    Rubros a considerar
    */
    double seguroEnfermedadMaternidad = 0.0925;
    double invalidezVejezMuerte = 0.0508;
    
    /*
    Calcular monto total de acuerdo a los rubros
    */
    double seguro = salario * seguroEnfermedadMaternidad;
    double invalidez = salario * invalidezVejezMuerte;
    double totalPagar= seguro + invalidez;
    
    /*
    Mostrar resultados
    */
    JOptionPane.showMessageDialog(null,"El salario con el seguroEnfermedadMaternidad es:"+seguro +
                                 "\n El salario con invalidezVejezMuerte es:"+invalidez +
                                 "\n La empresa deberá abonar por concepto de SEM y IVM un total de:"+totalPagar);
            
    }
    
}
