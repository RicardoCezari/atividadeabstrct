public class ProfessorHorista extends Professor{

    private int horas;
    private double valorHora;
    
    public ProfessorHorista(String nome, int hora, double valor) {
        super(nome);
        this.setHoras(hora);
        this.setValorHora(valor);
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
     
    public double calculaSalarioLiquido() {
        double valor;
        valor= this.getHoras()*this.getValorHora();
        return valor - valor*0.05;
    }
    
}
