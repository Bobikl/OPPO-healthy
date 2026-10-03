package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes8.dex */
public class v7i {
    public static int a;

    public static void a(int i) {
        if (i == 1 || i == 2) {
            a = i;
            return;
        }
        a = 1;
        w7i.i("SplitLoadStrategy", "splitLoadMode is " + i + ", the setting parameter is wrong. take the default 1", new Object[0]);
    }
}
