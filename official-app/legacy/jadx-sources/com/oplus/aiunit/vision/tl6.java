package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0001J\u0011\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0001J\t\u0010\t\u001a\u00020\u0004H\u0096\u0001J\t\u0010\n\u001a\u00020\u0004H\u0096\u0001J\t\u0010\u000b\u001a\u00020\u0004H\u0096\u0001J\u0019\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001J\t\u0010\u0010\u001a\u00020\u0004H\u0096\u0001J\t\u0010\u0011\u001a\u00020\u0004H\u0096\u0001¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/tl6;", "Lcom/oplus/aiunit/vision/gn9;", "", "a", "", b2n.f, "", "mac", "b", "onDestroy", "c", MapSchema.FIELD_NAME_ENTRY, "nodeId", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "messageEvent", "onMessageReceived", "d", "f", "<init>", "()V", "calendar_impl_release"}, k = 1, mv = {1, 8, 0})
public final class tl6 implements gn9 {

    @NotNull
    public static final tl6 INSTANCE = new tl6();
    public final /* synthetic */ a i = new a();

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/oplus/aiunit/vision/tl6$a", "Lcom/oplus/aiunit/vision/gn9;", "", "mac", "", "b", "c", b2n.f, "d", "f", MapSchema.FIELD_NAME_ENTRY, "nodeId", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "messageEvent", "onMessageReceived", "", "a", "onDestroy", "i", "Ljava/lang/String;", "TAG", "calendar_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements gn9 {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final String TAG = "CalHealth.EmptyCalSync";

        @Override // com.oplus.aiunit.vision.gn9
        public boolean a() {
            return false;
        }

        @Override // com.oplus.aiunit.vision.gn9
        public void b(@NotNull String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
        }

        @Override // com.oplus.aiunit.vision.gn9
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.gn9
        public void d() {
        }

        @Override // com.oplus.aiunit.vision.gn9
        public void e() {
            a7b.f(this.TAG, "onManagementSync");
        }

        @Override // com.oplus.aiunit.vision.gn9
        public void f() {
        }

        @Override // com.oplus.aiunit.vision.gn9
        public void g() {
        }

        @Override // com.oplus.aiunit.vision.gn9
        public void onDestroy() {
        }

        @Override // com.oplus.aiunit.vision.gn9
        public void onMessageReceived(@NotNull String nodeId, @NotNull MessageEvent messageEvent) {
            Intrinsics.checkNotNullParameter(nodeId, "nodeId");
            Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        }
    }

    @Override // com.oplus.aiunit.vision.gn9
    public boolean a() {
        return this.i.a();
    }

    @Override // com.oplus.aiunit.vision.gn9
    public void b(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        this.i.b(mac);
    }

    @Override // com.oplus.aiunit.vision.gn9
    public void c() {
        this.i.c();
    }

    @Override // com.oplus.aiunit.vision.gn9
    public void d() {
        this.i.d();
    }

    @Override // com.oplus.aiunit.vision.gn9
    public void e() {
        this.i.e();
    }

    @Override // com.oplus.aiunit.vision.gn9
    public void f() {
        this.i.f();
    }

    @Override // com.oplus.aiunit.vision.gn9
    public void g() {
        this.i.g();
    }

    @Override // com.oplus.aiunit.vision.gn9
    public void onDestroy() {
        this.i.onDestroy();
    }

    @Override // com.oplus.aiunit.vision.gn9
    public void onMessageReceived(@NotNull String nodeId, @NotNull MessageEvent messageEvent) {
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        this.i.onMessageReceived(nodeId, messageEvent);
    }
}
