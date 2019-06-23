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
public class ClienteDAO {

    public static boolean inserir(String nome, String endereco,int cidade, long telegone) {
        String sql = "INSERT INTO cliente (nome, endereco, telefone, cidade) VALUES ( ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            //ps.setInt(1, codigo);
            ps.setString(1, nome);
            ps.setString(2, endereco);
            ps.setInt(4, cidade);
            ps.setInt(3, (int) telegone);
            System.out.println("'asasas'''asfoaoe");
            ps.executeUpdate();
            ps.close();
            
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public static boolean alterar(int cod, String nome) {
        String sql = "UPDATE cliente SET nome = ?, endereco = ?,telefone = ?, cidade = ? WHERE numCadastro = ?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, nome);
            ps.setInt(2, cod);
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

      public static boolean excluir(int cod) {
        String sql = "DELETE FROM cliente WHERE numCadastro = ?";
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
    
    public static List<Pessoa> consultar() {
        List<Pessoa> resultados = new ArrayList<>();
        String sql = "SELECT numCadastro, nome, endereco, telefone, cidade FROM cliente";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                resultados.add(new Pessoa(rs.getInt("numCadastro"),rs.getString("nome"), rs.getString("endereco"),rs.getLong("telefone"),CidadeDAO.consultar(rs.getInt("cidade"))));
            }
            return resultados;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static Pessoa consultar(int pk) {
        Pessoa ne = null;
        String sql = "SELECT numCadastro, nome, endereco FROM cliente WHERE numCadastro=?";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, pk);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ne = new Pessoa(rs.getInt("numCadastro"), rs.getString("nome"), rs.getString("endereco"));
                
            }
            return ne;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
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
