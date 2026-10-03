package com.health.health_seedlingcard.utlis;

import com.heytap.accessory.pair.seeker.DeviceEventManager;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.l9b;
import com.oplus.aiunit.vision.m8b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/health/health_seedlingcard/utlis/b;", "", "Companion", "a", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
public final class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.health.health_seedlingcard.utlis.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/health/health_seedlingcard/utlis/b$a;", "", "", DeviceEventManager.Event.KEY_TAG, "message", "", "a", "<init>", "()V", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull String tag, @NotNull String message) {
            Intrinsics.checkNotNullParameter(tag, DeviceEventManager.Event.KEY_TAG);
            Intrinsics.checkNotNullParameter(message, "message");
            l9b.f(tag, message);
            if (if0.w()) {
                m8b.f(tag, message);
            }
        }
    }
}
