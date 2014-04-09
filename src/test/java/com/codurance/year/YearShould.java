package com.codurance.year;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class YearShould {

	@Test public void
	not_be_a_leap_year_if_not_divisible_by_4() {
		Year year = new Year(1997);
	    assertThat(year.leapYear(), is(false));
	}

}
