package com.oplus.aiunit.vision;

import android.app.Activity;
import com.heytap.store.platform.trackdomestic.TrackUtil;
import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import com.oplus.drs.track.ITrackApi;
import com.oplus.drs.track.TrackApi;
import com.oplus.drs.track.impl.BaseTrackImpl;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertyFilter;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0005*\u0001(\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b+\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002R\u0014\u0010\u0015\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR$\u0010$\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)¨\u0006,"}, d2 = {"Lcom/oplus/aiunit/vision/lg3;", "", "", b2n.f, "()V", "", "startActivityCount", "Landroid/app/Activity;", "activity", MapSchema.FIELD_NAME_ENTRY, "f", "d", b2n.g, "i", "", "eventId", "Lorg/json/JSONObject;", SAPropertyFilter.PROPERTIES, "j", "b", "c", "TIME_OUT", "I", "", "a", "J", "startTime", "endTime", "Ljava/lang/String;", "previousScreen", "Ljava/lang/Object;", "pendingEventLock", "Ljava/util/ArrayList;", "Lcom/oplus/aiunit/vision/lg3$a;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "pendingEvents", "", "Z", "appModuleIdListenerRegistered", "com/oplus/aiunit/vision/lg3$b", "Lcom/oplus/aiunit/vision/lg3$b;", "appModuleIdReadyListener", "<init>", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
public final class lg3 {
    public static final int TIME_OUT = 30000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static long startTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static long endTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static String previousScreen;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static boolean appModuleIdListenerRegistered;

    @NotNull
    public static final lg3 INSTANCE = new lg3();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Object pendingEventLock = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ArrayList<PresetEvent> pendingEvents = new ArrayList<>(4);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final b appModuleIdReadyListener = new b();

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.lg3$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/lg3$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "eventId", "Lorg/json/JSONObject;", "b", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", SAPropertyFilter.PROPERTIES, "<init>", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class PresetEvent {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String eventId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final JSONObject properties;

        public PresetEvent(@NotNull String eventId, @NotNull JSONObject properties) {
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            Intrinsics.checkNotNullParameter(properties, "properties");
            this.eventId = eventId;
            this.properties = properties;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEventId() {
            return this.eventId;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final JSONObject getProperties() {
            return this.properties;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PresetEvent)) {
                return false;
            }
            PresetEvent presetEvent = (PresetEvent) other;
            return Intrinsics.areEqual(this.eventId, presetEvent.eventId) && Intrinsics.areEqual(this.properties, presetEvent.properties);
        }

        public int hashCode() {
            return (this.eventId.hashCode() * 31) + this.properties.hashCode();
        }

        @NotNull
        public String toString() {
            return "PresetEvent(eventId=" + this.eventId + ", properties=" + this.properties + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/oplus/aiunit/vision/lg3$b", "Lcom/oplus/aiunit/vision/vb0$a;", "", "appModuleId", "", "a", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements vb0.a {
        @Override // com.oplus.aiunit.vision.vb0.a
        public void a(long appModuleId) {
            lg3.INSTANCE.c();
        }
    }

    public final void b(String eventId, JSONObject properties) {
        synchronized (pendingEventLock) {
            pendingEvents.add(new PresetEvent(eventId, properties));
            if (!appModuleIdListenerRegistered) {
                appModuleIdListenerRegistered = true;
                vb0.addOnAppModuleIdReadyListener(appModuleIdReadyListener);
            }
            Unit unit = Unit.INSTANCE;
        }
        TrackLogger.c("ClientVisitHelper", "AppModuleId not ready, cache preset event: " + eventId, new Object[0]);
    }

    public final void c() {
        Object obj = pendingEventLock;
        synchronized (obj) {
            ArrayList<PresetEvent> arrayList = pendingEvents;
            if (arrayList.isEmpty()) {
                appModuleIdListenerRegistered = false;
                return;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            appModuleIdListenerRegistered = false;
            Unit unit = Unit.INSTANCE;
            TrackApi.Companion companion = TrackApi.INSTANCE;
            if (!companion.j()) {
                synchronized (obj) {
                    arrayList.addAll(0, arrayList2);
                }
                TrackLogger.c("ClientVisitHelper", "SDK not init yet, keep " + arrayList2.size() + " preset events cached", new Object[0]);
                return;
            }
            TrackApi trackApiF = companion.f();
            if (trackApiF == null) {
                synchronized (obj) {
                    arrayList.addAll(0, arrayList2);
                    if (!appModuleIdListenerRegistered) {
                        appModuleIdListenerRegistered = true;
                        vb0.addOnAppModuleIdReadyListener(appModuleIdReadyListener);
                    }
                }
                return;
            }
            ITrackApi delegate$obus_sdk_release = trackApiF.getDelegate$obus_sdk_release();
            if ((delegate$obus_sdk_release instanceof BaseTrackImpl) && !((BaseTrackImpl) delegate$obus_sdk_release).getIsInitialized()) {
                synchronized (obj) {
                    arrayList.addAll(0, arrayList2);
                }
                TrackLogger.c("ClientVisitHelper", "TrackApi instance not init yet, keep " + arrayList2.size() + " preset events cached", new Object[0]);
                return;
            }
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                PresetEvent presetEvent = (PresetEvent) arrayList2.get(i);
                trackApiF.track(TrackUtil.EVENT_GROUP, presetEvent.getEventId(), presetEvent.getProperties());
            }
            TrackLogger.c("ClientVisitHelper", "flush preset events success, size=" + arrayList2.size(), new Object[0]);
        }
    }

    public final void d() {
        pa0.INSTANCE.c();
    }

    public final void e(int startActivityCount, @NotNull Activity activity) throws JSONException {
        Intrinsics.checkNotNullParameter(activity, "activity");
        long jCurrentTimeMillis = System.currentTimeMillis();
        startTime = jCurrentTimeMillis;
        if (startActivityCount != 1 || Math.abs(jCurrentTimeMillis - endTime) < 30000) {
            return;
        }
        tjg.INSTANCE.b();
        if (pa0.INSTANCE.b()) {
            h();
        }
        i(activity);
    }

    public final void f(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        endTime = System.currentTimeMillis();
        previousScreen = wo.a(activity);
    }

    public final void g() {
        synchronized (pendingEventLock) {
            if (pendingEvents.isEmpty()) {
                return;
            }
            Unit unit = Unit.INSTANCE;
            TrackLogger.c("ClientVisitHelper", "retryFlushPendingEvents after SDK init", new Object[0]);
            c();
        }
    }

    public final void h() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("$backgroundSessionId", pa0.INSTANCE.a());
        Unit unit = Unit.INSTANCE;
        j("$app_exit", jSONObject);
    }

    public final void i(Activity activity) throws JSONException {
        String strA = wo.a(activity);
        l7k l7kVarB = wo.b(activity);
        TrackLogger.c("ClientVisitHelper", "client start, start a track event, currentScreen=[" + strA + ']', new Object[0]);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("$previousScreen", previousScreen);
        jSONObject.put("$currentScreen", strA);
        if (l7kVarB != null) {
            nka.a(l7kVarB, jSONObject);
        }
        Unit unit = Unit.INSTANCE;
        j("$app_start", jSONObject);
    }

    public final void j(String eventId, JSONObject properties) {
        TrackApi.Companion companion = TrackApi.INSTANCE;
        if (!companion.j()) {
            b(eventId, properties);
            return;
        }
        TrackApi trackApiF = companion.f();
        if (trackApiF == null) {
            b(eventId, properties);
            return;
        }
        ITrackApi delegate$obus_sdk_release = trackApiF.getDelegate$obus_sdk_release();
        if (!(delegate$obus_sdk_release instanceof BaseTrackImpl) || ((BaseTrackImpl) delegate$obus_sdk_release).getIsInitialized()) {
            trackApiF.track(TrackUtil.EVENT_GROUP, eventId, properties);
        } else {
            b(eventId, properties);
        }
    }
}
