package desicao;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class desicao_a1 {
	public static void main(String [] args) {
		Scanner sca = new Scanner(System.in);
        System.out.println("Voce me indica no seu trampo? (responda com sim ou nao)");
        String sn = sca.nextLine();
        String sim = "sim";
        String nao = "nao";
        if(sn.equals(sim)) {
        	System.out.println("Muito obrigado, vou dar meu melhor! \n");
        }else if (sn.equals(nao)) {
        	System.out.println("Vai gaga, nem queria mesmo");
        }else {
        	System.out.println("Resposta invalida.Reinicie a pagina e tente novamente");
        }
        String resposta = sca.nextLine().toLowerCase();
        System.out.println("Deseja reiniciar? Y/N");
        String reiniciar = sca.nextLine();
        if (!resposta.equals("reiniciar")) {
            boolean reiniciar1 = false;
        }
       }
}