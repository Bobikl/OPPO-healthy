package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Offset;
import com.heytap.databaseengine.apiv3.data.Element;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.DeprecationLevel;
import p010kotlin.Metadata;
import p010kotlin.ReplaceWith;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\"\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001BT\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0002\u0010\u0011Bh\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0017Bp\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001aBf\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001bB\\\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u0006\u0010;\u001a\u00020<J\u0087\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u00052\b\b\u0002\u0010?\u001a\u00020\u00072\b\b\u0002\u0010@\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010A\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010CJo\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u00052\b\b\u0002\u0010?\u001a\u00020\u00072\b\b\u0002\u0010@\u001a\u00020\t2\b\b\u0002\u0010A\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010EJw\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u00052\b\b\u0002\u0010?\u001a\u00020\u00072\b\b\u0002\u0010@\u001a\u00020\t2\b\b\u0002\u0010A\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010GJm\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u00052\b\b\u0002\u0010?\u001a\u00020\u00072\b\b\u0002\u0010@\u001a\u00020\t2\b\b\u0002\u0010A\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ}\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u00052\b\b\u0002\u0010?\u001a\u00020\u00072\b\b\u0002\u0010@\u001a\u00020\t2\b\b\u0002\u0010A\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\b\u0010L\u001a\u00020MH\u0016R\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001fR&\u0010\r\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e8\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148GX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\"\u001a\u0004\b&\u0010'R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0017\u0010+\u001a\u00020\t8F¢\u0006\f\u0012\u0004\b,\u0010\"\u001a\u0004\b+\u0010-R\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010*\u001a\u0004\b.\u0010)R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u001a\u0010\u0018\u001a\u00020\u00198GX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010\"\u001a\u0004\b1\u00102R\u001c\u0010\u000b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010*\u001a\u0004\b3\u0010)R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b4\u0010-R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010)R\u001c\u0010\u0016\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010*\u001a\u0004\b6\u0010)R\u001c\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010)\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "uptimeMillis", "", "position", "Landroidx/compose/ui/geometry/Offset;", "pressed", "", "previousUptimeMillis", "previousPosition", "previousPressed", "consumed", "Landroidx/compose/ui/input/pointer/ConsumedData;", "type", "Landroidx/compose/ui/input/pointer/PointerType;", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "isInitiallyConsumed", "historical", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "scrollDelta", "(JJJZJJZZILjava/util/List;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", Element.ELEMENT_NAME_PRESSURE, "", "(JJJZFJJZZILjava/util/List;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJJZFJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJJZJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "_historical", "_pressure", "Ljava/lang/Float;", "<set-?>", "getConsumed$annotations", "()V", "getConsumed", "()Landroidx/compose/ui/input/pointer/ConsumedData;", "getHistorical$annotations", "getHistorical", "()Ljava/util/List;", "getId-J3iCeTQ", "()J", "J", "isConsumed", "isConsumed$annotations", "()Z", "getPosition-F1C5BW0", "getPressed", "getPressure$annotations", "getPressure", "()F", "getPreviousPosition-F1C5BW0", "getPreviousPressed", "getPreviousUptimeMillis", "getScrollDelta-F1C5BW0", "getType-T8wyACA", "()I", "I", "getUptimeMillis", "consume", "", "copy", "currentTime", "currentPosition", "currentPressed", "previousTime", "copy-wbzehF4", "(JJJZFJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-Ezr-O64", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;I)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-0GkPj7c", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;IJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-JKmWfYY", "(JJJZJJZIJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-OHpmEuE", "(JJJZJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "toString", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PointerInputChange {
    public static final int $stable = 0;

    @Nullable
    private List<HistoricalChange> _historical;

    @Nullable
    private Float _pressure;

    @NotNull
    private ConsumedData consumed;
    private final long id;
    private final long position;
    private final boolean pressed;
    private final long previousPosition;
    private final boolean previousPressed;
    private final long previousUptimeMillis;
    private final long scrollDelta;
    private final int type;
    private final long uptimeMillis;

    @ExperimentalComposeUiApi
    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z, float f, long j5, long j6, boolean z2, boolean z3, int i, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, z, f, j5, j6, z2, z3, i, j7);
    }

    @Deprecated(message = "use isConsumed and consume() pair of methods instead")
    public static /* synthetic */ void getConsumed$annotations() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getHistorical$annotations() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getPressure$annotations() {
    }

    public static /* synthetic */ void isConsumed$annotations() {
    }

    public final void consume() {
        this.consumed.setDownChange(true);
        this.consumed.setPositionChange(true);
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use copy() instead without `consumed` parameter to create a shallow copy or a constructor to create a new PointerInputChange", replaceWith = @ReplaceWith(expression = "copy(id, currentTime, currentPosition, currentPressed, previousTime, previousPosition, previousPressed, type, scrollDelta)", imports = {}))
    @NotNull
    /* JADX INFO: renamed from: copy-0GkPj7c, reason: not valid java name */
    public final PointerInputChange m3008copy0GkPj7c(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, @NotNull ConsumedData consumed, int type, long scrollDelta) {
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        PointerInputChange pointerInputChange = new PointerInputChange(id, currentTime, currentPosition, currentPressed, getPressure(), previousTime, previousPosition, previousPressed, consumed.getDownChange() || consumed.getPositionChange(), type, getHistorical(), scrollDelta, (DefaultConstructorMarker) null);
        this.consumed = consumed;
        return pointerInputChange;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another copy() method with scrollDelta parameter instead", replaceWith = @ReplaceWith(expression = "copy(id,currentTime, currentPosition, currentPressed, previousTime,previousPosition, previousPressed, consumed, type, this.scrollDelta)", imports = {}))
    /* JADX INFO: renamed from: copy-Ezr-O64, reason: not valid java name */
    public final /* synthetic */ PointerInputChange m3009copyEzrO64(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, ConsumedData consumed, int type) {
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        PointerInputChange pointerInputChange = new PointerInputChange(id, currentTime, currentPosition, currentPressed, getPressure(), previousTime, previousPosition, previousPressed, consumed.getDownChange() || consumed.getPositionChange(), type, getHistorical(), this.scrollDelta, (DefaultConstructorMarker) null);
        this.consumed = consumed;
        return pointerInputChange;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-JKmWfYY, reason: not valid java name */
    public final PointerInputChange m3010copyJKmWfYY(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, long scrollDelta) {
        PointerInputChange pointerInputChange = new PointerInputChange(id, currentTime, currentPosition, currentPressed, getPressure(), previousTime, previousPosition, previousPressed, false, type, (List) getHistorical(), scrollDelta, (DefaultConstructorMarker) null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    @ExperimentalComposeUiApi
    @NotNull
    /* JADX INFO: renamed from: copy-OHpmEuE, reason: not valid java name */
    public final PointerInputChange m3011copyOHpmEuE(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, @NotNull List<HistoricalChange> historical, long scrollDelta) {
        Intrinsics.checkNotNullParameter(historical, "historical");
        PointerInputChange pointerInputChange = new PointerInputChange(id, currentTime, currentPosition, currentPressed, getPressure(), previousTime, previousPosition, previousPressed, false, type, (List) historical, scrollDelta, (DefaultConstructorMarker) null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    @ExperimentalComposeUiApi
    @NotNull
    /* JADX INFO: renamed from: copy-wbzehF4, reason: not valid java name */
    public final PointerInputChange m3012copywbzehF4(long id, long currentTime, long currentPosition, boolean currentPressed, float pressure, long previousTime, long previousPosition, boolean previousPressed, int type, @NotNull List<HistoricalChange> historical, long scrollDelta) {
        Intrinsics.checkNotNullParameter(historical, "historical");
        PointerInputChange pointerInputChange = new PointerInputChange(id, currentTime, currentPosition, currentPressed, pressure, previousTime, previousPosition, previousPressed, false, type, (List) historical, scrollDelta, (DefaultConstructorMarker) null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    @NotNull
    public final ConsumedData getConsumed() {
        return this.consumed;
    }

    @ExperimentalComposeUiApi
    @NotNull
    public final List<HistoricalChange> getHistorical() {
        List<HistoricalChange> list = this._historical;
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: renamed from: getId-J3iCeTQ, reason: not valid java name and from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getPosition() {
        return this.position;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    @ExperimentalComposeUiApi
    public final float getPressure() {
        Float f = this._pressure;
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: getPreviousPosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getPreviousPosition() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    /* JADX INFO: renamed from: getScrollDelta-F1C5BW0, reason: not valid java name and from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    /* JADX INFO: renamed from: getType-T8wyACA, reason: not valid java name and from getter */
    public final int getType() {
        return this.type;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final boolean isConsumed() {
        return this.consumed.getDownChange() || this.consumed.getPositionChange();
    }

    @NotNull
    public String toString() {
        return "PointerInputChange(id=" + ((Object) PointerId.m3001toStringimpl(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m1388toStringimpl(this.position)) + ", pressed=" + this.pressed + ", pressure=" + getPressure() + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) Offset.m1388toStringimpl(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + isConsumed() + ", type=" + ((Object) PointerType.m3087toStringimpl(this.type)) + ", historical=" + getHistorical() + ",scrollDelta=" + ((Object) Offset.m1388toStringimpl(this.scrollDelta)) + ')';
    }

    @ExperimentalComposeUiApi
    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z, float f, long j5, long j6, boolean z2, boolean z3, int i, List list, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, z, f, j5, j6, z2, z3, i, (List<HistoricalChange>) list, j7);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another constructor with `scrollDelta` and without `ConsumedData` instead", replaceWith = @ReplaceWith(expression = "this(id, uptimeMillis, position, pressed, previousUptimeMillis, previousPosition, previousPressed, consumed.downChange || consumed.positionChange, type, Offset.Zero)", imports = {}))
    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, ConsumedData consumedData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, z, j5, j6, z2, consumedData, i);
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, boolean z3, int i, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, z, j5, j6, z2, z3, i, j7);
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, boolean z3, int i, List list, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, z, j5, j6, z2, z3, i, (List<HistoricalChange>) list, j7);
    }

    private PointerInputChange(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, boolean z3, int i, long j7) {
        this.id = j2;
        this.uptimeMillis = j3;
        this.position = j4;
        this.pressed = z;
        this.previousUptimeMillis = j5;
        this.previousPosition = j6;
        this.previousPressed = z2;
        this.type = i;
        this.scrollDelta = j7;
        this.consumed = new ConsumedData(z3, z3);
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, boolean z3, int i, long j7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, z, j5, j6, z2, z3, (i2 & 256) != 0 ? PointerType.INSTANCE.m3092getTouchT8wyACA() : i, (i2 & 512) != 0 ? Offset.INSTANCE.m1396getZeroF1C5BW0() : j7, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, ConsumedData consumedData, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, z, j5, j6, z2, consumedData, (i2 & 256) != 0 ? PointerType.INSTANCE.m3092getTouchT8wyACA() : i, (DefaultConstructorMarker) null);
    }

    private PointerInputChange(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, ConsumedData consumedData, int i) {
        this(j2, j3, j4, z, 1.0f, j5, j6, z2, consumedData.getDownChange() || consumedData.getPositionChange(), i, Offset.INSTANCE.m1396getZeroF1C5BW0(), (DefaultConstructorMarker) null);
    }

    private PointerInputChange(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, boolean z3, int i, List<HistoricalChange> list, long j7) {
        this(j2, j3, j4, z, 1.0f, j5, j6, z2, z3, i, list, j7, (DefaultConstructorMarker) null);
        this._historical = list;
    }

    private PointerInputChange(long j2, long j3, long j4, boolean z, float f, long j5, long j6, boolean z2, boolean z3, int i, List<HistoricalChange> list, long j7) {
        this(j2, j3, j4, z, f, j5, j6, z2, z3, i, j7, (DefaultConstructorMarker) null);
        this._historical = list;
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z, float f, long j5, long j6, boolean z2, boolean z3, int i, long j7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, z, f, j5, j6, z2, z3, (i2 & 512) != 0 ? PointerType.INSTANCE.m3092getTouchT8wyACA() : i, (i2 & 1024) != 0 ? Offset.INSTANCE.m1396getZeroF1C5BW0() : j7, (DefaultConstructorMarker) null);
    }

    private PointerInputChange(long j2, long j3, long j4, boolean z, float f, long j5, long j6, boolean z2, boolean z3, int i, long j7) {
        this(j2, j3, j4, z, j5, j6, z2, z3, i, j7, (DefaultConstructorMarker) null);
        this._pressure = Float.valueOf(f);
    }
}
