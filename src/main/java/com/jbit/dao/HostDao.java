package com.jbit.dao;

import com.jbit.entity.Host;
import com.jbit.entity.HostKey;

public interface HostDao {
    Host selectByPrimaryKey(HostKey key);
}