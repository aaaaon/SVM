package com.jbit.dao;

import com.jbit.entity.ProcKey;
import com.jbit.entity.ProcWithBLOBs;

public interface ProcDao {
    ProcWithBLOBs selectByPrimaryKey(ProcKey key);
}