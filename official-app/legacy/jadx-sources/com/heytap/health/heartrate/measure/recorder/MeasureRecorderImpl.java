package com.heytap.health.heartrate.measure.recorder;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.heytap.health.heartrate.measure.entity.HeartMeasureResult;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.d6b;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 $2\u00020\u0001:\u0003\u0006\n%B\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001d\u001a\b\u0018\u00010\u001aR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lcom/heytap/health/heartrate/measure/recorder/MeasureRecorderImpl;", "Lcom/heytap/health/heartrate/measure/recorder/a;", "", "D", "Lcom/heytap/health/heartrate/measure/entity/HeartMeasureResult;", "output", "a", "Lcom/heytap/health/heartrate/measure/recorder/MeasureRecorderImpl$UpdateState;", "state", "c", "b", "release", "d", MapSchema.FIELD_NAME_ENTRY, "", "J", "mHeartRateTotal", "mRespRateTotal", "mHeartCount", "mRespCount", "Ljava/lang/Object;", "Ljava/lang/Object;", "mLock", "f", "Lcom/heytap/health/heartrate/measure/entity/HeartMeasureResult;", "mCurrentData", "Lcom/heytap/health/heartrate/measure/recorder/MeasureRecorderImpl$b;", b2n.f, "Lcom/heytap/health/heartrate/measure/recorder/MeasureRecorderImpl$b;", "mHandler", "Landroid/os/HandlerThread;", b2n.g, "Landroid/os/HandlerThread;", "mHandlerThread", "<init>", "()V", "Companion", "UpdateState", "heartrate_release"}, k = 1, mv = {1, 8, 0})
public final class MeasureRecorderImpl implements a {

    @NotNull
    public static final String TAG = "MeasureRecorderImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long mHeartRateTotal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long mRespRateTotal;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long mHeartCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long mRespCount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object mLock = new Object();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public HeartMeasureResult mCurrentData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public b mHandler;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public HandlerThread mHandlerThread;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/heartrate/measure/recorder/MeasureRecorderImpl$UpdateState;", "", "(Ljava/lang/String;I)V", "PREPARE", "MEASURING", "heartrate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UpdateState {
        PREPARE,
        MEASURING
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/heytap/health/heartrate/measure/recorder/MeasureRecorderImpl$b;", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "Landroid/os/Looper;", "looper", "<init>", "(Lcom/heytap/health/heartrate/measure/recorder/MeasureRecorderImpl;Landroid/os/Looper;)V", "heartrate_release"}, k = 1, mv = {1, 8, 0})
    public final class b extends Handler {
        public final /* synthetic */ MeasureRecorderImpl a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull MeasureRecorderImpl measureRecorderImpl, Looper looper) {
            super(looper);
            Intrinsics.checkNotNullParameter(looper, "looper");
            this.a = measureRecorderImpl;
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            int i = msg.what;
            if (i == 0) {
                d6b.INSTANCE.a(MeasureRecorderImpl.TAG, "update prepare");
            } else {
                if (i != 1) {
                    return;
                }
                d6b.INSTANCE.a(MeasureRecorderImpl.TAG, "update measuring");
            }
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UpdateState.values().length];
            try {
                iArr[UpdateState.PREPARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UpdateState.MEASURING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.heytap.health.heartrate.measure.recorder.a
    public void D() {
        e();
        d();
    }

    @Override // com.heytap.health.heartrate.measure.recorder.a
    public void a(@NotNull HeartMeasureResult output) {
        Intrinsics.checkNotNullParameter(output, "output");
        synchronized (this.mLock) {
            this.mCurrentData = output;
            if (output.getWarnStatus() == 0) {
                if (output.getHeartRate() != 0) {
                    this.mHeartRateTotal += (long) output.getHeartRate();
                    this.mHeartCount++;
                }
                if (output.getRespRate() != 0) {
                    this.mRespRateTotal += (long) output.getRespRate();
                    this.mRespCount++;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.heytap.health.heartrate.measure.recorder.a
    @NotNull
    public HeartMeasureResult b() {
        HeartMeasureResult heartMeasureResult = new HeartMeasureResult(0, 0, 0, 0, 15, null);
        long j2 = this.mHeartCount;
        if (j2 == 0) {
            heartMeasureResult.setHeartRate(0);
        } else {
            heartMeasureResult.setHeartRate((int) (this.mHeartRateTotal / j2));
        }
        long j3 = this.mRespCount;
        if (j3 == 0) {
            heartMeasureResult.setRespRate(0);
        } else {
            heartMeasureResult.setRespRate((int) (this.mRespRateTotal / j3));
        }
        HeartMeasureResult heartMeasureResult2 = this.mCurrentData;
        heartMeasureResult.setMotionStatus(heartMeasureResult2 != null ? heartMeasureResult2.getMotionStatus() : 0);
        HeartMeasureResult heartMeasureResult3 = this.mCurrentData;
        heartMeasureResult.setWarnStatus(heartMeasureResult3 != null ? heartMeasureResult3.getWarnStatus() : 0);
        d6b d6bVar = d6b.INSTANCE;
        d6bVar.a(TAG, "current data is " + this.mCurrentData);
        d6bVar.a(TAG, "output data is " + heartMeasureResult);
        return heartMeasureResult;
    }

    @Override // com.heytap.health.heartrate.measure.recorder.a
    public void c(@NotNull HeartMeasureResult output, @NotNull UpdateState state) {
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(state, "state");
        if (output.getWarnStatus() != 0) {
            int i = c.$EnumSwitchMapping$0[state.ordinal()];
            if (i == 1) {
                b bVar = this.mHandler;
                if (bVar != null && bVar.hasMessages(0)) {
                    output.setWarnStatus(0);
                    return;
                }
                b bVar2 = this.mHandler;
                if (bVar2 != null) {
                    bVar2.sendEmptyMessageDelayed(0, 1000L);
                    return;
                }
                return;
            }
            if (i != 2) {
                return;
            }
            b bVar3 = this.mHandler;
            if (bVar3 != null && bVar3.hasMessages(1)) {
                output.setWarnStatus(0);
                return;
            }
            b bVar4 = this.mHandler;
            if (bVar4 != null) {
                bVar4.sendEmptyMessageDelayed(1, 5000L);
            }
        }
    }

    public final void d() {
        if (this.mHandlerThread == null) {
            HandlerThread handlerThread = new HandlerThread(TAG);
            this.mHandlerThread = handlerThread;
            handlerThread.start();
            HandlerThread handlerThread2 = this.mHandlerThread;
            if (handlerThread2 != null) {
                Looper looper = handlerThread2.getLooper();
                Intrinsics.checkNotNullExpressionValue(looper, "it.looper");
                this.mHandler = new b(this, looper);
            }
        }
    }

    public final void e() {
        synchronized (this.mLock) {
            this.mHeartRateTotal = 0L;
            this.mRespRateTotal = 0L;
            this.mHeartCount = 0L;
            this.mRespCount = 0L;
            this.mCurrentData = null;
            HandlerThread handlerThread = this.mHandlerThread;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            this.mHandlerThread = null;
            this.mHandler = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.heytap.health.heartrate.measure.recorder.a
    public void release() {
        e();
    }
}
