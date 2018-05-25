package com.jbit.dao;

import com.jbit.entity.TimeZoneLeapSecond;

public interface TimeZoneLeapSecondDao {
    TimeZoneLeapSecond selectByPrimaryKey(Long transitionTime);
}