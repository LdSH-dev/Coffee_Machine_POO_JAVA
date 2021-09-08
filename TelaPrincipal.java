package pratica09;

import java.util.Scanner;

public class TelaPrincipal
{
    private Cafeteira c1;
    private Cafeteira c2;

    public TelaPrincipal()
    {
        c1 = new Cafeteira("Saeco Xelsis");
        c2 = new Cafeteira("Delongui Magnifica");
    }
    
    public void exibir()
    {
        String menu = "M E N U\n\n"+
                      "[1] Cafeteira 01\n"+
                      "[2] Cafeteira 02\n"+
                      "[x] Sair\n\n"+
                      "Digite a sua opção:";
        char op = ' ';
        while (op != 'x')
        {
            Scanner sc1 = new Scanner (System.in);
            System.out.println(menu);
            op = sc1.next().toLowerCase().charAt(0);
            if (op == '1')
            {
                TelaCafeteira tela = new TelaCafeteira(c1);
                tela.exibir();
            }
            else if (op == '2')
            {
                TelaCafeteira tela = new TelaCafeteira(c2);
                tela.exibir();
            }
        }
    }
}
