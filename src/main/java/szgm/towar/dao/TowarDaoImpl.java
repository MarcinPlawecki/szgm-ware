package szgm.towar.dao;
 
import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import szgm.towar.model.Towar;
import szgm.towar.dao.TowarDao;

 
public class TowarDaoImpl extends HibernateDaoSupport implements TowarDao, Serializable {
    	   
    private static final long serialVersionUID = 1L;
    
    private final static Logger LOGGER = Logger.getLogger(TowarDaoImpl.class);
 
	public void addTowar(Towar towar){
		getHibernateTemplate().save(towar);
	}
 
	public List<Towar> findAllTowar(){
		LOGGER.info("dfsgsdgfds");
		return getHibernateTemplate().find("from Towar order by nazwa");
	}
	
}