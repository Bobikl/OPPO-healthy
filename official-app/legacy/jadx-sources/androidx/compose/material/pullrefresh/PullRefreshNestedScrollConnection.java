package androidx.compose.material.pullrefresh;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.oplus.smartenginehelper.entity.ViewEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001Bf\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u0003\u00121\u0010\b\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012\u0006\u0010\r\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fJ-\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001aH\u0096@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R>\u0010\b\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\tX\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/material/pullrefresh/PullRefreshNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPull", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "pullDelta", "onRelease", "Lkotlin/Function2;", "flingVelocity", "Lkotlin/coroutines/Continuation;", "", ViewEntity.ENABLED, "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Z)V", "Lkotlin/jvm/functions/Function2;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "consumed", "available", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PullRefreshNestedScrollConnection implements NestedScrollConnection {
    private final boolean enabled;

    @NotNull
    private final Function1<Float, Float> onPull;

    @NotNull
    private final Function2<Float, Continuation<? super Float>, Object> onRelease;

    /* JADX WARN: Multi-variable type inference failed */
    public PullRefreshNestedScrollConnection(@NotNull Function1<? super Float, Float> onPull, @NotNull Function2<? super Float, ? super Continuation<? super Float>, ? extends Object> onRelease, boolean z) {
        Intrinsics.checkNotNullParameter(onPull, "onPull");
        Intrinsics.checkNotNullParameter(onRelease, "onRelease");
        this.onPull = onPull;
        this.onRelease = onRelease;
        this.enabled = z;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo320onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (this.enabled) {
            return (!NestedScrollSource.m2908equalsimpl0(source, NestedScrollSource.INSTANCE.m2913getDragWNlRxjI()) || Offset.m1381getYimpl(available) <= 0.0f) ? Offset.INSTANCE.m1396getZeroF1C5BW0() : OffsetKt.Offset(0.0f, this.onPull.invoke(Float.valueOf(Offset.m1381getYimpl(available))).floatValue());
        }
        return Offset.INSTANCE.m1396getZeroF1C5BW0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public Object mo490onPreFlingQWom1Mo(long j2, @NotNull Continuation<? super Velocity> continuation) {
        PullRefreshNestedScrollConnection$onPreFling$1 pullRefreshNestedScrollConnection$onPreFling$1;
        float f;
        if (continuation instanceof PullRefreshNestedScrollConnection$onPreFling$1) {
            pullRefreshNestedScrollConnection$onPreFling$1 = (PullRefreshNestedScrollConnection$onPreFling$1) continuation;
            int i = pullRefreshNestedScrollConnection$onPreFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pullRefreshNestedScrollConnection$onPreFling$1.label = i - Integer.MIN_VALUE;
            } else {
                pullRefreshNestedScrollConnection$onPreFling$1 = new PullRefreshNestedScrollConnection$onPreFling$1(this, continuation);
            }
        } else {
            pullRefreshNestedScrollConnection$onPreFling$1 = new PullRefreshNestedScrollConnection$onPreFling$1(this, continuation);
        }
        Object objInvoke = pullRefreshNestedScrollConnection$onPreFling$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = pullRefreshNestedScrollConnection$onPreFling$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            Function2<Float, Continuation<? super Float>, Object> function2 = this.onRelease;
            Float fBoxFloat = Boxing.boxFloat(Velocity.m4330getYimpl(j2));
            pullRefreshNestedScrollConnection$onPreFling$1.F$0 = 0.0f;
            pullRefreshNestedScrollConnection$onPreFling$1.label = 1;
            objInvoke = function2.invoke(fBoxFloat, pullRefreshNestedScrollConnection$onPreFling$1);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            f = 0.0f;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f = pullRefreshNestedScrollConnection$onPreFling$1.F$0;
            ResultKt.throwOnFailure(objInvoke);
        }
        return Velocity.m4320boximpl(VelocityKt.Velocity(f, ((Number) objInvoke).floatValue()));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo321onPreScrollOzD1aCk(long available, int source) {
        if (this.enabled) {
            return (!NestedScrollSource.m2908equalsimpl0(source, NestedScrollSource.INSTANCE.m2913getDragWNlRxjI()) || Offset.m1381getYimpl(available) >= 0.0f) ? Offset.INSTANCE.m1396getZeroF1C5BW0() : OffsetKt.Offset(0.0f, this.onPull.invoke(Float.valueOf(Offset.m1381getYimpl(available))).floatValue());
        }
        return Offset.INSTANCE.m1396getZeroF1C5BW0();
    }
}
