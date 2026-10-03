package androidx.compose.ui.semantics;

import androidx.compose.runtime.Immutable;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmInline;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/semantics/Role;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
public final class Role {
    private final int value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int Button = m3481constructorimpl(0);
    private static final int Checkbox = m3481constructorimpl(1);
    private static final int Switch = m3481constructorimpl(2);
    private static final int RadioButton = m3481constructorimpl(3);
    private static final int Tab = m3481constructorimpl(4);
    private static final int Image = m3481constructorimpl(5);
    private static final int DropdownList = m3481constructorimpl(6);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u001c\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/semantics/Role$Companion;", "", "()V", "Button", "Landroidx/compose/ui/semantics/Role;", "getButton-o7Vup1c", "()I", "I", "Checkbox", "getCheckbox-o7Vup1c", "DropdownList", "getDropdownList-o7Vup1c", "Image", "getImage-o7Vup1c", "RadioButton", "getRadioButton-o7Vup1c", "Switch", "getSwitch-o7Vup1c", "Tab", "getTab-o7Vup1c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getButton-o7Vup1c, reason: not valid java name */
        public final int m3487getButtono7Vup1c() {
            return Role.Button;
        }

        /* JADX INFO: renamed from: getCheckbox-o7Vup1c, reason: not valid java name */
        public final int m3488getCheckboxo7Vup1c() {
            return Role.Checkbox;
        }

        /* JADX INFO: renamed from: getDropdownList-o7Vup1c, reason: not valid java name */
        public final int m3489getDropdownListo7Vup1c() {
            return Role.DropdownList;
        }

        /* JADX INFO: renamed from: getImage-o7Vup1c, reason: not valid java name */
        public final int m3490getImageo7Vup1c() {
            return Role.Image;
        }

        /* JADX INFO: renamed from: getRadioButton-o7Vup1c, reason: not valid java name */
        public final int m3491getRadioButtono7Vup1c() {
            return Role.RadioButton;
        }

        /* JADX INFO: renamed from: getSwitch-o7Vup1c, reason: not valid java name */
        public final int m3492getSwitcho7Vup1c() {
            return Role.Switch;
        }

        /* JADX INFO: renamed from: getTab-o7Vup1c, reason: not valid java name */
        public final int m3493getTabo7Vup1c() {
            return Role.Tab;
        }
    }

    private /* synthetic */ Role(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Role m3480boximpl(int i) {
        return new Role(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m3481constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3482equalsimpl(int i, Object obj) {
        return (obj instanceof Role) && i == ((Role) obj).getValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3483equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3484hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3485toStringimpl(int i) {
        if (m3483equalsimpl0(i, Button)) {
            return "Button";
        }
        if (m3483equalsimpl0(i, Checkbox)) {
            return "Checkbox";
        }
        if (m3483equalsimpl0(i, Switch)) {
            return "Switch";
        }
        if (m3483equalsimpl0(i, RadioButton)) {
            return "RadioButton";
        }
        if (m3483equalsimpl0(i, Tab)) {
            return "Tab";
        }
        if (m3483equalsimpl0(i, Image)) {
            return "Image";
        }
        return m3483equalsimpl0(i, DropdownList) ? "DropdownList" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m3482equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3484hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m3485toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
