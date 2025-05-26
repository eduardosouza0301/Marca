public class Marca {

    private String nome;
    private int peso;
    
    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()) {
        this.nome = nome;
        System.out.println("Nome da marca: " + nome);
        } else {
        System.out.println("Nome da marca inválido.");
        }
    }
    public void setPeso(int peso) {
        if(peso == 1000) {
            this.peso = peso;
        System.out.println("Embalagem tamanho G.");
        } else {
        System.out.println("Embalagem de tamanho inferiores a G, como P ou M. ");
        }
    }
    public String getNome () {
        return nome;
    }
    public int getPeso() {
        return peso;
    }

    public String getNomeInfo() {
        return "Nome: " + this.getNome() + ", Peso: "
    + this.getPeso();
    }

    public void verificarPeso(double quantidade) {
        if(quantidade == 200 ) {
            System.out.println("Embalagem tamanhoa P.");
        } else if(quantidade == 500) {
            System.out.println("Embalagem tamanho M.");
        } else {
            System.out.println("Embalagem tamanho G.");
        }
        

        }
}
    
    

