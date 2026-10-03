package com.oplus.pantaconnect.sdk.logger;

import com.lifesense.android.bluetooth.scale.bean.WeightData_A3;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.enums.EnumEntries;
import p010kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\tJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lcom/oplus/pantaconnect/sdk/logger/Logger;", "", "log", "", "level", "Lcom/oplus/pantaconnect/sdk/logger/Logger$Level;", "tag", "", "msg", "Level", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Logger {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/pantaconnect/sdk/logger/Logger$Level;", "", "(Ljava/lang/String;I)V", "DEBUG", "INFO", "WARNING", WeightData_A3.IMPEDANCE_STATUS_ERROR, "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Level {
        DEBUG,
        INFO,
        WARNING,
        ERROR;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<Level> getEntries() {
            return $ENTRIES;
        }
    }

    void log(@NotNull Level level, @NotNull String tag, @NotNull String msg);
}
