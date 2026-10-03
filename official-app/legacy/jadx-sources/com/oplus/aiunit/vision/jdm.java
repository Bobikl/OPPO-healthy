package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class jdm {
    public static /* synthetic */ int a(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        if (i == 6) {
            return -1;
        }
        throw null;
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "DEFAULT_ACTION";
        }
        if (i == 2) {
            return "IMPRESSION";
        }
        if (i == 3) {
            return "CLICK";
        }
        if (i == 4) {
            return "PAGE_VIEW";
        }
        if (i == 5) {
            return "PAGE_END";
        }
        return i == 6 ? "UNRECOGNIZED" : "null";
    }
}
