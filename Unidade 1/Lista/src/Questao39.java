import java.util.ArrayList;
import java.util.List;

/*
    Utilizando o recurso Generic de Java, construa um programa que tenha funcionalidades
    de um CRUD(create, read, update e delete) de Pessoa.
 */
public class Questao39<T extends Pessoa> {
        private List<T> pessoas;
        public Questao39() {
            pessoas = new ArrayList<>();
        }
        public void create(T pessoa) {
            pessoas.add(pessoa);
        }
        public T read(int index) {
            return pessoas.get(index);
        }
        public void update(int index, T pessoa) {
            pessoas.set(index, pessoa);
        }
        public void delete(int index) {
            pessoas.remove(index);
        }

        public static void main(String[] args) {
            Questao39<Pessoa> crud = new Questao39<>();
            Pessoa pessoa1 = new Pessoa(111111111, "joao", 21, "M", 70, 1.75);
            Pessoa pessoa2 = new Pessoa(222222222, "maria", 24, "F", 80, 1.70);

            //Criando pessoas
            crud.create(pessoa1);
            crud.create(pessoa2);
            
            //Exibindo pessoa
            System.out.println(crud.read(0));
            System.out.println(crud.read(1));
            System.out.println();
           
            //Alterando pessoa
            Pessoa updatepessoa1 = new Pessoa(111111111, "joao cleiton", 21, "M", 70, 1.75);
            crud.update(0, updatepessoa1);
            

            System.out.println("Exibindo apos alterar pessoas");
            for (Pessoa pessoa : crud.pessoas) {
                System.out.println(pessoa);
            }

            //deletando pessoa
            crud.delete(1);
    
             System.out.println("Exibindo apos deletar");
            for (Pessoa pessoa : crud.pessoas) {
                System.out.println(pessoa);
            }
        }
    }
