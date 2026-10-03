package com.heytap.health.device.sportrecord.parse;

import com.heytap.health.device.sportrecord.bean.SportRecordV2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/heytap/health/device/sportrecord/parse/SportRecordParseNative;", "", "Companion", "device_data_sync_native_release"}, k = 1, mv = {1, 8, 0})
public final class SportRecordParseNative {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086 ¨\u0006\u0007"}, d2 = {"Lcom/heytap/health/device/sportrecord/parse/SportRecordParseNative$Companion;", "", "()V", "parseSportRecord", "Lcom/heytap/health/device/sportrecord/bean/SportRecordV2;", "filePath", "", "device_data_sync_native_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final native SportRecordV2 parseSportRecord(@NotNull String filePath);
    }

    static {
        System.loadLibrary("sport-record-parse");
    }
}
