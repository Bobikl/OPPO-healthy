package com.alibaba.android.arouter.routes;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.alibaba.android.arouter.facade.template.IRouteRoot;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\u0018\u00010\u0006H\u0016¨\u0006\n"}, d2 = {"com/alibaba/android/arouter/routes/ARouter$$Root$$home_impl", "Lcom/alibaba/android/arouter/facade/template/IRouteRoot;", "()V", Consts.METHOD_LOAD_INTO, "", "routes", "", "", "Ljava/lang/Class;", "Lcom/alibaba/android/arouter/facade/template/IRouteGroup;", "home_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ARouter$$Root$$home_impl implements IRouteRoot {
    public static final int $stable = 0;

    @Override // com.alibaba.android.arouter.facade.template.IRouteRoot
    public void loadInto(@Nullable Map<String, Class<? extends IRouteGroup>> routes) {
        if (routes == null) {
            return;
        }
        routes.put("home", ARouter$$Group$$home.class);
    }
}
