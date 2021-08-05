package adv.db.project.services.data.em;

import java.util.List;

import javax.persistence.TypedQuery;

import adv.db.project.dataModels.Address;
import adv.db.project.services.data.api.DataAccessException;
import adv.db.project.services.data.api.IAddress;

public class AddressJPAEMDAO extends AbstractGenericDAO<Address> implements IAddress{

		@Override
		public List<Address> search(Address entity) throws DataAccessException {
			TypedQuery<Address> query = em.createQuery("from Movies", Address.class);
			System.out.println(query.getResultList());
			return query.getResultList();
		}

}
