package com.heytap.omas.omkms.network.request;

import androidx.annotation.Keep;
import com.heytap.omas.omkms.exception.AuthenticationException;
import com.heytap.omas.proto.Omkms3;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public interface BaseOmkmsRequest {
    Omkms3.Header getHeader();

    Omkms3.Pack getPack();

    String getUrl() throws AuthenticationException;
}
