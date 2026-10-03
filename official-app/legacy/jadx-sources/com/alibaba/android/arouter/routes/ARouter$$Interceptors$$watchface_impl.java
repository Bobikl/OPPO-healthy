package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.facade.template.IInterceptorGroup;
import com.heytap.health.watchface.business.creation.predownload.UniPreDownloadTaskManager;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\u0018\u00010\u0006H\u0016¨\u0006\n"}, d2 = {"com/alibaba/android/arouter/routes/ARouter$$Interceptors$$watchface_impl", "Lcom/alibaba/android/arouter/facade/template/IInterceptorGroup;", "()V", Consts.METHOD_LOAD_INTO, "", "interceptor", "", "", "Ljava/lang/Class;", "Lcom/alibaba/android/arouter/facade/template/IInterceptor;", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ARouter$$Interceptors$$watchface_impl implements IInterceptorGroup {
    @Override // com.alibaba.android.arouter.facade.template.IInterceptorGroup
    public void loadInto(@Nullable Map<Integer, Class<? extends IInterceptor>> interceptor) {
        if (interceptor == null) {
            return;
        }
        interceptor.put(3, UniPreDownloadTaskManager.class);
    }
}
