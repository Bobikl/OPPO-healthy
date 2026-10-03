package com.heytap.health.watch.calendar.service;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.heytap.health.watch.calendar.aidl.ICalendarMainSync;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.cm9;
import com.oplus.aiunit.vision.jp2;
import io.protostuff.MapSchema;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/watch/calendar/service/CalendarMainApi;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/health/watch/calendar/aidl/ICalendarMainSync;", "f", "Landroid/content/Context;", "context", "", "c", "b", "Lcom/heytap/health/watch/calendar/aidl/ICalendarMainSync$Stub;", "i", "Lkotlin/Lazy;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/heytap/health/watch/calendar/aidl/ICalendarMainSync$Stub;", "mBinder", "<init>", "()V", "Companion", "calendar_impl_release"}, k = 1, mv = {1, 8, 0})
public final class CalendarMainApi implements cm9<ICalendarMainSync> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy mBinder = LazyKt__LazyJVMKt.lazy(new Function0<CalendarMainApi$mBinder$2.AnonymousClass1>() { // from class: com.heytap.health.watch.calendar.service.CalendarMainApi$mBinder$2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Type inference failed for: r0v1, types: [com.heytap.health.watch.calendar.service.CalendarMainApi$mBinder$2$1] */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final AnonymousClass1 invoke() {
            return new ICalendarMainSync.Stub() { // from class: com.heytap.health.watch.calendar.service.CalendarMainApi$mBinder$2.1
                @Override // com.heytap.health.watch.calendar.aidl.ICalendarMainSync
                public void oobeSyncFinish(boolean result) {
                    a7b.f("CalHealth.CalendarMainApi", "oobeSyncFinish result " + result);
                    Intent intent = new Intent("com.op.smartwear.public.wearable.RECEIVER");
                    intent.putExtra("native_sync_action", "com.op.smartwear.native.calendar.RECEIVER");
                    intent.putExtra("native_sync_result", result);
                    LocalBroadcastManager.getInstance(b78.a()).sendBroadcast(intent);
                }
            };
        }
    });

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/watch/calendar/service/CalendarMainApi$Companion;", "", "", "result", "", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "calendar_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void a(boolean result) {
            BuildersKt__Builders_commonKt.launch$default(jp2.INSTANCE, null, null, new CalendarMainApi$Companion$oobeSyncFinish$1(result, null), 3, null);
        }
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final ICalendarMainSync.Stub e() {
        return (ICalendarMainSync.Stub) this.mBinder.getValue();
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ICalendarMainSync d() {
        return e();
    }
}
