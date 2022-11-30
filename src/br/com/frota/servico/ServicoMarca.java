package br.com.frota.servico;

import br.com.frota.DAO.MarcaDAO;
import br.com.frota.model.Laboratorio;

public class ServicoMarca extends MarcaDAO{

    //TODO: Aqui é um exemplo de regra de negócio. possivelmente quando estivermos implementando
    // as regras de vistoria do pneu tenham regras nesse modelo de padrão de projeto.
    public void insertMarca(Laboratorio entidade) {
        if (count() <= 20) {
            super.insertMarca(entidade);
        }
    }
}
