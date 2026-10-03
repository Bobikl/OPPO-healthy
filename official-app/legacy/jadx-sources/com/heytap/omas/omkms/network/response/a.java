package com.heytap.omas.omkms.network.response;

import com.heytap.omas.a.e.h;
import com.heytap.omas.a.e.i;
import com.heytap.omas.proto.Omkms3;

/* JADX INFO: loaded from: classes19.dex */
public class a implements BaseOmkmsResponse {
    public final String a;
    private Omkms3.Pack b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Omkms3.ResGetKmsCerts f7657c;
    private int d;

    public static final class b {
        private Omkms3.Pack a;
        private Omkms3.ResGetKmsCerts b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f7658c;

        private b() {
        }

        public b a(int i) {
            this.f7658c = i;
            return this;
        }

        public b a(Omkms3.Pack pack) {
            this.a = pack;
            return this;
        }

        public b a(Omkms3.ResGetKmsCerts resGetKmsCerts) {
            this.b = resGetKmsCerts;
            return this;
        }

        public a a() {
            return new a(this);
        }
    }

    private a(b bVar) {
        this.a = "GetKmsCertsResponse";
        this.d = 0;
        this.b = bVar.a;
        this.f7657c = bVar.b;
        this.d = bVar.f7658c;
    }

    public static b a() {
        return new b();
    }

    @Override // com.heytap.omas.omkms.network.response.BaseOmkmsResponse
    public Omkms3.CMSEncryptedData getCmsEncryptData() {
        Omkms3.Pack pack = this.b;
        if (pack != null) {
            return pack.getPayload();
        }
        i.b("GetKmsCertsResponse", "getHeader: pack is null.");
        return null;
    }

    @Override // com.heytap.omas.omkms.network.response.BaseOmkmsResponse
    public Omkms3.CMSSignedData getCmsSignedData() {
        Omkms3.Pack pack = this.b;
        if (pack != null) {
            return pack.getSignature();
        }
        i.b("GetKmsCertsResponse", "getHeader: pack is null.");
        return null;
    }

    @Override // com.heytap.omas.omkms.network.response.BaseOmkmsResponse
    public int getCode() {
        return this.d;
    }

    @Override // com.heytap.omas.omkms.network.response.BaseOmkmsResponse
    public Omkms3.Header getHeader() {
        Omkms3.Pack pack = this.b;
        if (pack != null) {
            return pack.getHeader();
        }
        i.b("GetKmsCertsResponse", "getHeader: pack is null.");
        return null;
    }

    @Override // com.heytap.omas.omkms.network.response.BaseOmkmsResponse
    public String getMetaResponse() {
        Omkms3.ResGetKmsCerts resGetKmsCerts = this.f7657c;
        if (resGetKmsCerts != null) {
            return h.a(resGetKmsCerts, (Class<Omkms3.ResGetKmsCerts>) Omkms3.ResGetKmsCerts.class);
        }
        i.b("GetKmsCertsResponse", "getMetaResponse: resGetKmsCerts is null.");
        return null;
    }

    @Override // com.heytap.omas.omkms.network.response.BaseOmkmsResponse
    public Omkms3.Pack getPack() {
        Omkms3.Pack pack = this.b;
        if (pack != null) {
            return pack;
        }
        i.b("GetKmsCertsResponse", "getPack,pack is null,see status code for detail.");
        return null;
    }

    public String toString() {
        return "GetKmsCertsResponse{TAG='GetKmsCertsResponse', pack=" + this.b + ", resGetKmsCerts=" + this.f7657c + ", statusCode=" + this.d + '}';
    }
}
