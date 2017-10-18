package it.unical.test;

import java.time.Instant;

import org.junit.Assert;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {

	private static AthleticGame game=new AthleticGame("calcio");
	
	@Test
	public void arrivalTest(){
		game.addArrival("Peppe", Instant.now());
		Assert.assertEquals(1,game.getArrivals().size());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void PartecipantTimeTest(){
		game.getParecipiantTime("Peppe");
	}
}
