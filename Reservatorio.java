package pratica09;


public class Reservatorio
        
{
    
    int capacidade;
    int nivel;

    public void setCapacidade(int capacidade) 
    {
        this.capacidade = capacidade;
    }
    
    public Reservatorio(int capacidade) 
    {
        
        this.capacidade = capacidade;
        this.nivel = 0;
    }

    public int verificaCapacidade() {
        return capacidade;
    }
    
    public int verificaNivel() 
    {
        return nivel;
    }

    public void abastecer (int quantidade_adicionada) 
    {
        this.nivel += quantidade_adicionada;
    }
    public boolean consumir (int quantidade_consumida) 
    {   
        boolean ok;
        if (quantidade_consumida + verificaNivel()<= verificaCapacidade())
        {
            this.nivel -= quantidade_consumida;
            return (ok = true);
        }
        else
        {
            return (ok = false);
        }
        
    }  
}
