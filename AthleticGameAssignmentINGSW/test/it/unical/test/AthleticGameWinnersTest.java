package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {

	private static AthleticGame game;
	
	@BeforeClass
	public static void init(){
		game=new AthleticGame("pallavolo");
	}
	
	@Before
	public void before(){
		game.start();
	}
	@Test
	public void winnerTest1(){
		game.addArrival("Antonio",Instant.now().plusMillis(500));
		game.addArrival("Luca",Instant.now().plusMillis(1500));
		game.addArrival("Matteo",Instant.now().plusMillis(1200));
		Assert.assertEquals("Antonio",game.getWinner());
	}
	
	@Test
	public void winnerTest2(){
		game.addArrival("Antonio",Instant.now().plusMillis(500));
		game.addArrival("Luca",Instant.now().plusMillis(500));
		game.addArrival("Matteo",Instant.now().plusMillis(1500));
		Assert.assertNotEquals("Luca",game.getWinner());
	}
	
	
	@After
	public void after(){
		game.reset();
	}
	
}
