package model.dao;

import java.util.List;

import model.entities.Department;

// Dao significa Data Acess Object e essa classe é responsável por fazer acesso a dados relacionados a entidade Department
public interface DepartmentDao {

    // Operação responsável por inserir no banco de dados o objeto que eu enviar para o parâmetro de entrada
    void insert(Department obj);

    // Operação responsável por atualizar o dado do objeto inserido no parâmetro no banco de dados
    void update(Department obj);

    // Operação resposável por deletar os dados do banco pelo id inserido no parâmetro 
    void deleteById(Integer id);

    // Operação responsável por pegar o id e consultar no banco de dados um objeto com esse id. Se existir, retorna. Se não existir retorna nulo
    Department findById(Integer id);

    // Operação responsável por consultar no banco de dados todos os dados do departamento
    List<Department> findAll();
}
