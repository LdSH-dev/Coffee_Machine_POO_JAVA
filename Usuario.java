package pratica09;



public class Usuario {
    
    private String id;
    private int AguaLongo;
    private int CafeLongo;
    private int AguaCurto;
    private int CafeCurto;
    
    public Usuario (String id) {
        this.id = id;
        AguaLongo = 90;
        CafeLongo = 32;
        AguaCurto = 50;
        CafeCurto = 20;
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
}
