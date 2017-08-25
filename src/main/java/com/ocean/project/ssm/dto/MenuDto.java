package com.ocean.project.ssm.dto;

import java.util.List;

/**
 * @author haiyang.li on 2017/8/25.
 */
public class MenuDto {

    private String id;

    private String name;

    private String url;

    private List<MenuDto> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<MenuDto> getChildren() {
        return children;
    }

    public void setChildren(List<MenuDto> children) {
        this.children = children;
    }
}
