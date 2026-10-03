package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes18.dex */
public class ybh {
    public static int a(float f) {
        if (f >= 20.0f) {
            return 0;
        }
        return (f < 10.0f || f >= 20.0f) ? -2 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r4 > 70.0f) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        if (r4 > 90.0f) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(long j2, float f) {
        if (j2 > 0) {
            if (f > 60.0f && f <= 70.0f) {
                return 1;
            }
        } else if (f > 80.0f && f <= 90.0f) {
            return 1;
        }
    }

    public static int c(float f) {
        if (f < 10.0f) {
            return -1;
        }
        return f > 30.0f ? 1 : 0;
    }

    public static int d(long j2) {
        if (j2 < 20) {
            return 0;
        }
        return j2 <= 40 ? 1 : 2;
    }

    public static int e(int i) {
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 3;
        }
        return i == 4 ? 2 : 4;
    }
}
