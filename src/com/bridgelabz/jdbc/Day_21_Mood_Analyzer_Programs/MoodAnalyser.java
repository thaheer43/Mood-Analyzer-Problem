package com.bridgelabz.jdbc.Day_21_Mood_Analyzer_Programs;

import com.bridgelabz.jdbc.Day_21_Mood_Analyzer_Programs.MoodAnalyserException.ExceptionType;

public class MoodAnalyser {

	String message;

	public MoodAnalyser() {

	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyzeMood() throws MoodAnalyserException {

		try {
			if (message.length() == 0) {
				throw new MoodAnalyserException(ExceptionType.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");
			}
			if (this.message.contains("Sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			throw new MoodAnalyserException(ExceptionType.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
		}
	}

}