package com.heytap.store.base.core.util.app;

import com.heytap.store.base.core.data.IBean;
import com.heytap.store.base.core.state.UrlConfig;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class AppConfigBean implements IBean {
    public List<String> h5WhiteList;
    public boolean newHomepageSwitch = true;
    public boolean recommends_witch = false;
    public boolean goodsDetail_recommend_switch = false;
    public boolean product_detail_switch = true;
    public boolean sensors_on = true;
    public String cartUrl = UrlConfig.H5_DEFAULT_CART_URL;

    @Deprecated
    public String refreshText = "";
}
