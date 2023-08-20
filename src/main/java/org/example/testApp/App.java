package org.example.testApp;

import org.example.model.Director;
import org.example.model.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration().addAnnotatedClass(Director.class).addAnnotatedClass(Movie.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try{
            session.beginTransaction();
            /*
            * С помощью Hibernate получите любого режиссера, а затем получите список
            * его фильмов
            */
            //Director director = session.get(Director.class, 1);
            //System.out.println(director);
            //List<Movie> movieList = director.getMovieList();
            //System.out.println(movieList);

            /*
            *Получите любой фильм, а затем получите его режиссера.
            */
            //Movie movie = session.get(Movie.class, 6);
            //System.out.println(movie);
            //Director owner = movie.getOwner();
            //System.out.println(owner);

            /*
            *Добавьте еще один фильм для любого режиссера.
            */
            //Director director = session.get(Director.class, 6);
            //Movie movie = new Movie("TestFilm" , 1990 , director);
            //session.save(movie);
            //director.getMovieList().add(movie);

            /*
            * Создайте нового режиссера и новый фильм и свяжите эти сущности.
            */
            //Director testDirector = new Director("TestDirector", 30);
            //Movie movie = new Movie("TestFilm2", 2003 , testDirector);
            //testDirector.setMovieList(new ArrayList<>(Collections.singletonList(movie)));
            //session.save(testDirector);
            //session.save(movie);

            /*
            * Смените режиссера у существующего фильма.
            */
            //Director director = session.get(Director.class, 7);
            //Movie movie = session.get(Movie.class, 1);
            //movie.getOwner().getMovieList().remove(movie);
            //movie.setOwner(director);
            //director.getMovieList().add(movie);

            /*
            * Удалите фильм у любого режиссера.
            */
            //Director director = session.get(Director.class, 1);
            //List<Movie> movieList = director.getMovieList();
            //Movie movie = movieList.get(0);
            //session.remove(movie);
            //movieList.remove(movie);
            session.getTransaction().commit();
        }
        finally {
            session.close();
        }
    }
}
