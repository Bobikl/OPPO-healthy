package com.heytap.store.platform.location.base;

import android.content.Context;
import android.content.Intent;
import com.heytap.store.platform.htrouter.facade.template.IProvider;
import com.heytap.store.platform.location.base.config.BaseLocationConfig;
import com.heytap.store.platform.location.base.entity.LocationInfo;
import com.heytap.store.platform.location.base.listener.LocationListener;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H&J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&J\u001c\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H&J\u0016\u0010\u0016\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\u0017\u001a\u00020\u0003H&¨\u0006\u0018"}, d2 = {"Lcom/heytap/store/platform/location/base/ILocation;", "Lcom/heytap/store/platform/htrouter/facade/template/IProvider;", "destroyLocation", "", "getCatchLocation", "listener", "Lcom/heytap/store/platform/location/base/listener/LocationListener;", "Lcom/heytap/store/platform/location/base/entity/LocationInfo;", "getGoogleMapIntent", "Landroid/content/Intent;", "latitude", "", "longitude", "initLocation", "mContext", "Landroid/content/Context;", "config", "Lcom/heytap/store/platform/location/base/config/BaseLocationConfig;", "isLocationServiceOpen", "", "saveLocation", UTraceSQLiteHelperKt.COL_INFO, "startLocation", "stopLocation", "location_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface ILocation extends IProvider {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void initLocation$default(ILocation iLocation, Context context, BaseLocationConfig baseLocationConfig, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initLocation");
            }
            if ((i & 2) != 0) {
                baseLocationConfig = null;
            }
            iLocation.initLocation(context, baseLocationConfig);
        }
    }

    void destroyLocation();

    void getCatchLocation(@Nullable LocationListener<LocationInfo> listener);

    @Nullable
    Intent getGoogleMapIntent(@NotNull String latitude, @NotNull String longitude);

    void initLocation(@NotNull Context mContext, @Nullable BaseLocationConfig config);

    boolean isLocationServiceOpen();

    void saveLocation(@Nullable LocationInfo info);

    void startLocation(@NotNull LocationListener<LocationInfo> listener);

    void stopLocation();
}
