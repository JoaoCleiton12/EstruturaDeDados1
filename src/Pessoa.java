public class pessoa {
        private long cpf;
        private String nome;
        private int idade;
        private String sexo;
        private double peso;
        private double altura;
        private double imc;
    
        public pessoa(long cpf, String nome, int idade, String sexo, double peso, double altura) {
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
    
        public String getNome() {
            return nome;
        }
    
        public int getIdade() {
            return idade;
        }
    
        public String getSexo() {
            return sexo;
        }
    
        public double getPeso() {
            return peso;
        }
    
        public double getAltura() {
            return altura;
        }
    
        public double calcularIMC() {
            return imc;
        }
     }
