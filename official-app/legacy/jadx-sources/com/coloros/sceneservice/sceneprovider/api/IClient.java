package com.coloros.sceneservice.sceneprovider.api;

import android.os.Bundle;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/coloros/sceneservice/sceneprovider/api/IClient;", "", "handleSceneEvent", "", "sceneEventId", "", "sceneData", "Landroid/os/Bundle;", "Companion", "com.coloros.sceneservice.sdk_release"}, k = 1, mv = {1, 1, 16})
public interface IClient {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String KEY_SCENE_STATUS_DATA = "scene_status_data";

    /* JADX INFO: renamed from: com.coloros.sceneservice.sceneprovider.api.IClient$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String KEY_SCENE_STATUS_DATA = "scene_status_data";
    }

    public static final class b {
        public static void a(IClient iClient, int i, @Nullable Bundle bundle) {
        }
    }

    void handleSceneEvent(int sceneEventId, @Nullable Bundle sceneData);
}
