package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sporthealth.blib.adapter.vb.JViewBean;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\tJ\b\u0010\u0002\u001a\u00020\u0000H&R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/nrj;", "Lcom/heytap/sporthealth/blib/adapter/vb/JViewBean;", "a", "", "i", "Z", "b", "()Z", "c", "(Z)V", "selected", "<init>", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class nrj extends JViewBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean selected;

    public nrj() {
        this(false, 1, null);
    }

    @NotNull
    public abstract nrj a();

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    public final void c(boolean z) {
        this.selected = z;
    }

    public nrj(boolean z) {
        this.selected = z;
    }

    public /* synthetic */ nrj(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
