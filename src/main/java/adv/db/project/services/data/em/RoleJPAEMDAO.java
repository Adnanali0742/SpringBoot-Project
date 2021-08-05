package adv.db.project.services.data.em;

import java.util.List;

import javax.persistence.TypedQuery;

import adv.db.project.dataModels.Role;
import adv.db.project.services.data.api.DataAccessException;
import adv.db.project.services.data.api.IRole;

public class RoleJPAEMDAO extends  AbstractGenericDAO<Role> implements IRole {
	
		@Override
		public List<Role> search(Role entity) throws DataAccessException {
			TypedQuery<Role> query = em.createQuery("from Role", Role.class);
			System.out.println(query.getResultList());
			return query.getResultList();
		}

}
