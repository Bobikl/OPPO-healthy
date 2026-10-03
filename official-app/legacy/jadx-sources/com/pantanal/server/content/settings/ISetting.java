package com.pantanal.server.content.settings;

import android.os.Bundle;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.fkj;
import com.oplus.seedling.sdk.statistics.StatisticsTrackUtil;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0005H&J\u001a\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000e0\rH&J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0003H&J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0003H&J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0003H&J\u001a\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000e0\rH&J\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0005H&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0005H&J\b\u0010\u001e\u001a\u00020\u001fH&J\b\u0010 \u001a\u00020\u001fH&J\b\u0010!\u001a\u00020\u001fH&J\b\u0010\"\u001a\u00020\u001fH&J\u0018\u0010#\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0003H&J&\u0010%\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00192\u0006\u0010'\u001a\u00020\u0003H&J\u0018\u0010(\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0003H&J\u0018\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H&J\u0018\u0010,\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0003H&¨\u0006-"}, d2 = {"Lcom/pantanal/server/content/settings/ISetting;", "", "getAddressTaxiSwitchByServiceId", "", "serviceId", "", "getBrandAndSubdomainSwitch", "Landroid/os/Bundle;", "packageName", "subdomain", "getBrandIcon", "brandCode", "getBrandInfo", "", "", "getBrandInfoByEntry", "entry", "getBrandInfoBySubDomain", "subDomain", "supportType", "getDomainInfo", "supportForm", "getSubDomainInfo", "getSubDomainSwitch", "subDomainInfo", "", "Lcom/pantanal/server/content/settings/SubDomainInfo;", "getSubDomainSwitchBySubdomain", "getSupportEntryByServiceId", "getSwitchByPackageName", "registerFluidCloudListener", "", "registerHeadsetListener", "registerSubdomainChangeListener", "registerSubdomainSwitchListener", "updateBrandSwitch", "brandSwitch", "updateDomainSwitch", "domain", fkj.PARAM_SWITCH_STATUS, "updateEntranceSwitchByBrand", "updateEntranceSwitchBySupportEntry", StatisticsTrackUtil.KEY_ENTRANCE, "disabledEntrance", "updateSubDomainSwitch", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface ISetting {
    int getAddressTaxiSwitchByServiceId(@NotNull String serviceId);

    @Nullable
    Bundle getBrandAndSubdomainSwitch(@NotNull String packageName, @NotNull String subdomain);

    @Nullable
    String getBrandIcon(@NotNull String brandCode);

    @NotNull
    List<Map<String, Object>> getBrandInfo();

    @Nullable
    Bundle getBrandInfoByEntry(int entry);

    @Nullable
    Bundle getBrandInfoBySubDomain(@NotNull String subDomain, int supportType);

    @Nullable
    Bundle getDomainInfo(@NotNull String brandCode, int supportForm);

    @NotNull
    List<Map<String, Object>> getSubDomainInfo();

    @Nullable
    Bundle getSubDomainSwitch(@NotNull List<SubDomainInfo> subDomainInfo);

    int getSubDomainSwitchBySubdomain(@NotNull String subDomain);

    int getSupportEntryByServiceId(@NotNull String serviceId);

    @Nullable
    Bundle getSwitchByPackageName(@NotNull String packageName);

    void registerFluidCloudListener();

    void registerHeadsetListener();

    void registerSubdomainChangeListener();

    void registerSubdomainSwitchListener();

    void updateBrandSwitch(@NotNull String brandCode, int brandSwitch);

    void updateDomainSwitch(@NotNull String brandCode, @NotNull List<String> domain, int switchStatus);

    void updateEntranceSwitchByBrand(@NotNull String brandCode, int switchStatus);

    void updateEntranceSwitchBySupportEntry(int entrance, int disabledEntrance);

    void updateSubDomainSwitch(@NotNull String subDomain, int switchStatus);
}
