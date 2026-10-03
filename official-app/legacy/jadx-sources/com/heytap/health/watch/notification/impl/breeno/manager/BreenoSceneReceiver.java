package com.heytap.health.watch.notification.impl.breeno.manager;

import android.content.Context;
import android.content.Intent;
import com.coloros.sceneservice.sceneprovider.BaseSceneBroadcastReceiver;
import com.coloros.sceneservice.sceneprovider.api.CallResult;
import com.coloros.sceneservice.sceneprovider.api.SceneAbilityApi;
import com.coloros.sceneservice.sceneprovider.listener.SceneSubscribeListener;
import com.oplus.aiunit.vision.a7b;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/watch/notification/impl/breeno/manager/BreenoSceneReceiver;", "Lcom/coloros/sceneservice/sceneprovider/BaseSceneBroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "sceneServiceInitSuccess", "", "", "getSupportSceneIdList", "<init>", "()V", "Companion", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class BreenoSceneReceiver extends BaseSceneBroadcastReceiver {

    @NotNull
    public static final String TAG = "NTF_BreenoSceneReceiver";

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/health/watch/notification/impl/breeno/manager/BreenoSceneReceiver$b", "Lcom/coloros/sceneservice/sceneprovider/listener/SceneSubscribeListener;", "Lcom/coloros/sceneservice/sceneprovider/api/CallResult;", "callResult", "", "onSubscribeSceneEnd", "onUnSubscribeSceneEnd", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements SceneSubscribeListener {
        @Override // com.coloros.sceneservice.sceneprovider.listener.SceneSubscribeListener
        public void onSubscribeSceneEnd(@NotNull CallResult callResult) {
            Intrinsics.checkNotNullParameter(callResult, "callResult");
            a7b.f(BreenoSceneReceiver.TAG, "[onSubscribeSceneEnd] --> " + callResult);
        }

        @Override // com.coloros.sceneservice.sceneprovider.listener.SceneSubscribeListener
        public void onUnSubscribeSceneEnd(@NotNull CallResult callResult) {
            Intrinsics.checkNotNullParameter(callResult, "callResult");
            a7b.f(BreenoSceneReceiver.TAG, "[onUnSubscribeSceneEnd] --> " + callResult);
        }
    }

    @Override // com.coloros.sceneservice.sceneprovider.BaseSceneBroadcastReceiver
    @NotNull
    public List<String> getSupportSceneIdList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("30001");
        arrayList.add("30002");
        arrayList.add("30003");
        arrayList.add("30004");
        arrayList.add("30005");
        arrayList.add("30006");
        arrayList.add("30007");
        arrayList.add("30010");
        arrayList.add("30011");
        arrayList.add("30012");
        arrayList.add("30013");
        arrayList.add("30014");
        arrayList.add("30016");
        arrayList.add("30018");
        arrayList.add("30020");
        return arrayList;
    }

    @Override // com.coloros.sceneservice.sceneprovider.BaseSceneBroadcastReceiver, android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onReceive(context, intent);
        a7b.f(TAG, "[onReceive] --> " + intent.getAction());
    }

    @Override // com.coloros.sceneservice.sceneprovider.BaseSceneBroadcastReceiver
    public void sceneServiceInitSuccess() {
        a7b.f(TAG, "[BreenoSceneReceiver] --> register");
        try {
            SceneAbilityApi.INSTANCE.subscribeScene("30001,30002,30003,30004,30005,30006,30007,30010,30011,30012,30013,30014,30016,30018,30020", new b());
        } catch (Exception e2) {
            a7b.b(TAG, "[sceneServiceInitSuccess] --> " + e2.getMessage());
        }
    }
}
