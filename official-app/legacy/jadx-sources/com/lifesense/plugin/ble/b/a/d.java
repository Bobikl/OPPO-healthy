package com.lifesense.plugin.ble.b.a;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes5.dex */
final class d implements FileFilter {
    @Override // java.io.FileFilter
    public boolean accept(File file) {
        boolean zI = c.i(file.getName());
        if (zI) {
            return zI;
        }
        return file.getName().indexOf("LSBLE-") == 0;
    }
}
