package com.oplus.oms.split.full.common;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public class ProcessInfoData {
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f19989c;

    public ProcessInfoData(String str, String str2, List<String> list) {
        this.a = str;
        this.b = str2;
        this.f19989c = list;
    }

    public final boolean a(List<String> list, List<String> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (!list2.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProcessInfoData processInfoData = (ProcessInfoData) obj;
        return Objects.equals(this.a, processInfoData.a) && Objects.equals(this.b, processInfoData.b) && a(this.f19989c, processInfoData.f19989c);
    }

    public String getActionName() {
        return this.b;
    }

    public String getProcessName() {
        return this.a;
    }

    public List<String> getSplitList() {
        return this.f19989c;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, this.f19989c);
    }

    public void setActionName(String str) {
        this.b = str;
    }

    public void setProcessName(String str) {
        this.a = str;
    }

    public void setSplitList(List<String> list) {
        this.f19989c = list;
    }

    public String toString() {
        return "ProcessInfoData{mProcessName='" + this.a + "', mActionName='" + this.b + "', mSplitList=" + this.f19989c + '}';
    }
}
