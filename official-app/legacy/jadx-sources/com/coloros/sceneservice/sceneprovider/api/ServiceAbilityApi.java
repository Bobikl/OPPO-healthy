package com.coloros.sceneservice.sceneprovider.api;

import android.os.Bundle;
import androidx.annotation.Keep;
import com.coloros.sceneservice.i.e;
import com.coloros.sceneservice.sceneprovider.listener.IMethodCallBack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u000e"}, d2 = {"Lcom/coloros/sceneservice/sceneprovider/api/ServiceAbilityApi;", "", "()V", "invokeSceneServiceMethod", "", "sceneId", "", "serviceId", "", "methodName", "request", "Landroid/os/Bundle;", "methodCallback", "Lcom/coloros/sceneservice/sceneprovider/listener/IMethodCallBack;", "com.coloros.sceneservice.sdk_release"}, k = 1, mv = {1, 1, 16})
public final class ServiceAbilityApi {
    public static final ServiceAbilityApi INSTANCE = new ServiceAbilityApi();

    public final void invokeSceneServiceMethod(int sceneId, @Nullable String serviceId, @NotNull String methodName, @Nullable Bundle request, @Nullable IMethodCallBack methodCallback) {
        Intrinsics.checkParameterIsNotNull(methodName, "methodName");
        e.getInstance().a(sceneId, serviceId, methodName, request, methodCallback);
    }
}
