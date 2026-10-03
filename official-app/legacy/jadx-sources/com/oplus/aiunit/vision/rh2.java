package com.oplus.aiunit.vision;

import android.content.res.Resources;
import com.heytap.databaseengine.model.UserInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/rh2;", "", "", "dpValue", "a", "", UserInfo.SEX_FEMALE, "getDENSITY", "()F", "DENSITY", "SMALL_WINDOW_TYPE", "I", "NORMAL_WINDOW_TYPE", "MIDDLE_WINDOW_TYPE", "LARGE_WINDOW_TYPE", "<init>", "()V", "coui-support-nearx_release"}, k = 1, mv = {1, 8, 0})
public final class rh2 {
    public static final int LARGE_WINDOW_TYPE = 3;
    public static final int MIDDLE_WINDOW_TYPE = 2;
    public static final int NORMAL_WINDOW_TYPE = 1;
    public static final int SMALL_WINDOW_TYPE = 0;

    @NotNull
    public static final rh2 INSTANCE = new rh2();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final float DENSITY = Resources.getSystem().getDisplayMetrics().density;

    @JvmStatic
    public static final int a(int dpValue) {
        return (int) ((dpValue * DENSITY) + 0.5f);
    }
}
