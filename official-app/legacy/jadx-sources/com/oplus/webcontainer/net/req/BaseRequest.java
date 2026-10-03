package com.oplus.webcontainer.net.req;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.etc;
import java.util.Random;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class BaseRequest {
    public Long timestamp = Long.valueOf(System.currentTimeMillis());
    public int nonce = new Random().nextInt();
    public String appKey = "2033";

    @etc
    public String sign = null;
}
