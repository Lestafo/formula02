/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Telas.modelo.Pessoa;
import Telas.modelo.Veiculo;
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
 * @author Lest
 */
public class VeiculoDAO {
    public static boolean inserir(String modelo, String tipo, String placa, Telas.modelo.Pessoa cliente) {
        String sql = "INSERT INTO veiculo (modelo,tipo,placa,cliente_num) VALUES ( ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, modelo);
            ps.setString(2, tipo);
            ps.setString(3, placa);
            ps.setInt(4, cliente.getCod());
            System.out.println("'asasas'''asfoaoe");
            ps.executeUpdate();
            ps.close();
            
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public static boolean alterar(String modelo, String placa, String tipo, int num, int codigo) {
        String sql = "UPDATE veiculo SET modelo = ?, SET placa = ?, SET tipo = ?, set cliente_num = ? WHERE codigo = ?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, modelo);
            ps.setString(2, placa);
            ps.setString(3,tipo);
            ps.setInt(4, num);
            ps.setInt(5, codigo);
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

      public static boolean excluir(String sigla) {
        String sql = "DELETE FROM veiculo WHERE codigo = ?";
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
    
    public static List<Veiculo> consultar() {
        List<Veiculo> resultados = new ArrayList<>();
        String sql = "SELECT modelo, tipo, placa,codigo, cliente_num FROM veiculo";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                resultados.add(new Veiculo(rs.getString("modelo"),rs.getInt("codigo"), ClienteDao.consultar(rs.getInt("cliente_num")),rs.getString("placa"),rs.getString("tipo")));
            }
            return resultados;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static Veiculo consultar(String pk) {
        Veiculo ne = null;
        String sql = "SELECT modelo, tipo,placa,codigo,cliente_num FROM pais WHERE sigla=?";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, pk);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ne = new Veiculo(rs.getString("modelo"), rs.getInt("codigo"),ClienteDao.consultar(rs.getInt("cliente_num")) ,rs.getString("placa"),rs.getString("tipo"));
            }
            return ne;
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

