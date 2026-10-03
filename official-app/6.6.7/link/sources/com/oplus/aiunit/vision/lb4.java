package com.oplus.aiunit.vision;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.oplus.smartenginehelper.entity.TextEntity;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class lb4 {
    public static lb4 e;
    public final Context a;
    public final a b;
    public final TelephonyManager c;
    public final String d;

    public static class a {
        public Locale a() {
            return Locale.getDefault();
        }
    }

    public lb4(Context context) {
        this(context, (TelephonyManager) context.getSystemService(TextEntity.AUTO_LINK_PHONE), new a());
    }

    public static synchronized lb4 b(Context context) {
        if (e == null) {
            e = new lb4(context.getApplicationContext());
        }
        return e;
    }

    public String a() {
        String strD = f() ? d() : null;
        if (TextUtils.isEmpty(strD)) {
            strD = e();
        }
        if (TextUtils.isEmpty(strD)) {
            strD = c();
        }
        if (TextUtils.isEmpty(strD) || g(strD)) {
            strD = "US";
        }
        return strD.toUpperCase(Locale.US);
    }

    public final String c() {
        Locale localeA = this.b.a();
        if (localeA != null) {
            return localeA.getCountry();
        }
        return null;
    }

    public final String d() {
        return this.c.getNetworkCountryIso();
    }

    public final String e() {
        return this.c.getSimCountryIso();
    }

    public final boolean f() {
        return this.c.getPhoneType() == 1;
    }

    public boolean g(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    public lb4(Context context, TelephonyManager telephonyManager, a aVar) {
        this.d = "US";
        this.c = telephonyManager;
        this.b = aVar;
        this.a = context;
    }
}
