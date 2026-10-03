package com.lifesense.device.scale.infrastructure.protocol;

import com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest;

/* JADX INFO: loaded from: classes4.dex */
public class SyncDownloadRequest extends BaseRequest {
    public static final String kRequestParam_Ts = "ts";

    public SyncDownloadRequest(long j2) {
        setRequestMethod("POST");
        addLongValue("ts", Long.valueOf(j2));
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getResponseClassName() {
        return SyncDownloadResponse.class.getName();
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getUrlWithoutProtocol() {
        return "/device_service/sync/download";
    }
}
