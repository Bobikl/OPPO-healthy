package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\u0004H&J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&J\b\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0011\u001a\u00020\u0004H&¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/gn9;", "", "", "mac", "", "b", "c", b2n.f, "d", "f", MapSchema.FIELD_NAME_ENTRY, "nodeId", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "messageEvent", "onMessageReceived", "", "a", "onDestroy", "calendar_impl_release"}, k = 1, mv = {1, 8, 0})
public interface gn9 {
    boolean a();

    void b(@NotNull String mac);

    void c();

    void d();

    void e();

    void f();

    void g();

    void onDestroy();

    void onMessageReceived(@NotNull String nodeId, @NotNull MessageEvent messageEvent);
}
