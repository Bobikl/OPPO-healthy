package com.heytap.databaseengine.apiv3.business;

import com.heytap.databaseengine.callback.ICommonListener;
import com.oplus.aiunit.vision.uok;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004H\u0016J\"\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004H\u0016¨\u0006\f"}, d2 = {"com/heytap/databaseengine/apiv3/business/UserInfoRead$realRun$1", "Lcom/heytap/databaseengine/callback/ICommonListener$Stub;", "", "intent", "", "", "data", "", "onSuccess", "errCode", "errMsg", "onFailure", "heytap_health_sdk_v2.1.7_release"}, k = 1, mv = {1, 8, 0})
public final class UserInfoRead$realRun$1 extends ICommonListener.Stub {
    final /* synthetic */ uok this$0;

    public UserInfoRead$realRun$1(uok uokVar) {
    }

    @Override // com.heytap.databaseengine.callback.ICommonListener
    public void onFailure(int errCode, @Nullable List<Object> errMsg) {
        uok.c(null);
        throw null;
    }

    @Override // com.heytap.databaseengine.callback.ICommonListener
    public void onSuccess(int intent, @Nullable List<Object> data) {
        uok.c(null);
        Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.heytap.databaseengine.apiv3.data.DataSet>");
        throw null;
    }
}
