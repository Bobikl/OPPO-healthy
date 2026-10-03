package com.oplus.accountsdk.base.common.net.service;

import androidx.annotation.Keep;
import com.oplus.account.netrequest.annotation.AcIgnoreIntercept;
import com.oplus.account.netrequest.annotation.AcNeedEncrypt;
import com.oplus.accountsdk.base.common.net.data.AcGetInitHostResponse;
import com.oplus.aiunit.vision.h8;
import com.oplus.aiunit.vision.lj;
import com.oplus.aiunit.vision.m1e;
import com.oplus.aiunit.vision.xr2;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public interface AcInnerRequestService {
    @AcIgnoreIntercept({lj.class})
    @AcNeedEncrypt(version = "v1")
    @m1e("/config/domain-config")
    xr2<h8<AcGetInitHostResponse, Object>> requestInitHostConfig();
}
