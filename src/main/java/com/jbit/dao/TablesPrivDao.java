package com.jbit.dao;

import com.jbit.entity.TablesPriv;
import com.jbit.entity.TablesPrivKey;

public interface TablesPrivDao {
    TablesPriv selectByPrimaryKey(TablesPrivKey key);
}