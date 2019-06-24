/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Telas.modelo.Ordem_Pecas;
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
public class OrdemPecasDAO {
    public static void debug(Exception ex){
        Logger.getLogger(OrdemPecasDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    public static boolean inserir(int ordCod, int pecCod, int qtd,double valor) {
        String sql = "INSERT INTO ordemPecas (ordemCod,pecasCod,quantidade,valor) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            //ps.setInt(1, codigo);
            ps.setInt(1,ordCod);
            ps.setInt(2,pecCod);
            ps.setInt(3,qtd);
            ps.setDouble(4, valor);
            ps.executeUpdate();
            ps.close();
            System.out.println("Deu");
            
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            debug(ex);
            return false;
        }
    }
    public static List<Ordem_Pecas> consultar() {
        List<Ordem_Pecas> resultados = new ArrayList<>();
        String sql = "SELECT ordemCod, pecasCod,quantidade,valor FROM ordemPecas";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                resultados.add(new Ordem_Pecas(OrdemDAO.consultar(rs.getInt("OrdemCod")),PecasDAO.consultar(rs.getInt("pecasCod")),rs.getInt("quantidade"),rs.getDouble("valor")));
            }
            return resultados;
        } catch (SQLException | ClassNotFoundException ex) {
            debug(ex);
            return null;
        }
    }
    public static Ordem_Pecas consultar(int pk) {
        Ordem_Pecas ne = null;
        String sql = "SELECT ordemCod,pecasCod,quantidade,valor FROM ordemPecas WHERE codOrdem=?";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, pk);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ne = new Ordem_Pecas(OrdemDAO.consultar(pk), PecasDAO.consultar(rs.getInt("pecasCod")),rs.getInt("quantidade"), rs.getDouble("valor"));
                
            }
            return ne;
        } catch (SQLException | ClassNotFoundException ex) {
            debug(ex);
            return null;
        }
    }

        public static boolean excluir(int cod) {
        String sql = "DELETE FROM ordemPecas WHERE pecasCod = ?";
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
