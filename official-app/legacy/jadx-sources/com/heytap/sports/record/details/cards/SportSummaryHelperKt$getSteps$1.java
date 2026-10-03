package com.heytap.sports.record.details.cards;

import android.content.Context;
import com.heytap.sports.R$string;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "context", "Landroid/content/Context;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class SportSummaryHelperKt$getSteps$1 extends Lambda implements Function2<Context, Integer, String> {
    public static final SportSummaryHelperKt$getSteps$1 INSTANCE = new SportSummaryHelperKt$getSteps$1();

    public SportSummaryHelperKt$getSteps$1() {
        super(2);
    }

    @Override // p010kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ String invoke(Context context, Integer num) {
        return invoke(context, num.intValue());
    }

    @NotNull
    public final String invoke(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.sports_walk_step);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.sports_walk_step)");
        return string;
    }
}
