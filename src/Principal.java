/* INTERFACES
 * Se trata de um "contrato" que grandes aplicações fazem para que o
 programador siga o  padrão do projeto definido no início do desenvolvimento.

* 1-> Declarar a classe com a palavra interface
* 2-> Só pode conter as assinaturas dos métodos, sem corpo
* 3-> Não pode ser instanciada
* 4-> A classe que implementa a interface deve implementar todos os seus
* métodos
* 5-> Uma classe pode implementar MAIS DE UMA INTERFACE
*           public class ContaCorrente extends Conta
*           public class ContaCorrente implements Conta, Usuario
  6-> Uma inteface pode implementar/extender diversas outras interfaces (ou seja,
  * adicionar comportamentos e métodos "a mais", aumentando as obrigatoriedades
  * do "contrato"
 */

public class Principal {

    public void calcularSalariodeFuncionario (Funcionario funcionario) {
        if (funcionario instanceof Gerente) {
            //Calculo para Gerente
        } else if (funcionario instanceof Administrador) {
            //Calculo para admnistrador
        } else {
            System.err.println("A classe não implementa a InterfaceDAO, " +
                    "nenhum procedimento foi executado.");
        }
    }
    public static void main(String[] args) {

        Funcionario func01 = new Funcionario();
        Gerente Ger01 = new Gerente();
        String nome = "Anderson";

         if (func01 instanceof InterfaceDAO){
            func01.salvar(nome);
            System.out.println(nome);
        }
        else{
            System.err.println("A classe não implementa a InterfaceDAO, " +
                    "nenhum procedimento foi executado.");
        }
    }
}
