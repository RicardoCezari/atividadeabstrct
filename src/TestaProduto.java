public class TestaProduto {
    public static void main(String[] args) {
        
    
    
    Motor m = new Motor("1234", "uno ", "exelente", 155872.99, 600, 14000);
    Parafuso f = new Parafuso("poia", "Parafuso aco", "resistente", 5.90, 45, 13);
    
    System.out.println(m.imprimirDados());
    System.out.println("Preço Final: "+ m.calcularPrecoFinal());
    
    System.out.println(f.imprimirDados());
    System.out.println("Preço Final: "+ f.calcularPrecoFinal());
    
    } 
}