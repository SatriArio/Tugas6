/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.satriaario.latihanmvcjdbc.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.satriaario.latihanmvcjdbc.impl.PelangganDaoImpl;
import edu.satriaario.latihanmvcjdbc.service.PelangganDao;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author Asus
 * NIM  : 10116518
 * Nama : Satria Ario Pamungkas
 * Kelas: PBO12
 */
public class KingBarbershopDatabase {
    
    private static Connection connection;
    
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws SQLException{
        if (connection==null){
            
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/kingsbarbershop");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
            
        }
        return connection;
    }
    public static PelangganDao getPelangganDao() throws SQLException{
        
        if (pelangganDao==null){
            pelangganDao = new PelangganDaoImpl(getConnection());
        }
        return pelangganDao;
        
    }

    public static PelangganDao getPelangganDao(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
