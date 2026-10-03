package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import com.oplus.aiunit.vision.a8i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ!\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020!H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b(\u0010$J\u001b\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u000e\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020\u0005J\u0006\u00100\u001a\u00020\u0005J'\u00101\u001a\u00020**\u0002022\u0006\u00103\u001a\u00020*2\u0006\u00104\u001a\u000205ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020**\u00020*ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010-J\n\u00108\u001a\u00020:*\u00020:J\u0017\u0010;\u001a\u00020**\u00020*ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010-J\u0017\u0010=\u001a\u00020!*\u00020!ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010-J\u0017\u0010?\u001a\u00020:*\u00020*ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010AJ\u0017\u0010?\u001a\u00020:*\u00020!ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010AJ\u001a\u0010C\u001a\u00020**\u00020:ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020!*\u00020!2\u0006\u0010G\u001a\u00020:ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bH\u0010IR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001b\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006J"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "reverseDirection", "", "nestedScrollDispatcher", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/runtime/State;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/OverscrollEffect;)V", "getFlingBehavior", "()Landroidx/compose/foundation/gestures/FlingBehavior;", "isNestedFlinging", "Landroidx/compose/runtime/MutableState;", "getNestedScrollDispatcher", "()Landroidx/compose/runtime/State;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getOverscrollEffect", "()Landroidx/compose/foundation/OverscrollEffect;", "getReverseDirection", "()Z", "getScrollableState", "()Landroidx/compose/foundation/gestures/ScrollableState;", "shouldDispatchOverscroll", "getShouldDispatchOverscroll", "doFlingAnimation", "Landroidx/compose/ui/unit/Velocity;", "available", "doFlingAnimation-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDragStopped", "", "initialVelocity", "onDragStopped-sF-c-tU", "performRawScroll", "Landroidx/compose/ui/geometry/Offset;", "scroll", "performRawScroll-MK-Hz9U", "(J)J", "registerNestedFling", "isFlinging", "shouldScrollImmediately", "dispatchScroll", "Landroidx/compose/foundation/gestures/ScrollScope;", "availableDelta", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "dispatchScroll-3eAAhYA", "(Landroidx/compose/foundation/gestures/ScrollScope;JI)J", "reverseIfNeeded", "reverseIfNeeded-MK-Hz9U", "", "singleAxisOffset", "singleAxisOffset-MK-Hz9U", "singleAxisVelocity", "singleAxisVelocity-AH228Gc", "toFloat", "toFloat-k-4lQ0M", "(J)F", "toFloat-TH1AsA0", "toOffset", "toOffset-tuRUvjQ", "(F)J", a8i.UPDATE, "newValue", "update-QWom1Mo", "(JF)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ScrollingLogic {

    @NotNull
    private final FlingBehavior flingBehavior;

    @NotNull
    private final MutableState<Boolean> isNestedFlinging;

    @NotNull
    private final State<NestedScrollDispatcher> nestedScrollDispatcher;

    @NotNull
    private final Orientation orientation;

    @Nullable
    private final OverscrollEffect overscrollEffect;
    private final boolean reverseDirection;

    @NotNull
    private final ScrollableState scrollableState;

    public ScrollingLogic(@NotNull Orientation orientation, boolean z, @NotNull State<NestedScrollDispatcher> nestedScrollDispatcher, @NotNull ScrollableState scrollableState, @NotNull FlingBehavior flingBehavior, @Nullable OverscrollEffect overscrollEffect) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(nestedScrollDispatcher, "nestedScrollDispatcher");
        Intrinsics.checkNotNullParameter(scrollableState, "scrollableState");
        Intrinsics.checkNotNullParameter(flingBehavior, "flingBehavior");
        this.orientation = orientation;
        this.reverseDirection = z;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.scrollableState = scrollableState;
        this.flingBehavior = flingBehavior;
        this.overscrollEffect = overscrollEffect;
        this.isNestedFlinging = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private final boolean getShouldDispatchOverscroll() {
        return this.scrollableState.getCanScrollForward() || this.scrollableState.getCanScrollBackward();
    }

    /* JADX INFO: renamed from: dispatchScroll-3eAAhYA, reason: not valid java name */
    public final long m322dispatchScroll3eAAhYA(@NotNull final ScrollScope dispatchScroll, long j2, final int i) {
        Intrinsics.checkNotNullParameter(dispatchScroll, "$this$dispatchScroll");
        long jM327singleAxisOffsetMKHz9U = m327singleAxisOffsetMKHz9U(j2);
        Function1<Offset, Offset> function1 = new Function1<Offset, Offset>() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$dispatchScroll$performScroll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Offset invoke(Offset offset) {
                return Offset.m1369boximpl(m333invokeMKHz9U(offset.getPackedValue()));
            }

            /* JADX INFO: renamed from: invoke-MK-Hz9U, reason: not valid java name */
            public final long m333invokeMKHz9U(long j3) {
                NestedScrollDispatcher value = this.this$0.getNestedScrollDispatcher().getValue();
                long jM2904dispatchPreScrollOzD1aCk = value.m2904dispatchPreScrollOzD1aCk(j3, i);
                long jM1384minusMKHz9U = Offset.m1384minusMKHz9U(j3, jM2904dispatchPreScrollOzD1aCk);
                ScrollingLogic scrollingLogic = this.this$0;
                long jM326reverseIfNeededMKHz9U = scrollingLogic.m326reverseIfNeededMKHz9U(scrollingLogic.m331toOffsettuRUvjQ(dispatchScroll.scrollBy(scrollingLogic.m330toFloatk4lQ0M(scrollingLogic.m326reverseIfNeededMKHz9U(jM1384minusMKHz9U)))));
                return Offset.m1385plusMKHz9U(Offset.m1385plusMKHz9U(jM2904dispatchPreScrollOzD1aCk, jM326reverseIfNeededMKHz9U), value.m2902dispatchPostScrollDzOQY0M(jM326reverseIfNeededMKHz9U, Offset.m1384minusMKHz9U(jM1384minusMKHz9U, jM326reverseIfNeededMKHz9U), i));
            }
        };
        return (this.overscrollEffect == null || !getShouldDispatchOverscroll()) ? function1.invoke(Offset.m1369boximpl(jM327singleAxisOffsetMKHz9U)).getPackedValue() : this.overscrollEffect.mo158applyToScrollRhakbz0(jM327singleAxisOffsetMKHz9U, i, function1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: doFlingAnimation-QWom1Mo, reason: not valid java name */
    public final Object m323doFlingAnimationQWom1Mo(long j2, @NotNull Continuation<? super Velocity> continuation) {
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$1;
        Ref.LongRef longRef;
        if (continuation instanceof ScrollingLogic$doFlingAnimation$1) {
            scrollingLogic$doFlingAnimation$1 = (ScrollingLogic$doFlingAnimation$1) continuation;
            int i = scrollingLogic$doFlingAnimation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                scrollingLogic$doFlingAnimation$1.label = i - Integer.MIN_VALUE;
            } else {
                scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, continuation);
            }
        } else {
            scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, continuation);
        }
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$2 = scrollingLogic$doFlingAnimation$1;
        Object obj = scrollingLogic$doFlingAnimation$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = scrollingLogic$doFlingAnimation$2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.LongRef longRef2 = new Ref.LongRef();
            longRef2.element = j2;
            ScrollableState scrollableState = this.scrollableState;
            ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$3 = new ScrollingLogic$doFlingAnimation$2(this, longRef2, j2, null);
            scrollingLogic$doFlingAnimation$2.L$0 = longRef2;
            scrollingLogic$doFlingAnimation$2.label = 1;
            if (ScrollableState.scroll$default(scrollableState, null, scrollingLogic$doFlingAnimation$3, scrollingLogic$doFlingAnimation$2, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            longRef = longRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            longRef = (Ref.LongRef) scrollingLogic$doFlingAnimation$2.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return Velocity.m4320boximpl(longRef.element);
    }

    @NotNull
    public final FlingBehavior getFlingBehavior() {
        return this.flingBehavior;
    }

    @NotNull
    public final State<NestedScrollDispatcher> getNestedScrollDispatcher() {
        return this.nestedScrollDispatcher;
    }

    @NotNull
    public final Orientation getOrientation() {
        return this.orientation;
    }

    @Nullable
    public final OverscrollEffect getOverscrollEffect() {
        return this.overscrollEffect;
    }

    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    @NotNull
    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: onDragStopped-sF-c-tU, reason: not valid java name */
    public final Object m324onDragStoppedsFctU(long j2, @NotNull Continuation<? super Unit> continuation) {
        ScrollingLogic$onDragStopped$1 scrollingLogic$onDragStopped$1;
        if (continuation instanceof ScrollingLogic$onDragStopped$1) {
            scrollingLogic$onDragStopped$1 = (ScrollingLogic$onDragStopped$1) continuation;
            int i = scrollingLogic$onDragStopped$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                scrollingLogic$onDragStopped$1.label = i - Integer.MIN_VALUE;
            } else {
                scrollingLogic$onDragStopped$1 = new ScrollingLogic$onDragStopped$1(this, continuation);
            }
        } else {
            scrollingLogic$onDragStopped$1 = new ScrollingLogic$onDragStopped$1(this, continuation);
        }
        Object obj = scrollingLogic$onDragStopped$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = scrollingLogic$onDragStopped$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            registerNestedFling(true);
            long jM328singleAxisVelocityAH228Gc = m328singleAxisVelocityAH228Gc(j2);
            ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this, null);
            if (this.overscrollEffect == null || !getShouldDispatchOverscroll()) {
                Velocity velocityM4320boximpl = Velocity.m4320boximpl(jM328singleAxisVelocityAH228Gc);
                scrollingLogic$onDragStopped$1.L$0 = this;
                scrollingLogic$onDragStopped$1.label = 2;
                if (scrollingLogic$onDragStopped$performFling$1.invoke(velocityM4320boximpl, scrollingLogic$onDragStopped$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                OverscrollEffect overscrollEffect = this.overscrollEffect;
                scrollingLogic$onDragStopped$1.L$0 = this;
                scrollingLogic$onDragStopped$1.label = 1;
                if (overscrollEffect.mo157applyToFlingBMRW4eQ(jM328singleAxisVelocityAH228Gc, scrollingLogic$onDragStopped$performFling$1, scrollingLogic$onDragStopped$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (ScrollingLogic) scrollingLogic$onDragStopped$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.registerNestedFling(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: performRawScroll-MK-Hz9U, reason: not valid java name */
    public final long m325performRawScrollMKHz9U(long scroll) {
        return this.scrollableState.isScrollInProgress() ? Offset.INSTANCE.m1396getZeroF1C5BW0() : m331toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m330toFloatk4lQ0M(scroll)))));
    }

    public final void registerNestedFling(boolean isFlinging) {
        this.isNestedFlinging.setValue(Boolean.valueOf(isFlinging));
    }

    public final float reverseIfNeeded(float f) {
        return this.reverseDirection ? f * (-1) : f;
    }

    /* JADX INFO: renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m326reverseIfNeededMKHz9U(long j2) {
        return this.reverseDirection ? Offset.m1387timestuRUvjQ(j2, -1.0f) : j2;
    }

    public final boolean shouldScrollImmediately() {
        if (!this.scrollableState.isScrollInProgress() && !this.isNestedFlinging.getValue().booleanValue()) {
            OverscrollEffect overscrollEffect = this.overscrollEffect;
            if (!(overscrollEffect != null ? overscrollEffect.isInProgress() : false)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: singleAxisOffset-MK-Hz9U, reason: not valid java name */
    public final long m327singleAxisOffsetMKHz9U(long j2) {
        return this.orientation == Orientation.Horizontal ? Offset.m1374copydBAh8RU$default(j2, 0.0f, 0.0f, 1, null) : Offset.m1374copydBAh8RU$default(j2, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: renamed from: singleAxisVelocity-AH228Gc, reason: not valid java name */
    public final long m328singleAxisVelocityAH228Gc(long j2) {
        return this.orientation == Orientation.Horizontal ? Velocity.m4325copyOhffZ5M$default(j2, 0.0f, 0.0f, 1, null) : Velocity.m4325copyOhffZ5M$default(j2, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m329toFloatTH1AsA0(long j2) {
        return this.orientation == Orientation.Horizontal ? Velocity.m4329getXimpl(j2) : Velocity.m4330getYimpl(j2);
    }

    /* JADX INFO: renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m330toFloatk4lQ0M(long j2) {
        return this.orientation == Orientation.Horizontal ? Offset.m1380getXimpl(j2) : Offset.m1381getYimpl(j2);
    }

    /* JADX INFO: renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m331toOffsettuRUvjQ(float f) {
        if (f == 0.0f) {
            return Offset.INSTANCE.m1396getZeroF1C5BW0();
        }
        return this.orientation == Orientation.Horizontal ? OffsetKt.Offset(f, 0.0f) : OffsetKt.Offset(0.0f, f);
    }

    /* JADX INFO: renamed from: update-QWom1Mo, reason: not valid java name */
    public final long m332updateQWom1Mo(long j2, float f) {
        return this.orientation == Orientation.Horizontal ? Velocity.m4325copyOhffZ5M$default(j2, f, 0.0f, 2, null) : Velocity.m4325copyOhffZ5M$default(j2, 0.0f, f, 1, null);
    }
}
