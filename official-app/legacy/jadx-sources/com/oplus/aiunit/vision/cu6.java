package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Field;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class cu6 {
    public long a;
    public IExceptionProcess b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10242c;

    public cu6(long j2, IExceptionProcess iExceptionProcess) {
        this.a = j2;
        this.b = iExceptionProcess;
    }

    public final JSONObject a(m7k m7kVar) throws JSONException, IllegalAccessException {
        if (m7kVar == null) {
            return null;
        }
        Class<?> superclass = m7kVar.getClass();
        JSONObject jSONObject = new JSONObject();
        do {
            for (Field field : superclass.getDeclaredFields()) {
                m6k m6kVar = (m6k) field.getAnnotation(m6k.class);
                if (m6kVar != null) {
                    String strValue = m6kVar.value();
                    if (TextUtils.isEmpty(strValue)) {
                        strValue = field.getName();
                    }
                    field.setAccessible(true);
                    jSONObject.put(strValue, String.valueOf(field.get(m7kVar)));
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
        this.f10242c = Log.getStackTraceString(th);
        return this.b.filter(thread, th);
    }

    public ExceptionEntity c() {
        ExceptionEntity exceptionEntity = new ExceptionEntity();
        exceptionEntity.b = this.a;
        try {
            exceptionEntity.kvProperties = a(this.b.getKvProperties()).toString();
        } catch (Exception unused) {
        }
        exceptionEntity.moduleVersion = this.b.getModuleVersion();
        String str = this.f10242c;
        exceptionEntity.exception = str;
        exceptionEntity.md5 = zbb.d(str);
        exceptionEntity.eventTime = System.currentTimeMillis();
        return exceptionEntity;
    }
}
