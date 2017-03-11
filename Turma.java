
/**
 * Escreva a descrição da classe Turma aqui.
 * 
 * @author Gelly Viana Mota
 * @version 08/03/17.
 */
public class Turma
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Aluno aluno1;
    private Aluno aluno2;
    private Aluno aluno3;

    /**
     * COnstrutor para objetos da classe Turma
     */
    public Turma(Aluno alun1, Aluno alun2, Aluno alun3)
    {
        // inicializa variáveis de instância
       aluno1 = alun1;
       aluno2 = alun2;
       aluno3 = alun3;
    }

    public double calcularMedia(){
        double resultadoTurma = (aluno1.calcularMedia() + aluno2.calcularMedia() + aluno3.calcularMedia())/3;
        if(resultadoTurma >= 0){
            return resultadoTurma;
        }
        else{
            return -1;
        }
    }
}
