package com.lifesense.plugin.ble.b.a;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
final class e implements Comparator {
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(File file, File file2) {
        long jG = c.g(file.getName());
        long jG2 = c.g(file2.getName());
        if (jG != jG2) {
            if (jG < jG2) {
                return 1;
            }
            return jG == jG2 ? 0 : -1;
        }
        int iB = c.b(file.getName());
        int iB2 = c.b(file2.getName());
        if (iB < iB2) {
            return 1;
        }
        return iB == iB2 ? 0 : -1;
    }
}
