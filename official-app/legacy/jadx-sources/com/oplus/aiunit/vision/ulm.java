package com.oplus.aiunit.vision;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes12.dex */
public final class ulm implements FileFilter {
    public final /* synthetic */ yhm a;

    public ulm(yhm yhmVar) {
        this.a = yhmVar;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return Pattern.matches("cpu[0-9]+", file.getName());
    }
}
