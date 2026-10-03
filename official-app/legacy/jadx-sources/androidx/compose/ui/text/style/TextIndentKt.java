package androidx.compose.ui.text.style;

import androidx.compose.ui.text.SpanStyleKt;
import com.oplus.channel.client.data.Action;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"lerp", "Landroidx/compose/ui/text/style/TextIndent;", "start", Action.LIFE_CIRCLE_VALUE_STOP, "fraction", "", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextIndentKt {
    @NotNull
    public static final TextIndent lerp(@NotNull TextIndent start, @NotNull TextIndent stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new TextIndent(SpanStyleKt.m3608lerpTextUnitInheritableC3pnCVY(start.getFirstLine(), stop.getFirstLine(), f), SpanStyleKt.m3608lerpTextUnitInheritableC3pnCVY(start.getRestLine(), stop.getRestLine(), f), null);
    }
}
