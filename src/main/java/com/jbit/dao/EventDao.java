package com.jbit.dao;

import com.jbit.entity.EventKey;
import com.jbit.entity.EventWithBLOBs;

public interface EventDao {
    EventWithBLOBs selectByPrimaryKey(EventKey key);
}