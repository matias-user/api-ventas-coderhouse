package com.tareacoder.tareacoderhouse.domain.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tareacoder.tareacoderhouse.domain.entity.Alumno;
import com.tareacoder.tareacoderhouse.domain.entity.Cliente;

import jakarta.persistence.EntityManagerFactory;

@Service
public class DAOFactory {
    private SessionFactory sessionFactory;

    @Autowired
    public DAOFactory(EntityManagerFactory factory) {
        this.sessionFactory = factory.unwrap(SessionFactory.class);
    }
    public void create(Object obj){
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save( obj);
        session.getTransaction().commit();
    }

    public List<Alumno> getAlumnos(){
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Query<Alumno> query = session.createQuery("SELECT al from Alumno al");     
        List<Alumno> alumnos = query.list();
        session.getTransaction().commit();
        return alumnos;
    }
    public List<Cliente> getClientes(){
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Query<Cliente> query = session.createQuery("SELECT cl from Cliente cl");     
        List<Cliente> clientes = query.list();
        session.getTransaction().commit();
        return clientes;
    }
    public void update(Object obj){
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate( obj);
        session.getTransaction().commit();
    }
    public Alumno getAlumnoById(Integer dni){
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Query<Alumno> query = session.createQuery("SELECT al from Alumno al WHERE al.dni = ?1", Alumno.class);     
        Alumno alumno = query.setParameter(1, dni).getSingleResult();
        session.getTransaction().commit();
        return alumno;
    }
    public Cliente getClienteByNombre(String nombre){
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Query<Cliente> query = session.createQuery("SELECT cl from Cliente cl WHERE cl.nombre = ?1", Cliente.class);     
        Cliente cliente = query.setParameter(1, nombre).getSingleResult();
        session.getTransaction().commit();
        return cliente;
    }
    public void borrarClienteByNombre(String nombre){
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Query<Cliente> query = session.createQuery("DELETE FROM Cliente WHERE nombre = ?1");
        query.setParameter(1, nombre);
        query.executeUpdate();
        session.getTransaction().commit();

    }
}
