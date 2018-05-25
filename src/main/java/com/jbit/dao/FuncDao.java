package com.jbit.dao;

import com.jbit.entity.Func;

public interface FuncDao {
    Func selectByPrimaryKey(String name);
}