package com.oplus.aiunit.vision;

import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes19.dex */
public class o7h {
    public final int a;

    public static class a {
        public final boolean a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f14826c;

        public a(boolean z, int i, String str) {
            this.a = z;
            this.b = i;
            this.f14826c = str;
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return 512000;
        }

        public String c() {
            return this.f14826c;
        }

        public boolean d() {
            return this.a;
        }

        public String toString() {
            return "ValidationResult{isValid=" + this.a + ", actualSize=" + this.b + ", reason='" + this.f14826c + "'}";
        }
    }

    public o7h(int i) {
        this.a = i;
    }

    public a a(String str) {
        if (str == null || str.isEmpty()) {
            return new a(false, 0, "Data is null or empty");
        }
        try {
            int length = str.getBytes("UTF-8").length;
            return length <= this.a ? new a(true, length, null) : new a(false, length, String.format("Data size (%d bytes) exceeds limit (%d bytes)", Integer.valueOf(length), Integer.valueOf(this.a)));
        } catch (UnsupportedEncodingException e2) {
            TrackLogger.d("DRS_SDK_COMMON_SizeValidator", "Failed to get byte size", e2, new Object[0]);
            return new a(false, 0, "Failed to calculate size");
        }
    }
}
