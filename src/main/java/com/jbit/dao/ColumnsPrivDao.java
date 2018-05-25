package com.jbit.dao;

import com.jbit.entity.ColumnsPriv;
import com.jbit.entity.ColumnsPrivKey;

public interface ColumnsPrivDao {
    ColumnsPriv selectByPrimaryKey(ColumnsPrivKey key);
}