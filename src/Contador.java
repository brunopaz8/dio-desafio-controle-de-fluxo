import java.util.Scanner;

import handler.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws Exception {

        
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		terminal.close();
		try {
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException exception) {      
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O primeiro parâmetro não pode ser maior que o segundo parâmetro !");
        }
		
		int contagem = parametroDois - parametroUm;
        for (;contagem > 0; contagem--){
            System.out.printf("Número: %s \n", contagem);
        }
	}
}

