package com.heytap.omas.omkms.network;

import com.heytap.omas.omkms.data.EnvConfig;
import com.heytap.omas.omkms.network.request.BaseOmkmsRequest;
import com.heytap.omas.omkms.network.response.BaseOmkmsResponse;
import com.heytap.omas.proto.Omkms3;

/* JADX INFO: loaded from: classes19.dex */
public interface f {
    BaseOmkmsRequest a(Omkms3.Header header, Omkms3.CMSEncryptedData cMSEncryptedData, Omkms3.CMSSignedData cMSSignedData, EnvConfig envConfig);

    BaseOmkmsResponse a(int i, Omkms3.Pack pack, String str);
}
