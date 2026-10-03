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
public class c implements f {
    public static final String a = "GetKmsSystemTimeFactory";

    @Override // com.heytap.omas.omkms.network.f
    @NonNull
    public BaseOmkmsRequest a(@NonNull Omkms3.Header header, @NonNull Omkms3.CMSEncryptedData cMSEncryptedData, @NonNull Omkms3.CMSSignedData cMSSignedData, @Nullable EnvConfig envConfig) {
        if (cMSSignedData == null || header == null || cMSEncryptedData == null) {
            i.b(a, "createRequest: Parameter invalid.");
            throw new IllegalArgumentException("createRequest: Parameters invalid.");
        }
        com.heytap.omas.omkms.network.request.b bVarA = com.heytap.omas.omkms.network.request.b.a().a(header).a(cMSEncryptedData).a(cMSSignedData).a(envConfig).a();
        bVarA.toString();
        return bVarA;
    }

    @Override // com.heytap.omas.omkms.network.f
    @NonNull
    public BaseOmkmsResponse a(int i, Omkms3.Pack pack, String str) {
        com.heytap.omas.omkms.network.response.b.C0739b c0739bA;
        if (i != 0) {
            c0739bA = com.heytap.omas.omkms.network.response.b.a();
        } else {
            try {
                return com.heytap.omas.omkms.network.response.b.a().a(i).a(pack).a((Omkms3.ResGetKMSSystemTime) h.a(str, Omkms3.ResGetKMSSystemTime.class)).a();
            } catch (JsonSyntaxException e2) {
                i.b(a, "createResponse: " + e2);
                c0739bA = com.heytap.omas.omkms.network.response.b.a();
                i = 1001;
            }
        }
        return c0739bA.a(i).a();
    }
}
