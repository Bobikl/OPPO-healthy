package com.oplus.aiunit.vision;

import androidx.annotation.BinderThread;
import androidx.annotation.WorkerThread;
import com.oplus.wearable.linkservice.sdk.Node;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H'¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/b2g;", "", "Lcom/oplus/aiunit/vision/b2g$a;", "listener", "", "b", "a", "", "mac", "", "getRunMode", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
public interface b2g {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H'¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/b2g$a;", "", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "", "preMode", "currentMode", "", "onRunModeChanged", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        @BinderThread
        void onRunModeChanged(@NotNull Node node, int preMode, int currentMode);
    }

    void a(@NotNull a listener);

    void b(@NotNull a listener);

    @WorkerThread
    int getRunMode(@NotNull String mac);
}
