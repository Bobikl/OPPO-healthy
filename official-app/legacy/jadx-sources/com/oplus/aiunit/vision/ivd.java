package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;
import com.heytap.health.watchface.business.creation.category.outfits.bean.OutfitAlternativeBean;
import com.heytap.health.watchface.business.creation.category.outfits.bean.OutfitAlternativeVideoBean;

/* JADX INFO: loaded from: classes19.dex */
public interface ivd extends nm9 {
    void I(Proto$DeviceInfo proto$DeviceInfo);

    void P(Bitmap bitmap);

    void R(Bitmap bitmap);

    void V(boolean z, int i);

    void Y(int i);

    void e1();

    void g0();

    void h2(OutfitAlternativeBean outfitAlternativeBean);

    void i();

    void y4(OutfitAlternativeVideoBean outfitAlternativeVideoBean, String str);

    void y6(boolean z);
}
