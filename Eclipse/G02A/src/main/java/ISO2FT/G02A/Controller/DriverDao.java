package ISO2FT.G02A.Controller;

import javax.persistence.Query;

import ISO2FT.G02A.Model.Driver;

public class DriverDao extends GeneralDao<Driver> {
	public DriverDao() {
		super();
	}
	
	public Driver findByDni(String dni) {
		Driver driver = null;
		/*
        try {
            startOperation();
            Query query=session.createQuery("from Driver where dni=?");
            query.setParameter(0, dni);
            driver = (Driver) query.getSingleResult();
            transaction.commit();
        } catch (HibernateException e) {
            throw e;
        } finally {
            HibernateFactory.close(session);
        }*/
        return driver;
	}
}
