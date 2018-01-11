/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.satriaario.latihanmvcjdbc.event;

import edu.satriaario.latihanmvcjdbc.entity.Pelanggan;
import edu.satriaario.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Asus
 * NIM  : 10116518
 * Nama : Satria Ario Pamungkas
 * Kelas: PBO12
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggans);

}
