package com.oplus.oms.split.full.core.splitinstall;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class OplusSplitInstallRequest {
    private final List<String> a;

    public OplusSplitInstallRequest(List<String> list) {
        this.a = list;
    }

    public List<String> getModuleNames() {
        return this.a;
    }

    public String toString() {
        return "SplitInstallRequest{modulesNames=" + this.a + "}";
    }
}
