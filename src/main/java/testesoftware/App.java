package testesoftware;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        String opc ;
        Scanner scan = new Scanner(System.in);
        
        Controle cntrl = new Controle(0, 0, true);
        
        do {
            
            System.out.println("1: + volume");
            System.out.println("2: - volume");
            System.out.println("3: canal (Numero)");
            System.out.println("4: Ligar/Desligar TV");
            System.out.println("exit: Sair");
            
                opc = scan.next();
                        
            switch (opc) {
            case "1":
                System.out.println(cntrl.aumentarVolume());
                break;

            case "2":            
                System.out.println(cntrl.diminuirVolume());
                break;

            case "3":
                String ch;
                Scanner sch = new Scanner(System.in);
                System.out.println("Digite o canal: ");
                ch = sch.next();
                System.out.println(cntrl.mudarCanal(ch));
                break;    

            case "4":
                System.out.println(cntrl.ligaDesliga());
                break; 

            

            default:
                System.out.println("opçao incorreta");
            } 
            
        } while (!opc.equalsIgnoreCase("Exit")); 
    }
}
