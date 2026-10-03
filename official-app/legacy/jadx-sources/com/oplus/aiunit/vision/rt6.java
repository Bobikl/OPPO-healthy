package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.statistics.NearMeStatistics;
import com.heytap.statistics.event.CustomEvent;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class rt6 extends ot6 {

    public static class a {
        public static final rt6 a = new rt6();
    }

    public static ot6 c() {
        return a.a;
    }

    @Override // com.oplus.aiunit.vision.ot6
    public boolean a(ExceptionEntity exceptionEntity) {
        try {
            NearMeStatistics.onBaseEvent(x84.a(), (int) exceptionEntity.b, new CustomEvent("01_0000", "01_0000_01", b(exceptionEntity)));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final Map<String, String> b(m7k m7kVar) throws IllegalAccessException {
        if (m7kVar == null) {
            return null;
        }
        Class<?> superclass = m7kVar.getClass();
        HashMap map = new HashMap();
        do {
            for (Field field : superclass.getDeclaredFields()) {
                m6k m6kVar = (m6k) field.getAnnotation(m6k.class);
                if (m6kVar != null) {
                    String strValue = m6kVar.value();
                    if (TextUtils.isEmpty(strValue)) {
                        strValue = field.getName();
                    }
                    field.setAccessible(true);
                    map.put(strValue, String.valueOf(field.get(m7kVar)));
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
