package com.oplus.aiunit.vision;

import com.heytap.webview.extension.cache.CacheConstants;
import com.oplus.seedling.sdk.SeedlingInitConfig;
import com.oplus.seedling.sdk.entity.EngineType;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.app.bean.Configuration;
import pantanal.app.seedling.SeedingEngineType;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"Lpantanal/app/bean/Configuration;", CacheConstants.Word.CONFIGURATION, "Lcom/oplus/seedling/sdk/SeedlingInitConfig;", "a", "card-seedling_release"}, k = 2, mv = {1, 8, 0})
public final class sqg {
    @NotNull
    public static final SeedlingInitConfig a(@NotNull Configuration configuration) {
        EngineType engineTypeA;
        SeedingEngineType engineType;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        SeedlingInitConfig.Builder builder = new SeedlingInitConfig.Builder();
        SeedlingConfiguration seedingConfiguration = configuration.getSeedingConfiguration();
        if (seedingConfiguration == null || (engineType = seedingConfiguration.getEngineType()) == null || (engineTypeA = zqg.a(engineType)) == null) {
            engineTypeA = EngineType.STANDARD;
        }
        return builder.engineType(engineTypeA).supportInteruptCreatingSeedlingCard(configuration.getSupportInterruptLoadingSeedlingCard()).isContextLoadedByAppDefaultClassLoader(configuration.getIsContextLoadedByAppDefaultClassLoader()).hostClassLoader(configuration.getHostClassLoader()).deltaOfLCAParentClassLoader(configuration.getDeltaOfLCAParentClassLoader()).initViaPantacardSdk(true).needHostHandleCardBg(configuration.getNeedHostHandleCardBg()).isHostLightColor(configuration.getIsHostLightColor()).extrasDataToEngine(configuration.getExtrasDataToEngine()).checkForceCopySwitch(configuration.getCheckForceCopySwitch()).entranceType(configuration.getEntrance().getEntranceType()).isSupportAddParamsToIntent(configuration.getIsSupportAddParamsToIntent()).extrasDataToEngine(configuration.getExtrasDataToPlugin()).build();
    }
}
