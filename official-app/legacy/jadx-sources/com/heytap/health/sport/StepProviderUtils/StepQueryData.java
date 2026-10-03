package com.heytap.health.sport.StepProviderUtils;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class StepQueryData {
    private String uri = null;
    private String[] projection = null;
    private String[] selectionArgs = null;
    private String selection = null;
    private String sortOrder = null;
    private int startPos = 0;

    public String[] getProjection() {
        return this.projection;
    }

    public String getSelection() {
        return this.selection;
    }

    public String[] getSelectionArgs() {
        return this.selectionArgs;
    }

    public String getSortOrder() {
        return this.sortOrder;
    }

    public int getStartPos() {
        return this.startPos;
    }

    public String getUri() {
        return this.uri;
    }

    public void setProjection(String[] strArr) {
        this.projection = strArr;
    }

    public void setSelection(String str) {
        this.selection = str;
    }

    public void setSelectionArgs(String[] strArr) {
        this.selectionArgs = strArr;
    }

    public void setSortOrder(String str) {
        this.sortOrder = str;
    }

    public void setStartPos(int i) {
        this.startPos = i;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public String toString() {
        return "StepQueryData{uri=" + this.uri + ", projection=" + this.projection + ", selectionArgs=" + this.selectionArgs + ", selection='" + this.selection + "', sortOrder='" + this.sortOrder + "'}";
    }
}
