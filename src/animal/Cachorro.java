package animal;

public class Cachorro 
{
    protected int codigo;
    String raca; //Se não coloco nada, será protected.
    protected String sexo;
    public void setCodigo(int codigo)
    {
        if(codigo < 10)
        {//Código não válido.
            this.codigo = -1;
        }else{
            this.codigo = codigo;
        }
    }
    public int getCodigo()
    {
        return(this.codigo);
    }
    public void setRaca(String raca)
    {
        this.raca = raca;
    }
    public String getRaca()
    {
        return(this.raca);
    }
    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }
    public String getSexo()
    {
        return(this.sexo);
    }
}
