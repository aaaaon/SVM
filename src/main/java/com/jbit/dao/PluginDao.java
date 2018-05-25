package com.jbit.dao;

import com.jbit.entity.Plugin;

public interface PluginDao {
    Plugin selectByPrimaryKey(String name);
}