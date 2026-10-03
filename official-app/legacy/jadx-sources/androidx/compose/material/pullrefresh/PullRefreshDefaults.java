package androidx.compose.material.pullrefresh;

import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.heytap.databaseengine.model.UserInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/material/pullrefresh/PullRefreshDefaults;", "", "()V", "RefreshThreshold", "Landroidx/compose/ui/unit/Dp;", "getRefreshThreshold-D9Ej5fM", "()F", UserInfo.SEX_FEMALE, "RefreshingOffset", "getRefreshingOffset-D9Ej5fM", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nPullRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,233:1\n154#2:234\n154#2:235\n*S KotlinDebug\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshDefaults\n*L\n218#1:234\n223#1:235\n*E\n"})
public final class PullRefreshDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final PullRefreshDefaults INSTANCE = new PullRefreshDefaults();
    private static final float RefreshThreshold = Dp.m4104constructorimpl(80);
    private static final float RefreshingOffset = Dp.m4104constructorimpl(56);

    private PullRefreshDefaults() {
    }

    /* JADX INFO: renamed from: getRefreshThreshold-D9Ej5fM, reason: not valid java name */
    public final float m1211getRefreshThresholdD9Ej5fM() {
        return RefreshThreshold;
    }

    /* JADX INFO: renamed from: getRefreshingOffset-D9Ej5fM, reason: not valid java name */
    public final float m1212getRefreshingOffsetD9Ej5fM() {
        return RefreshingOffset;
    }
}
