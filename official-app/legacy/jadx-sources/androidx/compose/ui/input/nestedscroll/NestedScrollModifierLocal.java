package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.Velocity;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J)\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b&\u0010'J-\u0010(\u001a\u00020)2\u0006\u0010$\u001a\u00020)2\u0006\u0010%\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J!\u0010.\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b/\u00100J%\u00101\u001a\u00020)2\u0006\u0010%\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R/\u0010\u0015\u001a\u0004\u0018\u00010\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00064"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "connection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "getConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getDispatcher", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "key", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "nestedCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getNestedCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "<set-?>", "parent", "getParent", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal;", "setParent", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal;)V", "parent$delegate", "Landroidx/compose/runtime/MutableState;", "value", "getValue", "onModifierLocalsUpdated", "", "scope", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNestedScrollModifierLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollModifierLocal.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,100:1\n76#2:101\n102#2,2:102\n*S KotlinDebug\n*F\n+ 1 NestedScrollModifierLocal.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal\n*L\n45#1:101\n45#1:102,2\n*E\n"})
public final class NestedScrollModifierLocal implements ModifierLocalConsumer, ModifierLocalProvider<NestedScrollModifierLocal>, NestedScrollConnection {

    @NotNull
    private final NestedScrollConnection connection;

    @NotNull
    private final NestedScrollDispatcher dispatcher;

    /* JADX INFO: renamed from: parent$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState parent;

    public NestedScrollModifierLocal(@NotNull NestedScrollDispatcher dispatcher, @NotNull NestedScrollConnection connection) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.dispatcher = dispatcher;
        this.connection = connection;
        dispatcher.setCalculateNestedScrollScope$ui_release(new Function0<CoroutineScope>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal.1
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final CoroutineScope invoke() {
                return NestedScrollModifierLocal.this.getNestedCoroutineScope();
            }
        });
        this.parent = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineScope getNestedCoroutineScope() {
        CoroutineScope originNestedScrollScope;
        NestedScrollModifierLocal parent = getParent();
        if ((parent == null || (originNestedScrollScope = parent.getNestedCoroutineScope()) == null) && (originNestedScrollScope = this.dispatcher.getOriginNestedScrollScope()) == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return originNestedScrollScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final NestedScrollModifierLocal getParent() {
        return (NestedScrollModifierLocal) this.parent.getValue();
    }

    private final void setParent(NestedScrollModifierLocal nestedScrollModifierLocal) {
        this.parent.setValue(nestedScrollModifierLocal);
    }

    @NotNull
    public final NestedScrollConnection getConnection() {
        return this.connection;
    }

    @NotNull
    public final NestedScrollDispatcher getDispatcher() {
        return this.dispatcher;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public ProvidableModifierLocal<NestedScrollModifierLocal> getKey() {
        return NestedScrollModifierLocalKt.getModifierLocalNestedScroll();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public NestedScrollModifierLocal getValue() {
        return this;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        setParent((NestedScrollModifierLocal) scope.getCurrent(NestedScrollModifierLocalKt.getModifierLocalNestedScroll()));
        this.dispatcher.setParent$ui_release(getParent());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public Object mo319onPostFlingRZ2iAVY(long j2, long j3, @NotNull Continuation<? super Velocity> continuation) {
        NestedScrollModifierLocal$onPostFling$1 nestedScrollModifierLocal$onPostFling$1;
        long j4;
        long j5;
        long packedValue;
        long jM4340getZero9UxMQ8M;
        long j6;
        NestedScrollModifierLocal nestedScrollModifierLocal = this;
        if (continuation instanceof NestedScrollModifierLocal$onPostFling$1) {
            nestedScrollModifierLocal$onPostFling$1 = (NestedScrollModifierLocal$onPostFling$1) continuation;
            int i = nestedScrollModifierLocal$onPostFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollModifierLocal$onPostFling$1.label = i - Integer.MIN_VALUE;
            } else {
                nestedScrollModifierLocal$onPostFling$1 = new NestedScrollModifierLocal$onPostFling$1(this, continuation);
            }
        } else {
            nestedScrollModifierLocal$onPostFling$1 = new NestedScrollModifierLocal$onPostFling$1(this, continuation);
        }
        Object objMo319onPostFlingRZ2iAVY = nestedScrollModifierLocal$onPostFling$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = nestedScrollModifierLocal$onPostFling$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                long j7 = nestedScrollModifierLocal$onPostFling$1.J$1;
                long j8 = nestedScrollModifierLocal$onPostFling$1.J$0;
                nestedScrollModifierLocal = (NestedScrollModifierLocal) nestedScrollModifierLocal$onPostFling$1.L$0;
                ResultKt.throwOnFailure(objMo319onPostFlingRZ2iAVY);
                j5 = j7;
                j4 = j8;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j6 = nestedScrollModifierLocal$onPostFling$1.J$0;
                ResultKt.throwOnFailure(objMo319onPostFlingRZ2iAVY);
            }
            jM4340getZero9UxMQ8M = ((Velocity) objMo319onPostFlingRZ2iAVY).getPackedValue();
            packedValue = j6;
            return Velocity.m4320boximpl(Velocity.m4333plusAH228Gc(packedValue, jM4340getZero9UxMQ8M));
        }
        ResultKt.throwOnFailure(objMo319onPostFlingRZ2iAVY);
        NestedScrollConnection nestedScrollConnection = nestedScrollModifierLocal.connection;
        nestedScrollModifierLocal$onPostFling$1.L$0 = nestedScrollModifierLocal;
        j4 = j2;
        nestedScrollModifierLocal$onPostFling$1.J$0 = j4;
        j5 = j3;
        nestedScrollModifierLocal$onPostFling$1.J$1 = j5;
        nestedScrollModifierLocal$onPostFling$1.label = 1;
        objMo319onPostFlingRZ2iAVY = nestedScrollConnection.mo319onPostFlingRZ2iAVY(j2, j3, nestedScrollModifierLocal$onPostFling$1);
        if (objMo319onPostFlingRZ2iAVY == coroutine_suspended) {
            return coroutine_suspended;
        }
        packedValue = ((Velocity) objMo319onPostFlingRZ2iAVY).getPackedValue();
        NestedScrollModifierLocal parent = nestedScrollModifierLocal.getParent();
        if (parent != null) {
            long jM4333plusAH228Gc = Velocity.m4333plusAH228Gc(j4, packedValue);
            long jM4332minusAH228Gc = Velocity.m4332minusAH228Gc(j5, packedValue);
            nestedScrollModifierLocal$onPostFling$1.L$0 = null;
            nestedScrollModifierLocal$onPostFling$1.J$0 = packedValue;
            nestedScrollModifierLocal$onPostFling$1.label = 2;
            objMo319onPostFlingRZ2iAVY = parent.mo319onPostFlingRZ2iAVY(jM4333plusAH228Gc, jM4332minusAH228Gc, nestedScrollModifierLocal$onPostFling$1);
            if (objMo319onPostFlingRZ2iAVY == coroutine_suspended) {
                return coroutine_suspended;
            }
            j6 = packedValue;
            jM4340getZero9UxMQ8M = ((Velocity) objMo319onPostFlingRZ2iAVY).getPackedValue();
            packedValue = j6;
        } else {
            jM4340getZero9UxMQ8M = Velocity.INSTANCE.m4340getZero9UxMQ8M();
        }
        return Velocity.m4320boximpl(Velocity.m4333plusAH228Gc(packedValue, jM4340getZero9UxMQ8M));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo320onPostScrollDzOQY0M(long consumed, long available, int source) {
        long jMo320onPostScrollDzOQY0M = this.connection.mo320onPostScrollDzOQY0M(consumed, available, source);
        NestedScrollModifierLocal parent = getParent();
        return Offset.m1385plusMKHz9U(jMo320onPostScrollDzOQY0M, parent != null ? parent.mo320onPostScrollDzOQY0M(Offset.m1385plusMKHz9U(consumed, jMo320onPostScrollDzOQY0M), Offset.m1384minusMKHz9U(available, jMo320onPostScrollDzOQY0M), source) : Offset.INSTANCE.m1396getZeroF1C5BW0());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public Object mo490onPreFlingQWom1Mo(long j2, @NotNull Continuation<? super Velocity> continuation) {
        NestedScrollModifierLocal$onPreFling$1 nestedScrollModifierLocal$onPreFling$1;
        long jM4340getZero9UxMQ8M;
        long j3;
        if (continuation instanceof NestedScrollModifierLocal$onPreFling$1) {
            nestedScrollModifierLocal$onPreFling$1 = (NestedScrollModifierLocal$onPreFling$1) continuation;
            int i = nestedScrollModifierLocal$onPreFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollModifierLocal$onPreFling$1.label = i - Integer.MIN_VALUE;
            } else {
                nestedScrollModifierLocal$onPreFling$1 = new NestedScrollModifierLocal$onPreFling$1(this, continuation);
            }
        } else {
            nestedScrollModifierLocal$onPreFling$1 = new NestedScrollModifierLocal$onPreFling$1(this, continuation);
        }
        Object objMo490onPreFlingQWom1Mo = nestedScrollModifierLocal$onPreFling$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = nestedScrollModifierLocal$onPreFling$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                long j4 = nestedScrollModifierLocal$onPreFling$1.J$0;
                NestedScrollModifierLocal nestedScrollModifierLocal = (NestedScrollModifierLocal) nestedScrollModifierLocal$onPreFling$1.L$0;
                ResultKt.throwOnFailure(objMo490onPreFlingQWom1Mo);
                this = nestedScrollModifierLocal;
                j2 = j4;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = nestedScrollModifierLocal$onPreFling$1.J$0;
                ResultKt.throwOnFailure(objMo490onPreFlingQWom1Mo);
            }
            return Velocity.m4320boximpl(Velocity.m4333plusAH228Gc(j3, ((Velocity) objMo490onPreFlingQWom1Mo).getPackedValue()));
        }
        ResultKt.throwOnFailure(objMo490onPreFlingQWom1Mo);
        NestedScrollModifierLocal parent = getParent();
        if (parent != null) {
            nestedScrollModifierLocal$onPreFling$1.L$0 = this;
            nestedScrollModifierLocal$onPreFling$1.J$0 = j2;
            nestedScrollModifierLocal$onPreFling$1.label = 1;
            objMo490onPreFlingQWom1Mo = parent.mo490onPreFlingQWom1Mo(j2, nestedScrollModifierLocal$onPreFling$1);
            if (objMo490onPreFlingQWom1Mo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            jM4340getZero9UxMQ8M = Velocity.INSTANCE.m4340getZero9UxMQ8M();
        }
        NestedScrollModifierLocal nestedScrollModifierLocal2 = this;
        j3 = jM4340getZero9UxMQ8M;
        NestedScrollConnection nestedScrollConnection = nestedScrollModifierLocal2.connection;
        long jM4332minusAH228Gc = Velocity.m4332minusAH228Gc(j2, j3);
        nestedScrollModifierLocal$onPreFling$1.L$0 = null;
        nestedScrollModifierLocal$onPreFling$1.J$0 = j3;
        nestedScrollModifierLocal$onPreFling$1.label = 2;
        objMo490onPreFlingQWom1Mo = nestedScrollConnection.mo490onPreFlingQWom1Mo(jM4332minusAH228Gc, nestedScrollModifierLocal$onPreFling$1);
        if (objMo490onPreFlingQWom1Mo == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Velocity.m4320boximpl(Velocity.m4333plusAH228Gc(j3, ((Velocity) objMo490onPreFlingQWom1Mo).getPackedValue()));
        jM4340getZero9UxMQ8M = ((Velocity) objMo490onPreFlingQWom1Mo).getPackedValue();
        NestedScrollModifierLocal nestedScrollModifierLocal3 = this;
        j3 = jM4340getZero9UxMQ8M;
        NestedScrollConnection nestedScrollConnection2 = nestedScrollModifierLocal3.connection;
        long jM4332minusAH228Gc2 = Velocity.m4332minusAH228Gc(j2, j3);
        nestedScrollModifierLocal$onPreFling$1.L$0 = null;
        nestedScrollModifierLocal$onPreFling$1.J$0 = j3;
        nestedScrollModifierLocal$onPreFling$1.label = 2;
        objMo490onPreFlingQWom1Mo = nestedScrollConnection2.mo490onPreFlingQWom1Mo(jM4332minusAH228Gc2, nestedScrollModifierLocal$onPreFling$1);
        if (objMo490onPreFlingQWom1Mo == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Velocity.m4320boximpl(Velocity.m4333plusAH228Gc(j3, ((Velocity) objMo490onPreFlingQWom1Mo).getPackedValue()));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo321onPreScrollOzD1aCk(long available, int source) {
        NestedScrollModifierLocal parent = getParent();
        long jMo321onPreScrollOzD1aCk = parent != null ? parent.mo321onPreScrollOzD1aCk(available, source) : Offset.INSTANCE.m1396getZeroF1C5BW0();
        return Offset.m1385plusMKHz9U(jMo321onPreScrollOzD1aCk, this.connection.mo321onPreScrollOzD1aCk(Offset.m1384minusMKHz9U(available, jMo321onPreScrollOzD1aCk), source));
    }
}
