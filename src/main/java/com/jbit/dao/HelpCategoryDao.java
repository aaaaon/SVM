package com.jbit.dao;

import com.jbit.entity.HelpCategory;

public interface HelpCategoryDao {
    HelpCategory selectByPrimaryKey(Short helpCategoryId);
}