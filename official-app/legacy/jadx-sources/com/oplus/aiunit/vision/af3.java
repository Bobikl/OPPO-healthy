package com.oplus.aiunit.vision;

import com.oplus.drs.core.model.TrackType;

/* JADX INFO: loaded from: classes19.dex */
public class af3 {
    public final String a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9325c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9326e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f9327j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f9328l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TrackType f9329n;

    public String a() {
        return this.b;
    }

    public int b() {
        return this.h;
    }

    public String c() {
        return this.k;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.f9327j;
    }

    public TrackType f() {
        return this.f9329n;
    }

    public boolean g() {
        return this.f9326e;
    }

    public boolean h() {
        return this.g;
    }

    public boolean i() {
        return this.f9328l;
    }

    public boolean j() {
        return this.f9325c;
    }

    public boolean k() {
        return this.i;
    }

    public boolean l() {
        return this.f;
    }

    public boolean m() {
        return this.d;
    }

    public boolean n() {
        return this.m;
    }

    public String toString() {
        return "ClientAppConfig{region='" + this.a + "', feedbackRegion='" + this.b + "', enableLog=" + this.f9325c + ", enableTrackSdkCrash=" + this.d + ", defaultToDeviceProtectedStorage=" + this.f9326e + ", enableTrackInCurrentProcess=" + this.f + ", enableCacheStdId=" + this.g + ", ipcIdleUnbindMinutes=" + this.h + ", enableNetRequest=" + this.i + ", storageFilePrefix='" + this.f9327j + "', legacyDrainProcess='" + this.k + "', enableLegacyDataMigration=" + this.f9328l + ", forceJsonSerialization=" + this.m + '}';
    }

    public af3(b bVar) {
        this.a = bVar.b;
        this.b = bVar.f9330c;
        this.f9325c = bVar.d;
        this.d = bVar.f9331e;
        this.f9326e = bVar.f;
        this.f = bVar.g;
        this.g = bVar.h;
        this.h = bVar.i;
        this.i = bVar.f9332j;
        this.f9327j = bVar.k;
        this.k = bVar.f9333l;
        this.f9328l = bVar.m;
        this.m = bVar.f9334n;
        this.f9329n = bVar.a;
    }

    public static class b {
        public TrackType a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f9330c;
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f9331e;
        public boolean f;
        public boolean g;
        public boolean h;
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f9332j;
        public String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f9333l;
        public boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f9334n;

        public b(String str) {
            this.a = TrackType.OBUS;
            this.b = "";
            this.f9330c = "";
            this.d = false;
            this.f9331e = true;
            this.f = false;
            this.g = false;
            this.h = true;
            this.i = 10;
            this.f9332j = false;
            this.k = "";
            this.f9333l = "";
            this.m = true;
            this.f9334n = false;
            if (str == null || str.isEmpty()) {
                return;
            }
            this.b = str;
            this.f9330c = str;
        }

        public af3 n() {
            return new af3(this);
        }

        public b o(boolean z) {
            this.f = z;
            return this;
        }

        public b p(boolean z) {
            this.h = z;
            return this;
        }

        public b q(boolean z) {
            this.m = z;
            return this;
        }

        public b r(boolean z) {
            this.d = z;
            return this;
        }

        public b s(boolean z) {
            this.f9332j = z;
            return this;
        }

        public b t(boolean z) {
            this.g = z;
            return this;
        }

        public b u(boolean z) {
            this.f9331e = z;
            return this;
        }

        public b v(boolean z) {
            this.f9334n = z;
            return this;
        }

        public b w(int i) {
            if (i < 1) {
                i = 10;
            }
            this.i = i;
            return this;
        }

        public b x(String str) {
            if (str != null) {
                this.f9333l = str;
            }
            return this;
        }

        public b y(String str) {
            if (str != null) {
                this.k = str;
            }
            return this;
        }

        public b z(TrackType trackType) {
            this.a = trackType;
            return this;
        }

        public b(String str, String str2) {
            this(str);
            if (str2 == null || str2.isEmpty()) {
                return;
            }
            this.f9330c = str2;
        }
    }
}
