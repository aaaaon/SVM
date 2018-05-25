package com.jbit.dao;

import com.jbit.entity.ProcsPriv;
import com.jbit.entity.ProcsPrivKey;

public interface ProcsPrivDao {
    ProcsPriv selectByPrimaryKey(ProcsPrivKey key);
}