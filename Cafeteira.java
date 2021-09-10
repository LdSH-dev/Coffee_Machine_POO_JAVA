package pratica09;

public class Cafeteira
{
    private String modelo;
    private boolean ligado;
    private int contadorCafeCurto;
    private int contadorCafeLongo;
    private int CafeCurto;
    private int AguaCurto;
    private int CafeLongo;
    private int AguaLongo;
    private Usuario user1;
    private Usuario user2;
    private Usuario user3;
    private Usuario userAtivo;
    
    public Cafeteira(String modelo)
    {
        this.modelo = modelo;
        this.ligado = false;
        this.contadorCafeCurto = 0;
        this.contadorCafeLongo = 0;
        this.CafeCurto = 20;
        this.AguaCurto = 50;
        this.CafeLongo = 32;
        this.AguaLongo = 90;
        this.user1 =  new Usuario ("Usuário 1");
        this.user2 =  new Usuario ("Usuário 2");
        this.user3 =  new Usuario ("Usuário 3");
        this.userAtivo = user1;
        
    }

    public String getModelo()
    {
        return modelo;
    }

    public boolean isLigado()
    {
        return ligado;
    }

    public void ligar()
    {
        this.ligado = true;
    }
    
    public void desligar()
    {
        this.ligado = false;
    }

    public int getContadorCafeCurto()
    {
        return contadorCafeCurto;
    }

    public int getContadorCafeLongo()
    {
        return contadorCafeLongo;
    }

    public void reinicializar()
    {
        this.contadorCafeCurto = 0;
        this.contadorCafeLongo = 0;
    }

    public int getCafeCurto()
    {
        return CafeCurto;
    }

    public int getAguaCurto()
    {
        return AguaCurto;
    }

    public int getCafeLongo()
    {
        return CafeLongo;
    }

    public int getAguaLongo()
    {
        return AguaLongo;
    }

    public boolean setCafeCurto(int CafeCurto)
    {
        boolean ok = false;
        if (CafeCurto >= 10 && CafeCurto <= 30)
        {
            this.CafeCurto = CafeCurto;
            ok = true;
        }
        return ok;
    }

    public boolean setAguaCurto(int AguaCurto)
    {
        boolean ok = false;
        if (AguaCurto >= 30 && AguaCurto <= 60)
        {
            this.AguaCurto = AguaCurto;
            ok = true;
        }
        return ok;
    }

    public boolean setCafeLongo(int CafeLongo)
    {
        boolean ok = false;
        if (CafeLongo >= 25 && CafeLongo <= 45)
        {
            this.CafeLongo = CafeLongo;
            ok = true;
        }
        return ok;
    }

    public boolean setAguaLongo(int AguaLongo)
    {
        boolean ok = false;
        if (AguaLongo >= 70 && AguaLongo <= 110)
        {
            this.AguaLongo = AguaLongo;
            ok = true;
        }
        return ok;
    }

    public void setUserAtivo(Usuario userAtivo) {
        this.userAtivo = userAtivo;
    }

    public Usuario getUser1() {
        return user1;
    }

    public Usuario getUser2() {
        return user2;
    }

    public Usuario getUser3() {
        return user3;
    }

    public Usuario getUserAtivo() {
        return userAtivo;
    }
    
    

}
