package com.oplus.webcontainer.net.req;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.wuc;
import java.util.Random;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
public class BaseRequest {
    public Long timestamp = Long.valueOf(System.currentTimeMillis());
    public int nonce = new Random().nextInt();
    public String appKey = "2033";

    @wuc
    public String sign = null;
}
