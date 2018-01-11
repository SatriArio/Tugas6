/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.satriaario.latihanmvcjdbc.service;

import edu.satriaario.latihanmvcjdbc.entity.Pelanggan;
import edu.satriaario.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
 * @author Asus
 * NIM  : 10116518
 * Nama : Satria Ario Pamungkas
 * Kelas: PBO12
 */
public interface PelangganDao {
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    public void deletePelanggan(Integer id) throws PelangganException;
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    public Pelanggan getelanggan(String email) throws PelangganException;
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
    
}
