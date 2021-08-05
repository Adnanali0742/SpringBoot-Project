package adv.db.project.services.data.em;

import java.util.List;

import javax.persistence.TypedQuery;

import adv.db.project.dataModels.Movies;
import adv.db.project.services.data.api.DataAccessException;
import adv.db.project.services.data.api.IMovies;

public class MoviesJPAEMDAO extends AbstractGenericDAO<Movies> implements IMovies{

	@Override
	public List<Movies> search(Movies entity) throws DataAccessException {
		TypedQuery<Movies> query = em.createQuery("from Movies", Movies.class);
		System.out.println(query.getResultList());
		return query.getResultList();
	}

}
