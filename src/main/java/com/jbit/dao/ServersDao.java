package com.jbit.dao;

import com.jbit.entity.Servers;

public interface ServersDao {
    Servers selectByPrimaryKey(String serverName);
}