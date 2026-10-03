package com.heytap.omas.omkms.network.response;

import com.heytap.omas.a.e.h;
import com.heytap.omas.a.e.i;
import com.heytap.omas.proto.Omkms3;

/* JADX INFO: loaded from: classes19.dex */
public class b implements BaseOmkmsResponse {
    public static final String d = "ResGetKmsSystemTime";
    private Omkms3.Pack a;
    private Omkms3.ResGetKMSSystemTime b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7659c;

    /* JADX INFO: renamed from: com.heytap.omas.omkms.network.response.b$b, reason: collision with other inner class name */
    public static final class C0739b {
        private Omkms3.Pack a;
        private Omkms3.ResGetKMSSystemTime b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f7660c;

        private C0739b() {
        }

        public C0739b a(int i) {
            this.f7660c = i;
            return this;
        }

        public C0739b a(Omkms3.Pack pack) {
            this.a = pack;
            return this;
        }

        public C0739b a(Omkms3.ResGetKMSSystemTime resGetKMSSystemTime) {
            this.b = resGetKMSSystemTime;
            return this;
        }

        public b a() {
            return new b(this);
        }
    }

    private b(C0739b c0739b) {
        this.f7659c = 0;
        this.a = c0739b.a;
        this.b = c0739b.b;
        this.f7659c = c0739b.f7660c;
    }

    public static C0739b a() {
        return new C0739b();
    }

    @Override // com.heytap.omas.omkms.network.response.BaseOmkmsResponse
    public Omkms3.CMSEncryptedData getCmsEncryptData() {
        Omkms3.Pack pack = this.a;
        if (pack != null) {
            return pack.getPayload();
        }
        i.b(d, "getCmsEncryptData: pack is null.");
        return null;
    }

    @Override // com.heytap.omas.omkms.network.response.BaseOmkmsResponse
    public Omkms3.CMSSignedData getCmsSignedData() {
        Omkms3.Pack pack = this.a;
        if (pack != null) {
            return pack.getSignature();
        }
        i.b(d, "getCmsSignedData: pack is null.");
        return null;
    }

    @Override // com.heytap.omas.omkms.network.response.BaseOmkmsResponse
    public int getCode() {
        return this.f7659c;
    }

    @Override // com.heytap.omas.omkms.network.response.BaseOmkmsResponse
    public Omkms3.Header getHeader() {
        Omkms3.Pack pack = this.a;
        if (pack != null) {
            return pack.getHeader();
        }
        i.b(d, "getHeader: pack is null.");
        return null;
    }

    @Override // com.heytap.omas.omkms.network.response.BaseOmkmsResponse
    public String getMetaResponse() {
        Omkms3.ResGetKMSSystemTime resGetKMSSystemTime = this.b;
        if (resGetKMSSystemTime != null) {
            return h.a(resGetKMSSystemTime, (Class<Omkms3.ResGetKMSSystemTime>) Omkms3.ResGetKMSSystemTime.class);
        }
        i.b(d, "getMetaResponse: resGetKMSSystemTime:" + this.b);
        return null;
    }

    @Override // com.heytap.omas.omkms.network.response.BaseOmkmsResponse
    public Omkms3.Pack getPack() {
        Omkms3.Pack pack = this.a;
        if (pack != null) {
            return pack;
        }
        i.b(d, "getPack,pack is null.");
        return null;
    }

    public String toString() {
        return "ResGetKmsSystemTime{pack=" + this.a + ", resGetKMSSystemTime=" + this.b + ", statusCode=" + this.f7659c + '}';
    }
}
