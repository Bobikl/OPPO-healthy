package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.alibaba.android.arouter.facade.Postcard;
import com.heytap.health.operation.ecg.business.PdfViewActivity;
import com.heytap.health.operations.bean.MedalListBean;
import com.heytap.health.settings.me.setting.NetWorkOfficeWebViewActivity;

/* JADX INFO: loaded from: classes17.dex */
public class end {
    public static void a() {
        x0.d().b("/operation/MedalAchievementActivity").withInt(PdfViewActivity.BUND_TAG, -2).navigation();
    }

    public static void b(MedalListBean medalListBean) {
        x0.d().b("/operation/MedalListDetailActivity").withSerializable("medal_type_code", medalListBean).navigation();
    }

    public static void c(String str) {
        x0.d().b("/operation/ServiceWebViewActivity").withString("jumpUrl", str).navigation();
    }

    public static void d(String str, String str2, boolean z, boolean z2) {
        Postcard postcardB = x0.d().b("/thirdservice/ThirdPartyServiceWebViewActivity");
        if (!TextUtils.isEmpty(str2)) {
            postcardB.withString("title", str2);
        }
        postcardB.withString(NetWorkOfficeWebViewActivity.EXTRA_WEBSITE, str).withBoolean(NetWorkOfficeWebViewActivity.EXTRA_SUPPORT_DARK_MODE, true).withBoolean(NetWorkOfficeWebViewActivity.EXTRA_ADOPT_SCREEN, z).withBoolean("supportZoom", z2).navigation();
    }
}
