package com.heytap.omas.omkms.network.request;

import androidx.annotation.NonNull;
import com.heytap.omas.a.e.h;
import com.heytap.omas.a.e.i;
import com.heytap.omas.omkms.data.EnvConfig;
import com.heytap.omas.omkms.exception.AuthenticationException;
import com.heytap.omas.proto.Omkms3;

/* JADX INFO: loaded from: classes19.dex */
public class d implements BaseOmkmsRequest {
    private static final String f = "ReqGetServiceTicket";
    private final String a;
    private Omkms3.Header b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Omkms3.CMSEncryptedData f7654c;
    private Omkms3.CMSSignedData d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EnvConfig f7655e;

    public static class b {
        private Omkms3.Header a;
        private Omkms3.CMSEncryptedData b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Omkms3.CMSSignedData f7656c;
        private EnvConfig d;

        private b() {
            this.d = EnvConfig.RELEASE;
        }

        public b a(EnvConfig envConfig) {
            if (envConfig == null) {
                throw new IllegalArgumentException("envConfig cannot be null.");
            }
            this.d = envConfig;
            return this;
        }

        public b a(Omkms3.CMSEncryptedData cMSEncryptedData) {
            if (cMSEncryptedData == null) {
                throw new NullPointerException("payload is null.");
            }
            this.b = cMSEncryptedData;
            return this;
        }

        public b a(Omkms3.CMSSignedData cMSSignedData) {
            if (cMSSignedData == null) {
                throw new NullPointerException("signature is null.");
            }
            this.f7656c = cMSSignedData;
            return this;
        }

        public b a(Omkms3.Header header) {
            if (header == null) {
                throw new NullPointerException("header is null.");
            }
            header.getRequestId();
            this.a = header;
            return this;
        }

        public d a() {
            if (this.a == null || this.b == null || this.f7656c == null) {
                throw new IllegalArgumentException("header or payload or signature must not be null.");
            }
            return new d(this);
        }
    }

    private d(b bVar) {
        this.a = "getserviceticket";
        this.f7655e = EnvConfig.RELEASE;
        this.b = bVar.a;
        this.f7654c = bVar.b;
        this.d = bVar.f7656c;
        this.f7655e = bVar.d;
    }

    public static b a() {
        return new b();
    }

    @Override // com.heytap.omas.omkms.network.request.BaseOmkmsRequest
    public Omkms3.Header getHeader() {
        return this.b;
    }

    @Override // com.heytap.omas.omkms.network.request.BaseOmkmsRequest
    public Omkms3.Pack getPack() {
        String str;
        if (this.b == null) {
            str = "getPack,header of request cannot be null.";
        } else if (this.f7654c == null) {
            str = "getPack,payload of request cannot be null.";
        } else {
            if (this.d != null) {
                return Omkms3.Pack.newBuilder().setHeader(h.a(this.b, (Class<Omkms3.Header>) Omkms3.Header.class)).setPayload(h.a(this.f7654c, (Class<Omkms3.CMSEncryptedData>) Omkms3.CMSEncryptedData.class)).setSignature(h.a(this.d, (Class<Omkms3.CMSSignedData>) Omkms3.CMSSignedData.class)).build();
            }
            str = "getPack,signature of request  cannot be null.";
        }
        i.b(f, str);
        return null;
    }

    @Override // com.heytap.omas.omkms.network.request.BaseOmkmsRequest
    @NonNull
    public String getUrl() throws AuthenticationException {
        if (this.f7655e != null) {
            return this.f7655e.getEnvUrl() + "getserviceticket";
        }
        i.c(f, "getUrl: Not set EnvConfig,would use default release env config.");
        return com.heytap.omas.omkms.network.a.a() + "getserviceticket";
    }
}
