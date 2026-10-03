package com.heytap.omas.omkms.network;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.JsonSyntaxException;
import com.heytap.omas.a.e.h;
import com.heytap.omas.a.e.i;
import com.heytap.omas.omkms.data.EnvConfig;
import com.heytap.omas.omkms.network.request.BaseOmkmsRequest;
import com.heytap.omas.omkms.network.response.BaseOmkmsResponse;
import com.heytap.omas.proto.Omkms3;

/* JADX INFO: loaded from: classes19.dex */
public class b implements f {
    public static final String a = "GetKmsCertFactory";

    @Override // com.heytap.omas.omkms.network.f
    @NonNull
    public BaseOmkmsRequest a(@NonNull Omkms3.Header header, @NonNull Omkms3.CMSEncryptedData cMSEncryptedData, @Nullable Omkms3.CMSSignedData cMSSignedData, @Nullable EnvConfig envConfig) {
        if (header != null && cMSEncryptedData != null) {
            com.heytap.omas.omkms.network.request.a aVarA = com.heytap.omas.omkms.network.request.a.a().a(header).a(cMSEncryptedData).a(envConfig).a();
            aVarA.toString();
            return aVarA;
        }
        i.b(a, "createRequest: Parameter invalid.header:" + header + ",cmsEncryptedData:" + cMSEncryptedData);
        throw new IllegalArgumentException("Parameters cannot be null.");
    }

    @Override // com.heytap.omas.omkms.network.f
    @NonNull
    public BaseOmkmsResponse a(int i, Omkms3.Pack pack, String str) {
        com.heytap.omas.omkms.network.response.a.b bVarA;
        if (i != 0) {
            bVarA = com.heytap.omas.omkms.network.response.a.a();
        } else {
            try {
                return com.heytap.omas.omkms.network.response.a.a().a(i).a(pack).a((Omkms3.ResGetKmsCerts) h.a(str, Omkms3.ResGetKmsCerts.class)).a();
            } catch (JsonSyntaxException e2) {
                i.b(a, "createResponse: " + e2);
                bVarA = com.heytap.omas.omkms.network.response.a.a();
                i = 1001;
            }
        }
        return bVarA.a(i).a();
    }
}
