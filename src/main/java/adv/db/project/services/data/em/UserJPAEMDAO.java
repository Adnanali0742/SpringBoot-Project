package adv.db.project.services.data.em;

import java.util.List;

import javax.persistence.TypedQuery;

import adv.db.project.dataModels.User;
import adv.db.project.services.data.api.DataAccessException;
import adv.db.project.services.data.api.IUser;

public class UserJPAEMDAO extends  AbstractGenericDAO<User> implements IUser{

	@Override
	public List<User> search(User entity) throws DataAccessException {
		TypedQuery<User> query = em.createQuery("from User", User.class);
		System.out.println(query.getResultList());
		return query.getResultList();
	}

}
