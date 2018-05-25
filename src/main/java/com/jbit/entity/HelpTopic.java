package com.jbit.entity;

public class HelpTopic {
    private Integer helpTopicId;

    private String name;

    private Short helpCategoryId;

    private String url;

    public Integer getHelpTopicId() {
        return helpTopicId;
    }

    public void setHelpTopicId(Integer helpTopicId) {
        this.helpTopicId = helpTopicId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getHelpCategoryId() {
        return helpCategoryId;
    }

    public void setHelpCategoryId(Short helpCategoryId) {
        this.helpCategoryId = helpCategoryId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}