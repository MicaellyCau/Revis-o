package revisao;

import java.util.ArrayList;

public class Imprimir {
public static void main(String[] args) {
	ArrayList<Funcionario> funcionarios= new ArrayList();
	
	Funcionario f1= new Funcionario("999.999.999-21"," Marlon Jose","43.333.433","(88)9 58488447");
	
	Funcionario f2= new Funcionario("322.999.999-21"," Sabino Jose","43.000.433","(88)9 99999999");
	
	Funcionario f3= new Funcionario("333.999.999-21"," Simalias Diogo ","32.398.433","(88)9 66444322");
funcionarios.add(f1);
funcionarios.add(f2);
funcionarios.add(f3);

ArrayList<Empresa> empresas= new ArrayList();
Empresa emp1= new Empresa("77327/0001","Barbados do doda","82 9299292929");

Empresa emp2= new Empresa("4335533/0001","LARAS Bijoterias","82 434342422");

Empresa emp3= new Empresa("9399348/0001","LARAJAS do Joao","82 4378899999");

empresas.add(emp1);
empresas.add(emp2);
empresas.add(emp3);
/*CadastrarFuncionario CadFun= new CadastrarFuncionario();*/

}}
