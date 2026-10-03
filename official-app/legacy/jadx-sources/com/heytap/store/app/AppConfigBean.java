package com.heytap.store.app;

import com.heytap.store.base.core.state.UrlConfig;
import com.heytap.store.entity.IBean;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
class AppConfigBean implements IBean {
    public List<String> h5WhiteList;
    public boolean recommends_witch = false;
    public boolean goodsDetail_recommend_switch = false;
    public boolean product_detail_switch = true;
    public boolean sensors_on = true;
    public int personalized = 1;
    public String cartUrl = UrlConfig.H5_DEFAULT_CART_URL;
}
