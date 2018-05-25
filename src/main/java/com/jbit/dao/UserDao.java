package com.jbit.dao;

import com.jbit.entity.UserKey;
import com.jbit.entity.UserWithBLOBs;

public interface UserDao {
    UserWithBLOBs selectByPrimaryKey(UserKey key);
}