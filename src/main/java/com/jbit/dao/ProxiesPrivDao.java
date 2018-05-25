package com.jbit.dao;

import com.jbit.entity.ProxiesPriv;
import com.jbit.entity.ProxiesPrivKey;

public interface ProxiesPrivDao {
    ProxiesPriv selectByPrimaryKey(ProxiesPrivKey key);
}