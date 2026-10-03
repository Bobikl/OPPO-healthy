package com.oplus.aiunit.vision;

import com.heytap.databaseengineservice.db.AppDatabase;
import com.heytap.databaseengineservice.db.table.DBAccountInfo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/sn;", "", "", "a", "TAG", "Ljava/lang/String;", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public final class sn {

    @NotNull
    public static final sn INSTANCE = new sn();

    @NotNull
    public static final String TAG = "AccountUtil";

    @Nullable
    public final String a() {
        qa2 qa2Var = qa2.INSTANCE;
        String ssoid = qa2Var.a().getSsoid();
        if (!(ssoid == null || ssoid.length() == 0) && !StringsKt__StringsKt.contains$default((CharSequence) ssoid, (CharSequence) "com.", false, 2, (Object) null)) {
            return ssoid;
        }
        cj4.c(TAG, "getID is null or empty or tourist");
        List<DBAccountInfo> listQuery = AppDatabase.K(qa2Var.b().b()).h().query(true);
        Intrinsics.checkNotNullExpressionValue(listQuery, "getInstance(BusinessDele…             .query(true)");
        DBAccountInfo dBAccountInfo = (DBAccountInfo) CollectionsKt___CollectionsKt.firstOrNull((List) listQuery);
        return dBAccountInfo != null ? dBAccountInfo.getSsoid() : ssoid;
    }
}
