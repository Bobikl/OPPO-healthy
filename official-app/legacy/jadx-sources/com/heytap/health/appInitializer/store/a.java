package com.heytap.health.appInitializer.store;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.g8a;
import com.oplus.aiunit.vision.lza;
import com.oplus.aiunit.vision.qe0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class a implements g8a {
    public final Context a;

    public a(Context context) {
        this.a = context;
    }

    @Override // com.oplus.aiunit.vision.g8a
    @NonNull
    public List<a8a> a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<Configuration> listB = b.b(this.a, "initializers.json");
        b(listB);
        List<a8a> listD = d(listB);
        StringBuilder sb = new StringBuilder();
        sb.append("initializers: cost time is ");
        sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sb.append(" list size is ");
        sb.append(listD.size());
        return listD;
    }

    public final void b(List<Configuration> list) {
        if (qe0.s()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            StringBuilder sb = new StringBuilder();
            sb.append("checkDuplicateIfNeed | size is ");
            sb.append(list.size());
            sb.append(", configurationSet size is ");
            sb.append(arrayList.size());
            for (Configuration configuration : list) {
                if (arrayList.contains(configuration)) {
                    arrayList2.add(configuration);
                } else {
                    arrayList.add(configuration);
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("checkDuplicateIfNeed | duplicate ");
            sb2.append(arrayList2);
            if (lza.a(arrayList2)) {
                return;
            }
            throw new RuntimeException("配置了重复的初始化器，请排查 initializers.json ：" + arrayList2);
        }
    }

    @Nullable
    public final a8a c(Configuration configuration) {
        try {
            Class<?> cls = Class.forName(configuration.getClassName());
            if (a8a.class.isAssignableFrom(cls)) {
                return (a8a) cls.newInstance();
            }
            a7b.b("ConfigurationFilesInitializerStore", "configuration2Initializer: clazz:" + configuration.getClassName() + " is not extend Initializer.class!!");
            return null;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            a7b.b("ConfigurationFilesInitializerStore", "configuration2Initializer: exception" + e2.getMessage());
            return null;
        }
    }

    public final List<a8a> d(List<Configuration> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        Iterator<Configuration> it = list.iterator();
        while (it.hasNext()) {
            a8a a8aVarC = c(it.next());
            if (a8aVarC != null) {
                arrayList.add(a8aVarC);
            }
        }
        return arrayList;
    }
}
