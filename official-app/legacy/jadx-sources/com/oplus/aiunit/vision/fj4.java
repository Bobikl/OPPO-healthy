package com.oplus.aiunit.vision;

import com.heytap.databaseengineservice.db.table.DBOneTimeSport;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/fj4;", "", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public final class fj4 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.fj4$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/fj4$a;", "", "Lcom/heytap/databaseengineservice/db/table/DBOneTimeSport;", "dbOneTimeSport", "", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull DBOneTimeSport dbOneTimeSport) {
            Intrinsics.checkNotNullParameter(dbOneTimeSport, "dbOneTimeSport");
            if (dbOneTimeSport.getModifiedTime() <= 0 || dbOneTimeSport.getSource() == 3) {
                int source = dbOneTimeSport.getSource();
                if (source == 1) {
                    cj4.c("DBReportDataUtil", "data is from XUNJI");
                } else if (source == 2) {
                    cj4.c("DBReportDataUtil", "data is from LIANLIAN");
                } else if (source == 3) {
                    cj4.c("DBReportDataUtil", "data is from TBULU");
                }
                yn9.a aVarL = qa2.INSTANCE.l();
                String clientDataId = dbOneTimeSport.getClientDataId();
                Intrinsics.checkNotNullExpressionValue(clientDataId, "dbOneTimeSport.clientDataId");
                String deviceUniqueId = dbOneTimeSport.getDeviceUniqueId();
                Intrinsics.checkNotNullExpressionValue(deviceUniqueId, "dbOneTimeSport.deviceUniqueId");
                String deviceType = dbOneTimeSport.getDeviceType();
                Intrinsics.checkNotNullExpressionValue(deviceType, "dbOneTimeSport.deviceType");
                long j2 = 1000;
                aVarL.o(clientDataId, deviceUniqueId, deviceType, (int) (dbOneTimeSport.getStartTimestamp() / j2), (int) (dbOneTimeSport.getEndTimestamp() / j2), dbOneTimeSport.getSportMode(), dbOneTimeSport.getVersion(), dbOneTimeSport.getSource());
            }
        }
    }
}
