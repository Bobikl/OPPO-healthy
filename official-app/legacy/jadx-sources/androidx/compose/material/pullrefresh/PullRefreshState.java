package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\tH\u0002J\b\u00107\u001a\u00020\tH\u0002J\u0015\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020\tH\u0000¢\u0006\u0002\b:J\u0015\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\tH\u0000¢\u0006\u0002\b=J\u0015\u0010>\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u0014H\u0000¢\u0006\u0002\b?J\u0015\u0010@\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\bAJ\u0015\u0010B\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0002\bCR+\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010\u001b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R+\u0010\u001f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0013\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R\u001b\u0010#\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b$\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010'\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0013\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u000fR\u0011\u0010/\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b0\u0010\u000fR\u0014\u00101\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u000f¨\u0006D"}, d2 = {"Landroidx/compose/material/pullrefresh/PullRefreshState;", "", "animationScope", "Lkotlinx/coroutines/CoroutineScope;", "onRefreshState", "Landroidx/compose/runtime/State;", "Lkotlin/Function0;", "", "refreshingOffset", "", EventType.EventAssociationExtra.THRESHOLD, "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/State;FF)V", "<set-?>", "_position", "get_position", "()F", "set_position", "(F)V", "_position$delegate", "Landroidx/compose/runtime/MutableState;", "", "_refreshing", "get_refreshing", "()Z", "set_refreshing", "(Z)V", "_refreshing$delegate", "_refreshingOffset", "get_refreshingOffset", "set_refreshingOffset", "_refreshingOffset$delegate", "_threshold", "get_threshold", "set_threshold", "_threshold$delegate", "adjustedDistancePulled", "getAdjustedDistancePulled", "adjustedDistancePulled$delegate", "Landroidx/compose/runtime/State;", "distancePulled", "getDistancePulled", "setDistancePulled", "distancePulled$delegate", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "position", "getPosition$material_release", "progress", "getProgress", "refreshing", "getRefreshing$material_release", "getThreshold$material_release", "animateIndicatorTo", "Lkotlinx/coroutines/Job;", TypedValues.CycleType.S_WAVE_OFFSET, "calculateIndicatorPosition", "onPull", "pullDelta", "onPull$material_release", "onRelease", "velocity", "onRelease$material_release", "setRefreshing", "setRefreshing$material_release", "setRefreshingOffset", "setRefreshingOffset$material_release", "setThreshold", "setThreshold$material_release", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nPullRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,233:1\n76#2:234\n76#2:235\n102#2,2:236\n76#2:238\n102#2,2:239\n76#2:241\n102#2,2:242\n76#2:244\n102#2,2:245\n76#2:247\n102#2,2:248\n*S KotlinDebug\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n*L\n121#1:234\n123#1:235\n123#1:236,2\n124#1:238\n124#1:239,2\n125#1:241\n125#1:242,2\n126#1:244\n126#1:245,2\n127#1:247\n127#1:248,2\n*E\n"})
public final class PullRefreshState {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: _position$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState _position;

    /* JADX INFO: renamed from: _refreshing$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState _refreshing;

    /* JADX INFO: renamed from: _refreshingOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState _refreshingOffset;

    /* JADX INFO: renamed from: _threshold$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState _threshold;

    /* JADX INFO: renamed from: adjustedDistancePulled$delegate, reason: from kotlin metadata */
    @NotNull
    private final State adjustedDistancePulled;

    @NotNull
    private final CoroutineScope animationScope;

    /* JADX INFO: renamed from: distancePulled$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState distancePulled;

    @NotNull
    private final MutatorMutex mutatorMutex;

    @NotNull
    private final State<Function0<Unit>> onRefreshState;

    /* JADX INFO: renamed from: androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1", f = "PullRefreshState.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $offset;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1", f = "PullRefreshState.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
        public static final class C00831 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            final /* synthetic */ float $offset;
            int label;
            final /* synthetic */ PullRefreshState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00831(PullRefreshState pullRefreshState, float f, Continuation<? super C00831> continuation) {
                super(1, continuation);
                this.this$0 = pullRefreshState;
                this.$offset = f;
            }

            @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new C00831(this.this$0, this.$offset, continuation);
            }

            @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    float f = this.this$0.get_position();
                    float f2 = this.$offset;
                    final PullRefreshState pullRefreshState = this.this$0;
                    Function2<Float, Float, Unit> function2 = new Function2<Float, Float, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshState.animateIndicatorTo.1.1.1
                        {
                            super(2);
                        }

                        @Override // p010kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Float f3, Float f4) {
                            invoke(f3.floatValue(), f4.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(float f3, float f4) {
                            pullRefreshState.set_position(f3);
                        }
                    };
                    this.label = 1;
                    if (SuspendAnimationKt.animate$default(f, f2, 0.0f, null, function2, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            @Override // p010kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
                return ((C00831) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$offset = f;
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PullRefreshState.this.new AnonymousClass1(this.$offset, continuation);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutatorMutex mutatorMutex = PullRefreshState.this.mutatorMutex;
                C00831 c00831 = new C00831(PullRefreshState.this, this.$offset, null);
                this.label = 1;
                if (MutatorMutex.mutate$default(mutatorMutex, null, c00831, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // p010kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PullRefreshState(@NotNull CoroutineScope animationScope, @NotNull State<? extends Function0<Unit>> onRefreshState, float f, float f2) {
        Intrinsics.checkNotNullParameter(animationScope, "animationScope");
        Intrinsics.checkNotNullParameter(onRefreshState, "onRefreshState");
        this.animationScope = animationScope;
        this.onRefreshState = onRefreshState;
        this.adjustedDistancePulled = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: androidx.compose.material.pullrefresh.PullRefreshState$adjustedDistancePulled$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                return Float.valueOf(this.this$0.getDistancePulled() * 0.5f);
            }
        });
        this._refreshing = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        Float fValueOf = Float.valueOf(0.0f);
        this._position = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
        this.distancePulled = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
        this._threshold = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f2), null, 2, null);
        this._refreshingOffset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f), null, 2, null);
        this.mutatorMutex = new MutatorMutex();
    }

    private final Job animateIndicatorTo(float offset) {
        return BuildersKt__Builders_commonKt.launch$default(this.animationScope, null, null, new AnonymousClass1(offset, null), 3, null);
    }

    private final float calculateIndicatorPosition() {
        if (getAdjustedDistancePulled() <= getThreshold$material_release()) {
            return getAdjustedDistancePulled();
        }
        float fCoerceIn = RangesKt___RangesKt.coerceIn(Math.abs(getProgress()) - 1.0f, 0.0f, 2.0f);
        return getThreshold$material_release() + (getThreshold$material_release() * (fCoerceIn - (((float) Math.pow(fCoerceIn, 2)) / 4)));
    }

    private final float getAdjustedDistancePulled() {
        return ((Number) this.adjustedDistancePulled.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final float getDistancePulled() {
        return ((Number) this.distancePulled.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final float get_position() {
        return ((Number) this._position.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean get_refreshing() {
        return ((Boolean) this._refreshing.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float get_refreshingOffset() {
        return ((Number) this._refreshingOffset.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float get_threshold() {
        return ((Number) this._threshold.getValue()).floatValue();
    }

    private final void setDistancePulled(float f) {
        this.distancePulled.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_position(float f) {
        this._position.setValue(Float.valueOf(f));
    }

    private final void set_refreshing(boolean z) {
        this._refreshing.setValue(Boolean.valueOf(z));
    }

    private final void set_refreshingOffset(float f) {
        this._refreshingOffset.setValue(Float.valueOf(f));
    }

    private final void set_threshold(float f) {
        this._threshold.setValue(Float.valueOf(f));
    }

    public final float getPosition$material_release() {
        return get_position();
    }

    public final float getProgress() {
        return getAdjustedDistancePulled() / getThreshold$material_release();
    }

    public final boolean getRefreshing$material_release() {
        return get_refreshing();
    }

    public final float getThreshold$material_release() {
        return get_threshold();
    }

    public final float onPull$material_release(float pullDelta) {
        if (get_refreshing()) {
            return 0.0f;
        }
        float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(getDistancePulled() + pullDelta, 0.0f);
        float distancePulled = fCoerceAtLeast - getDistancePulled();
        setDistancePulled(fCoerceAtLeast);
        set_position(calculateIndicatorPosition());
        return distancePulled;
    }

    public final float onRelease$material_release(float velocity) {
        if (getRefreshing$material_release()) {
            return 0.0f;
        }
        if (getAdjustedDistancePulled() > getThreshold$material_release()) {
            this.onRefreshState.getValue().invoke();
        }
        animateIndicatorTo(0.0f);
        if ((getDistancePulled() == 0.0f) || velocity < 0.0f) {
            velocity = 0.0f;
        }
        setDistancePulled(0.0f);
        return velocity;
    }

    public final void setRefreshing$material_release(boolean refreshing) {
        if (get_refreshing() != refreshing) {
            set_refreshing(refreshing);
            setDistancePulled(0.0f);
            animateIndicatorTo(refreshing ? get_refreshingOffset() : 0.0f);
        }
    }

    public final void setRefreshingOffset$material_release(float refreshingOffset) {
        if (get_refreshingOffset() == refreshingOffset) {
            return;
        }
        set_refreshingOffset(refreshingOffset);
        if (getRefreshing$material_release()) {
            animateIndicatorTo(refreshingOffset);
        }
    }

    public final void setThreshold$material_release(float threshold) {
        set_threshold(threshold);
    }
}
