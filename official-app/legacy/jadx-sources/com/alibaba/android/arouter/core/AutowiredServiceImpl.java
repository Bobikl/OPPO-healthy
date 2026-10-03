package com.alibaba.android.arouter.core;

import android.content.Context;
import android.util.LruCache;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.AutowiredService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
@Route(path = "/arouter/service/autowired")
public class AutowiredServiceImpl implements AutowiredService {
    public LruCache<String, ISyringe> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<String> f540j;

    @Override // com.alibaba.android.arouter.facade.service.AutowiredService
    public void autowire(Object obj) {
        c(obj, null);
    }

    public final void c(Object obj, Class<?> cls) {
        if (cls == null) {
            cls = obj.getClass();
        }
        ISyringe iSyringeH1 = h1(cls);
        if (iSyringeH1 != null) {
            iSyringeH1.inject(obj);
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null || superclass.getName().startsWith("android")) {
            return;
        }
        c(obj, superclass);
    }

    public final ISyringe h1(Class<?> cls) {
        String name = cls.getName();
        try {
            if (this.f540j.contains(name)) {
                return null;
            }
            ISyringe iSyringe = this.i.get(name);
            if (iSyringe == null) {
                iSyringe = (ISyringe) Class.forName(cls.getName() + "$$ARouter$$Autowired").getConstructor(new Class[0]).newInstance(new Object[0]);
            }
            this.i.put(name, iSyringe);
            return iSyringe;
        } catch (Exception unused) {
            this.f540j.add(name);
            return null;
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        this.i = new LruCache<>(50);
        this.f540j = new ArrayList();
    }
}
