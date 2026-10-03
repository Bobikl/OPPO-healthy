package com.heytap.wallet.business.entrance.router;

import android.app.Activity;
import android.content.Context;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.health.wallet.BaseActivity;
import com.oplus.aiunit.vision.lid;
import com.oplus.aiunit.vision.suc;
import com.oplus.aiunit.vision.zld;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public interface EntranceOperateService extends IProvider {
    public static final long CODE_NEED_CLEAN = 253016;
    public static final String SUCCESS_CARD = "SUC";
    public static final String UNFINISH_CARD = "ADD";
    public static final String W_ACTIVE = "W_ACTIVE";

    void A2(Activity activity, String str, String str2, String str3);

    void B5(Activity activity, String str, String str2, String str3, String str4);

    void D2(Context context, String str, suc<String, Integer, String, Integer, String> sucVar);

    void N3(Activity activity, String str, String str2, String str3, String str4, String str5);

    void Q0(Activity activity, String str, String str2, String str3);

    void c0(Context context, String str);

    void c5(String str, String str2, BaseActivity baseActivity, String str3, String str4, String str5, String str6, zld zldVar, WeakReference<lid> weakReference);

    boolean e5();

    void n5(Context context, String str);

    void v7(Context context, String str, Map<String, Object> map, String str2);
}
