package com.oplus.aiunit.vision;

import com.oplus.epona.provider.ProviderInfo;
import com.oplus.epona.provider.ProviderMethodInfo;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class u2f implements vpf {
    public final ConcurrentHashMap<String, s76> a = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, ProviderInfo> b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap<String, Object> f17271c = new ConcurrentHashMap<>();

    @Override // com.oplus.aiunit.vision.vpf
    public s76 a(String str) {
        return this.a.get(str);
    }

    @Override // com.oplus.aiunit.vision.vpf
    public ProviderInfo b(String str) {
        return this.b.get(str);
    }

    @Override // com.oplus.aiunit.vision.vpf
    public void c(PrintWriter printWriter) {
        printWriter.println("---------start dump epona register info---------");
        e(printWriter);
        f(printWriter);
        printWriter.println("-------------------- end -----------------------");
    }

    public final Map<String, ProviderMethodInfo> d(ProviderInfo providerInfo) {
        if (providerInfo == null) {
            return null;
        }
        try {
            Field declaredField = providerInfo.getClass().getDeclaredField("mMethods");
            declaredField.setAccessible(true);
            return (Map) declaredField.get(providerInfo);
        } catch (Exception e2) {
            l7b.d("Epona->ProviderRepo", e2.toString(), new Object[0]);
            return null;
        }
    }

    public final void e(PrintWriter printWriter) {
        if (this.a.isEmpty()) {
            printWriter.println("Dynamic register provider is empty\n");
            return;
        }
        printWriter.println("dynamic:");
        for (Map.Entry<String, s76> entry : this.a.entrySet()) {
            if (entry.getValue().getName() != null) {
                printWriter.println(entry.getValue().getName());
            }
        }
        printWriter.println("");
    }

    public final void f(PrintWriter printWriter) {
        if (this.b.isEmpty()) {
            printWriter.println("Auto register provider is empty\n");
            return;
        }
        printWriter.println("static:");
        Iterator<Map.Entry<String, ProviderInfo>> it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            ProviderInfo value = it.next().getValue();
            String name = value.getName();
            if (name != null) {
                printWriter.println(name + " : ");
            }
            Map<String, ProviderMethodInfo> mapD = d(value);
            if (mapD != null) {
                for (Map.Entry<String, ProviderMethodInfo> entry : mapD.entrySet()) {
                    if (entry != null) {
                        printWriter.println("    -> " + entry.getValue().getMethodName());
                    }
                }
            }
            printWriter.println("");
        }
    }
}
