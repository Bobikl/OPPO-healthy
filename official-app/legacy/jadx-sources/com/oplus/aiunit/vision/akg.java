package com.oplus.aiunit.vision;

import com.coui.appcompat.searchhistory.COUIFlowLayout;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/akg;", "Lcom/coui/appcompat/searchhistory/COUIFlowLayout$b;", "", "getContent", "a", "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", DBHealthReviewPlan.DESC, "", "b", "I", "getData", "()I", "data", "<init>", "(Ljava/lang/String;I)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class akg implements COUIFlowLayout.b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String desc;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int data;

    public akg(@NotNull String desc, int i) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.desc = desc;
        this.data = i;
    }

    @Override // com.coui.appcompat.searchhistory.COUIFlowLayout.b
    @NotNull
    /* JADX INFO: renamed from: getContent, reason: from getter */
    public String getDesc() {
        return this.desc;
    }
}
