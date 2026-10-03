package com.heytap.health.operations.bean;

import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class ActionBean implements Serializable {
    private String actionName;
    private int actionRestTime;
    private String actionTimes;
    private int groupCount;
    private int groupRestTime;
    private String imageUrl;
    private boolean isAssociates;
    private String phaseRuleName;
    private String upSportAction;

    public String getActionName() {
        return this.actionName;
    }

    public int getActionRestTime() {
        return this.actionRestTime;
    }

    public String getActionTimes() {
        return this.actionTimes;
    }

    public int getGroupCount() {
        return this.groupCount;
    }

    public int getGroupRestTime() {
        return this.groupRestTime;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getPhaseRuleName() {
        return this.phaseRuleName;
    }

    public String getUpSportAction() {
        return this.upSportAction;
    }

    public boolean isIsAssociates() {
        return this.isAssociates;
    }

    public void setActionName(String str) {
        this.actionName = str;
    }

    public void setActionRestTime(int i) {
        this.actionRestTime = i;
    }

    public void setActionTimes(String str) {
        this.actionTimes = str;
    }

    public void setGroupCount(int i) {
        this.groupCount = i;
    }

    public void setGroupRestTime(int i) {
        this.groupRestTime = i;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setIsAssociates(boolean z) {
        this.isAssociates = z;
    }

    public void setPhaseRuleName(String str) {
        this.phaseRuleName = str;
    }

    public void setUpSportAction(String str) {
        this.upSportAction = str;
    }
}
