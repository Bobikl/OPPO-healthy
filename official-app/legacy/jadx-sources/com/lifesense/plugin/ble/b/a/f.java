package com.lifesense.plugin.ble.b.a;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes5.dex */
final class f implements FileFilter {
    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return c.h(file.getName());
    }
}
