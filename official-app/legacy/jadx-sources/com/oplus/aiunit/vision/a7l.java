package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.accountsdk.base.common.constants.AcBaseConstants;
import com.platform.usercenter.network.header.UCHeaderHelperV2;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class a7l {
    public HashMap<String, String> a;

    public final String a(Context context) {
        return context.getPackageName() + "/" + x70.e(context);
    }

    public final String b() {
        WalletDevInfo walletDevInfoB = yj5.c().b();
        return lkj.b() + "/" + walletDevInfoB.g() + "/" + lkj.a() + "/" + walletDevInfoB.getFirmwareVersion() + "/" + walletDevInfoB.d() + "/";
    }

    public HashMap<String, String> c(long j2) {
        HashMap<String, String> map = this.a;
        if (map == null || map.isEmpty()) {
            d(qz0.mContext);
        }
        HashMap<String, String> map2 = new HashMap<>();
        String strB = cn.a().b();
        map2.putAll(this.a);
        map2.put("accept-language", kek.c());
        map2.put("X-Timestamp", String.valueOf(j2));
        map2.put("X-Source", x70.c(qz0.mContext));
        map2.put(AcBaseConstants.a.HEADER_X_TOKEN, strB);
        map2.put("t", String.valueOf(j2));
        map2.put("watchApkVersion", aec.m());
        map2.putAll(dj8.b());
        return map2;
    }

    public final void d(Context context) {
        HashMap<String, String> map = new HashMap<>();
        this.a = map;
        map.put("X-Country", kek.a());
        this.a.put("X-Locale", Locale.getDefault().toString());
        this.a.put("X-Timezone", Calendar.getInstance().getTimeZone().getID());
        this.a.put("X-Device", b());
        this.a.put("X-APP-Info", a(context));
        this.a.put(UCHeaderHelperV2.X_PROTOCOL_VERSION, "1");
        this.a.put("X-NfcSupport", SpeechConstant.TRUE_STR);
    }
}
