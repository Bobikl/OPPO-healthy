package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\b\b&\u0018\u0000 \u00132\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&R&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/b4k;", "", "", "key", "value", "a", "", "appId", "categoryId", "eventId", "", "c", "", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "data", "<init>", "()V", "Companion", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public abstract class b4k {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    public static final boolean isDebug = false;

    @JvmField
    public static boolean isV3TrackInit;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<String, String> data = new LinkedHashMap();

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.b4k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/b4k$a;", "", "Landroid/content/Context;", "context", "Lcom/oplus/aiunit/vision/ini;", "caller", "Lcom/oplus/aiunit/vision/r7b;", "logger", "Lcom/oplus/aiunit/vision/b4k;", "a", "", "isDebug", "Z", "isV3TrackInit", "<init>", "()V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final b4k a(@NotNull Context context, @Nullable ini caller, @NotNull r7b logger) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(logger, "logger");
            if (caller != null) {
                return new ig4(context, caller, logger);
            }
            e8k e8kVar = e8k.INSTANCE;
            if (e8kVar.c()) {
                return new psk(logger);
            }
            if (e8kVar.b()) {
                return new nsk(logger);
            }
            return e8kVar.a(context) ? new jsk(context, logger) : new muc();
        }
    }

    @NotNull
    public final b4k a(@NotNull String key, @Nullable String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (value != null) {
            this.data.put(key, value);
        }
        return this;
    }

    @NotNull
    public final Map<String, String> b() {
        return this.data;
    }

    public abstract void c(int appId, @NotNull String categoryId, @NotNull String eventId);
}
