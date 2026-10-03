package com.heytap.sports.record.util;

import com.heytap.databaseengine.model.RunExtra;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/heytap/databaseengine/model/RunExtra;", "invoke", "(Lcom/heytap/databaseengine/model/RunExtra;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class RecordHelper$hasTennisDetailByRunExtra$1 extends Lambda implements Function1<RunExtra, Boolean> {
    public static final RecordHelper$hasTennisDetailByRunExtra$1 INSTANCE = new RecordHelper$hasTennisDetailByRunExtra$1();

    public RecordHelper$hasTennisDetailByRunExtra$1() {
        super(1);
    }

    @Override // p010kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull RunExtra it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.getTotalBatting() > 0);
    }
}
