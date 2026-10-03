package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/pba;", "Lcom/oplus/aiunit/vision/hr9;", "Lcom/oplus/aiunit/vision/fr9;", "", "invoke", "value", "b", "clear", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", oea.CALLBACK, "Lcom/oplus/aiunit/vision/fr9;", "", "c", "Z", "needCallback", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "card-instant_release"}, k = 1, mv = {1, 8, 0})
public final class pba implements hr9<fr9> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function1<fr9, Unit> cb;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public fr9 value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean needCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public pba(@NotNull Function1<? super fr9, Unit> cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        this.cb = cb;
    }

    @Override // com.oplus.aiunit.vision.hr9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull fr9 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.needCallback = true;
    }

    @Override // com.oplus.aiunit.vision.hr9
    public void clear() {
        this.value = null;
    }

    @Override // com.oplus.aiunit.vision.hr9
    public void invoke() {
        if (this.needCallback) {
            fr9 fr9Var = this.value;
            if (fr9Var != null) {
                this.cb.invoke(fr9Var);
            }
            this.needCallback = false;
        }
    }
}
