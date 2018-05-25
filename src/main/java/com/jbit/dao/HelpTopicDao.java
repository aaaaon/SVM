package com.jbit.dao;

import com.jbit.entity.HelpTopicWithBLOBs;

public interface HelpTopicDao {
    HelpTopicWithBLOBs selectByPrimaryKey(Integer helpTopicId);
}