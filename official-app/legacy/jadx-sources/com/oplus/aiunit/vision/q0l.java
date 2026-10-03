package com.oplus.aiunit.vision;

import androidx.annotation.StringRes;
import com.heytap.health.watchpair.R$string;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/q0l;", "", "", "a", "I", "()I", "c", "(I)V", "strResid", "b", "d", "visibility", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class q0l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @StringRes
    public int strResid = R$string.oobe_setting_next;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int visibility;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getStrResid() {
        return this.strResid;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getVisibility() {
        return this.visibility;
    }

    public final void c(int i) {
        this.strResid = i;
    }

    public final void d(int i) {
        this.visibility = i;
    }
}
