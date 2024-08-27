import org.junit.jupiter.api.Test;

public class Testes {
    @Test
    void test(){
        int a = 3;
        Cachorro dog1 = new Cachorro();
        Cachorro dog2 = new Cachorro();
        dog1.setRaca("Golden");
        dog2.setRaca("Pug");
        System.out.println("Dog1: " + dog1.getRaca() + " Dog2: " + dog2.getRaca());
    }

    class Cachorro {
        // Atributos
        String nome;
        String raca;
        int idade;

        public int getIdade() {
            return idade;
        }

        public String getNome() {
            return nome;
        }

        public String getRaca() {
            return raca;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setRaca(String raca) {
            this.raca = raca;
        }
    }
}
