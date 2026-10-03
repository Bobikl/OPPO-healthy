package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.heytap.wallet.business.entrance.router.EntranceOperateService;
import com.oppo.lib.common.R$string;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes18.dex */
public class ah1 implements sz2 {
    public WeakReference<Context> a;
    public String b;

    public ah1(WeakReference<Context> weakReference, String str) {
        this.a = weakReference;
        this.b = str;
    }

    @Override // com.oplus.aiunit.vision.sz2
    public void a() {
        WeakReference<Context> weakReference = this.a;
        Context context = weakReference != null ? weakReference.get() : null;
        if (context != null) {
            ((EntranceOperateService) x0.d().a(Uri.parse("heytaphealth://com.heytap.health/entrance/operateService")).navigation()).c0(context, "/main/cardPackageList");
        }
    }

    @Override // com.oplus.aiunit.vision.sz2
    public int b() {
        return 0;
    }

    @Override // com.oplus.aiunit.vision.sz2
    public String getTitle() {
        return TextUtils.isEmpty(this.b) ? qz0.mContext.getString(R$string.ble_key) : this.b;
    }
}
