package com.oplus.aiunit.vision;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/zki;", "", "Companion", "a", "TapDatabase"}, k = 1, mv = {1, 4, 0})
public final class zki {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.zki$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/zki$a;", "", "", "indexName", "tableName", "", "indexColumnList", "a", "<init>", "()V", "TapDatabase"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final String a(@NotNull String indexName, @NotNull String tableName, @Nullable List<String> indexColumnList) {
            Intrinsics.checkParameterIsNotNull(indexName, "indexName");
            Intrinsics.checkParameterIsNotNull(tableName, "tableName");
            boolean z = true;
            int i = 0;
            if (tableName.length() == 0) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE INDEX IF NOT EXISTS " + indexName + " ON " + tableName);
            Intrinsics.checkExpressionValueIsNotNull(sb, "StringBuilder()\n        …indexName ON $tableName\")");
            List<String> list = indexColumnList;
            if (list != null && !list.isEmpty()) {
                z = false;
            }
            if (!z) {
                sb.append("(");
                for (Object obj : indexColumnList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    String str = (String) obj;
                    if (i == 0) {
                        sb.append(str);
                    } else {
                        sb.append(", " + str);
                    }
                    i = i2;
                }
                sb.append(")");
            }
            return sb.toString();
        }
    }
}
