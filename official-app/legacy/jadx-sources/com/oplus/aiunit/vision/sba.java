package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.app.instant.internal.VisibilityState;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/sba;", "Lcom/oplus/aiunit/vision/hr9;", "Lpantanal/app/instant/internal/VisibilityState;", "", "invoke", "value", "b", "clear", "Lcom/oplus/aiunit/vision/sba$a;", "a", "Lcom/oplus/aiunit/vision/sba$a;", "stateChange", "Lpantanal/app/instant/internal/VisibilityState;", "<init>", "(Lcom/oplus/aiunit/vision/sba$a;)V", "card-instant_release"}, k = 1, mv = {1, 8, 0})
public final class sba implements hr9<VisibilityState> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final a stateChange;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public VisibilityState value;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/oplus/aiunit/vision/sba$a;", "", "", "b", "a", "card-instant_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a();

        void b();
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VisibilityState.values().length];
            try {
                iArr[VisibilityState.VISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VisibilityState.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public sba(@NotNull a stateChange) {
        Intrinsics.checkNotNullParameter(stateChange, "stateChange");
        this.stateChange = stateChange;
    }

    @Override // com.oplus.aiunit.vision.hr9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull VisibilityState value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    @Override // com.oplus.aiunit.vision.hr9
    public void clear() {
        this.value = null;
    }

    @Override // com.oplus.aiunit.vision.hr9
    public void invoke() {
        VisibilityState visibilityState = this.value;
        int i = visibilityState == null ? -1 : b.$EnumSwitchMapping$0[visibilityState.ordinal()];
        if (i == 1) {
            this.stateChange.b();
        } else if (i == 2) {
            this.stateChange.a();
        }
        this.value = VisibilityState.INIT;
    }
}
