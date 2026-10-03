package com.oplus.oms.split.full.splitload;

import android.app.Application;
import android.content.Context;
import com.oplus.aiunit.vision.bcm;
import com.oplus.aiunit.vision.wlm;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public final bcm a = bcm.f();
    public final Context b;

    public a(Context context) {
        this.b = context;
    }

    public void a(Application application) throws SplitLoadException {
        try {
            this.a.b(application, this.b);
        } catch (com.oplus.oms.split.full.splitload.c.b e2) {
            throw new SplitLoadException(-25, e2);
        }
    }

    public void b(ClassLoader classLoader, String str) throws SplitLoadException {
        try {
            this.a.c(classLoader, str);
        } catch (com.oplus.oms.split.full.splitload.c.b e2) {
            throw new SplitLoadException(-26, e2);
        }
    }

    public Application c(ClassLoader classLoader, String str) throws SplitLoadException {
        try {
            return this.a.e(classLoader, str);
        } catch (com.oplus.oms.split.full.splitload.c.b e2) {
            throw new SplitLoadException(-24, e2);
        }
    }

    public void d(Application application) throws SplitLoadException {
        if (application != null) {
            try {
                wlm.b(Application.class, "onCreate", new Class[0]).invoke(application, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                throw new SplitLoadException(-25, e2);
            }
        }
    }
}
