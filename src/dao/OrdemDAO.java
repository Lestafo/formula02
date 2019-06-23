/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Telas.modelo.OrdemServico;
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
}
