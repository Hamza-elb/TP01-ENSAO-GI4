package com.ensa.gi4.dao;

import com.ensa.gi4.modele.Materiel;
import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MaterielRowMapper implements RowMapper<Materiel> {
    @Override
    public Materiel mapRow(ResultSet resultSet, int i) throws SQLException {
        Materiel materiel = new Materiel() { // because it is abstract
        };

        String name = resultSet.getString(2);
        String name_ = resultSet.getString("NAME");
        String code_ = resultSet.getString("CODE");
        String code = resultSet.getString(3);
        materiel.setCode(code);
        materiel.setName(name);

        return materiel;
    }

    @Override
    public int[] getRowsForPaths(TreePath[] path) {
        return new int[0];
    }
}