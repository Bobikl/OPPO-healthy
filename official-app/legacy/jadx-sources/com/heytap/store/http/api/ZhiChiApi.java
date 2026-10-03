package com.heytap.store.http.api;

import com.heytap.store.entity.BaseResponseData;
import com.heytap.store.entity.bean.ZhichiUserToken;
import com.heytap.store.message.service.MessageConst;
import com.oplus.aiunit.vision.g18;
import com.oplus.aiunit.vision.g5f;
import com.oplus.aiunit.vision.kbd;

/* JADX INFO: loaded from: classes5.dex */
public interface ZhiChiApi {
    @g18("/cs/api/web/zhichi/getUserToken")
    kbd<BaseResponseData<ZhichiUserToken>> getOnLineServiceData(@g5f("skuId") String str, @g5f(MessageConst.CUST_SOURCE) String str2, @g5f(MessageConst.CUST_MEDIUM) String str3);
}
