package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/m9a;", "Lcom/oplus/aiunit/vision/oy1;", "", MapSchema.FIELD_NAME_ENTRY, "", "f", "c", "Ljava/lang/String;", "weight", "code", "<init>", "(ILjava/lang/String;)V", "msg", "(ILjava/lang/String;Ljava/lang/String;)V", "bodyfat_release"}, k = 1, mv = {1, 8, 0})
public final class m9a extends oy1 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String weight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9a(int i, @NotNull String weight) {
        super(i);
        Intrinsics.checkNotNullParameter(weight, "weight");
        this.weight = weight;
    }

    @NotNull
    public final String e() {
        String strValueOf = String.valueOf(f() / 1000);
        if (strValueOf.length() <= 1) {
            return strValueOf + "kg";
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = strValueOf.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb.append(strSubstring);
        int length = strValueOf.length();
        for (int i = 1; i < length; i++) {
            sb.append("*");
        }
        return ((Object) sb) + "kg";
    }

    public final int f() {
        String str = this.weight;
        StringBuilder sb = new StringBuilder();
        sb.append("getWeight:");
        sb.append(str);
        String str2 = this.weight;
        if (str2 == null) {
            return 0;
        }
        try {
            Intrinsics.checkNotNull(str2);
            return (int) Double.parseDouble(str2);
        } catch (Exception e2) {
            a7b.b("BodyFatDetailsActivity", "getWeight error:" + e2.getMessage());
            return 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9a(int i, @NotNull String msg, @NotNull String weight) {
        super(i, msg);
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(weight, "weight");
        this.weight = weight;
    }
}
