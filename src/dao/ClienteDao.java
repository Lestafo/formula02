/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Telas.modelo.Pessoa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Administrador
 */
public class ClienteDao {

    public static boolean inserir(int codigo, String nome, String endereco,int cidade, long telegone) {
        String sql = "INSERT INTO cliente (numcadastro, nome, endereco, telefone, cidade) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.setString(2, nome);
            ps.setString(3, endereco);
            ps.setInt(5, cidade);
            ps.setInt(4, (int) telegone);
            Telas.modelo.Pessoa.codAtual++;
            System.out.println("'asasas'''asfoaoe");
            ps.executeUpdate();
            ps.close();
            
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public static boolean alterar(String sigla, String nome) {
        String sql = "UPDATE pais SET nome = ? WHERE sigla = ?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, sigla);
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

      public static boolean excluir(String sigla) {
        String sql = "DELETE FROM pais WHERE sigla = ?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, sigla);
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public static List<Pessoa> consultar() {
        List<Pessoa> resultados = new ArrayList<>();
        String sql = "SELECT nome, endereco, telefone, cidade FROM cliente";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                resultados.add(new Pessoa(rs.getString("nome"), rs.getString("endereco"),rs.getLong("telefone"),rs.getInt("cidade")));
            }
            return resultados;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static Map<String, String> consultar(String pk) {
        Map<String, String> resultado = new HashMap<>();
        String sql = "SELECT sigla, nome FROM pais WHERE sigla=?";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, pk);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                resultado.put("sigla", rs.getString("sigla"));
                resultado.put("nome", rs.getString("nome"));
            }
            return resultado;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static void main(String[] args) {
//        boolean resultad = inserir(1223,"Manatouras", "naasa do carailo", 1, 1);
//        if (resultad) {
//            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
//        } else {
//            JOptionPane.showMessageDialog(null, "Erro!");
//        }
        //inserir(123,"asi","nasas",334,1);
    }
}
