public  abstract class Professor{
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }
    
    public abstract double calculaSalarioLiquido();
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
     
     
}    
    

