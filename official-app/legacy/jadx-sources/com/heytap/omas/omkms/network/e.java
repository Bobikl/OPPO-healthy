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
public class e implements f {
    private final String a = "GetServiceTicketFactory";

    @Override // com.heytap.omas.omkms.network.f
    @NonNull
    public BaseOmkmsRequest a(@NonNull Omkms3.Header header, @NonNull Omkms3.CMSEncryptedData cMSEncryptedData, @NonNull Omkms3.CMSSignedData cMSSignedData, @Nullable EnvConfig envConfig) {
        if (header != null && cMSEncryptedData != null && cMSSignedData != null) {
            return com.heytap.omas.omkms.network.request.d.a().a(header).a(cMSEncryptedData).a(cMSSignedData).a(envConfig).a();
        }
        i.b("GetServiceTicketFactory", "createRequest: Parameters invalid.");
        throw new IllegalArgumentException("createRequest: Parameters cannot be null.");
    }

    @Override // com.heytap.omas.omkms.network.f
    @NonNull
    public BaseOmkmsResponse a(int i, Omkms3.Pack pack, String str) {
        com.heytap.omas.omkms.network.response.d.b bVarA;
        if (i != 0) {
            bVarA = com.heytap.omas.omkms.network.response.d.a();
        } else {
            try {
                return com.heytap.omas.omkms.network.response.d.a().a(i).a(pack).a((Omkms3.ResGetServiceTicket) h.a(str, Omkms3.ResGetServiceTicket.class)).a();
            } catch (JsonSyntaxException e2) {
                e2.getMessage();
                bVarA = com.heytap.omas.omkms.network.response.d.a();
                i = 1001;
            }
        }
        return bVarA.a(i).a();
    }
}
