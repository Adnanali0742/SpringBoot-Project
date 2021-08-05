package adv.db.project.services.data.em;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import adv.db.project.dataModels.SeenMovies;
import adv.db.project.services.data.api.DataAccessException;
import adv.db.project.services.data.api.ISeenMoviesDAO;

@Transactional(value = Transactional.TxType.REQUIRED)
public class SeenMoviesJPAEMDAO extends AbstractGenericDAO<SeenMovies> implements ISeenMoviesDAO{

	@Override
	public List<SeenMovies> search(SeenMovies entity) throws DataAccessException {
		TypedQuery<SeenMovies> query = em.createQuery("from SeenMovies", SeenMovies.class);
		System.out.println(query.getResultList());
		return query.getResultList();
	}
}
