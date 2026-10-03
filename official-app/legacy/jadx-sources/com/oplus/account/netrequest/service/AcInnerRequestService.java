package com.oplus.account.netrequest.service;

import androidx.annotation.Keep;
import com.oplus.account.netrequest.annotation.AcIgnoreIntercept;
import com.oplus.account.netrequest.annotation.AcNeedEncrypt;
import com.oplus.account.netrequest.bean.AcGetInitHostResponse;
import com.oplus.aiunit.vision.h8;
import com.oplus.aiunit.vision.m1e;
import com.oplus.aiunit.vision.n7;
import com.oplus.aiunit.vision.xr2;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public interface AcInnerRequestService {
    @AcIgnoreIntercept({n7.class})
    @AcNeedEncrypt(version = "v1")
    @m1e("/config/domain-config")
    xr2<h8<AcGetInitHostResponse, Object>> requestInitHostConfig();
}
