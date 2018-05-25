package com.jbit.dao;

import com.jbit.entity.TimeZoneTransitionType;
import com.jbit.entity.TimeZoneTransitionTypeKey;

public interface TimeZoneTransitionTypeDao {
    TimeZoneTransitionType selectByPrimaryKey(TimeZoneTransitionTypeKey key);
}