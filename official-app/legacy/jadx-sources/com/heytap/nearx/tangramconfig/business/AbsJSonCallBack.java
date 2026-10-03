package com.heytap.nearx.tangramconfig.business;

import com.heytap.nearx.tangramconfig.bean.ConfigVersionInfo;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public abstract class AbsJSonCallBack<E> implements IJSonCallBack {
    public void onConfigData(E e2, ConfigVersionInfo configVersionInfo) {
    }

    public void onConfigDataList(List<E> list, ConfigVersionInfo configVersionInfo) {
    }

    @Override // com.heytap.nearx.tangramconfig.business.IJSonCallBack
    public void onError(int i, Throwable th) {
    }

    public void onOriginData(String str, ConfigVersionInfo configVersionInfo) {
    }
}
