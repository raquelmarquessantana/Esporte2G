public class Main {
    public static void main(String[] args) {

        Pessoa qualquer = new Pessoa();
        qualquer.setNome("Rebeca Andrade");
        System.out.println(qualquer.getNome());

        Esportista jogadora = new Esportista();
        Esportista surfista = new Esportista(345);
        jogadora.setNome("Taíssa do Volei");
        System.out.println(jogadora.getNome());

        // Polimorfismo
        Pessoa outra = new Pessoa();
        String retorno = outra.sacar();
        System.out.println(retorno);

    }
}