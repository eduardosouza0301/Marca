public class POOMarca {
    public static void main(String[] args) {
        
        Marca marca = new Marca();

        marca.setNome("cozinhando");

        marca.setPeso(1000);

        System.out.println(marca.getNome());

        System.out.println(marca.getPeso());

        System.out.println(marca.getNomeInfo());

        marca.verificarPeso(200);

    }        
}
