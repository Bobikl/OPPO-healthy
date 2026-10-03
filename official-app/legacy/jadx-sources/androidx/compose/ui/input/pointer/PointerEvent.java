package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005B\u001f\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u001f\u001a\u00020\u001aH\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\fJ\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u001e\u0010\"\u001a\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u001c\u0010\t\u001a\u00020\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\u0013ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0014\u0010\fR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R/\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a@@X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEvent;", "", "changes", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "(Ljava/util/List;)V", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "(Ljava/util/List;Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "buttons", "Landroidx/compose/ui/input/pointer/PointerButtons;", "getButtons-ry648PA", "()I", "I", "getChanges", "()Ljava/util/List;", "getInternalPointerEvent$ui_release", "()Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "keyboardModifiers", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "getKeyboardModifiers-k7X9c1A", "motionEvent", "Landroid/view/MotionEvent;", "getMotionEvent$ui_release", "()Landroid/view/MotionEvent;", "<set-?>", "Landroidx/compose/ui/input/pointer/PointerEventType;", "type", "getType-7fucELk", "setType-EhbLWgg$ui_release", "(I)V", "calculatePointerEventType", "calculatePointerEventType-7fucELk", "component1", "copy", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,202:1\n33#2,6:203\n33#2,6:209\n151#2,3:215\n33#2,4:218\n154#2,2:222\n38#2:224\n156#2:225\n*S KotlinDebug\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n*L\n72#1:203,6\n96#1:209,6\n99#1:215,3\n99#1:218,4\n99#1:222,2\n99#1:224\n99#1:225\n*E\n"})
public final class PointerEvent {
    public static final int $stable = 8;
    private final int buttons;

    @NotNull
    private final List<PointerInputChange> changes;

    @Nullable
    private final InternalPointerEvent internalPointerEvent;
    private final int keyboardModifiers;
    private int type;

    public PointerEvent(@NotNull List<PointerInputChange> changes, @Nullable InternalPointerEvent internalPointerEvent) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        this.changes = changes;
        this.internalPointerEvent = internalPointerEvent;
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        this.buttons = PointerButtons.m2950constructorimpl(motionEvent$ui_release != null ? motionEvent$ui_release.getButtonState() : 0);
        MotionEvent motionEvent$ui_release2 = getMotionEvent$ui_release();
        this.keyboardModifiers = PointerKeyboardModifiers.m3076constructorimpl(motionEvent$ui_release2 != null ? motionEvent$ui_release2.getMetaState() : 0);
        this.type = m2956calculatePointerEventType7fucELk();
    }

    /* JADX INFO: renamed from: calculatePointerEventType-7fucELk, reason: not valid java name */
    private final int m2956calculatePointerEventType7fucELk() {
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        if (motionEvent$ui_release == null) {
            List<PointerInputChange> list = this.changes;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                PointerInputChange pointerInputChange = list.get(i);
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    return PointerEventType.INSTANCE.m2974getRelease7fucELk();
                }
                if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                    return PointerEventType.INSTANCE.m2973getPress7fucELk();
                }
            }
            return PointerEventType.INSTANCE.m2972getMove7fucELk();
        }
        int actionMasked = motionEvent$ui_release.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    switch (actionMasked) {
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            return PointerEventType.INSTANCE.m2975getScroll7fucELk();
                        case 9:
                            return PointerEventType.INSTANCE.m2970getEnter7fucELk();
                        case 10:
                            return PointerEventType.INSTANCE.m2971getExit7fucELk();
                        default:
                            return PointerEventType.INSTANCE.m2976getUnknown7fucELk();
                    }
                }
                return PointerEventType.INSTANCE.m2972getMove7fucELk();
            }
            return PointerEventType.INSTANCE.m2974getRelease7fucELk();
        }
        return PointerEventType.INSTANCE.m2973getPress7fucELk();
    }

    @NotNull
    public final List<PointerInputChange> component1() {
        return this.changes;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008f  */
    @NotNull
    public final PointerEvent copy(@NotNull List<PointerInputChange> changes, @Nullable MotionEvent motionEvent) {
        boolean z;
        Intrinsics.checkNotNullParameter(changes, "changes");
        if (motionEvent == null) {
            return new PointerEvent(changes, null);
        }
        if (Intrinsics.areEqual(motionEvent, getMotionEvent$ui_release())) {
            return new PointerEvent(changes, this.internalPointerEvent);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = changes.get(i);
            linkedHashMap.put(PointerId.m2996boximpl(pointerInputChange.getId()), pointerInputChange);
        }
        ArrayList arrayList = new ArrayList(changes.size());
        int size2 = changes.size();
        int i2 = 0;
        while (i2 < size2) {
            PointerInputChange pointerInputChange2 = changes.get(i2);
            long id = pointerInputChange2.getId();
            long uptimeMillis = pointerInputChange2.getUptimeMillis();
            long position = pointerInputChange2.getPosition();
            long position2 = pointerInputChange2.getPosition();
            boolean pressed = pointerInputChange2.getPressed();
            float pressure = pointerInputChange2.getPressure();
            int type = pointerInputChange2.getType();
            InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
            int i3 = size2;
            if (internalPointerEvent != null) {
                z = true;
                if (!internalPointerEvent.m2946issuesEnterExitEvent0FcD4WY(pointerInputChange2.getId())) {
                    z = false;
                }
            } else {
                z = false;
            }
            arrayList.add(new PointerInputEventData(id, uptimeMillis, position, position2, pressed, pressure, type, z, null, 0L, 768, null));
            i2++;
            size2 = i3;
        }
        return new PointerEvent(changes, new InternalPointerEvent(linkedHashMap, new PointerInputEvent(motionEvent.getEventTime(), arrayList, motionEvent)));
    }

    /* JADX INFO: renamed from: getButtons-ry648PA, reason: not valid java name and from getter */
    public final int getButtons() {
        return this.buttons;
    }

    @NotNull
    public final List<PointerInputChange> getChanges() {
        return this.changes;
    }

    @Nullable
    /* JADX INFO: renamed from: getInternalPointerEvent$ui_release, reason: from getter */
    public final InternalPointerEvent getInternalPointerEvent() {
        return this.internalPointerEvent;
    }

    /* JADX INFO: renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name and from getter */
    public final int getKeyboardModifiers() {
        return this.keyboardModifiers;
    }

    @Nullable
    public final MotionEvent getMotionEvent$ui_release() {
        InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
        if (internalPointerEvent != null) {
            return internalPointerEvent.getMotionEvent();
        }
        return null;
    }

    /* JADX INFO: renamed from: getType-7fucELk, reason: not valid java name and from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: setType-EhbLWgg$ui_release, reason: not valid java name */
    public final void m2960setTypeEhbLWgg$ui_release(int i) {
        this.type = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PointerEvent(@NotNull List<PointerInputChange> changes) {
        this(changes, null);
        Intrinsics.checkNotNullParameter(changes, "changes");
    }
}
