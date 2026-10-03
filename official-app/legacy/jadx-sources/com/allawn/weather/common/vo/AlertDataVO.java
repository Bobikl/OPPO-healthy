package com.allawn.weather.common.vo;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class AlertDataVO {
    private List<String> defenseGuideInformation;
    private String description;
    private String landDefenseId;
    private int levelValue;
    private String text;

    public List<String> getDefenseGuideInformation() {
        return this.defenseGuideInformation;
    }

    public String getDescription() {
        return this.description;
    }

    public String getLandDefenseId() {
        return this.landDefenseId;
    }

    public int getLevelValue() {
        return this.levelValue;
    }

    public String getText() {
        return this.text;
    }

    public void setDefenseGuideInformation(List<String> list) {
        this.defenseGuideInformation = list;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setLandDefenseId(String str) {
        this.landDefenseId = str;
    }

    public void setLevelValue(int i) {
        this.levelValue = i;
    }

    public void setText(String str) {
        this.text = str;
    }

    public String toString() {
        return "AlertPO{description='" + this.description + "', text='" + this.text + "', levelValue=" + this.levelValue + "', landDefenseId=" + this.landDefenseId + "', defenseGuideInformation=" + this.defenseGuideInformation + '}';
    }
}
