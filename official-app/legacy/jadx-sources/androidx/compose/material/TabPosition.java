package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.y04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001a\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0005J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\u00038Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000b\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/TabPosition;", "", y04.TIME_STYLE_LEFT_DIR_NAME, "Landroidx/compose/ui/unit/Dp;", Fields.WIDTH_FIELD, "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLeft-D9Ej5fM", "()F", UserInfo.SEX_FEMALE, y04.TIME_STYLE_RIGHT_DIR_NAME, "getRight-D9Ej5fM", "getWidth-D9Ej5fM", "equals", "", "other", "hashCode", "", "toString", "", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabPosition\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,517:1\n51#2:518\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabPosition\n*L\n328#1:518\n*E\n"})
public final class TabPosition {
    public static final int $stable = 0;
    private final float left;
    private final float width;

    public /* synthetic */ TabPosition(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) other;
        return Dp.m4109equalsimpl0(this.left, tabPosition.left) && Dp.m4109equalsimpl0(this.width, tabPosition.width);
    }

    /* JADX INFO: renamed from: getLeft-D9Ej5fM, reason: not valid java name and from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m1163getRightD9Ej5fM() {
        return Dp.m4104constructorimpl(this.left + this.width);
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (Dp.m4110hashCodeimpl(this.left) * 31) + Dp.m4110hashCodeimpl(this.width);
    }

    @NotNull
    public String toString() {
        return "TabPosition(left=" + ((Object) Dp.m4115toStringimpl(this.left)) + ", right=" + ((Object) Dp.m4115toStringimpl(m1163getRightD9Ej5fM())) + ", width=" + ((Object) Dp.m4115toStringimpl(this.width)) + ')';
    }

    private TabPosition(float f, float f2) {
        this.left = f;
        this.width = f2;
    }
}
