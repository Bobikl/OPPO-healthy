package com.heytap.store.platform.htrouter.utils;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.store.platform.htrouter.facade.template.IProvider;
import com.heytap.store.platform.htrouter.launcher.business.HTAliasRouter;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\u0086\b¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"getService", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/heytap/store/platform/htrouter/facade/template/IProvider;", "()Lcom/heytap/store/platform/htrouter/facade/template/IProvider;", "htrouter-api_release"}, k = 2, mv = {1, 4, 0})
public final class ServiceGetterKt {
    @Nullable
    public static final /* synthetic */ <T extends IProvider> T getService() {
        HTAliasRouter companion = HTAliasRouter.INSTANCE.getInstance();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) companion.getService(IProvider.class);
    }
}
