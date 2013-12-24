package szgm.towar.dao;
 
import java.io.Serializable;
import java.util.List;
 

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import szgm.towar.model.Towar;
 
public class TowarDaoImpl extends HibernateDaoSupport implements TowarDao, Serializable {
    	   
    private static final long serialVersionUID = 1L;
 
	public void addTowar(Towar towar){
		getHibernateTemplate().save(towar);
	}
 
	public List<Towar> findAllTowar(){
		return getHibernateTemplate().find("from Towar order by nazwa");
	}
}