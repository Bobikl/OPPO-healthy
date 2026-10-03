package com.heytap.health.bandface.api;

import android.content.Context;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.alibaba.android.arouter.facade.template.IProvider;

/* JADX INFO: loaded from: classes15.dex */
public interface BandFaceApi extends IProvider {
    public static final String OPERATE_CONNECT_STATE = "WatchFaceManagerContract.CONNECT_STATUS";
    public static final String OPERATE_MAC_ADDRESS = "currentMac";

    public interface a {
        void onResult(String str);
    }

    void D3(SyncBandFaceCallback syncBandFaceCallback);

    void f8(LifecycleOwner lifecycleOwner, String str, a aVar);

    void m6(Context context, String str, ImageView imageView);

    void p2(SyncBandFaceCallback syncBandFaceCallback);

    void ya(Context context, String str);
}
