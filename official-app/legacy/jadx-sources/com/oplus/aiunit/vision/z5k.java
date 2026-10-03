package com.oplus.aiunit.vision;

import android.net.Uri;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import com.oplus.nearx.track.internal.common.content.GlobalConfigHelper;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/z5k;", "", "Companion", "a", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class z5k {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EXTRA_COMMON_PARAM_KEY_APP_ID = "appId";
    public static final String a;

    @NotNull
    public static final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Uri f19275c;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.z5k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u001c\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/z5k$a;", "", "Landroid/net/Uri;", "AUTHORITY_URI", "Landroid/net/Uri;", "a", "()Landroid/net/Uri;", "", "AUTHORITY", "Ljava/lang/String;", "EXTRA_COMMON_PARAM_KEY_APP_ID", "kotlin.jvm.PlatformType", "PACKAGE_NAME", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Uri a() {
            return z5k.f19275c;
        }
    }

    static {
        String packageName = GlobalConfigHelper.INSTANCE.c().getPackageName();
        a = packageName;
        String str = packageName + ".Track.TrackEventProvider";
        b = str;
        Uri uri = Uri.parse(NotificationApiService.CONTENT + str);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(\"content://$AUTHORITY\")");
        f19275c = uri;
    }
}
