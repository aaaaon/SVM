package com.jbit.dao;

import com.jbit.entity.Db;
import com.jbit.entity.DbKey;

public interface DbDao {
    Db selectByPrimaryKey(DbKey key);
}