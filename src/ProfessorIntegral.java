public class ProfessorIntegral  extends Professor{

    private double salario;
    
    public ProfessorIntegral(String nome, double salario) {
        super(nome);
        this.setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calculaSalarioLiquido() {
        return this.getSalario() - this.getSalario()*0.11;
        
    }
    
    
}