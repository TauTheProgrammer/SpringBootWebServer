package com.tau.beans;

import com.tau.enums.Energy;
import com.tau.enums.Season;
import com.tau.enums.Sleep;
import com.tau.enums.Weather;

public record EmotionalRecord(Energy energy, Season season, Sleep sleep, Weather weather, String journalEntry) { }