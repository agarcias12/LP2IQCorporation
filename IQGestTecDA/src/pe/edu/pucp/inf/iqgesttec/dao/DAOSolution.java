/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.iqgesttec.dao;

/**
 *
 * @author ASUS
 */
public interface DAOSolution {
    void CreateSolution();
    void ModifySolution();
    void InsertComponentUse();
    void InsertComponentDamage();
    void addComment(String comment);
    void newVisit();
}
