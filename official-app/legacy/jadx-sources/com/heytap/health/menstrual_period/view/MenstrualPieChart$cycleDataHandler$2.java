package com.heytap.health.menstrual_period.view;

import com.heytap.health.menstrual_period.datahandler.CycleDataHandler;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/heytap/health/menstrual_period/datahandler/CycleDataHandler;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class MenstrualPieChart$cycleDataHandler$2 extends Lambda implements Function0<CycleDataHandler> {
    public static final MenstrualPieChart$cycleDataHandler$2 INSTANCE = new MenstrualPieChart$cycleDataHandler$2();

    public MenstrualPieChart$cycleDataHandler$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final CycleDataHandler invoke() {
        return new CycleDataHandler();
    }
}
