package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.statistics.NearMeStatistics;
import com.heytap.statistics.event.CustomEvent;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class st6 extends nt6 {

    public static class a {
        public static final st6 a = new st6();
    }

    public static nt6 d() {
        return a.a;
    }

    @Override // com.oplus.aiunit.vision.nt6
    public boolean a(com.oplus.nearx.track.internal.db.ExceptionEntity exceptionEntity) {
        try {
            NearMeStatistics.onBaseEvent(w84.a(), (int) exceptionEntity.moduleId, new CustomEvent("01_0000", "01_0000_01", c(exceptionEntity)));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final Map<String, String> c(l7k l7kVar) throws IllegalAccessException {
        if (l7kVar == null) {
            return null;
        }
        Class<?> superclass = l7kVar.getClass();
        HashMap map = new HashMap();
        do {
            for (Field field : superclass.getDeclaredFields()) {
                l6k l6kVar = (l6k) field.getAnnotation(l6k.class);
                if (l6kVar != null) {
                    String strValue = l6kVar.value();
                    if (TextUtils.isEmpty(strValue)) {
                        strValue = field.getName();
                    }
                    field.setAccessible(true);
                    map.put(strValue, String.valueOf(field.get(l7kVar)));
                }
            }
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                break;
            }
        } while (superclass != Object.class);
        return map;
    }
}
