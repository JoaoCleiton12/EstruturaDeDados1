import java.io.Serializable;

public class Pessoa implements Serializable{
        private long cpf;
        private String nome;
        private int idade;
        private String sexo;
        private double peso;
        private double altura;
        private double imc;

        public Pessoa(long cpf, String nome, int idade, String sexo, double peso, double altura) {
            this.cpf = cpf;
            this.nome = nome;
            this.idade = idade;
            this.sexo = sexo;
            this.peso = peso;
            this.altura = altura;
            this.imc = (peso / (altura * altura));

        }
    
        public long getCpf() {
            return cpf;
        }

        public void setCpf(long cpf) {
            this.cpf = cpf;
        }

        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }
    
        public void setIdade(int idade) {
            this.idade = idade;
        }

        public String getSexo() {
            return sexo;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }
    
        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }
    
        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }
    
        public double calcularIMC() {
            return imc;
        }
        public String toString() {
            return "CPF: " + cpf + "\n" +
                    "Nome: " + nome + "\n" +
                    "Idade: " + idade + "\n" +
                    "Sexo: " + sexo + "\n" +
                    "Peso: " + peso + "\n" +
                    "Altura: " + altura + "\n" +
                    "IMC: " + imc + "\n";
        }

     }
