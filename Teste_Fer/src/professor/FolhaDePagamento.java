package professor;
import java.util.Scanner;
public class FolhaDePagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor da sua hora trabalhada:");
        float hora = scanner.nextFloat(); 
        System.out.println("Insira a quantidade de horas que voce trabalha:");
        float quantidade = scanner.nextFloat();
        float SalarioBruto = hora * quantidade;
        if (SalarioBruto <= 900 ) {
        	float SINDICADO = (3f / 100) * SalarioBruto;
        	float FGTS = (11f / 100) * SalarioBruto;
        	float result = SalarioBruto - SINDICADO - FGTS;
        	System.out.println("O seu salario Bruto é: " + SalarioBruto + " .Aplicando os desconstos no seu salario, vamos ter a liquidez de: " + result);
        }else if(SalarioBruto <=1500) {
        	float SINDICADO2 = (3f / 100) * SalarioBruto;
        	float FGTS2 = (11f / 100) * SalarioBruto;
        	float IR = (5f / 100) * SalarioBruto;
        	float result2 = SalarioBruto - IR - FGTS2 - SINDICADO2;
        	System.out.println("O seu salario bruto é :" + SalarioBruto + " .Aplicando os descontos no seu salario, vamos ter a liquidez de: " + result2);
        }else if (SalarioBruto <=2500) {
        	float SINDICADO3 = (3f / 100) * SalarioBruto;
        	float FGTS3 = (11f / 100) * SalarioBruto;
        	float IR2 = (10f / 100) * SalarioBruto;
        	float result3 = SalarioBruto - IR2 - FGTS3 - SINDICADO3;
        	System.out.println("O seu salario bruto é :" + SalarioBruto + " .Aplicando os descontos no seu salario, vamos ter a liquidez de: " + result3);
        }else if (SalarioBruto > 2500) {
        	float SINDICADO4 = (3f / 100) * SalarioBruto;
        	float FGTS4 = (11f / 100) * SalarioBruto;
        	float IR3 = (20f / 100) * SalarioBruto;
        	float result4 = SalarioBruto - IR3 - FGTS4 - SINDICADO4;
        	System.out.println("O seu salario bruto é :" + SalarioBruto + " .Aplicando os descontos no seu salario, vamos ter a liquidez de: " + result4);
        }}}