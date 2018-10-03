package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Vendedor;

public class VendedorJpaDAO {
	private static VendedorJpaDAO instance;
    protected EntityManager entityManager;
    
    public static VendedorJpaDAO getInstance(){
              if (instance == null){
                       instance = new VendedorJpaDAO();
              }
              
              return instance;
    }

    private VendedorJpaDAO() {
              entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
              EntityManagerFactory factory = Persistence.createEntityManagerFactory("crudHibernatePU");
              if (entityManager == null) {
                       entityManager = factory.createEntityManager();
              }

              return entityManager;
    }
    //lista um vendedor pelo seu id
    public Vendedor getById(final int id) {
              return entityManager.find(Vendedor.class, id);
    }
    //lista todos os vendedores
    @SuppressWarnings("unchecked")
    public List<Vendedor> findAll() {
              return entityManager.createQuery("FROM " + Vendedor.class.getName()).getResultList();
    }
    //insere um dado na tabela 
    public void persist(Vendedor vendedor) {
              try {
                       entityManager.getTransaction().begin();
                       entityManager.persist(vendedor);
                       entityManager.getTransaction().commit();
              } catch (Exception ex) {
                       ex.printStackTrace();
                       entityManager.getTransaction().rollback();
              }
    }
    //atualiza um dado na tabela
    public void merge(Vendedor vendedor) {
              try {
                       entityManager.getTransaction().begin();
                       entityManager.merge(vendedor);
                       entityManager.getTransaction().commit();
              } catch (Exception ex) {
                       ex.printStackTrace();
                       entityManager.getTransaction().rollback();
              }
    }
    //remove um vendedor, mas deve-se passar todos os parâmetros do vendedor
    public void remove(Vendedor vendedor) {
              try {
                       entityManager.getTransaction().begin();
                       vendedor = entityManager.find(Vendedor.class, vendedor.getId());
                       entityManager.remove(vendedor);
                       entityManager.getTransaction().commit();
              } catch (Exception ex) {
                       ex.printStackTrace();
                       entityManager.getTransaction().rollback();
              }
    }
    //remove um vendedor pelo seu id
    public void removeById(final int id) {
              try {
                       Vendedor vendedor = getById(id);
                       remove(vendedor);
              } catch (Exception ex) {
                       ex.printStackTrace();
              }
    }
}
