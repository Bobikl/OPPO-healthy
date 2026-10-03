package androidx.compose.material;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.heytap.databaseengine.model.UserInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/material/BottomSheetScaffoldDefaults;", "", "()V", "SheetElevation", "Landroidx/compose/ui/unit/Dp;", "getSheetElevation-D9Ej5fM", "()F", UserInfo.SEX_FEMALE, "SheetPeekHeight", "getSheetPeekHeight-D9Ej5fM", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,614:1\n154#2:615\n154#2:616\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldDefaults\n*L\n468#1:615\n472#1:616\n*E\n"})
public final class BottomSheetScaffoldDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final BottomSheetScaffoldDefaults INSTANCE = new BottomSheetScaffoldDefaults();
    private static final float SheetElevation = Dp.m4104constructorimpl(8);
    private static final float SheetPeekHeight = Dp.m4104constructorimpl(56);

    private BottomSheetScaffoldDefaults() {
    }

    /* JADX INFO: renamed from: getSheetElevation-D9Ej5fM, reason: not valid java name */
    public final float m929getSheetElevationD9Ej5fM() {
        return SheetElevation;
    }

    /* JADX INFO: renamed from: getSheetPeekHeight-D9Ej5fM, reason: not valid java name */
    public final float m930getSheetPeekHeightD9Ej5fM() {
        return SheetPeekHeight;
    }
}
