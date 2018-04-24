package com.excilys.cdb.dao;

import java.sql.SQLException;

import com.excilys.cdb.exceptions.NoObjectException;
import com.excilys.cdb.model.Computer;
import com.excilys.cdb.utils.Page;

/**
 * Interface regroupant toutes les transactions sur la BD.
 * @param <T>
 *            L'objet manipulé
 */
public interface DAO<T> {

    /**
     * Récupère une page d'objet de la base.
     * @param page
     *            le numéro de la page
     * @return la page contenant les objets
     * @throws SQLException
     *             Exception liée à la requete
     */
    Page<T> findAll(int page) throws SQLException;

    /**
     * Récupère l'objet voulu.
     * @param id
     *            l'id de l'objet voulu
     * @return l'objet voulu
     * @throws SQLException
     *             Exception liée à la requete
     */
    T findById(long id) throws SQLException;

    /**
     * Ajoute une objet dans la base.
     * @param t
     *            l'objet à ajouter
     * @return l'id du nouvelle objet
     * @throws SQLException
     *             Exception liée à la requete
     * @throws NoObjectException
     *             Exception lancée quand l'objet est null
     */
    int add(T t) throws SQLException, NoObjectException;

    /**
     * Supprime l'objet voulu.
     * @param id
     *            l'id de l'objet à supprimer
     * @throws SQLException
     *             Exception liée à la requete
     */
    void delete(long id) throws SQLException;

    /**
     * Met à jour l'objet voulu.
     * @param t
     *            l'objet contenant les nouvelles informations
     * @return le nouvel objet
     * @throws SQLException
     *             Exception liée à la requete
     * @throws NoObjectException
     *             Exception lancée quand un objet est null ou inexistant
     */
    Computer update(T t) throws SQLException, NoObjectException;

    /**
     * Récupère le nombre de page maximum d'un table d'objet.
     * @return le nombre maximum de page
     * @throws SQLException
     *             Exception liée à la requete
     */
    int getMaxPage() throws SQLException;
}
