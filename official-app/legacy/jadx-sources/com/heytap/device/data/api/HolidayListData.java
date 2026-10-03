package com.heytap.device.data.api;

import androidx.annotation.Keep;
import com.google.gson.reflect.TypeToken;
import com.heytap.health.base.text.GsonUtil;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/heytap/device/data/api/HolidayListData;", "", "()V", "config", "", "Lcom/heytap/device/data/api/Holiday;", "getConfig", "()Ljava/util/List;", "setConfig", "(Ljava/util/List;)V", "version", "", "getVersion", "()Ljava/lang/String;", "setVersion", "(Ljava/lang/String;)V", "Companion", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HolidayListData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private List<Holiday> config;

    @Nullable
    private String version;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lcom/heytap/device/data/api/HolidayListData$Companion;", "", "", "json", "Lcom/heytap/device/data/api/HolidayListData;", "a", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final HolidayListData a(@Nullable String json) {
            if (json == null) {
                return null;
            }
            return (HolidayListData) GsonUtil.b(json, new TypeToken<HolidayListData>() { // from class: com.heytap.device.data.api.HolidayListData$Companion$parseHolidayList$data$1
            }.getType());
        }
    }

    @Nullable
    public final List<Holiday> getConfig() {
        return this.config;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public final void setConfig(@Nullable List<Holiday> list) {
        this.config = list;
    }

    public final void setVersion(@Nullable String str) {
        this.version = str;
    }
}
