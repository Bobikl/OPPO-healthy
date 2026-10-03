package com.heytap.health.operations.bean;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class StageBean implements Serializable {
    private List<ActionBean> actions;
    private int phaseRestTime;
    private String phaseRule;

    public List<ActionBean> getActions() {
        return this.actions;
    }

    public int getPhaseRestTime() {
        return this.phaseRestTime;
    }

    public String getPhaseRule() {
        return this.phaseRule;
    }

    public void setActions(List<ActionBean> list) {
        this.actions = list;
    }

    public void setPhaseRestTime(int i) {
        this.phaseRestTime = i;
    }

    public void setPhaseRule(String str) {
        this.phaseRule = str;
    }
}
