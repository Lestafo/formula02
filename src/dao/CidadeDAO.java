/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Telas.modelo.Cidade;
import Telas.modelo.Pessoa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lest
 */
public class CidadeDAO {
    public static boolean inserir(String nome) {
        String sql = "INSERT INTO cidade (nome) VALUES (?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            //ps.setInt(1, codigo);
            ps.setString(1, nome);
            
            
            ps.executeUpdate();
            ps.close();
            System.out.println("Deu");
            
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    public static List<Cidade> consultar() {
        List<Cidade> resultados = new ArrayList<>();
        String sql = "SELECT nome, codigo FROM cidade";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                resultados.add(new Cidade(rs.getInt("codigo"),rs.getString("nome")));
            }
            return resultados;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public static Cidade consultar(int pk) {
        Cidade ne = null;
        String sql = "SELECT codigo, nome FROM cidade WHERE codigo=?";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, pk);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ne = new Cidade(pk,rs.getString("nome"));
                
            }
            return ne;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
        public static boolean alterar(int cod, String nome) {
        String sql = "UPDATE cidade SET nome = ? WHERE codigo = ?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, nome);
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
        public static boolean excluir(int cod) {
        String sql = "DELETE FROM cidade WHERE codigo = ?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, cod);
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
