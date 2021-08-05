package adv.db.project.Test.Entity;

import java.sql.SQLException;

import javax.inject.Inject;
import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import adv.db.project.dataModels.Movies;
import adv.db.project.dataModels.SeenMovies;
import adv.db.project.dataModels.User;
import adv.db.project.services.data.api.DataAccessException;
import adv.db.project.services.data.api.IMovies;
import adv.db.project.services.data.api.ISeenMoviesDAO;
import adv.db.project.services.data.api.IUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContextJPA.xml")
@Commit
public class TestClass {
	
	@Inject
	ISeenMoviesDAO iSeenMoviesDAO;
	
	@Inject 
	IUser iUser;
	
	@Inject
	IMovies iMovies;
	
	@Inject
	DataSource ds;
	
	@Test
	@Transactional
	public void test() throws DataAccessException, SQLException {
//		try {
			Movies movies = new Movies();
			iMovies.search(movies);
			
			
			//			iSeenMoviesDAO.search(seenMovies);
//			iSeenMoviesDAO.delete(seenMovies);
//			
//			seenMovies = new SeenMovies(2, "Khan");
//			iSeenMoviesDAO.update(seenMovies);
//			iSeenMoviesDAO.search(seenMovies);
			
//			User user = new User(1, "Adnan");
//			iUser.create(user);
//
//			Movies movies = new Movies(1, "Iron Man", "2019", "Action");
//			iMovies.create(movies);
			
//			iSeenMoviesDAO.create(seenMovies);
//			iSeenMoviesDAO.search(seenMovies);
//			System.out.println(seenMovies.getId());
//			System.out.println(seenMovies.getMovieName());
//			PreparedStatement preparedStatement = ds.getConnection().prepareStatement("SELECT FROM SEEN_MOVIES");
//			ResultSet rs = preparedStatement.executeQuery();
			
//			while(rs.next()) {
//				System.out.println(seenMovies.getMovieName());
				
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}

		}}
