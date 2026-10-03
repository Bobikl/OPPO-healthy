package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/xta;", "", "", "clientDataId", "", "startTimestamp", "", "a", "", "b", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class xta {
    public static final int $stable = 0;

    @NotNull
    public static final xta INSTANCE = new xta();

    public final void a(@Nullable String clientDataId, long startTimestamp) {
        if ((clientDataId == null || StringsKt__StringsJVMKt.isBlank(clientDataId)) || startTimestamp <= 0) {
            return;
        }
        v9g v9gVarX = v9g.x("sports_latest_record_clicks");
        if (startTimestamp >= v9gVarX.B("latest_clicked_timestamp", 0L)) {
            v9gVarX.T("latest_clicked_timestamp", startTimestamp);
        }
    }

    public final boolean b(long startTimestamp) {
        return startTimestamp > 0 && startTimestamp > v9g.x("sports_latest_record_clicks").B("latest_clicked_timestamp", 0L);
    }
}
