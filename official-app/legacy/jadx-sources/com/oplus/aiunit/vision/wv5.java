package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.formatter.LogFieldKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H$¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/wv5;", "Lcom/heytap/health/base/view/recyclercard/a;", "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.LEVEL_KEY, "o", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDisturbBaseCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisturbBaseCard.kt\ncom/heytap/health/sleep/disturb/ui/card/DisturbBaseCard\n+ 2 CommonUtil.kt\ncom/heytap/health/healthbase/util/CommonUtilKt\n*L\n1#1,30:1\n15#2,4:31\n*S KotlinDebug\n*F\n+ 1 DisturbBaseCard.kt\ncom/heytap/health/sleep/disturb/ui/card/DisturbBaseCard\n*L\n24#1:31,4\n*E\n"})
public abstract class wv5 extends com.heytap.health.base.view.recyclercard.a {
    public static final int $stable = 0;

    @Override // com.heytap.health.base.view.recyclercard.a
    public void l(@Nullable Context context, @Nullable View cardView) {
        super.l(context, cardView);
        if (ArraysKt___ArraysKt.filterNotNull(new Object[]{context, cardView}).size() == 2) {
            Intrinsics.checkNotNull(context);
            Intrinsics.checkNotNull(cardView);
            o(context, cardView);
        }
    }

    public abstract void o(@NotNull Context context, @NotNull View cardView);
}
