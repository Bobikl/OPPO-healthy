package com.oplus.pay.opensdk.model.request;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.ftc;
import java.util.Random;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class BaseRequest {
    public Long timestamp = Long.valueOf(System.currentTimeMillis());
    public int nonce = new Random().nextInt();
    public String appKey = "2033";

    @ftc
    public String sign = null;
}
