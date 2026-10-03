package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/z5e;", "", "", "progress", "taskFlag", "c", "spec", "b", "a", "TASK_FLAG_NEXT", "I", "TASK_FLAG_FAILE", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class z5e {

    @NotNull
    public static final z5e INSTANCE = new z5e();
    public static final int TASK_FLAG_FAILE = Integer.MIN_VALUE;
    public static final int TASK_FLAG_NEXT = 1073741824;

    public final int a(int spec) {
        return 1073741823 & spec;
    }

    public final int b(int spec) {
        return (-1073741824) & spec;
    }

    public final int c(int progress, int taskFlag) {
        return (1073741823 & progress) | ((-1073741824) & taskFlag);
    }
}
