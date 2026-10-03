package com.oplus.aiunit.vision;

import com.cloud.sdk.cloudstorage.common.ErrorInfo;

/* JADX INFO: loaded from: classes12.dex */
public final class k6n {
    public long a;
    public String b;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13177e;
    public short g;
    public boolean h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13176c = ErrorInfo.OC_OPTION_ERROR_DIR;
    public long f = 0;

    public k6n(boolean z) {
        this.h = z;
    }

    public static long a(String str) {
        long j2;
        if (str == null || str.length() == 0) {
            return 0L;
        }
        int i = 0;
        long j3 = 0;
        for (int length = str.length() - 1; length >= 0; length--) {
            long jCharAt = str.charAt(length);
            if (jCharAt < 48 || jCharAt > 57) {
                long j4 = 97;
                if (jCharAt < 97 || jCharAt > 102) {
                    j4 = 65;
                    if (jCharAt < 65 || jCharAt > 70) {
                        if (jCharAt != 58 && jCharAt != 124) {
                            return 0L;
                        }
                    }
                }
                j2 = (jCharAt - j4) + 10;
            } else {
                j2 = jCharAt - 48;
            }
            j3 += j2 << i;
            i += 4;
        }
        if (i != 48) {
            return 0L;
        }
        return j3;
    }

    public static String c(long j2) {
        if (j2 < 0 || j2 > 281474976710655L) {
            return null;
        }
        return s6n.a(s6n.b(j2), ":");
    }

    public final String b() {
        return this.h + "#" + this.a;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final k6n clone() {
        k6n k6nVar = new k6n(this.h);
        k6nVar.a = this.a;
        k6nVar.b = this.b;
        k6nVar.f13176c = this.f13176c;
        k6nVar.d = this.d;
        k6nVar.f13177e = this.f13177e;
        k6nVar.f = this.f;
        k6nVar.g = this.g;
        k6nVar.h = this.h;
        return k6nVar;
    }

    public final String toString() {
        return "AmapWifi{mac=" + this.a + ", ssid='" + this.b + "', rssi=" + this.f13176c + ", frequency=" + this.d + ", timestamp=" + this.f13177e + ", lastUpdateUtcMills=" + this.f + ", freshness=" + ((int) this.g) + ", connected=" + this.h + '}';
    }
}
