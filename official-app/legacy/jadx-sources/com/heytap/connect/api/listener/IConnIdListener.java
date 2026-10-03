package com.heytap.connect.api.listener;

import com.heytap.connect.config.connectid.ConnectIdLogic;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/heytap/connect/api/listener/IConnIdListener;", "", "", ConnectIdLogic.JSON_KEY_LCID, "", "onIDChecking", "(Ljava/lang/String;)V", "", "fromCache", "onIDRegistered", "(Ljava/lang/String;Z)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public interface IConnIdListener {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ void onIDRegistered$default(IConnIdListener iConnIdListener, String str, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onIDRegistered");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            iConnIdListener.onIDRegistered(str, z);
        }
    }

    void onIDChecking(@NotNull String lcId);

    void onIDRegistered(@NotNull String lcId, boolean fromCache);
}
