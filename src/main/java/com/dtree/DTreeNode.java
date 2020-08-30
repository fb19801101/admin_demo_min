package com.dtree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-04-20 15:33
 */
public class DTreeNode {
    /**
     * 节点ID
     */
    private String id;
    /**
     * 上级节点ID
     */
    private String parentId;
    /**
     * 节点名称
     */
    private String title;
    /**
     * 是否展开节点
     */
    private Boolean spread;
    /**
     * 是否最后一级节点
     */
    private Boolean last;
    /**
     * 是否隐藏
     */
    private Boolean hide;
    /**
     * 是否禁用
     */
    private Boolean disabled;
    /**
     * 自定义图标class
     */
    private String iconClass;
    /**
     * 表示用户自定义需要存储在树节点中的数据
     */
    private Object basicData;
    /**
     * 复选框集合
     */
    private List<CheckArr> checkArr = new ArrayList<CheckArr>();
    /**
     * 子节点集合
     */
    private List<DTreeNode> children = new ArrayList<DTreeNode>();

    /**
     * 默认构造方法
     */
    public DTreeNode() {
    }

    /**
     * 完整构造方法
     */
    public DTreeNode(String id, String parentId, String title, Boolean spread, Boolean last, Boolean hide, Boolean disabled, String iconClass, Object basicData, List<CheckArr> checkArr, List<DTreeNode> children) {
        this.id = id;
        this.parentId = parentId;
        this.title = title;
        this.spread = spread;
        this.last = last;
        this.hide = hide;
        this.disabled = disabled;
        this.iconClass = iconClass;
        this.basicData = basicData;
        this.checkArr = checkArr;
        this.children = children;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getSpread() {
        return spread;
    }

    public void setSpread(Boolean spread) {
        this.spread = spread;
    }

    public Boolean getLast() {
        return last;
    }

    public void setLast(Boolean last) {
        this.last = last;
    }

    public Boolean getHide() {
        return hide;
    }

    public void setHide(Boolean hide) {
        this.hide = hide;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public String getIconClass() {
        return iconClass;
    }

    public void setIconClass(String iconClass) {
        this.iconClass = iconClass;
    }

    public Object getBasicData() {
        return basicData;
    }

    public void setBasicData(Object basicData) {
        this.basicData = basicData;
    }

    public List<CheckArr> getCheckArr() {
        return checkArr;
    }

    public void setCheckArr(List<CheckArr> checkArr) {
        this.checkArr = checkArr;
    }

    public List<DTreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<DTreeNode> children) {
        this.children = children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DTreeNode dTree = (DTreeNode) o;
        return id.equals(dTree.id) &&
                parentId.equals(dTree.parentId) &&
                title.equals(dTree.title) &&
                spread.equals(dTree.spread) &&
                last.equals(dTree.last) &&
                hide.equals(dTree.hide) &&
                disabled.equals(dTree.disabled) &&
                iconClass.equals(dTree.iconClass) &&
                basicData.equals(dTree.basicData) &&
                checkArr.equals(dTree.checkArr) &&
                children.equals(dTree.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parentId, title, spread, last, hide, disabled, iconClass, basicData, checkArr, children);
    }

    @Override
    public String toString() {
        return "DTree{" +
                "id='" + id + '\'' +
                ", parentId='" + parentId + '\'' +
                ", title='" + title + '\'' +
                ", spread=" + spread +
                ", last=" + last +
                ", hide=" + hide +
                ", disabled=" + disabled +
                ", iconClass='" + iconClass + '\'' +
                ", basicData=" + basicData +
                ", checkArr=" + checkArr +
                ", children=" + children +
                '}';
    }
}
