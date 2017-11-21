package it.unical.test;

import java.time.Instant;

import org.junit.Test;

import it.unical.asde.AthleticGame;
import org.junit.Assert;

public class AthleticGameBasicTest {
	
	@Test
	public void addArrivalsWorks() {
		AthleticGame game=new AthleticGame("nuoto");
		game.addArrival("Angelo",Instant.now());
		Assert.assertEquals(1,game.getArrivals().size());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void getParticipantTimeWorks() {
		AthleticGame game=new AthleticGame("nuoto");
		game.getParecipiantTime("Marco");
	}
	
}
