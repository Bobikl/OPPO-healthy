package com.heytap.omas.omkms.network.response;

import androidx.annotation.Keep;
import com.heytap.omas.proto.Omkms3;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public interface BaseOmkmsResponse {
    Omkms3.CMSEncryptedData getCmsEncryptData();

    Omkms3.CMSSignedData getCmsSignedData();

    int getCode();

    Omkms3.Header getHeader();

    String getMetaResponse();

    Omkms3.Pack getPack();
}
