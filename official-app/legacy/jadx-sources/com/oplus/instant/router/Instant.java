package com.oplus.instant.router;

import android.content.Context;
import com.oplus.aiunit.vision.epm;
import com.oplus.aiunit.vision.kbm;
import com.oplus.aiunit.vision.llm;
import com.oplus.aiunit.vision.mrm;
import com.oplus.aiunit.vision.nhm;
import com.oplus.aiunit.vision.zym;
import com.oplus.instant.router.callback.Callback;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class Instant {
    public static final String HOST_INSTANT = "instant";
    public static final String PATH_APP = "/app";
    public static final String SCHEME_OAPS = "oaps";

    public static abstract class Builder {
        public abstract Req build();

        public abstract Builder putExtra(String str, String str2);

        public abstract Builder putParams(String str, String str2);

        public abstract Builder putStat(String str, String str2);

        public abstract Builder setCallback(Callback callback);

        public abstract Builder setExtra(String str);

        public abstract Builder setFrom(String str);

        @Deprecated
        public abstract Builder setPackage(String str);

        @Deprecated
        public abstract Builder setPage(String str);

        @Deprecated
        public abstract Builder setPath(String str);

        public abstract Builder setRequestUrl(String str);

        public abstract Builder signAsPlatform();
    }

    public static abstract class FromBuilder {
        public abstract String build();

        public abstract FromBuilder set(String str, String str2);

        public abstract FromBuilder setScene(String str);

        public abstract FromBuilder setTraceId(String str);
    }

    public interface IStatisticsProvider {
        void onStat(Map<String, String> map);
    }

    public static abstract class Req {
        public abstract void preload(Context context);

        public abstract void request(Context context);
    }

    public static Builder createBuilder(String str, String str2) {
        return new nhm(str, str2);
    }

    public static FromBuilder createFromBuilder() {
        return new llm();
    }

    public static void enableLog() {
        epm.a();
    }

    public static String getSDKVersion() {
        return zym.f();
    }

    public static String getVersion(Context context) {
        return zym.l(context);
    }

    @Deprecated
    public static boolean isFitPltVersion(Context context, String str) {
        return zym.d(context, str);
    }

    @Deprecated
    public static boolean isFitPltVersionStrict(Context context, String str) {
        return zym.g(context, str);
    }

    @Deprecated
    public static boolean isInstantOapsUri(String str) {
        return mrm.o(str);
    }

    public static boolean isInstantPlatformInstalled(Context context) {
        return zym.n(context);
    }

    public static void setStatisticsProvider(IStatisticsProvider iStatisticsProvider) {
        kbm.c().b(iStatisticsProvider);
    }
}
