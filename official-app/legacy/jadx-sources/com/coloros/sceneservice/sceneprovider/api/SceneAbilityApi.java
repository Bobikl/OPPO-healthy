package com.coloros.sceneservice.sceneprovider.api;

import androidx.annotation.Keep;
import com.coloros.sceneservice.h.b;
import com.coloros.sceneservice.i.e;
import com.coloros.sceneservice.m.a;
import com.coloros.sceneservice.m.f;
import com.coloros.sceneservice.sceneprovider.listener.SceneSubscribeListener;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\tJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\tJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\b\u0010\u0012\u001a\u00020\u0006H\u0007J\b\u0010\u0013\u001a\u00020\u000eH\u0007J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/coloros/sceneservice/sceneprovider/api/SceneAbilityApi;", "", "()V", "TAG", "", "isSupportSubscribeScene", "", "()Z", "getSubscribedSceneList", "", "getSupportResourceList", "", "getSupportSceneList", "subscribeScene", "", "sceneIds", "listener", "Lcom/coloros/sceneservice/sceneprovider/listener/SceneSubscribeListener;", "tryBindSceneManagerService", "tryUnBindSceneManagerService", "unSubscribeScene", "com.coloros.sceneservice.sdk_release"}, k = 1, mv = {1, 1, 16})
public final class SceneAbilityApi {
    public static final SceneAbilityApi INSTANCE = new SceneAbilityApi();
    public static final String TAG = "SceneAbilityApi";

    @NotNull
    public final List getSubscribedSceneList() {
        e eVar = e.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(eVar, "SceneManager.getInstance()");
        List subscribedSceneList = eVar.getSubscribedSceneList();
        Intrinsics.checkExpressionValueIsNotNull(subscribedSceneList, "SceneManager.getInstance().subscribedSceneList");
        return subscribedSceneList;
    }

    @NotNull
    public final List getSupportResourceList() {
        e eVar = e.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(eVar, "SceneManager.getInstance()");
        List supportResourceList = eVar.getSupportResourceList();
        Intrinsics.checkExpressionValueIsNotNull(supportResourceList, "SceneManager.getInstance().supportResourceList");
        return supportResourceList;
    }

    @NotNull
    public final List getSupportSceneList() {
        e eVar = e.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(eVar, "SceneManager.getInstance()");
        List supportSceneList = eVar.getSupportSceneList();
        Intrinsics.checkExpressionValueIsNotNull(supportSceneList, "SceneManager.getInstance().supportSceneList");
        return supportSceneList;
    }

    public final boolean isSupportSubscribeScene() {
        return a.q();
    }

    public final void subscribeScene(@NotNull String sceneIds, @Nullable SceneSubscribeListener listener) {
        Intrinsics.checkParameterIsNotNull(sceneIds, "sceneIds");
        f.i(TAG, "subscribeScene sceneIds:" + sceneIds);
        com.coloros.sceneservice.n.e.a(new com.coloros.sceneservice.h.a(sceneIds, listener));
    }

    @Deprecated(message = "")
    public final boolean tryBindSceneManagerService() {
        return e.getInstance().tryBindSceneManagerService();
    }

    @Deprecated(message = "")
    public final void tryUnBindSceneManagerService() {
        e.getInstance().tryUnBindSceneManagerService();
    }

    public final void unSubscribeScene(@NotNull String sceneIds, @Nullable SceneSubscribeListener listener) {
        Intrinsics.checkParameterIsNotNull(sceneIds, "sceneIds");
        f.i(TAG, "unSubscribeScene sceneIds:" + sceneIds);
        com.coloros.sceneservice.n.e.a(new b(sceneIds, listener));
    }
}
