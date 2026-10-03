package com.oplus.statistics.storage;

import android.text.TextUtils;
import com.oplus.statistics.storage.MemoryPreference;
import com.oplus.statistics.util.LogUtil;
import com.oplus.statistics.util.Supplier;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class MemoryPreference {
    public Map<String, String> a = new HashMap();

    public static /* synthetic */ String c(String str, String str2, NumberFormatException numberFormatException) {
        return "getInt key=" + str + ", value=" + str2 + ", exception=" + numberFormatException.toString();
    }

    public static /* synthetic */ String d(String str, String str2, NumberFormatException numberFormatException) {
        return "getLong key=" + str + ", value=" + str2 + ", exception=" + numberFormatException.toString();
    }

    public int getInt(final String str, int i) {
        final String str2 = this.a.get(str);
        if (TextUtils.isEmpty(str2)) {
            return i;
        }
        try {
            return Integer.parseInt(str2);
        } catch (NumberFormatException e2) {
            LogUtil.w("MemoryPreference", new Supplier() { // from class: com.oplus.aiunit.vision.isb
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return MemoryPreference.c(str, str2, e2);
                }
            });
            return i;
        }
    }

    public long getLong(final String str, long j2) {
        final String str2 = this.a.get(str);
        if (TextUtils.isEmpty(str2)) {
            return j2;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException e2) {
            LogUtil.w("MemoryPreference", new Supplier() { // from class: com.oplus.aiunit.vision.jsb
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return MemoryPreference.d(str, str2, e2);
                }
            });
            return j2;
        }
    }

    public String getString(String str, String str2) {
        String str3 = this.a.get(str);
        return TextUtils.isEmpty(str3) ? str2 : str3;
    }

    public void setInt(String str, long j2) {
        this.a.put(str, String.valueOf(j2));
    }

    public void setLong(String str, long j2) {
        this.a.put(str, String.valueOf(j2));
    }

    public void setString(String str, String str2) {
        this.a.put(str, str2);
    }
}
