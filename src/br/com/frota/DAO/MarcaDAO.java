package br.com.frota.DAO;

import br.com.frota.model.Laboratorio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MarcaDAO extends ConexaoDB {

    private static final String INSERT_MARCA_SQL = "INSERT INTO marca (descricao) VALUES (?);";
    private static final String SELECT_MARCA_BY_ID = "SELECT id, descricao FROM marca WHERE id = ?";
    private static final String SELECT_ALL_MARCA = "SELECT * FROM marca;";
    private static final String DELETE_MARCA_SQL = "DELETE FROM marca WHERE id = ?;";
    private static final String UPDATE_MARCA_SQL = "UPDATE marca SET descricao = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM marca;";

    public Integer count() {
        Integer count = 0;
        try (PreparedStatement preparedStatement = prapararSQL(TOTAL)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                count = rs.getInt("count");
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return count;
    }

    public void insertMarca(Laboratorio entidade) {
        try (PreparedStatement preparedStatement = prapararSQL(INSERT_MARCA_SQL)) {
            preparedStatement.setString(1, entidade.getDescricao());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Laboratorio selectMarca(int id) {
        Laboratorio entidade = null;
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_MARCA_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String descricao = rs.getString("descricao");
                entidade = new Laboratorio(id, descricao);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Laboratorio> selectAllMarcas() {
        List<Laboratorio> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_ALL_MARCA)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                entidades.add(new Laboratorio(id, descricao));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteMarca(int id) throws SQLException {
        try (PreparedStatement statement = prapararSQL(DELETE_MARCA_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateMarca(Laboratorio entidade) throws SQLException {
        try (PreparedStatement statement = prapararSQL(UPDATE_MARCA_SQL)) {
            statement.setString(1, entidade.getDescricao());
            statement.setInt(2, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
