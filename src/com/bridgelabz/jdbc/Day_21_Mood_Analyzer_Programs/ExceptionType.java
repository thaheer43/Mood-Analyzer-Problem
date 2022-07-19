package com.bridgelabz.jdbc.Day_21_Mood_Analyzer_Programs;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() throws Exception {

		MoodAnalyser moodAnalyzer = new MoodAnalyser("This is a Sad message");
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() throws Exception {

		MoodAnalyser moodAnalyzer = new MoodAnalyser("This is a Happy message");
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenMessage_WhenNull_ShouldThrowMoodAnalysisNullException() {

		MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
		try {
			moodAnalyzer.analyzeMood();
		} catch (MoodAnalyserException e) {
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
		}

	}

	@Test
	public void givenMessage_WhenEmpty_ShouldThrowMoodAnalysisEmptyException() {

		MoodAnalyser moodAnalyzer = new MoodAnalyser("");
		try {
			moodAnalyzer.analyzeMood();
		} catch (MoodAnalyserException e) {
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
}