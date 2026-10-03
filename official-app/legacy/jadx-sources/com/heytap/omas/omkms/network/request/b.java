package com.heytap.omas.omkms.network.request;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.omas.a.e.h;
import com.heytap.omas.a.e.i;
import com.heytap.omas.omkms.data.EnvConfig;
import com.heytap.omas.omkms.exception.AuthenticationException;
import com.heytap.omas.proto.Omkms3;

/* JADX INFO: loaded from: classes19.dex */
public class b implements BaseOmkmsRequest {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f7648e = "getkmssystemtime";
    private static final String f = "ReqGetKmsSystemTime";
    private Omkms3.CMSEncryptedData a;
    private Omkms3.CMSSignedData b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Omkms3.Header f7649c;
    private EnvConfig d;

    /* JADX INFO: renamed from: com.heytap.omas.omkms.network.request.b$b, reason: collision with other inner class name */
    public static final class C0737b {
        private Omkms3.CMSEncryptedData a;
        private Omkms3.CMSSignedData b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Omkms3.Header f7650c;
        private EnvConfig d;

        private C0737b() {
            this.d = EnvConfig.RELEASE;
        }

        public C0737b a(EnvConfig envConfig) {
            if (envConfig == null) {
                throw new IllegalArgumentException("envConfig cannot be null.");
            }
            this.d = envConfig;
            return this;
        }

        public C0737b a(Omkms3.CMSEncryptedData cMSEncryptedData) {
            this.a = cMSEncryptedData;
            return this;
        }

        public C0737b a(Omkms3.CMSSignedData cMSSignedData) {
            this.b = cMSSignedData;
            return this;
        }

        public C0737b a(Omkms3.Header header) {
            this.f7650c = header;
            return this;
        }

        public b a() {
            return new b(this);
        }
    }

    private b(C0737b c0737b) {
        this.d = EnvConfig.RELEASE;
        this.a = c0737b.a;
        this.b = c0737b.b;
        this.f7649c = c0737b.f7650c;
        this.d = c0737b.d;
    }

    public static C0737b a() {
        return new C0737b();
    }

    @Override // com.heytap.omas.omkms.network.request.BaseOmkmsRequest
    public Omkms3.Header getHeader() {
        return this.f7649c;
    }

    @Override // com.heytap.omas.omkms.network.request.BaseOmkmsRequest
    @Nullable
    public Omkms3.Pack getPack() {
        String str;
        if (this.f7649c == null) {
            str = "getPack,header of request cannot be null.";
        } else if (this.a == null) {
            str = "getPack,payload of request cannot be null.";
        } else {
            if (this.b != null) {
                return Omkms3.Pack.newBuilder().setHeader(h.a(this.f7649c, (Class<Omkms3.Header>) Omkms3.Header.class)).setPayload(h.a(this.a, (Class<Omkms3.CMSEncryptedData>) Omkms3.CMSEncryptedData.class)).setSignature(h.a(this.b, (Class<Omkms3.CMSSignedData>) Omkms3.CMSSignedData.class)).build();
            }
            str = "getPack,signature of request  cannot be null.";
        }
        i.b(f, str);
        return null;
    }

    @Override // com.heytap.omas.omkms.network.request.BaseOmkmsRequest
    @NonNull
    public String getUrl() throws AuthenticationException {
        if (this.d != null) {
            return this.d.getEnvUrl() + f7648e;
        }
        i.c(f, "getUrl: Not set EnvConfig,would use default release env config.");
        return com.heytap.omas.omkms.network.a.a() + f7648e;
    }

    public String toString() {
        return "ReqGetKmsSystemTime{payload=" + this.a + ", signature=" + this.b + ", header=" + this.f7649c + ", envConfig=" + this.d + '}';
    }
}
