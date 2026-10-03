package com.heytap.nearx.cloudconfig.impl;

import com.heytap.nearx.cloudconfig.bean.EntityQueryParams;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ3\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/heytap/nearx/cloudconfig/impl/IDataWrapper;", "", "wrap", "ReturnT", "ResultT", "queryParams", "Lcom/heytap/nearx/cloudconfig/bean/EntityQueryParams;", "queryList", "", "(Lcom/heytap/nearx/cloudconfig/bean/EntityQueryParams;Ljava/util/List;)Ljava/lang/Object;", "Companion", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public interface IDataWrapper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/nearx/cloudconfig/impl/IDataWrapper$Companion;", "", "()V", "Default", "Lcom/heytap/nearx/cloudconfig/impl/IDataWrapper;", "getDefault$com_heytap_nearx_cloudconfig", "()Lcom/heytap/nearx/cloudconfig/impl/IDataWrapper;", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final IDataWrapper Default = new IDataWrapper() { // from class: com.heytap.nearx.cloudconfig.impl.IDataWrapper$Companion$Default$1
            private final List<?> value(Object defaultValue) {
                if (defaultValue != null) {
                    return defaultValue instanceof List ? (List) defaultValue : CollectionsKt__CollectionsJVMKt.listOf(defaultValue);
                }
                return null;
            }

            @Override // com.heytap.nearx.cloudconfig.impl.IDataWrapper
            @Nullable
            public <ResultT, ReturnT> ReturnT wrap(@NotNull EntityQueryParams queryParams, @Nullable List<? extends ResultT> queryList) {
                Intrinsics.checkParameterIsNotNull(queryParams, "queryParams");
                List<? extends ResultT> list = queryList;
                if (list == null || list.isEmpty()) {
                    queryList = (ReturnT) value(queryParams.getDefaultValue());
                }
                if (Intrinsics.areEqual(List.class, queryParams.resultType())) {
                    return (ReturnT) queryList;
                }
                if (queryList == null || queryList.isEmpty()) {
                    return null;
                }
                return (ReturnT) queryList.get(0);
            }
        };

        private Companion() {
        }

        @NotNull
        public final IDataWrapper getDefault$com_heytap_nearx_cloudconfig() {
            return Default;
        }
    }

    @Nullable
    <ResultT, ReturnT> ReturnT wrap(@NotNull EntityQueryParams queryParams, @Nullable List<? extends ResultT> queryList);
}
