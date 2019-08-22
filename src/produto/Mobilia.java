package produto;
public class Mobilia 
{
     private int codigo;
     private String modelo;
     private float preco;
     
     public void setCodigo(int codigo)
     {
         this.codigo = codigo;
     }
     public int getCodigo()
     {
         return(this.codigo);
     }
     public void setModelo(String modelo)
     {
         this.modelo = modelo;
     }
     public String getModelo()
     {
         return(this.modelo);
     }
     public void setPreco(float preco)
     {
         this.preco = preco;
     }
     /*public float getPreco()
     {
         return(this.preco);
     }*/
     private float getPreco()
     {
         return(this.preco);
     } 
     //Se este método for private não servirá para nada.
     
}
