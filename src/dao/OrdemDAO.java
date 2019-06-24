/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Telas.modelo.OrdemServico;
import Telas.modelo.Pessoa;
import Telas.modelo.Veiculo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Date;

/**
 *
 * @author Lest
 */
public class OrdemDAO {
    
    public static List<OrdemServico> consultar() {
        List<OrdemServico> resultados = new ArrayList<>();
        String sql = "SELECT codigo,pago,valorTotal,progresso,dataOrdem,situação,observação,codVeiculo FROM ordemserviço";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                resultados.add(new OrdemServico(rs.getInt("codigo"),rs.getString("pago"),rs.getDouble("valorTotal"),rs.getString("progresso"),rs.getString("dataOrdem"),rs.getString("situação"),rs.getString("observação"),VeiculoDAO.consultar(rs.getInt("codVeiculo"))));
            }
            return resultados;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(OrdemDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public static boolean inserir(boolean pago,double valorTotal, String progresso, String data, String situacao, String observacao, Veiculo codVeiculo) {
        String sql = "INSERT INTO ordemServiço (pago,valorTotal,progresso,dataOrdem,situação,observação,codVeiculo) VALUES ( ?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            //ps.setInt(1, codigo);
            
            ps.setBoolean(1, pago);
            ps.setDouble(2, valorTotal);
            ps.setString(3, progresso);
            ps.setString(4, data);
            ps.setString(5, situacao);
            ps.setString(6, observacao);
            ps.setInt(7, codVeiculo.getCod());
            System.out.println("'asasas'''asfoaoe");
            ps.executeUpdate();
            ps.close();
            
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    public static OrdemServico consultar(int pk) {
        OrdemServico ne = null;
        String sql = "SELECT codigo,pago,valorTotal,progresso,dataOrdem,situação,observação,codVeiculo FROM OrdemServiço WHERE codigo=?";
        PreparedStatement ps;
        try {
            ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, pk);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ne = new OrdemServico(pk, rs.getString("pago"),rs.getDouble("valorTotal"),rs.getString("progresso"),rs.getString("dataOrdem"),rs.getString("situação"),rs.getString("observação"),VeiculoDAO.consultar(rs.getInt("codVeiculo")));
                
            }
            return ne;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public static boolean excluir(int cod) {
        String sql = "DELETE FROM ordemServiço WHERE codigo = ?";
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
