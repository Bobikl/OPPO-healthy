package com.heytap.health.watch.calendar.observer;

import com.oplus.aiunit.vision.a7b;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCalendarObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarObserver.kt\ncom/heytap/health/watch/calendar/observer/CalendarObserver$ensureDevice$1\n*L\n1#1,53:1\n*E\n"})
public final class CalendarObserver$ensureDevice$1 extends Lambda implements Function0<Unit> {
    public static final CalendarObserver$ensureDevice$1 INSTANCE = new CalendarObserver$ensureDevice$1();

    public CalendarObserver$ensureDevice$1() {
        super(0);
    }

    @Override // p010kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        a7b.b("CalHealth.CalendarObserver", "ensureDevice unSupport");
    }
}
