package com.heytap.omas.omkms.network.request;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.omas.a.e.h;
import com.heytap.omas.a.e.i;
import com.heytap.omas.omkms.data.EnvConfig;
import com.heytap.omas.omkms.exception.AuthenticationException;
import com.heytap.omas.proto.Omkms3;

/* JADX INFO: loaded from: classes19.dex */
public class c implements BaseOmkmsRequest {
    private static final String f = "ReqGetKmsTicket";
    private final String a;
    private Omkms3.Header b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Omkms3.CMSEncryptedData f7651c;
    private Omkms3.CMSSignedData d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EnvConfig f7652e;

    public static class b {
        private Omkms3.Header a;
        private Omkms3.CMSEncryptedData b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Omkms3.CMSSignedData f7653c;
        private EnvConfig d = EnvConfig.RELEASE;

        public b a(EnvConfig envConfig) {
            if (envConfig == null) {
                throw new IllegalArgumentException("envConfig cannot be null.");
            }
            this.d = envConfig;
            return this;
        }

        public b a(Omkms3.CMSEncryptedData cMSEncryptedData) {
            if (cMSEncryptedData == null) {
                throw new IllegalArgumentException("payload cannot be null.");
            }
            this.b = cMSEncryptedData;
            return this;
        }

        public b a(Omkms3.CMSSignedData cMSSignedData) {
            if (cMSSignedData == null) {
                throw new IllegalArgumentException("signature cannot be null.");
            }
            this.f7653c = cMSSignedData;
            return this;
        }

        public b a(Omkms3.Header header) {
            if (header == null) {
                throw new IllegalArgumentException("header cannot be null.");
            }
            header.getRequestId();
            this.a = header;
            return this;
        }

        public c a() {
            return new c(this);
        }
    }

    private c(b bVar) {
        this.a = "getkmsticket";
        this.f7652e = EnvConfig.RELEASE;
        this.b = bVar.a;
        this.f7651c = bVar.b;
        this.d = bVar.f7653c;
        this.f7652e = bVar.d;
    }

    public static b c() {
        return new b();
    }

    public Omkms3.CMSEncryptedData a() {
        return this.f7651c;
    }

    public Omkms3.CMSSignedData b() {
        return this.d;
    }

    @Override // com.heytap.omas.omkms.network.request.BaseOmkmsRequest
    public Omkms3.Header getHeader() {
        return this.b;
    }

    @Override // com.heytap.omas.omkms.network.request.BaseOmkmsRequest
    @Nullable
    public Omkms3.Pack getPack() {
        String str;
        if (this.b == null) {
            str = "getPack,header of request cannot be null.";
        } else if (this.f7651c == null) {
            str = "getPack,payload of request cannot be null.";
        } else {
            if (this.d != null) {
                return Omkms3.Pack.newBuilder().setHeader(h.a(this.b, (Class<Omkms3.Header>) Omkms3.Header.class)).setPayload(h.a(this.f7651c, (Class<Omkms3.CMSEncryptedData>) Omkms3.CMSEncryptedData.class)).setSignature(h.a(this.d, (Class<Omkms3.CMSSignedData>) Omkms3.CMSSignedData.class)).build();
            }
            str = "getPack,signature of request  cannot be null.";
        }
        i.b(f, str);
        return null;
    }

    @Override // com.heytap.omas.omkms.network.request.BaseOmkmsRequest
    @NonNull
    public String getUrl() throws AuthenticationException {
        if (this.f7652e != null) {
            return this.f7652e.getEnvUrl() + "getkmsticket";
        }
        i.c(f, "getUrl: Not set EnvConfig,would use default release env config.");
        return com.heytap.omas.omkms.network.a.a() + "getkmsticket";
    }
}
