
package calculadora;
import javax.swing.JOptionPane;
public class Calculadora {
    public static void main(String[] args) {
        String pnum=
            JOptionPane.showInputDialog( " Insira o primeiro número ");
        String snum=
            JOptionPane.showInputDialog( " Insira o segundo número ");
        int num1 = Integer.parseInt(pnum);
        int num2 = Integer.parseInt(snum);
        String ope=
            JOptionPane.showInputDialog( " Insira a operacao desejada ");
        Calc calculadora = new Calc();
        float resp=0;
        int flag=0;
         switch(ope){
             case "divisão": 
                resp=num1/num2; 
             break;
             case "multiplicação":
                resp=num1*num2;
             break;
             case "adição":
                resp=num1+num2;
             break;
             case "subtração":
                resp=num1-num2;
             default:
                 flag=1;
                 System.out.println("Operação inválida ou sintaxe incorreta, escreva com ~ e ç");
             break;     
         }
         if (flag == 0) {    
           JOptionPane.showMessageDialog( null, resp);
    }
  }
}
    