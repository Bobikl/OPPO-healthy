package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public class i7d {
    public static String a(long j2) {
        if (j2 < 1000) {
            return String.format("%.0f B", Double.valueOf(j2));
        }
        if (j2 < 1024) {
            return "1 KB";
        }
        if (j2 < 1024000) {
            return String.format("%.0f KB", Double.valueOf(j2 / 1024.0d));
        }
        if (j2 < 1048576) {
            return "1.0 MB";
        }
        if (j2 < 104857600) {
            return String.format("%.1f MB", Double.valueOf(j2 / 1048576.0d));
        }
        if (j2 < 1048576000) {
            return String.format("%.0f MB", Double.valueOf(j2 / 1048576.0d));
        }
        if (j2 < 1073741824) {
            return "0.98 GB";
        }
        return j2 < 10737418240L ? String.format("%.2f GB", Double.valueOf(j2 / 1.073741824E9d)) : String.format("%.1f GB", Double.valueOf(j2 / 1.073741824E9d));
    }
}
