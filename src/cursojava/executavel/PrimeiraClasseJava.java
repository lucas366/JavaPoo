package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
		
		/*new Aluno() é uma instancia (Criaçãode objeto)*/
		/* aluno1 é uma referencia para ó objto aluno */
		Aluno aluno1 =  new Aluno();
		
		aluno1.setNome("lucas felipe"); 
		
		System.out.println("Nome no aluno  1  é " + aluno1.getNome());
		
		/*=======================================================================================*/
		Aluno aluno2 =  new Aluno();
		Aluno aluno3 =  new Aluno();
		Aluno aluno4 =  new Aluno("Maria"); 

	}

}
