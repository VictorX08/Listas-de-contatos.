import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> contatos = new ArrayList<>();
        
        boolean running = true;
        while (running) { 
            System.out.println("1. Adicionar contato"); ;  
            System.out.println("2. Listar contatos");
            System.out.println("0 - sair");
            System.out.print("Escolha': ");
        int escolha = scanner.nextInt();
            scanner.nextLine();
        switch (escolha) {
                case 1:
                    System.out.print("Adicionar contato: ");
                    String contato = scanner.nextLine();
                    contatos.add(contato);
                    break;
                case 2:
                    for (String c: contatos) {
                        System.out.println(c);
                    }   
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    break;
                    
                    
            }
    }
}
}