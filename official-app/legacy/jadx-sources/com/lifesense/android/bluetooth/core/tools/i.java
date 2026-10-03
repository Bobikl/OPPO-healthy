package com.lifesense.android.bluetooth.core.tools;

import java.io.File;
import java.io.FileFilter;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes4.dex */
public class i {
    public static final long MILLIS_IN_DAY = 86400000;
    public static final int SECONDS_IN_DAY = 86400;

    public class a implements FileFilter {
        public a(i iVar) {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String lowerCase = file.getName().toLowerCase();
            return lowerCase.startsWith("log") && lowerCase.endsWith(".txt");
        }
    }

    static {
        new SimpleDateFormat("MM-dd HH:mm:ss");
    }

    public i(String str) {
        new a(this);
    }
}
