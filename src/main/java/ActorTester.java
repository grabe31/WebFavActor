import java.util.List;

import controller.Helpers.ActorHelper;
import model.Actor;

/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Oct 15, 2023
 */
public class ActorTester {
	public static void main(String[] args) {
		Actor test = new Actor("Tom Hanks", "7/9/1956", "2");
		ActorHelper sh = new ActorHelper();
		sh.persist(test);
		List<Actor> allActors = sh.showAllActors();
		for(Actor a: allActors) {
		System.out.println(a.toString());
		}
		}
}
