package com.oplus.health.apiprovider;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.heytap.health.annotation.ProcessName;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.o2f;
import com.oplus.aiunit.vision.rdf;
import com.oplus.health.apiprovider.ProcessReceiver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00112\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/oplus/health/apiprovider/ProcessReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "b", "Lcom/oplus/aiunit/vision/o2f;", "a", "Lcom/oplus/aiunit/vision/o2f;", "getMHelper", "()Lcom/oplus/aiunit/vision/o2f;", "mHelper", "<init>", "(Lcom/oplus/aiunit/vision/o2f;)V", "Companion", "lib_apiprovider_release"}, k = 1, mv = {1, 8, 0})
public final class ProcessReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final o2f mHelper;

    /* JADX INFO: renamed from: com.oplus.health.apiprovider.ProcessReceiver$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/oplus/health/apiprovider/ProcessReceiver$a;", "", "Landroid/content/Context;", "context", "Lcom/heytap/health/annotation/ProcessName;", Fields.PROCESS_NAME_FIELD, "", "a", "", "PROCESS_START_ACTION", "Ljava/lang/String;", "PROCESS_START_NAME", "TAG", "<init>", "()V", "lib_apiprovider_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void a(@NotNull Context context, @NotNull ProcessName processName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(processName, "processName");
            a7b.f("ProcessReceiver", "notifyProcessStarted: notify '" + processName.mPName + "'");
            Intent intent = new Intent("com.heytap.health.apiprovider.PROC_STARTED");
            intent.putExtra("PROC_NAME", processName.mPName);
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent);
        }
    }

    public ProcessReceiver(@NotNull o2f mHelper) {
        Intrinsics.checkNotNullParameter(mHelper, "mHelper");
        this.mHelper = mHelper;
    }

    @JvmStatic
    public static final void c(@NotNull Context context, @NotNull ProcessName processName) {
        INSTANCE.a(context, processName);
    }

    public static final void d(ProcessReceiver this$0, ProcessName processName) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object objE = this$0.mHelper.e(processName, false);
        if (objE == null) {
            objE = "null";
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        a7b.f("ProcessReceiver", "notifyProcessStarted: receive '" + processName.mPName + "' delay=" + jCurrentTimeMillis2 + " api=" + objE);
    }

    public final void b(@Nullable Context context) {
        if (context == null) {
            return;
        }
        rdf.a(context, this, new IntentFilter("com.heytap.health.apiprovider.PROC_STARTED"), 4);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (intent != null && Intrinsics.areEqual(intent.getAction(), "com.heytap.health.apiprovider.PROC_STARTED")) {
            final ProcessName processNameByName = ProcessName.getProcessNameByName(intent.getStringExtra("PROC_NAME"));
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.bxe
                @Override // java.lang.Runnable
                public final void run() {
                    ProcessReceiver.d(this.i, processNameByName);
                }
            });
        }
    }
}
