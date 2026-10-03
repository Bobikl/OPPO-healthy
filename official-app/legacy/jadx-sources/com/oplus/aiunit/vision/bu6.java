package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Field;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class bu6 {
    public long a;
    public zp9 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9855c;

    public bu6(long j2, zp9 zp9Var) {
        this.a = j2;
        this.b = zp9Var;
    }

    public final JSONObject a(l7k l7kVar) throws JSONException, IllegalAccessException {
        if (l7kVar == null) {
            return null;
        }
        Class<?> superclass = l7kVar.getClass();
        JSONObject jSONObject = new JSONObject();
        do {
            for (Field field : superclass.getDeclaredFields()) {
                l6k l6kVar = (l6k) field.getAnnotation(l6k.class);
                if (l6kVar != null) {
                    String strValue = l6kVar.value();
                    if (TextUtils.isEmpty(strValue)) {
                        strValue = field.getName();
                    }
                    field.setAccessible(true);
                    jSONObject.put(strValue, String.valueOf(field.get(l7kVar)));
                }
            }
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                break;
            }
        } while (superclass != Object.class);
        return jSONObject;
    }

    public boolean b(Thread thread, Throwable th) {
        this.f9855c = Log.getStackTraceString(th);
        return this.b.filter(thread, th);
    }

    public zp9 c() {
        return this.b;
    }

    public com.oplus.nearx.track.internal.db.ExceptionEntity d() {
        com.oplus.nearx.track.internal.db.ExceptionEntity exceptionEntity = new com.oplus.nearx.track.internal.db.ExceptionEntity();
        exceptionEntity.moduleId = this.a;
        try {
            exceptionEntity.kvProperties = a(this.b.getKvProperties()).toString();
        } catch (Exception unused) {
        }
        exceptionEntity.moduleVersion = this.b.getModuleVersion();
        String str = this.f9855c;
        exceptionEntity.exception = str;
        exceptionEntity.md5 = acb.d(str);
        exceptionEntity.eventTime = System.currentTimeMillis();
        return exceptionEntity;
    }
}
