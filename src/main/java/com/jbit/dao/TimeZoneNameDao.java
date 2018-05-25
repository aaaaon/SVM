package com.jbit.dao;

import com.jbit.entity.TimeZoneName;

public interface TimeZoneNameDao {
    TimeZoneName selectByPrimaryKey(String name);
}