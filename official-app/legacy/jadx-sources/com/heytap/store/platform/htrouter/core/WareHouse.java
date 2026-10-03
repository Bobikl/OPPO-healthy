package com.heytap.store.platform.htrouter.core;

import com.heytap.store.platform.htrouter.base.UniqueKeyTreeMap;
import com.heytap.store.platform.htrouter.facade.models.RouteMeta;
import com.heytap.store.platform.htrouter.facade.template.IInterceptor;
import com.heytap.store.platform.htrouter.facade.template.IProvider;
import com.heytap.store.platform.htrouter.facade.template.IRouteGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001e\u001a\u00020\u001fRA\u0010\u0003\u001a2\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0004j\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006`\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R%\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\u00060\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R9\u0010\u0016\u001a*\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00170\u0004j\u0014\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0017`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR1\u0010\u0019\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u001a0\u0004j\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u001a`\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\nR1\u0010\u001c\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u001a0\u0004j\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u001a`\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\n¨\u0006 "}, d2 = {"Lcom/heytap/store/platform/htrouter/core/WareHouse;", "", "()V", "groupsIndex", "Ljava/util/HashMap;", "", "Ljava/lang/Class;", "Lcom/heytap/store/platform/htrouter/facade/template/IRouteGroup;", "Lkotlin/collections/HashMap;", "getGroupsIndex", "()Ljava/util/HashMap;", "interceptors", "Ljava/util/ArrayList;", "Lcom/heytap/store/platform/htrouter/facade/template/IInterceptor;", "Lkotlin/collections/ArrayList;", "getInterceptors", "()Ljava/util/ArrayList;", "interceptorsIndex", "Lcom/heytap/store/platform/htrouter/base/UniqueKeyTreeMap;", "", "getInterceptorsIndex", "()Lcom/heytap/store/platform/htrouter/base/UniqueKeyTreeMap;", "providers", "Lcom/heytap/store/platform/htrouter/facade/template/IProvider;", "getProviders", "providersIndex", "Lcom/heytap/store/platform/htrouter/facade/models/RouteMeta;", "getProvidersIndex", "routes", "getRoutes", "clear", "", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
public final class WareHouse {
    public static final WareHouse INSTANCE = new WareHouse();

    @NotNull
    private static final HashMap<String, Class<? extends IRouteGroup>> groupsIndex = new HashMap<>();

    @NotNull
    private static final HashMap<String, RouteMeta> routes = new HashMap<>();

    @NotNull
    private static final HashMap<Class<?>, IProvider> providers = new HashMap<>();

    @NotNull
    private static final HashMap<String, RouteMeta> providersIndex = new HashMap<>();

    @NotNull
    private static final UniqueKeyTreeMap<Integer, Class<? extends IInterceptor>> interceptorsIndex = new UniqueKeyTreeMap<>("More than one interceptors use same priority");

    @NotNull
    private static final ArrayList<IInterceptor> interceptors = new ArrayList<>();

    private WareHouse() {
    }

    public final void clear() {
        groupsIndex.clear();
        routes.clear();
        providers.clear();
        providersIndex.clear();
        interceptorsIndex.clear();
        interceptors.clear();
    }

    @NotNull
    public final HashMap<String, Class<? extends IRouteGroup>> getGroupsIndex() {
        return groupsIndex;
    }

    @NotNull
    public final ArrayList<IInterceptor> getInterceptors() {
        return interceptors;
    }

    @NotNull
    public final UniqueKeyTreeMap<Integer, Class<? extends IInterceptor>> getInterceptorsIndex() {
        return interceptorsIndex;
    }

    @NotNull
    public final HashMap<Class<?>, IProvider> getProviders() {
        return providers;
    }

    @NotNull
    public final HashMap<String, RouteMeta> getProvidersIndex() {
        return providersIndex;
    }

    @NotNull
    public final HashMap<String, RouteMeta> getRoutes() {
        return routes;
    }
}
