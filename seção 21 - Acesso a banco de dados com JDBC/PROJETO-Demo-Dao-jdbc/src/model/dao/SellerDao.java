package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;
// Dao significa Data Acess Object e essa classe é responsável por fazer acesso a dados relacionados a entidade Seller
public interface SellerDao {

    // Operação responsável por inserir no banco de dados o objeto que eu enviar para o parâmetro de entrada
    void insert(Seller obj);

    // Operação responsável por atualizar o dado do objeto inserido no parâmetro no banco de dados
    void update(Seller obj);

    // Operação resposável por deletar os dados do banco pelo id inserido no parâmetro 
    void deleteById(Integer id);

    // Operação responsável por pegar o id e consultar no banco de dados um objeto com esse id. Se existir, retorna. Se não existir retorna nulo
    Seller findById(Integer id);

    // Operação responsável por consultar no banco de dados todos os dados de seller
    List<Seller> findAll();

    // Busca os vendedores dado o departamento
    List<Seller> findByDepartment(Department department);
}
