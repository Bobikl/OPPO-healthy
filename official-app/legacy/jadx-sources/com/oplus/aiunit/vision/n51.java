package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.daily.R$layout;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/n51;", "Lcom/oplus/aiunit/vision/e7c;", "", "a", "", b2n.f, b2n.g, "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "i", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "f", "(Landroid/content/Context;)V", "context", "<init>", "()V", "daily_release"}, k = 1, mv = {1, 8, 0})
public abstract class n51 extends e7c {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public Context context;

    public n51() {
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        this.context = contextA;
    }

    @Override // com.oplus.aiunit.vision.e7c
    public int a() {
        return R$layout.sports_view_daily_detail_base_item;
    }

    @NotNull
    public String e() {
        return "";
    }

    public final void f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public boolean g() {
        return true;
    }

    public boolean h() {
        return true;
    }
}
