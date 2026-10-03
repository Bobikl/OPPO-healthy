package com.heytap.nearx.cloudconfig.api;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.nearx.cloudconfig.bean.ConfigTrace;
import com.heytap.nearx.cloudconfig.bean.EntityQueryParams;
import com.heytap.nearx.cloudconfig.impl.EntityDBProvider;
import com.heytap.nearx.cloudconfig.impl.EntityFileProvider;
import com.heytap.nearx.cloudconfig.impl.EntityPluginFileProvider;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0004H&J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0012"}, d2 = {"Lcom/heytap/nearx/cloudconfig/api/EntityProvider;", ExifInterface.GPS_DIRECTION_TRUE, "", "hasInit", "", "onConfigChanged", "", "configId", "", "version", "", "moduleName", "queryEntities", "", "queryParams", "Lcom/heytap/nearx/cloudconfig/bean/EntityQueryParams;", "Companion", "Factory", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public interface EntityProvider<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/nearx/cloudconfig/api/EntityProvider$Companion;", "", "()V", "DEFALUT", "Lcom/heytap/nearx/cloudconfig/api/EntityProvider$Factory;", "getDEFALUT", "()Lcom/heytap/nearx/cloudconfig/api/EntityProvider$Factory;", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final Factory<Object> DEFALUT = new Factory<Object>() { // from class: com.heytap.nearx.cloudconfig.api.EntityProvider$Companion$DEFALUT$1
            @Override // com.heytap.nearx.cloudconfig.api.EntityProvider.Factory
            @NotNull
            public EntityProvider<Object> newEntityProvider(@NotNull Context context, @NotNull ConfigTrace configTrace) {
                Intrinsics.checkParameterIsNotNull(context, "context");
                Intrinsics.checkParameterIsNotNull(configTrace, "configTrace");
                int configType = configTrace.getConfigType();
                if (configType == 1) {
                    return new EntityDBProvider(context, configTrace);
                }
                if (configType != 2) {
                    return configType != 3 ? new EntityDBProvider(context, configTrace) : new EntityPluginFileProvider(configTrace);
                }
                return new EntityFileProvider(configTrace);
            }
        };

        private Companion() {
        }

        @NotNull
        public final Factory<Object> getDEFALUT() {
            return DEFALUT;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/heytap/nearx/cloudconfig/api/EntityProvider$Factory;", ExifInterface.GPS_DIRECTION_TRUE, "", "newEntityProvider", "Lcom/heytap/nearx/cloudconfig/api/EntityProvider;", "context", "Landroid/content/Context;", "configTrace", "Lcom/heytap/nearx/cloudconfig/bean/ConfigTrace;", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
    public interface Factory<T> {
        @NotNull
        EntityProvider<T> newEntityProvider(@NotNull Context context, @NotNull ConfigTrace configTrace);
    }

    boolean hasInit();

    void onConfigChanged(@NotNull String configId, int version, @NotNull String moduleName);

    @NotNull
    List<T> queryEntities(@NotNull EntityQueryParams queryParams);
}
