package com.omron;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import com.heytap.log.util.DateUtil;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class bm {
    private static final ThreadLocal<Map<String, SimpleDateFormat>> a = new a();

    public class a extends ThreadLocal<Map<String, SimpleDateFormat>> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<String, SimpleDateFormat> initialValue() {
            return new HashMap();
        }
    }

    public static String a(long j2) {
        return b().format(new Date(j2));
    }

    private static SimpleDateFormat b() {
        return a(DateUtil.DATEFORMATMILLISECOND);
    }

    public static SimpleDateFormat c() {
        return a("yyyy-MM-dd HH:mm:ss");
    }

    public static String a(long j2, @NonNull DateFormat dateFormat) {
        return dateFormat.format(new Date(j2));
    }

    public static String a(Date date) {
        return a(date, c());
    }

    public static String a(Date date, @NonNull DateFormat dateFormat) {
        return dateFormat.format(date);
    }

    public static SimpleDateFormat a() {
        return a("yyyy-MM-dd");
    }

    @SuppressLint({"SimpleDateFormat"})
    public static SimpleDateFormat a(String str) {
        Map<String, SimpleDateFormat> map = a.get();
        SimpleDateFormat simpleDateFormat = map.get(str);
        if (simpleDateFormat != null) {
            return simpleDateFormat;
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str);
        map.put(str, simpleDateFormat2);
        return simpleDateFormat2;
    }
}
