package principal;

import animal.Cachorro;
import animal.Pessoa;
import produto.Mobilia;

public class Principal 
{
    public static void main(String[] args) 
    {
        Cachorro caozinho = new Cachorro();
        Pessoa pessoinha = new Pessoa();
        Mobilia movelzinho = new Mobilia();
        
        caozinho.setCodigo(15);
        caozinho.setRaca("Labradorhmkk kk");
        caozinho.setSexo("Fêmeaaaa");
        
        // pessoinha.
        // Não consigo acessar os atributos de pessoinha, pois 
        // são privados.
        
        movelzinho.setCodigo(200);
        movelzinho.setModelo("Mesa mogno");
        movelzinho.setPreco(2678);
        
        //movelzinho.getPreco();// Dá erro, pois ele é privado.
        
    } 
}
