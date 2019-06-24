/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Telas.modelo.Pecas;
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
public class PecasDAO {
    public static void debug(Exception ex){
        Logger.getLogger(PecasDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    public static boolean inserir(double valor,String nome) {
        String sql = "INSERT INTO pecas (valor,nome) VALUES (?,?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            //ps.setInt(1, codigo);
            ps.setDouble(1, valor);
            ps.setString(2, nome);
            
            
            ps.executeUpdate();
            ps.close();
            System.out.println("Deu");
            
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            debug(ex);
            return false;
        }
    }
    public static List<Pecas> consultar() {
        List<Pecas> resultados = new ArrayList<>();
        String sql = "SELECT nome,valor, codigo FROM pecas";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                resultados.add(new Pecas(rs.getInt("codigo"),rs.getDouble("valor"), rs.getString("nome")));
            }
            return resultados;
        } catch (SQLException | ClassNotFoundException ex) {
            debug(ex);
            return null;
        }
    }
    public static Pecas consultar(int pk) {
        Pecas ne = null;
        String sql = "SELECT codigo, nome,valor FROM pecas WHERE codigo=?";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, pk);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ne = new Pecas(pk,rs.getDouble("valor"),rs.getString("nome"));
                
            }
            return ne;
        } catch (SQLException | ClassNotFoundException ex) {
            debug(ex);
            return null;
        }
    }
        public static boolean alterar(int cod, double valor, String nome) {
        String sql = "UPDATE pecas SET nome = ?, SET valor = ? WHERE codigo = ?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, nome);
            ps.setDouble(2, valor);
            ps.setInt(3, cod);
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            debug(ex);
            return false;
        }
    }
        public static boolean excluir(int cod) {
        String sql = "DELETE FROM pecas WHERE codigo = ?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, cod);
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            debug(ex);
            return false;
        }
    }
}
