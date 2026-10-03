package com.oplus.deepthinker.sdk.app.feature;

import android.os.Bundle;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.oea;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.DeviceEventResult;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventCallback;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 \u00132\u00020\u0001:\u0003\u0014\u0015\u0016B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/feature/AppSwitchCallback;", "Lcom/oplus/deepthinker/sdk/app/aidl/eventfountain/IEventCallback$Stub;", "Lcom/oplus/deepthinker/sdk/app/feature/AppSwitchCallback$a;", "event", "", "onAppSwitchEvent", "", "code", "", "msg", "onSuccess", "onFailure", "Lcom/oplus/deepthinker/sdk/app/aidl/eventfountain/DeviceEventResult;", "deviceEventResult", "onEventStateChanged", "tag", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Companion", "a", "b", "c", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
public abstract class AppSwitchCallback extends IEventCallback.Stub {

    @NotNull
    private static final String ACTIVITY_FILTER = "activity_filter";

    @NotNull
    private static final String APP_FILTER = "app_filter";

    @NotNull
    private static final String DISPATCH_DELAY = "dispatch_delay";
    public static final int EVENT_ACTIVITY_ENTER = 4;
    public static final int EVENT_ACTIVITY_EXIT = 8;
    public static final int EVENT_APP_ENTER = 1;
    public static final int EVENT_APP_EXIT = 2;

    @NotNull
    private static final String EVENT_TYPE = "event";

    @NotNull
    private static final String FEATURE = "AtomFeature";

    @NotNull
    private static final String FIRST_START = "first";

    @NotNull
    private static final String IS_RESUMING_FIRST_START = "is_resuming_first_start";

    @NotNull
    private static final String IS_RESUMING_MULTI_APP = "is_resuming_multi_app";
    public static final int LISTEN_ALL = 15;
    public static final int LISTEN_EVENT_ACTIVITY = 12;
    public static final int LISTEN_EVENT_APP = 3;

    @NotNull
    private static final String MULTI_APP = "multi";

    @NotNull
    private static final String RESUMING_ACTIVITY_NAME = "resuming_activity_name";

    @NotNull
    private static final String RESUMING_PACKAGE_NAME = "resuming_package_name";

    @NotNull
    private static final String TAG = "AppSwitchCallback";

    @NotNull
    private static final String TARGET_NAME = "target";

    @NotNull
    private static final String TIMESTAMP = "timestamp";

    @NotNull
    private static final String WINDOW_MODE = "windowMode";

    @NotNull
    private final String tag;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/feature/AppSwitchCallback$b;", "", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
    public static final class b {
    }

    public AppSwitchCallback(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
    }

    public void onAppSwitchEvent(@NotNull AppSwitchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventCallback
    public final void onEventStateChanged(@Nullable DeviceEventResult deviceEventResult) {
        Bundle extraData;
        if (deviceEventResult == null || deviceEventResult.getEventType() != 3) {
            return;
        }
        int eventStateType = deviceEventResult.getEventStateType();
        if (eventStateType == 0) {
            oea.Companion companion = oea.INSTANCE;
            Bundle extraData2 = deviceEventResult.getExtraData();
            Intrinsics.checkNotNullExpressionValue(extraData2, "deviceEventResult.extraData");
            int iC = companion.c(extraData2);
            Bundle extraData3 = deviceEventResult.getExtraData();
            Intrinsics.checkNotNullExpressionValue(extraData3, "deviceEventResult.extraData");
            onFailure(iC, companion.e(extraData3));
            return;
        }
        if (eventStateType != 1) {
            if (eventStateType == 2 && (extraData = deviceEventResult.getExtraData()) != null) {
                onAppSwitchEvent(new AppSwitchEvent(extraData));
                return;
            }
            return;
        }
        oea.Companion companion2 = oea.INSTANCE;
        Bundle extraData4 = deviceEventResult.getExtraData();
        Intrinsics.checkNotNullExpressionValue(extraData4, "deviceEventResult.extraData");
        int iC2 = companion2.c(extraData4);
        Bundle extraData5 = deviceEventResult.getExtraData();
        Intrinsics.checkNotNullExpressionValue(extraData5, "deviceEventResult.extraData");
        onSuccess(iC2, companion2.e(extraData5));
    }

    public void onFailure(int code, @Nullable String msg) {
    }

    public void onSuccess(int code, @Nullable String msg) {
    }

    /* JADX INFO: renamed from: com.oplus.deepthinker.sdk.app.feature.AppSwitchCallback$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010+\u001a\u00020\u0007\u0012\u0006\u0010-\u001a\u00020\u0007¢\u0006\u0004\b.\u0010/B\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u000200¢\u0006\u0004\b.\u00101J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010 \u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0010\u001a\u0004\b\"\u0010\u0012R\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\u0017R\u0019\u0010)\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0015\u001a\u0004\b(\u0010\u0017R\u0017\u0010+\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010\u001cR\u0017\u0010-\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010\u001a\u001a\u0004\b-\u0010\u001c¨\u00062"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/feature/AppSwitchCallback$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "getTimeStamp", "()J", SpeechConstant.KEY_TTS_TIMESTAMP, "b", "I", "getEventType", "()I", "eventType", "c", "Ljava/lang/String;", "getTargetName", "()Ljava/lang/String;", "targetName", "d", "Z", "getFirstStart", "()Z", "firstStart", MapSchema.FIELD_NAME_ENTRY, "getMultiApp", "multiApp", "f", "getWindowMode", AppSwitchCallback.WINDOW_MODE, b2n.f, "getResumingPackageName", "resumingPackageName", b2n.g, "getResumingActivityName", "resumingActivityName", "i", "isResumingMultiApp", "j", "isResumingFirstStart", "<init>", "(JILjava/lang/String;ZZILjava/lang/String;Ljava/lang/String;ZZ)V", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
    public static final /* data */ class AppSwitchEvent {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final long timeStamp;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int eventType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String targetName;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        public final boolean firstStart;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean multiApp;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        public final int windowMode;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
        @Nullable
        public final String resumingPackageName;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
        @Nullable
        public final String resumingActivityName;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        public final boolean isResumingMultiApp;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isResumingFirstStart;

        public AppSwitchEvent(long j2, int i, @Nullable String str, boolean z, boolean z2, int i2, @Nullable String str2, @Nullable String str3, boolean z3, boolean z4) {
            this.timeStamp = j2;
            this.eventType = i;
            this.targetName = str;
            this.firstStart = z;
            this.multiApp = z2;
            this.windowMode = i2;
            this.resumingPackageName = str2;
            this.resumingActivityName = str3;
            this.isResumingMultiApp = z3;
            this.isResumingFirstStart = z4;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AppSwitchEvent)) {
                return false;
            }
            AppSwitchEvent appSwitchEvent = (AppSwitchEvent) other;
            return this.timeStamp == appSwitchEvent.timeStamp && this.eventType == appSwitchEvent.eventType && Intrinsics.areEqual(this.targetName, appSwitchEvent.targetName) && this.firstStart == appSwitchEvent.firstStart && this.multiApp == appSwitchEvent.multiApp && this.windowMode == appSwitchEvent.windowMode && Intrinsics.areEqual(this.resumingPackageName, appSwitchEvent.resumingPackageName) && Intrinsics.areEqual(this.resumingActivityName, appSwitchEvent.resumingActivityName) && this.isResumingMultiApp == appSwitchEvent.isResumingMultiApp && this.isResumingFirstStart == appSwitchEvent.isResumingFirstStart;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v17, types: [int] */
        /* JADX WARN: Type inference failed for: r0v19, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v16, types: [int] */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r1v24 */
        /* JADX WARN: Type inference failed for: r1v6, types: [int] */
        /* JADX WARN: Type inference failed for: r1v8, types: [int] */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v2 */
        public int hashCode() {
            int iHashCode = ((Long.hashCode(this.timeStamp) * 31) + Integer.hashCode(this.eventType)) * 31;
            String str = this.targetName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            boolean z = this.firstStart;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int i = (iHashCode2 + r1) * 31;
            boolean z2 = this.multiApp;
            ?? r2 = z2;
            if (z2) {
                r2 = 1;
            }
            int iHashCode3 = (((i + r2) * 31) + Integer.hashCode(this.windowMode)) * 31;
            String str2 = this.resumingPackageName;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.resumingActivityName;
            int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
            boolean z3 = this.isResumingMultiApp;
            ?? r3 = z3;
            if (z3) {
                r3 = 1;
            }
            int i2 = (iHashCode5 + r3) * 31;
            boolean z4 = this.isResumingFirstStart;
            return i2 + (z4 ? 1 : z4);
        }

        @NotNull
        public String toString() {
            return "AppSwitchEvent(timeStamp=" + this.timeStamp + ", eventType=" + this.eventType + ", targetName=" + ((Object) this.targetName) + ", firstStart=" + this.firstStart + ", multiApp=" + this.multiApp + ", windowMode=" + this.windowMode + ", resumingPackageName=" + ((Object) this.resumingPackageName) + ", resumingActivityName=" + ((Object) this.resumingActivityName) + ", isResumingMultiApp=" + this.isResumingMultiApp + ", isResumingFirstStart=" + this.isResumingFirstStart + ')';
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AppSwitchEvent(@NotNull Bundle b) {
            this(b.getLong("timestamp"), b.getInt("event"), b.getString("target"), b.getBoolean(AppSwitchCallback.FIRST_START), b.getBoolean(AppSwitchCallback.MULTI_APP), b.getInt(AppSwitchCallback.WINDOW_MODE), b.getString(AppSwitchCallback.RESUMING_PACKAGE_NAME), b.getString(AppSwitchCallback.RESUMING_ACTIVITY_NAME), b.getBoolean(AppSwitchCallback.IS_RESUMING_MULTI_APP), b.getBoolean(AppSwitchCallback.IS_RESUMING_FIRST_START));
            Intrinsics.checkNotNullParameter(b, "b");
        }
    }
}
