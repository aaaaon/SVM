package com.jbit.dao;

import com.jbit.entity.TimeZone;

public interface TimeZoneDao {
    TimeZone selectByPrimaryKey(Integer timeZoneId);
}