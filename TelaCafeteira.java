package pratica09;

import java.util.Scanner;

public class TelaCafeteira
{
    private Cafeteira cf;
    

    public TelaCafeteira(Cafeteira cf)
    {
        this.cf = cf;
    }
    
    public void exibir()
    {
        String selectUsuario = "SELECIONE UM USUÁRIO \n \n"+
                              "[1] Usuário 1"+
                              "[2] Usuário 2"+
                              "[3] Usuário 3";
        
        String menuD = "M E N U ("+cf.getModelo()+")\n\n"+
                      "[p] Ligar\n"+
                      "[a] Abastecer água\n"+
                      "[g] Abastecer café\n"+
                      "[x] Sair\n\n"+
                      "Digite a sua opção:";
        
        String menuL = "M E N U ("+cf.getModelo()+")\n\n"+
                      "[p] Desligar\n"+
                      "[c] Café Curto\n"+
                      "[l] Café Longo\n"+
                      "[a] Abastecer água\n"+
                      "[g] Abastecer café\n"+
                      "[s] Estado da cafeteira\n"+
                      "[f] Configurar\n"+
                      "[x] Sair\n\n"+
                      "Digite a sua opção:";
        
        char op = ' ';
        while (op != 'x')
        {
            Scanner sc1 = new Scanner (System.in);
            String menu = menuD;
            
            if (cf.isLigado())
            {
                menu = menuL;
            }
            char user = ' ';
            System.out.println(selectUsuario);
            user = sc1.next().charAt(0);
            
            while (user != '1' || user != '2' || user != '3'){
            if (user == '1'){
                cf.setUserAtivo(cf.getUser1());
            }
             if (user == '2'){
                cf.setUserAtivo(cf.getUser2());
            }
              if (user == '3'){
                cf.setUserAtivo(cf.getUser3());
            }
              else{
                  System.out.println("Digite um usuário válido!");
        }
            }
            
            System.out.println("Digite a capacidade do reservatorio de café (em g): ");
            int inputCafe = sc1.nextInt();
            System.out.println("Digite a capacidade do reservatório de água (em mL): ");
            int inputAgua = sc1.nextInt();
            
            Container c1 = new Container(inputCafe,inputAgua);
            
            
            System.out.println(menu);
            op = sc1.next().toLowerCase().charAt(0);

            if (op == 'p')
            {
                if (cf.isLigado())
                {
                    cf.desligar();
                }
                else
                {
                    cf.ligar();
                }
            }
            else if (op == 'c')
            {
                //boolean sucesso = cf.servirCafeCurto();
                if (c1.reservatorioAgua.consumir(cf.getAguaCurto()) && c1.reservatorioCafe.consumir(cf.getCafeCurto()))
                {
                    System.out.println("Café curto servido");
                }
                else
                {
                    System.out.println("Falta ligar ou abastecer água ou café");
                }
            }
            else if (op == 'l')
            {
                //boolean sucesso = cf.servirCafeCurto();
                if (c1.reservatorioAgua.consumir(cf.getAguaLongo()) && c1.reservatorioCafe.consumir(cf.getCafeLongo()))
                {
                    System.out.println("Café longo servido");
                }
                else
                {
                    System.out.println("Falta ligar ou abastecer água ou café");
                }
            }
            else if (op == 'a')
            {
                c1.reservatorioAgua.abastecer(c1.reservatorioAgua.verificaCapacidade());
                System.out.println("Água abastecida");
            }
            else if (op == 'g')
            {
                c1.reservatorioCafe.abastecer(c1.reservatorioCafe.verificaCapacidade());
                System.out.println("Café abastecido");
            }
            else if (op == 's')
            {
                System.out.println("Estoque Café___________ "+c1.reservatorioCafe.verificaNivel());
                System.out.println("Estoque Água___________ "+c1.reservatorioAgua.verificaNivel());
                System.out.println("Contador Cafés Curtos__ "+cf.getContadorCafeCurto());
                System.out.println("Contador Cafés Longos__ "+cf.getContadorCafeLongo());
            }
            else if (op == 'f')
            {
                System.out.println("Grãos para café curto (gr): " + cf.getCafeCurto());
                int CafeCurto = sc1.nextInt();
                System.out.println("Água para café curto (ml): "+cf.getAguaCurto() );
                int AguaCurto = sc1.nextInt();
                System.out.println("Grãos para café longo (gr): " + cf.getCafeLongo() );
                int CafeLongo = sc1.nextInt();
                System.out.println("Água para café longo (ml): " + cf.getAguaLongo() );
                int AguaLongo = sc1.nextInt();
                
                boolean ok1 = cf.setCafeCurto(CafeCurto);
                boolean ok2 = cf.setAguaCurto(AguaCurto);
                boolean ok3 = cf.setCafeLongo(CafeLongo);
                boolean ok4 = cf.setAguaLongo(AguaLongo);
                
                if (ok1 && ok2 && ok3 && ok4)
                {
                    System.out.println("Configuração realizada com sucesso.");
                }
                else
                {
                    System.out.println("Você informou um dos valores fora de faixa.\nO valor anterior permaneceu para este caso.");
                }
                
            }
        }
    }
}
