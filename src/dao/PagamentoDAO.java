/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Telas.modelo.Pagamento;
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
public class PagamentoDAO {
        public static boolean inserir(String dataPag,String dataVenc, double valor, int ordemCod) {
        String sql = "INSERT INTO pagamento (dataPag,dataVenc,valor,ordemCod) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            //ps.setInt(1, codigo);
            ps.setString(1,dataPag);
            ps.setString(2, dataVenc);
            ps.setDouble(3, valor);
            ps.setInt(4, ordemCod);
            
            
            ps.executeUpdate();
            ps.close();
            System.out.println("Deu");
            
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    public static List<Pagamento> consultar() {
        List<Pagamento> resultados = new ArrayList<>();
        String sql = "SELECT codigo, dataPag, dataVenc,valor,ordemCod FROM pagamento";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                resultados.add(new Pagamento(rs.getInt("codigo"), rs.getString("dataPag"), rs.getString("dataVenc"), rs.getDouble("valor"), OrdemDAO.consultar(rs.getInt("ordemCod"))));
            }
            return resultados;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public static Pagamento consultar(int pk) {
        Pagamento ne = null;
        String sql = "SELECT codigo, dataPag, dataVenc, valor, ordemCod FROM pagamento WHERE codigo=?";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, pk);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ne = new Pagamento(pk, rs.getString("dataPag"), rs.getString("dataVenc"), rs.getDouble("valor"), OrdemDAO.consultar(rs.getInt("ordemCod")));
                
            }
            return ne;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
        public static boolean alterar(int cod,String dataPag,String dataVenc,double valor,int ordemCod) {
        String sql = "UPDATE Pagamento SET dataPag = ?, dataVenc, valor,ordemCod WHERE codigo = ?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, dataPag);
            ps.setString(2, dataVenc);
            ps.setDouble(3, valor);
            ps.setInt(4, ordemCod);
            ps.setInt(5, ordemCod);
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
        public static boolean excluir(int cod) {
        String sql = "DELETE FROM Pagamento WHERE codigo = ?";
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
