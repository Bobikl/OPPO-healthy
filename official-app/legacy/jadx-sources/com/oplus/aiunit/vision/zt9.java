package com.oplus.aiunit.vision;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/zt9;", "", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "a", "Landroid/content/ContentValues;", "values", "", "b", "c", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface zt9 {
    @NotNull
    Bundle a(@NotNull Context context);

    void b(@NotNull Context context, @NotNull ContentValues values);

    void c(@NotNull Context context);
}
