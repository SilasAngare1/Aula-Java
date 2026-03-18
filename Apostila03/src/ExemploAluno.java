public class ExemploAluno {

    public static void main(String[] args) {
        //Criar um objeto do tipo aluno
        Aluno estudante = new Aluno();

        //Atribuir valores para todos os atributos do alunos
        estudante.id = 123;
        estudante.idade = 21;
        estudante.nome = "silasnorris";
        estudante.turma = 'A';
        estudante.matriculado = true;
        estudante.valorMensalidade = 13000;
        estudante.nomeCurso = "analise e desenvolvimento de sistemas";

        //Exibir os valores dos atributos do objeto aluno
        System.out.println("Id:" + estudante.id);
        System.out.println("Nome:" + estudante.nome);
        System.out.println("turma:" + estudante.turma);
        System.out.println("matriculado:" + estudante.matriculado);
        System.out.println("Mensalidade:" + estudante.valorMensalidade);
        System.out.println("Curso:" + estudante.nomeCurso);

        Aluno silas = new Aluno();
        silas.nomeCurso = "analise e desenvolvimento de sistemas";
        silas.idade = 22;
        silas.nome = "Silas Angare Pedroso de Oliveira";

        System.out.println("----------------------------");
        System.out.println("Idade:" + silas.idade);
        System.out.println("Curso:" + silas.nomeCurso);
        System.out.println("Nome:" + silas.nome);
        
       
    }

}

