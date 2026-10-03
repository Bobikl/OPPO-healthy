package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.newsleep.BreathRateStat;
import com.heytap.databaseengine.option.DataReadOption;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\nB\u0011\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0010J*\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005R\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/qdh;", "", "", "startTime", "endTime", "", "groupUnitType", "Lcom/oplus/aiunit/vision/ddd;", "", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "a", "", "Ljava/lang/String;", "getMSsoId", "()Ljava/lang/String;", "b", "(Ljava/lang/String;)V", "mSsoId", "<init>", "Companion", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public final class qdh {

    @NotNull
    public String a;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "it", "", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "a", "(Lcom/heytap/databaseengine/model/CommonBackBean;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class b<T, R> implements g18 {
        public static final b<T, R> INSTANCE = new b<>();

        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<BreathRateStat> apply(@NotNull CommonBackBean commonBackBean) {
            Intrinsics.checkNotNullParameter(commonBackBean, "it");
            ArrayList arrayList = new ArrayList();
            if (commonBackBean.getErrorCode() == 0 && commonBackBean.getObj() != null) {
                Object obj = commonBackBean.getObj();
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.newsleep.BreathRateStat>");
                arrayList.addAll((List) obj);
            }
            m8b.f("SleepBRWeekDataRepository", "queryBreathRateStatList size:" + arrayList.size() + ", :" + commonBackBean.getErrorCode());
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "a", "(Ljava/lang/Throwable;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class c<T, R> implements g18 {
        public static final c<T, R> INSTANCE = new c<>();

        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<BreathRateStat> apply(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            StringBuilder sb = new StringBuilder();
            sb.append("queryBreathRateStatList error:");
            sb.append(th);
            return new ArrayList();
        }
    }

    public qdh(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "mSsoId");
        this.a = str;
    }

    @NotNull
    public final ddd<List<BreathRateStat>> a(long startTime, long endTime, int groupUnitType) {
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(this.a);
        dataReadOption.setDataTable(1076);
        dataReadOption.setStartTime(startTime);
        dataReadOption.setEndTime(endTime);
        dataReadOption.setSortOrder(0);
        dataReadOption.setGroupUnitType(groupUnitType);
        ddd<List<BreathRateStat>> dddVarT0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(b.INSTANCE).t0(c.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(dddVarT0, "getInstance()\n          …ArrayList()\n            }");
        return dddVarT0;
    }

    public final void b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.a = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ qdh(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = cn.c().getSsoid();
            Intrinsics.checkNotNullExpressionValue(str, "getAccountManager().ssoid");
        }
        this(str);
    }
}
