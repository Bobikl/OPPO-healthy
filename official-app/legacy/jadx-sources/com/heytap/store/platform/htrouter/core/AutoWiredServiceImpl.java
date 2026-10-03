package com.heytap.store.platform.htrouter.core;

import android.content.Context;
import android.util.LruCache;
import com.heytap.store.platform.htrouter.facade.annotations.Route;
import com.heytap.store.platform.htrouter.facade.service.AutoWiredService;
import com.heytap.store.platform.htrouter.facade.template.ISyringe;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes6.dex */
@Route(path = "/htrouter/service/autowired")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000fH\u0002J\u0016\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0002J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/heytap/store/platform/htrouter/core/AutoWiredServiceImpl;", "Lcom/heytap/store/platform/htrouter/facade/service/AutoWiredService;", "()V", "blackList", "", "", "classCache", "Landroid/util/LruCache;", "Lcom/heytap/store/platform/htrouter/facade/template/ISyringe;", "autoWired", "", "instance", "", "doInject", "parent", "Ljava/lang/Class;", "getSyringe", "clazz", "init", "context", "Landroid/content/Context;", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
public final class AutoWiredServiceImpl implements AutoWiredService {
    private List<String> blackList;
    private LruCache<String, ISyringe> classCache;

    private final void doInject(Object instance, Class<?> parent) {
        if (parent == null) {
            parent = instance.getClass();
        }
        ISyringe syringe = getSyringe(parent);
        if (syringe != null) {
            syringe.inject(instance);
        }
        Class<? super Object> superclass = parent.getSuperclass();
        if (superclass != null) {
            String name = superclass.getName();
            Intrinsics.checkNotNullExpressionValue(name, "superClazz.name");
            if (StringsKt__StringsJVMKt.startsWith$default(name, "android", false, 2, null)) {
                return;
            }
            doInject(instance, superclass);
        }
    }

    private final ISyringe getSyringe(Class<?> clazz) {
        ISyringe iSyringe;
        String className = clazz.getName();
        try {
            List<String> list = this.blackList;
            if (list != null && list.contains(className)) {
                return null;
            }
            LruCache<String, ISyringe> lruCache = this.classCache;
            if (lruCache == null || (iSyringe = lruCache.get(className)) == null) {
                Object objNewInstance = Class.forName(className + "$$HTRouter$$AutoWired").getConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.heytap.store.platform.htrouter.facade.template.ISyringe");
                }
                iSyringe = (ISyringe) objNewInstance;
            }
            LruCache<String, ISyringe> lruCache2 = this.classCache;
            if (lruCache2 != null) {
                lruCache2.put(className, iSyringe);
            }
            return iSyringe;
        } catch (Exception unused) {
            List<String> list2 = this.blackList;
            if (list2 == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(className, "className");
            list2.add(className);
            return null;
        }
    }

    @Override // com.heytap.store.platform.htrouter.facade.service.AutoWiredService
    public void autoWired(@NotNull Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        doInject(instance, null);
    }

    @Override // com.heytap.store.platform.htrouter.facade.template.IProvider
    public void init(@Nullable Context context) {
        this.classCache = new LruCache<>(50);
        this.blackList = new ArrayList();
    }
}
