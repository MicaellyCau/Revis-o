package revisao;

import java.util.List;

public class RegraNegocioEmpresa {
	Empresa[] empre= new Empresa[10];
	int cont = 0; 
	public void CadastrarEmpresa(Empresa empresa) {
		if(empre.length<=10) {
			empre[cont]= empresa;
			cont++;}
		
		}
	private List<Empresa> listarempresas;

}
