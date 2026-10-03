package androidx.compose.ui.text.font;

import androidx.compose.ui.util.MathHelpersKt;
import com.oplus.channel.client.data.Action;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"lerp", "Landroidx/compose/ui/text/font/FontWeight;", "start", Action.LIFE_CIRCLE_VALUE_STOP, "fraction", "", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FontWeightKt {
    @NotNull
    public static final FontWeight lerp(@NotNull FontWeight start, @NotNull FontWeight stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new FontWeight(RangesKt___RangesKt.coerceIn(MathHelpersKt.lerp(start.getWeight(), stop.getWeight(), f), 1, 1000));
    }
}
