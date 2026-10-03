package com.heytap.health.devicelog.feedback;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.protocol.file.LogKitProto$LogKitActionReq;
import com.heytap.health.protocol.file.LogKitProto$LogKitStateRsp;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.LogGetParam;
import com.oplus.aiunit.vision.LogGetResult;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.bm5;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.l9d;
import com.oplus.aiunit.vision.rg7;
import com.oplus.aiunit.vision.rl4;
import com.oplus.aiunit.vision.ul4;
import com.oplus.aiunit.vision.yr2;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import java.util.List;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b5\u00106J%\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u001c\u0010%\u001a\n \"*\u0004\u0018\u00010!0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u00101\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00104\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lcom/heytap/health/devicelog/feedback/TayCanFeedback;", "Lcom/heytap/health/devicelog/feedback/Feedback;", "Lcom/oplus/aiunit/vision/rl4$b;", "Lcom/oplus/aiunit/vision/ul4$a;", "Lkotlin/Pair;", "", "", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/devicelog/feedback/FeedbackOption;", "feedbackOption", "Lcom/heytap/health/devicelog/feedback/a$e;", "n", "(Lcom/heytap/health/devicelog/feedback/FeedbackOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fbOption", LogFieldKey.PROCESS_NAME_KEY, "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "", "onMessageReceived", MapSchema.FIELD_NAME_ENTRY, "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "onPeerConnected", "onPeerDisconnected", "", "u", "I", SpeechConstant.KEY_EVENT_SID, "v", "cid", "Lcom/heytap/health/protocol/file/LogKitProto$LogKitStateRsp;", "kotlin.jvm.PlatformType", "w", "Lcom/heytap/health/protocol/file/LogKitProto$LogKitStateRsp;", "stateNone", "x", "Ljava/util/List;", "logHistory", "Lkotlinx/coroutines/sync/Mutex;", "y", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "z", "Z", b2n.f, "()Z", "forceConnected", "A", "j", "isRTOSDevice", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFeedbackStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedbackStrategy.kt\ncom/heytap/health/devicelog/feedback/TayCanFeedback\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,149:1\n120#2,10:150\n*S KotlinDebug\n*F\n+ 1 FeedbackStrategy.kt\ncom/heytap/health/devicelog/feedback/TayCanFeedback\n*L\n90#1:150,10\n*E\n"})
public final class TayCanFeedback extends Feedback implements rl4.b, ul4.a {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public final boolean isRTOSDevice;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final int sid = 28;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final int cid = 1;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public final LogKitProto$LogKitStateRsp stateNone = LogKitProto$LogKitStateRsp.newBuilder().setAction(-1).build();

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public List<String> logHistory;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final Mutex mutex;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public final boolean forceConnected;

    public TayCanFeedback() {
        Mutex Mutex = MutexKt.Mutex(false);
        this.mutex = Mutex;
        Mutex.tryLock(this);
        bm5 bm5Var = gl4.devicePrimary;
        bm5Var.messageApi.f(28, 1, this);
        bm5Var.nodeApi.g(this);
        bm5Var.messageApi.b(new MessageEvent(28, 1, LogKitProto$LogKitActionReq.newBuilder().setAction(0).build().toByteArray()));
        this.forceConnected = true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.heytap.health.devicelog.feedback.b
    @Nullable
    public Object a(@NotNull Continuation<? super Pair<Boolean, ? extends List<String>>> continuation) {
        TayCanFeedback$loadHistoryLogs$1 tayCanFeedback$loadHistoryLogs$1;
        Mutex mutex;
        if (continuation instanceof TayCanFeedback$loadHistoryLogs$1) {
            tayCanFeedback$loadHistoryLogs$1 = (TayCanFeedback$loadHistoryLogs$1) continuation;
            int i = tayCanFeedback$loadHistoryLogs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tayCanFeedback$loadHistoryLogs$1.label = i - Integer.MIN_VALUE;
            } else {
                tayCanFeedback$loadHistoryLogs$1 = new TayCanFeedback$loadHistoryLogs$1(this, continuation);
            }
        } else {
            tayCanFeedback$loadHistoryLogs$1 = new TayCanFeedback$loadHistoryLogs$1(this, continuation);
        }
        Object obj = tayCanFeedback$loadHistoryLogs$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = tayCanFeedback$loadHistoryLogs$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            mutex = this.mutex;
            tayCanFeedback$loadHistoryLogs$1.L$0 = this;
            tayCanFeedback$loadHistoryLogs$1.L$1 = mutex;
            tayCanFeedback$loadHistoryLogs$1.label = 1;
            if (mutex.lock(null, tayCanFeedback$loadHistoryLogs$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) tayCanFeedback$loadHistoryLogs$1.L$1;
            TayCanFeedback tayCanFeedback = (TayCanFeedback) tayCanFeedback$loadHistoryLogs$1.L$0;
            ResultKt.throwOnFailure(obj);
            mutex = mutex2;
            this = tayCanFeedback;
        }
        try {
            Boolean boolBoxBoolean = Boxing.boxBoolean(true);
            List<String> listEmptyList = this.logHistory;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            return TuplesKt.to(boolBoxBoolean, listEmptyList);
        } finally {
            mutex.unlock(null);
        }
    }

    @Override // com.heytap.health.devicelog.feedback.Feedback, com.heytap.health.devicelog.feedback.b
    public void e() {
        bm5 bm5Var = gl4.devicePrimary;
        bm5Var.messageApi.t(this.sid, this.cid, this);
        bm5Var.nodeApi.d(this);
    }

    @Override // com.heytap.health.devicelog.feedback.b
    /* JADX INFO: renamed from: g, reason: from getter */
    public boolean getForceConnected() {
        return this.forceConnected;
    }

    @Override // com.heytap.health.devicelog.feedback.b
    /* JADX INFO: renamed from: j, reason: from getter */
    public boolean getIsRTOSDevice() {
        return this.isRTOSDevice;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.heytap.health.devicelog.feedback.Feedback
    @Nullable
    public Object n(@NotNull FeedbackOption feedbackOption, @NotNull Continuation<? super a.LogkitOk> continuation) {
        TayCanFeedback$doSubmit$1 tayCanFeedback$doSubmit$1;
        FeedbackOption feedbackOption2;
        if (continuation instanceof TayCanFeedback$doSubmit$1) {
            tayCanFeedback$doSubmit$1 = (TayCanFeedback$doSubmit$1) continuation;
            int i = tayCanFeedback$doSubmit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tayCanFeedback$doSubmit$1.label = i - Integer.MIN_VALUE;
            } else {
                tayCanFeedback$doSubmit$1 = new TayCanFeedback$doSubmit$1(this, continuation);
            }
        } else {
            tayCanFeedback$doSubmit$1 = new TayCanFeedback$doSubmit$1(this, continuation);
        }
        Object objA = tayCanFeedback$doSubmit$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = tayCanFeedback$doSubmit$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA);
            yr2 yr2Var = new yr2(new c(), new UploadFileOcloud(), new TellDeviceUploadLog());
            LogGetParam logGetParam = new LogGetParam(feedbackOption, null, null, null, null, null, null, 126, null);
            tayCanFeedback$doSubmit$1.L$0 = feedbackOption;
            tayCanFeedback$doSubmit$1.label = 1;
            objA = yr2Var.a(logGetParam, tayCanFeedback$doSubmit$1);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            feedbackOption2 = feedbackOption;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            feedbackOption2 = (FeedbackOption) tayCanFeedback$doSubmit$1.L$0;
            ResultKt.throwOnFailure(objA);
        }
        return new a.LogkitOk(feedbackOption2, ((LogGetResult) objA).getFid());
    }

    @Override // com.oplus.aiunit.vision.rl4.b
    public void onMessageReceived(@NotNull String mac, @NotNull MessageEvent event) throws InvalidProtocolBufferException {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(event, "event");
        LogKitProto$LogKitStateRsp from = LogKitProto$LogKitStateRsp.parseFrom(event.getData());
        a7b.f(Feedback.INSTANCE.a(), "TayCanFeedback@" + hashCode() + " onMessageReceived -> " + from);
        int action = from.getAction();
        if (action == 0) {
            v().postValue(from);
            this.logHistory = from.getHistoryList();
            this.mutex.unlock(this);
        } else if (action != 7) {
            v().postValue(from);
        } else {
            rg7.m(from.getParam());
        }
    }

    @Override // com.oplus.aiunit.vision.ul4.a
    public void onPeerConnected(@NotNull Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        gl4.devicePrimary.messageApi.b(new MessageEvent(this.sid, this.cid, LogKitProto$LogKitActionReq.newBuilder().setAction(0).build().toByteArray()));
    }

    @Override // com.oplus.aiunit.vision.ul4.a
    public void onPeerDisconnected(@NotNull Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        v().postValue(this.stateNone);
    }

    @Override // com.heytap.health.devicelog.feedback.Feedback
    @Nullable
    public Object p(@NotNull FeedbackOption feedbackOption, @NotNull Continuation<? super String> continuation) {
        return "";
    }
}
