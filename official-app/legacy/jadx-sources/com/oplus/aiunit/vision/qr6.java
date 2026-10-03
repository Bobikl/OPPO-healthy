package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/oplus/aiunit/vision/qr6;", "Lcom/oplus/aiunit/vision/mn9;", "", "a", "Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/lang/String;", "j", "(Ljava/lang/String;)V", "evaluateTitle", "b", "c", b2n.g, "evaluateDesc", "", "Ljava/util/List;", "d", "()Ljava/util/List;", "i", "(Ljava/util/List;)V", "evaluateHighLightDesc", "", "Z", b2n.f, "()Z", MapSchema.FIELD_NAME_KEY, "(Z)V", "isPositive", "", "I", "f", "()I", LogFieldKey.LEVEL_KEY, "(I)V", "textPriority", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class qr6 implements mn9 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean isPositive;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String evaluateTitle = "";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public String evaluateDesc = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<String> evaluateHighLightDesc = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int textPriority = 2;

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEvaluateDesc() {
        return this.evaluateDesc;
    }

    @NotNull
    public final List<String> d() {
        return this.evaluateHighLightDesc;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getEvaluateTitle() {
        return this.evaluateTitle;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getTextPriority() {
        return this.textPriority;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsPositive() {
        return this.isPositive;
    }

    public final void h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.evaluateDesc = str;
    }

    public final void i(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.evaluateHighLightDesc = list;
    }

    public final void j(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.evaluateTitle = str;
    }

    public final void k(boolean z) {
        this.isPositive = z;
    }

    public final void l(int i) {
        this.textPriority = i;
    }
}
