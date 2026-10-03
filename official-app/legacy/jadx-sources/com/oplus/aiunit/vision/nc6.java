package com.oplus.aiunit.vision;

import android.app.Activity;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.heytap.databaseengine.model.ECGRecord;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¨\u0006\u0005"}, d2 = {"Lcom/heytap/databaseengine/model/ECGRecord;", "", "b", "Landroid/app/Activity;", "a", "operation_impl_release"}, k = 2, mv = {1, 8, 0})
public final class nc6 {
    @Nullable
    @org.jetbrains.annotations.Nullable
    public static final Activity a() {
        if (op.n().q().isEmpty()) {
            return null;
        }
        return op.n().q().get(0);
    }

    public static final boolean b(@NotNull ECGRecord eCGRecord) {
        Intrinsics.checkNotNullParameter(eCGRecord, "<this>");
        return (TextUtils.isEmpty(eCGRecord.getEcgAppVersion()) || TextUtils.isEmpty(eCGRecord.getEcgResultName()) || TextUtils.isEmpty(eCGRecord.getUserInfo())) ? false : true;
    }
}
