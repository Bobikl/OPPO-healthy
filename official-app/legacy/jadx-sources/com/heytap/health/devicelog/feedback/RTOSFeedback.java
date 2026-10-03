package com.heytap.health.devicelog.feedback;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.devicemanager.client.call.DMCallException;
import com.heytap.health.protocol.file.LogKitProto$LogListRsp;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.LogGetParam;
import com.oplus.aiunit.vision.LogGetResult;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.jlk;
import com.oplus.aiunit.vision.yr2;
import com.oplus.aiunit.vision.zk4;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fR\u001a\u0010\u0013\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/devicelog/feedback/RTOSFeedback;", "Lcom/heytap/health/devicelog/feedback/Feedback;", "Lkotlin/Pair;", "", "", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/devicelog/feedback/FeedbackOption;", "feedbackOption", "Lcom/heytap/health/devicelog/feedback/a$a;", "n", "(Lcom/heytap/health/devicelog/feedback/FeedbackOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fbOption", LogFieldKey.PROCESS_NAME_KEY, "u", "Z", b2n.f, "()Z", "forceConnected", "v", "j", "isRTOSDevice", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class RTOSFeedback extends Feedback {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final boolean forceConnected;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final boolean isRTOSDevice = true;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.heytap.health.devicelog.feedback.b
    @Nullable
    public Object a(@NotNull Continuation<? super Pair<Boolean, ? extends List<String>>> continuation) throws InvalidProtocolBufferException, DMCallException {
        RTOSFeedback$loadHistoryLogs$1 rTOSFeedback$loadHistoryLogs$1;
        if (continuation instanceof RTOSFeedback$loadHistoryLogs$1) {
            rTOSFeedback$loadHistoryLogs$1 = (RTOSFeedback$loadHistoryLogs$1) continuation;
            int i = rTOSFeedback$loadHistoryLogs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rTOSFeedback$loadHistoryLogs$1.label = i - Integer.MIN_VALUE;
            } else {
                rTOSFeedback$loadHistoryLogs$1 = new RTOSFeedback$loadHistoryLogs$1(this, continuation);
            }
        } else {
            rTOSFeedback$loadHistoryLogs$1 = new RTOSFeedback$loadHistoryLogs$1(this, continuation);
        }
        RTOSFeedback$loadHistoryLogs$1 rTOSFeedback$loadHistoryLogs$2 = rTOSFeedback$loadHistoryLogs$1;
        Object objC = rTOSFeedback$loadHistoryLogs$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = rTOSFeedback$loadHistoryLogs$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objC);
            zk4 zk4Var = gl4.devicePrimary.callApi;
            MessageEvent messageEvent = new MessageEvent(28, 2, null);
            rTOSFeedback$loadHistoryLogs$2.label = 1;
            objC = zk4.a.c(zk4Var, messageEvent, null, 0L, 0, rTOSFeedback$loadHistoryLogs$2, 14, null);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objC);
        }
        Intrinsics.checkNotNull(objC);
        return TuplesKt.to(Boxing.boxBoolean(false), LogKitProto$LogListRsp.parseFrom(((MessageEvent) objC).getData()).getLogListList());
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

    @Override // com.heytap.health.devicelog.feedback.Feedback
    @Nullable
    public Object n(@NotNull FeedbackOption feedbackOption, @NotNull Continuation<? super a.C0356a> continuation) {
        return a.C0356a.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.heytap.health.devicelog.feedback.Feedback
    @Nullable
    public Object p(@NotNull FeedbackOption feedbackOption, @NotNull Continuation<? super String> continuation) {
        RTOSFeedback$doSync$1 rTOSFeedback$doSync$1;
        if (continuation instanceof RTOSFeedback$doSync$1) {
            rTOSFeedback$doSync$1 = (RTOSFeedback$doSync$1) continuation;
            int i = rTOSFeedback$doSync$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rTOSFeedback$doSync$1.label = i - Integer.MIN_VALUE;
            } else {
                rTOSFeedback$doSync$1 = new RTOSFeedback$doSync$1(this, continuation);
            }
        } else {
            rTOSFeedback$doSync$1 = new RTOSFeedback$doSync$1(this, continuation);
        }
        Object objA = rTOSFeedback$doSync$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = rTOSFeedback$doSync$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA);
            yr2 yr2Var = new yr2(new WaitDevicePackage(), new c(), new SyncLogFiles(), new UploadFileOcloud(), new jlk());
            LogGetParam logGetParam = new LogGetParam(feedbackOption, s(), r(), u(), null, null, null, 112, null);
            rTOSFeedback$doSync$1.label = 1;
            objA = yr2Var.a(logGetParam, rTOSFeedback$doSync$1);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objA);
        }
        return ((LogGetResult) objA).getFid();
    }
}
