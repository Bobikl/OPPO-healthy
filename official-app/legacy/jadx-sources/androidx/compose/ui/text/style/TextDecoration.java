package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.TempListUtilsKt;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002J\u0013\u0010\n\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0011\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0086\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/TextDecoration;", "", "mask", "", "(I)V", "getMask", "()I", "contains", "", "other", "equals", "hashCode", "plus", "decoration", "toString", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextDecoration {
    public static final int $stable = 0;
    private final int mask;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final TextDecoration None = new TextDecoration(0);

    @NotNull
    private static final TextDecoration Underline = new TextDecoration(1);

    @NotNull
    private static final TextDecoration LineThrough = new TextDecoration(2);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000e\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/TextDecoration$Companion;", "", "()V", "LineThrough", "Landroidx/compose/ui/text/style/TextDecoration;", "getLineThrough$annotations", "getLineThrough", "()Landroidx/compose/ui/text/style/TextDecoration;", "None", "getNone$annotations", "getNone", "Underline", "getUnderline$annotations", "getUnderline", "combine", "decorations", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTextDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,111:1\n108#2,3:112\n111#2,2:119\n113#2:122\n33#3,4:115\n38#3:121\n*S KotlinDebug\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n*L\n57#1:112,3\n57#1:119,2\n57#1:122\n57#1:115,4\n57#1:121\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        public static /* synthetic */ void getLineThrough$annotations() {
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }

        @Stable
        public static /* synthetic */ void getUnderline$annotations() {
        }

        @NotNull
        public final TextDecoration combine(@NotNull List<TextDecoration> decorations) {
            Intrinsics.checkNotNullParameter(decorations, "decorations");
            Integer numValueOf = 0;
            int size = decorations.size();
            for (int i = 0; i < size; i++) {
                numValueOf = Integer.valueOf(numValueOf.intValue() | decorations.get(i).getMask());
            }
            return new TextDecoration(numValueOf.intValue());
        }

        @NotNull
        public final TextDecoration getLineThrough() {
            return TextDecoration.LineThrough;
        }

        @NotNull
        public final TextDecoration getNone() {
            return TextDecoration.None;
        }

        @NotNull
        public final TextDecoration getUnderline() {
            return TextDecoration.Underline;
        }
    }

    public TextDecoration(int i) {
        this.mask = i;
    }

    public final boolean contains(@NotNull TextDecoration other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i = this.mask;
        return (other.mask | i) == i;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TextDecoration) && this.mask == ((TextDecoration) other).mask;
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return this.mask;
    }

    @NotNull
    public final TextDecoration plus(@NotNull TextDecoration decoration) {
        Intrinsics.checkNotNullParameter(decoration, "decoration");
        return new TextDecoration(this.mask | decoration.mask);
    }

    @NotNull
    public String toString() {
        if (this.mask == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.mask & Underline.mask) != 0) {
            arrayList.add("Underline");
        }
        if ((this.mask & LineThrough.mask) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + TempListUtilsKt.fastJoinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
