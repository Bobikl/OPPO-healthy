package org.hapjs.card.sdk.utils.reflect;

import android.app.Application;
import android.content.Context;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes11.dex */
public class ContextImplClass {
    private static Field packageInfo;

    public static Object getPackageInfo(Context context) throws IllegalAccessException, NoSuchFieldException {
        Context baseContext = ((Application) context.getApplicationContext()).getBaseContext();
        if (packageInfo == null) {
            Field declaredField = baseContext.getClass().getDeclaredField("mPackageInfo");
            packageInfo = declaredField;
            declaredField.setAccessible(true);
        }
        return packageInfo.get(baseContext);
    }
}
