package revisao;

import java.util.List;

public class RegraNegovioFuncionario {
 
	Funcionario[] funcio= new Funcionario[100];
	int cont = 0; 
	public void CadastrarFuncionario(Funcionario funcionario) {
		if(funcio.length<=10) {
			funcio[cont]= funcionario;
			cont++;}
		}
	private List<Funcionario> listarfuncinarios;
	
	public List<Funcionario> getListarfuncinarios() {
		return listarfuncinarios;
	}
	public void setListarfuncinarios(List<Funcionario> listarfuncinarios) {
		this.listarfuncinarios = listarfuncinarios;
	}



}
