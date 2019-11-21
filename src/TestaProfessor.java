public class TestaProfessor {
   
    public static void main(String[] args) {
        
        ProfessorIntegral pInt = new ProfessorIntegral("Ricardo", 3700);
        ProfessorHorista pHori = new ProfessorHorista("Tião", 190, 100);
        
        System.out.println("Pagamento Professor Integral " + pInt.getNome() +", é: "+ pInt.calculaSalarioLiquido());
        System.out.println("Pagamento Professor Horista " + pHori.getNome() +", é: "+ pHori.calculaSalarioLiquido());
        
    }
}
    

