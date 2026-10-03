package com.oplus.pantaconnect.sdk.logger;

import android.util.Log;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\f\u0010\n\u001a\u00020\u000b*\u00020\u0006H\u0002¨\u0006\f"}, d2 = {"Lcom/oplus/pantaconnect/sdk/logger/AndroidLogger;", "Lcom/oplus/pantaconnect/sdk/logger/Logger;", "()V", "log", "", "level", "Lcom/oplus/pantaconnect/sdk/logger/Logger$Level;", "tag", "", "msg", "getPriority", "", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidLogger implements Logger {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Logger.Level.values().length];
            try {
                iArr[Logger.Level.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Logger.Level.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Logger.Level.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Logger.Level.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final int getPriority(Logger.Level level) {
        int i = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 5;
        }
        if (i == 4) {
            return 6;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.oplus.pantaconnect.sdk.logger.Logger
    public void log(@NotNull Logger.Level level, @NotNull String tag, @NotNull String msg) {
        Log.println(getPriority(level), tag, msg);
    }
}
