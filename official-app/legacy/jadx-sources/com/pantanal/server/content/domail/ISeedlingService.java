package com.pantanal.server.content.domail;

import android.content.Context;
import androidx.annotation.Keep;
import com.oplus.pantanal.seedling.constants.Constants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H&J&\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fH&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0005H&J)\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/pantanal/server/content/domail/ISeedlingService;", "", "disableSubDomain", "", "subDomain", "", Constants.KEY_QUERY_FLUID_CLOUD_METHOD, "Lcom/pantanal/server/content/domail/FluidCloudInfo;", "context", "Landroid/content/Context;", "serviceId", "queryFluidClouds", "", Constants.KEY_SERVICE_IDS, "queryServiceInfo", "Lcom/pantanal/server/content/domail/SeedlingServiceInfo;", "updateFluidCloud", "", "closeEntry", "", Constants.KEY_SERVICE_SWITCH, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)J", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface ISeedlingService {
    boolean disableSubDomain(@NotNull String subDomain);

    @Nullable
    FluidCloudInfo queryFluidCloud(@NotNull Context context, @NotNull String serviceId);

    @Nullable
    List<FluidCloudInfo> queryFluidClouds(@NotNull Context context, @NotNull List<String> serviceIds);

    @NotNull
    SeedlingServiceInfo queryServiceInfo(@NotNull String serviceId);

    long updateFluidCloud(@NotNull String serviceId, @Nullable Integer closeEntry, @Nullable Integer serviceSwitch);
}
