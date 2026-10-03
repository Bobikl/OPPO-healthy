package com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui;

import com.heytap.wsport.data.SleepSettingBean;
import com.oplus.aiunit.vision.SleepHabit;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/oplus/aiunit/vision/whh;", "invoke", "(Lcom/oplus/aiunit/vision/whh;)Lcom/oplus/aiunit/vision/whh;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepAllRestViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAllRestViewModel.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepAllRestViewModel$cancel$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,193:1\n1549#2:194\n1620#2,2:195\n1622#2:198\n1#3:197\n*S KotlinDebug\n*F\n+ 1 SleepAllRestViewModel.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepAllRestViewModel$cancel$1\n*L\n93#1:194\n93#1:195,2\n93#1:198\n*E\n"})
final class SleepAllRestViewModel$cancel$1 extends Lambda implements Function1<SleepHabit, SleepHabit> {
    public static final SleepAllRestViewModel$cancel$1 INSTANCE = new SleepAllRestViewModel$cancel$1();

    public SleepAllRestViewModel$cancel$1() {
        super(1);
    }

    @Override // p010kotlin.jvm.functions.Function1
    @NotNull
    public final SleepHabit invoke(@NotNull SleepHabit update) {
        Intrinsics.checkNotNullParameter(update, "$this$update");
        List<SleepSettingBean.SleepRest> listD = update.d();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listD, 10));
        for (SleepSettingBean.SleepRest sleepRest : listD) {
            sleepRest.isSelected = false;
            arrayList.add(sleepRest);
        }
        return SleepHabit.b(update, false, arrayList, 1, null);
    }
}
