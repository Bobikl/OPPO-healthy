package com.oplus.aiunit.vision;

import com.alibaba.android.arouter.base.UniqueKeyTreeMap;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class y7l {
    public static Map<String, Class<? extends IRouteGroup>> a = new HashMap();
    public static Map<String, RouteMeta> b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Map<Class, IProvider> f18917c = new HashMap();
    public static Map<String, RouteMeta> d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Map<Integer, Class<? extends IInterceptor>> f18918e = new UniqueKeyTreeMap("More than one interceptors use same priority [%s]");
    public static List<IInterceptor> f = new ArrayList();
}
