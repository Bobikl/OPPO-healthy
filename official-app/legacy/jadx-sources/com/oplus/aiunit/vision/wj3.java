package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.MetadataUnit;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0003\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/wj3;", "", "", "a", "I", "b", "()I", "setType", "(I)V", "type", "", "Lcom/heytap/databaseengine/model/MetadataUnit;", "Ljava/util/List;", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "dataList", "<init>", "(ILjava/util/List;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class wj3 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public List<MetadataUnit> dataList;

    public wj3(int i, @NotNull List<MetadataUnit> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.type = i;
        this.dataList = dataList;
    }

    @NotNull
    public final List<MetadataUnit> a() {
        return this.dataList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getType() {
        return this.type;
    }
}
