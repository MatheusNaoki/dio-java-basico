public class ForArrays {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS", "LIVIA"};

        for(String aluno : alunos) // coisa estranha
        {
            System.out.println("O nome do aluno é " + aluno);
        }
        for(int x = 0; x < alunos.length; x += 1) //apenas melhor
        {
            System.out.println("O aluno do indice x = " + x + " é " + alunos[x] ); 
        }
    }
}
