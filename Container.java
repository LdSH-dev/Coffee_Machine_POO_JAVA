package pratica09;


public class Container {
    
    Reservatorio reservatorioCafe;
    Reservatorio reservatorioAgua;
    
    public Container (int capacidadeCafe, int capacidadeAgua)
    {
        reservatorioCafe = new Reservatorio(capacidadeCafe);
        reservatorioAgua = new Reservatorio(capacidadeAgua);
    }
    
  
}
