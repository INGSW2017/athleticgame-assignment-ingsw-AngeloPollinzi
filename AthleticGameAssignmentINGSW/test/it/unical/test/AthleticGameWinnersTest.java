package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;
import org.junit.Assert;

public class AthleticGameWinnersTest {

	private static AthleticGame game;
	private static String partecipant1;
	private static String partecipant2;
	private static String partecipant3;
	private static String partecipant4;
	private static Instant now;
	
	@BeforeClass
	public static void init() {
		game=new AthleticGame("nuoto");
		partecipant1=new String("Angelo");
		partecipant2=new String("Marco");
		partecipant3=new String("Luca");
		partecipant4=new String("Matteo");
		now=Instant.now();
	}
	
	@Before
	public void start() {
		game.start();
	}
	
	@After 
	public void reset() {
		game.reset();
	}
	
	@Test
	public void getWinnerWorks1() {
		game.addArrival(partecipant1, now.plusMillis(100));
		game.addArrival(partecipant2, now.plusMillis(400));
		game.addArrival(partecipant3, now.plusMillis(200));
		game.addArrival(partecipant4, now.plusMillis(800));
		Assert.assertEquals(partecipant1, game.getWinner());
	}
	
	@Test
	public void getWinnerWorks2() {
		game.addArrival(partecipant1, now.plusMillis(600));
		game.addArrival(partecipant2, now.plusMillis(200));
		game.addArrival(partecipant3, now.plusMillis(200));
		game.addArrival(partecipant4, now.plusMillis(800));
		Assert.assertNotNull(game.getWinner());
	}
	
}
