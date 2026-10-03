package com.heytap.nearx.cloudconfig;

import com.heytap.nearx.cloudconfig.annotation.CountryCode;
import com.heytap.nearx.cloudconfig.observable.Observable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¨\u0006\n"}, d2 = {"Lcom/heytap/nearx/cloudconfig/AreaHostService;", "", "observeHost", "Lcom/heytap/nearx/cloudconfig/observable/Observable;", "Lcom/heytap/nearx/cloudconfig/AreaHostEntity;", "countryCode", "", "observeHosts", "", "queryHost", "cloudconfig-area_release"}, k = 1, mv = {1, 1, 16})
public interface AreaHostService {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
    public static final class DefaultImpls {
        public static /* synthetic */ Observable observeHost$default(AreaHostService areaHostService, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeHost");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return areaHostService.observeHost(str);
        }

        public static /* synthetic */ Observable observeHosts$default(AreaHostService areaHostService, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeHosts");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            return areaHostService.observeHosts(str);
        }

        public static /* synthetic */ AreaHostEntity queryHost$default(AreaHostService areaHostService, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryHost");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return areaHostService.queryHost(str);
        }
    }

    @NotNull
    Observable<AreaHostEntity> observeHost(@CountryCode @Nullable String countryCode);

    @NotNull
    Observable<List<AreaHostEntity>> observeHosts(@CountryCode @NotNull String countryCode);

    @Nullable
    AreaHostEntity queryHost(@CountryCode @Nullable String countryCode);
}
