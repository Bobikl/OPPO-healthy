package com.heytap.health.devicelog.feedback;

import androidx.lifecycle.LiveData;
import com.heytap.health.protocol.file.LogKitProto$LogKitStateRsp;
import com.oplus.aiunit.vision.b2n;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J%\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0004H\u0016R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u0014\u0010\u001e\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/heytap/health/devicelog/feedback/b;", "", "Lcom/heytap/health/devicelog/feedback/FeedbackOption;", "fbOption", "", "b", "(Lcom/heytap/health/devicelog/feedback/FeedbackOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", b2n.g, "Lkotlin/Pair;", "", "", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", MapSchema.FIELD_NAME_ENTRY, "Landroidx/lifecycle/LiveData;", "Lcom/heytap/health/devicelog/feedback/a;", "d", "()Landroidx/lifecycle/LiveData;", "feedbackStage", "", "f", "logSyncProgress", "c", "fileUploadProgress", "Lcom/heytap/health/protocol/file/LogKitProto$LogKitStateRsp;", "i", "logStateChange", b2n.f, "()Z", "forceConnected", "j", "isRTOSDevice", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public interface b {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static void a(@NotNull b bVar) {
        }
    }

    @Nullable
    Object a(@NotNull Continuation<? super Pair<Boolean, ? extends List<String>>> continuation);

    @Nullable
    Object b(@NotNull FeedbackOption feedbackOption, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    LiveData<Float> c();

    @NotNull
    LiveData<com.heytap.health.devicelog.feedback.a> d();

    void e();

    @NotNull
    LiveData<Float> f();

    /* JADX INFO: renamed from: g */
    boolean getForceConnected();

    void h(@NotNull FeedbackOption fbOption);

    @NotNull
    LiveData<LogKitProto$LogKitStateRsp> i();

    /* JADX INFO: renamed from: j */
    boolean getIsRTOSDevice();
}
