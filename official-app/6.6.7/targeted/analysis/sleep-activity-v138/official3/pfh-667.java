package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes18.dex */
public class pfh {
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
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(long r2, float r4) {
        /*
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r3 = 1
            r0 = 2
            if (r2 <= 0) goto L1a
            r2 = 1114636288(0x42700000, float:60.0)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r1 = 1116471296(0x428c0000, float:70.0)
            if (r2 <= 0) goto L15
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 > 0) goto L15
            goto L2e
        L15:
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 <= 0) goto L2d
            goto L2b
        L1a:
            r2 = 1117782016(0x42a00000, float:80.0)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r1 = 1119092736(0x42b40000, float:90.0)
            if (r2 <= 0) goto L27
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 > 0) goto L27
            goto L2e
        L27:
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 <= 0) goto L2d
        L2b:
            r3 = r0
            goto L2e
        L2d:
            r3 = 0
        L2e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oplus.aiunit.vision.pfh.b(long, float):int");
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