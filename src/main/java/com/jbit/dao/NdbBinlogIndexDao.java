package com.jbit.dao;

import com.jbit.entity.NdbBinlogIndex;

public interface NdbBinlogIndexDao {
    NdbBinlogIndex selectByPrimaryKey(Long epoch);
}