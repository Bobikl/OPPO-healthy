package com.heytap.health.device.third.weightscale;

import android.content.Context;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.oplus.aiunit.vision.tql;

/* JADX INFO: loaded from: classes16.dex */
public interface IWeightScaleService extends IProvider {

    public interface a {
        void onFail();

        void onSuccess(String str);
    }

    public interface b {
        void onFail();

        void onSuccess();
    }

    void Ba(Context context, tql tqlVar);

    String G3(tql tqlVar);

    String I8(Context context, tql tqlVar);

    void S1(Context context, tql tqlVar, b bVar);

    void d9(Context context, tql tqlVar, a aVar);
}
