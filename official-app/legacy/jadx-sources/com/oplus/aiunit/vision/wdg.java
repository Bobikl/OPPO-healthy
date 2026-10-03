package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.UserInfo;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/wdg;", "", "", "a", UserInfo.SEX_FEMALE, "()F", "c", "(F)V", y04.TIME_STYLE_LEFT_DIR_NAME, "b", "d", y04.TIME_STYLE_RIGHT_DIR_NAME, "<init>", "()V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class wdg {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public float left;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public float right;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    public final void c(float f) {
        this.left = f;
    }

    public final void d(float f) {
        this.right = f;
    }
}
