package com.heytap.health.cervical_vertebra.repository;

import com.heytap.health.cervical_vertebra.bean.CSData;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "lhs", "Lcom/heytap/health/cervical_vertebra/bean/CSData;", "rhs", "invoke", "(Lcom/heytap/health/cervical_vertebra/bean/CSData;Lcom/heytap/health/cervical_vertebra/bean/CSData;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CSRepository$fillDayDetailForCard$1 extends Lambda implements Function2<CSData, CSData, Integer> {
    public static final CSRepository$fillDayDetailForCard$1 INSTANCE = new CSRepository$fillDayDetailForCard$1();

    public CSRepository$fillDayDetailForCard$1() {
        super(2);
    }

    @Override // p010kotlin.jvm.functions.Function2
    @NotNull
    public final Integer invoke(@NotNull CSData lhs, @NotNull CSData rhs) {
        int i;
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        long date = lhs.getDate();
        long date2 = rhs.getDate();
        if (date > date2) {
            i = 1;
        } else {
            i = date < date2 ? -1 : 0;
        }
        return Integer.valueOf(i);
    }
}
