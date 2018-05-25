package com.jbit.dao;

import com.jbit.entity.TimeZoneTransition;
import com.jbit.entity.TimeZoneTransitionKey;

public interface TimeZoneTransitionDao {
    TimeZoneTransition selectByPrimaryKey(TimeZoneTransitionKey key);
}