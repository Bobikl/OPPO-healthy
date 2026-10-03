package com.oplus.oms.split.full.common;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class SplitInfoData {
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f19990c;

    public SplitInfoData(String str, String str2, List<String> list) {
        this.a = str;
        this.b = str2;
        this.f19990c = list;
    }

    public String getMainProcessName() {
        return this.b;
    }

    public String getSplitName() {
        return this.a;
    }

    public List<String> getSubProcessList() {
        return this.f19990c;
    }

    public void setMainProcessName(String str) {
        this.b = str;
    }

    public void setSplitName(String str) {
        this.a = str;
    }

    public void setSubProcessList(List<String> list) {
        this.f19990c = list;
    }

    public String toString() {
        return "SplitInfoData{mSplitName='" + this.a + "', mMainProcessName='" + this.b + "', mSubList=" + this.f19990c + '}';
    }
}
