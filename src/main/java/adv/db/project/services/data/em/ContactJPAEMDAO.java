package adv.db.project.services.data.em;

import java.util.List;

import javax.persistence.TypedQuery;

import adv.db.project.dataModels.Contact;
import adv.db.project.services.data.api.DataAccessException;
import adv.db.project.services.data.api.IContact;

public class ContactJPAEMDAO extends AbstractGenericDAO<Contact> implements IContact{

		@Override
		public List<Contact> search(Contact entity) throws DataAccessException {
			TypedQuery<Contact> query = em.createQuery("from Contact", Contact.class);
			System.out.println(query.getResultList());
			return query.getResultList();
		}

}
