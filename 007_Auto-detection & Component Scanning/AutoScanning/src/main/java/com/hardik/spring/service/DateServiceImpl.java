package com.hardik.spring.service;

import org.joda.time.LocalDate;
import org.springframework.stereotype.Service;

/**
 * DateService Implementation
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Service("dateService")
public class DateServiceImpl implements DateService {

	@Override
	public LocalDate getNextAssessmentDate() {
		return new LocalDate(2017, 12, 01);
	}

}
