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

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H$R\"\u0010\u0003\u001a\u00020\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/ap8;", "Lcom/heytap/health/base/view/recyclercard/a;", "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.LEVEL_KEY, LogFieldKey.PROCESS_NAME_KEY, "o", "Landroid/content/Context;", "()Landroid/content/Context;", "q", "(Landroid/content/Context;)V", "<init>", "()V", "health_base_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHealthBaseCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthBaseCard.kt\ncom/heytap/health/healthbase/card/HealthBaseCard\n+ 2 CommonUtil.kt\ncom/heytap/health/healthbase/util/CommonUtilKt\n*L\n1#1,25:1\n15#2,4:26\n*S KotlinDebug\n*F\n+ 1 HealthBaseCard.kt\ncom/heytap/health/healthbase/card/HealthBaseCard\n*L\n18#1:26,4\n*E\n"})
public abstract class ap8 extends com.heytap.health.base.view.recyclercard.a {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public Context context;

    public ap8() {
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        this.context = contextA;
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public void l(@Nullable Context context, @Nullable View cardView) {
        super.l(context, cardView);
        if (ArraysKt___ArraysKt.filterNotNull(new Object[]{context, cardView}).size() == 2) {
            Intrinsics.checkNotNull(context);
            this.context = context;
            Intrinsics.checkNotNull(cardView);
            p(context, cardView);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public abstract void p(@NotNull Context context, @NotNull View cardView);

    public final void q(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }
}
