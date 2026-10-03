package com.heytap.health.backup;

import com.heytap.health.base.text.GsonUtil;
import com.oplus.aiunit.vision.qe0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\r"}, d2 = {"Lcom/heytap/health/backup/a;", "", "", "spName", "Lcom/heytap/health/backup/SPDataItem;", "a", "b", "", "Ljava/util/Map;", "spMap", "<init>", "()V", "Companion", "Health-6.4.4_03460bd_260624_OPlusRelease"}, k = 1, mv = {1, 8, 0})
public final class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<String, SPDataItem> spMap = new LinkedHashMap();

    /* JADX INFO: renamed from: com.heytap.health.backup.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/heytap/health/backup/a$a;", "", "", "json", "Lcom/heytap/health/backup/SPData;", "a", "<init>", "()V", "Health-6.4.4_03460bd_260624_OPlusRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final SPData a(@NotNull String json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return (SPData) GsonUtil.a(json, SPData.class);
        }
    }

    @NotNull
    public final SPDataItem a(@NotNull String spName) {
        Intrinsics.checkNotNullParameter(spName, "spName");
        SPDataItem sPDataItem = this.spMap.get(spName);
        if (sPDataItem != null) {
            return sPDataItem;
        }
        SPDataItem sPDataItem2 = new SPDataItem(spName);
        this.spMap.put(spName, sPDataItem2);
        return sPDataItem2;
    }

    @NotNull
    public final String b() {
        SPData sPData = new SPData();
        sPData.setAppVersion(qe0.n());
        sPData.setSpDataList(new ArrayList());
        List<SPDataItem> spDataList = sPData.getSpDataList();
        if (spDataList != null) {
            spDataList.addAll(this.spMap.values());
        }
        String strE = GsonUtil.e(sPData);
        Intrinsics.checkNotNullExpressionValue(strE, "toJson(spData)");
        return strE;
    }
}
