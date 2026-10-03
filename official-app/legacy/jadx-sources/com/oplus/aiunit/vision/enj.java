package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\t\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0004\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/enj;", "", "", "toString", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "text", "", "b", "I", "()I", "priority", "Lkotlin/Function0;", "", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", ParserTag.TAG_ONCLICK, "<init>", "(Ljava/lang/String;ILkotlin/jvm/functions/Function0;)V", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public class enj {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int priority;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> onClick;

    public enj(@NotNull String text, int i, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.text = text;
        this.priority = i;
        this.onClick = onClick;
    }

    @NotNull
    public final Function0<Unit> a() {
        return this.onClick;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public String toString() {
        return "{text=" + this.text + ", priority=" + this.priority + "}";
    }
}
