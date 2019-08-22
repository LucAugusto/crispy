package animal;
public class Pessoa 
{
     private String cpf;
     private String nome;
     
     public void criamosUmCachorro()
     {
         //Esse cachorro foi criado e acessado diretamente,
         //pois os atributos são "protected".
         Cachorro cao = new Cachorro();
         cao.codigo = 15;
         cao.raca = "Dobermann";
         cao.sexo = "macho";
     }
}
