package com.oplus.aiunit.vision;

import android.os.Bundle;
import com.heytap.accessory.CommonStatusCodes;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.SportDataStat;
import com.heytap.databaseengine.option.DataReadOption;
import com.heytap.health.core.provider.adapter.open.SportDataAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/bui;", "", "Landroid/os/Bundle;", "a", "", "startTime", "endTime", "Lcom/oplus/aiunit/vision/ddd;", "", "Lcom/heytap/databaseengine/model/SportDataStat;", "b", "<init>", "()V", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
public final class bui {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "commonBackBean", "", "Lcom/heytap/databaseengine/model/SportDataStat;", "a", "(Lcom/heytap/databaseengine/model/CommonBackBean;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class a<T, R> implements g18 {
        public static final a<T, R> INSTANCE = new a<>();

        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<SportDataStat> apply(@NotNull CommonBackBean commonBackBean) {
            Intrinsics.checkNotNullParameter(commonBackBean, "commonBackBean");
            m8b.f("StepDataRepository", "getStepStat success,data==null?:" + (commonBackBean.getObj() == null));
            Object obj = commonBackBean.getObj();
            return obj != null ? (List) obj : CollectionsKt.emptyList();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "", "Lcom/heytap/databaseengine/model/SportDataStat;", "a", "(Ljava/lang/Throwable;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class b<T, R> implements g18 {
        public static final b<T, R> INSTANCE = new b<>();

        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<SportDataStat> apply(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            m8b.f("StepDataRepository", "getStepStat error:" + th.getMessage());
            return CollectionsKt.emptyList();
        }
    }

    @NotNull
    public final Bundle a() {
        Bundle bundleG = SportDataAdapter.G(e88.a());
        Intrinsics.checkNotNullExpressionValue(bundleG, "querySportData(context)");
        return bundleG;
    }

    @NotNull
    public final ddd<List<SportDataStat>> b(long startTime, long endTime) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(cn.c().getSsoid());
        dataReadOption.setStartTime(startTime);
        dataReadOption.setEndTime(endTime);
        dataReadOption.setReadSportMode(-2);
        dataReadOption.setDataTable(CommonStatusCodes.AUTHENTICATE_FAIL);
        dataReadOption.setGroupUnitType(4);
        dataReadOption.setIsParse(2);
        ddd<List<SportDataStat>> dddVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(a.INSTANCE).t0(b.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …   listOf()\n            }");
        return dddVarT0;
    }
}
