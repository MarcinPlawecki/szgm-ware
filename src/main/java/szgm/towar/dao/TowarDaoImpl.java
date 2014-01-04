package szgm.towar.dao;
 
import java.io.Serializable;
import java.util.List;
 

import java.util.logging.Logger;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import szgm.towar.model.Towar;
 
public class TowarDaoImpl extends HibernateDaoSupport implements TowarDao, Serializable {
    	   
    private static final long serialVersionUID = 1L;
    
    private final static Logger LOGGER = Logger.getLogger(TowarDaoImpl.class.getName());
 
	public void addTowar(Towar towar){
		getHibernateTemplate().save(towar);
	}
 
	public List<Towar> findAllTowar(){
		LOGGER.info("dfsgsdgfds");
		return getHibernateTemplate().find("from Towar order by nazwa");
	}
	
}