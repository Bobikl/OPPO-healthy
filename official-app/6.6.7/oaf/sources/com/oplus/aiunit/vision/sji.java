package com.oplus.aiunit.vision;

import com.health.health_seedlingcard.model.SportRecordModel;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.TrackMetadataStat;
import com.heytap.databaseengine.option.DataReadOption;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/sji;", "", "Lcom/oplus/aiunit/vision/ddd;", "", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "a", "<init>", "()V", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
public final class sji {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "commonBackBean", "", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "a", "(Lcom/heytap/databaseengine/model/CommonBackBean;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class a<T, R> implements g18 {
        public static final a<T, R> INSTANCE = new a<>();

        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<TrackMetadataStat> apply(@Nullable CommonBackBean commonBackBean) {
            ArrayList arrayList = new ArrayList();
            if (commonBackBean != null && commonBackBean.getObj() != null && commonBackBean.getErrorCode() == 0) {
                Object obj = commonBackBean.getObj();
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.model.TrackMetadataStat>");
                arrayList.addAll((List) obj);
            }
            m8b.f(SportRecordModel.TAG, "getHistoryLastRecords result:" + arrayList.size());
            return arrayList;
        }
    }

    @NotNull
    public final ddd<List<TrackMetadataStat>> a() {
        m8b.f(SportRecordModel.TAG, "getHistoryLastRecords");
        DataReadOption dataReadOption = new DataReadOption();
        dataReadOption.setSsoid(cn.c().getSsoid());
        dataReadOption.setDataTable(1041);
        dataReadOption.setReadSportMode(-2);
        dataReadOption.setStartTime(0L);
        dataReadOption.setEndTime(System.currentTimeMillis());
        dataReadOption.setSortOrder(1);
        dataReadOption.setCount(1);
        ddd<List<TrackMetadataStat>> dddVarJ0 = SportHealthDataAPI.getInstance().readSportHealthData(dataReadOption).j0(a.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(dddVarJ0, "getInstance()\n          …   dataList\n            }");
        return dddVarJ0;
    }
}
