package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\u0006B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/rba;", "Lcom/oplus/aiunit/vision/hr9;", "", "", "invoke", "value", "b", "clear", "Lcom/oplus/aiunit/vision/rba$b;", "a", "Lcom/oplus/aiunit/vision/rba$b;", "stateChange", "I", "<init>", "(Lcom/oplus/aiunit/vision/rba$b;)V", "Companion", "card-instant_release"}, k = 1, mv = {1, 8, 0})
public final class rba implements hr9<Integer> {
    public static final int SCROLL_INIT_STATE = -1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final b stateChange;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int value;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/rba$b;", "", "", "state", "", "a", "card-instant_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        void a(int state);
    }

    public rba(@NotNull b stateChange) {
        Intrinsics.checkNotNullParameter(stateChange, "stateChange");
        this.stateChange = stateChange;
        this.value = -1;
    }

    @Override // com.oplus.aiunit.vision.hr9
    public /* bridge */ /* synthetic */ void a(Integer num) {
        b(num.intValue());
    }

    public void b(int value) {
        this.value = value;
    }

    @Override // com.oplus.aiunit.vision.hr9
    public void clear() {
        this.value = -1;
    }

    @Override // com.oplus.aiunit.vision.hr9
    public void invoke() {
        int i = this.value;
        if (i != -1) {
            this.stateChange.a(i);
            this.value = -1;
        }
    }
}
