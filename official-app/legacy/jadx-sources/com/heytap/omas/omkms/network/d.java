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
public class d implements f {
    private static final String a = "GetKmsTicketFactory";

    @Override // com.heytap.omas.omkms.network.f
    @NonNull
    public BaseOmkmsRequest a(@NonNull Omkms3.Header header, @NonNull Omkms3.CMSEncryptedData cMSEncryptedData, @NonNull Omkms3.CMSSignedData cMSSignedData, @Nullable EnvConfig envConfig) {
        if (cMSEncryptedData != null && cMSSignedData != null && header != null) {
            return com.heytap.omas.omkms.network.request.c.c().a(header).a(cMSEncryptedData).a(cMSSignedData).a(envConfig).a();
        }
        i.b(a, "createRequest,Parameter invalid,all of parameters cannot be null.");
        throw new IllegalArgumentException("createRequest: Parameters cannot be null.");
    }

    @Override // com.heytap.omas.omkms.network.f
    @NonNull
    public BaseOmkmsResponse a(int i, Omkms3.Pack pack, String str) {
        com.heytap.omas.omkms.network.response.c.b bVarA;
        if (i != 0) {
            bVarA = com.heytap.omas.omkms.network.response.c.a();
        } else {
            try {
                return com.heytap.omas.omkms.network.response.c.a().a(i).a((Omkms3.ResGetKMSTicket) h.a(str, Omkms3.ResGetKMSTicket.class)).a(pack).a();
            } catch (JsonSyntaxException e2) {
                i.b(a, "createResponse: fatal error,detail:" + e2);
                bVarA = com.heytap.omas.omkms.network.response.c.a();
                i = 1001;
            }
        }
        return bVarA.a(i).a();
    }
}
