package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.speech.engine.SpeechEngineException;
import com.heytap.speech.engine.constant.ErrorCode;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 _2\u00020\u0001:\u00057=B\"\u001cB\u0019\u0012\u0006\u0010;\u001a\u00020\b\u0012\b\u0010A\u001a\u0004\u0018\u00010<¢\u0006\u0004\b]\u0010^J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ)\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u000b\"\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0011\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u000b\"\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0014\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u000b\"\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0016\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u000b\"\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\bJ\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001dJ+\u0010 \u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\b2\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u000b\"\u00020\b¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u0004J!\u0010$\u001a\u00020\u00022\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u000b\"\u00020\b¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\u00022\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u000b\"\u00020\b¢\u0006\u0004\b&\u0010%J\u0006\u0010'\u001a\u00020\u0002J\u0010\u0010(\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)H\u0016J\u0010\u0010,\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004J-\u00103\u001a\u0004\u0018\u00010/2\b\u0010.\u001a\u0004\u0018\u00010-2\u0006\u00100\u001a\u00020/2\n\b\u0002\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104J\u000e\u00106\u001a\u00020\u00022\u0006\u00105\u001a\u00020/R\u0017\u0010;\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010A\u001a\u0004\u0018\u00010<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0016\u0010D\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010G\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010FR$\u0010K\u001a\u0012\u0012\u0004\u0012\u00020\b0Hj\b\u0012\u0004\u0012\u00020\b`I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010JR2\u0010P\u001a\u001e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020M0Lj\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020M`N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010OR\u0016\u0010R\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\b0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010XR\u0018\u0010\\\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010[¨\u0006`"}, d2 = {"Lcom/oplus/aiunit/vision/u92;", "", "", "n", "Lcom/oplus/aiunit/vision/n8c;", "data", LogFieldKey.PROCESS_NAME_KEY, "q", "", "topic", "r", "", "parts", "u", "(Ljava/lang/String;[Ljava/lang/String;)V", "", "logout", "s", "(Ljava/lang/String;Z[Ljava/lang/String;)V", "", "v", "(Ljava/lang/String;[[B)V", "t", "(Ljava/lang/String;Z[[B)V", "multipart", "w", "url", "Lcom/oplus/aiunit/vision/u92$c;", MapSchema.FIELD_NAME_ENTRY, "", "args", "f", b2n.f, "(Ljava/lang/String;[Ljava/lang/String;)Lcom/oplus/aiunit/vision/u92$c;", "d", "topics", "C", "([Ljava/lang/String;)V", "D", "i", "z", "Ljava/io/PrintWriter;", "pw", "j", "o", "Ljava/lang/Runnable;", "runnable", "", ClickApiEntity.TIME, "Lcom/oplus/aiunit/vision/u92$e;", "callBack", "A", "(Ljava/lang/Runnable;JLcom/oplus/aiunit/vision/u92$e;)Ljava/lang/Long;", "timerId", LogFieldKey.MESSAGE_KEY, "a", "Ljava/lang/String;", LogFieldKey.LEVEL_KEY, "()Ljava/lang/String;", "name", "Lcom/oplus/aiunit/vision/fa2;", "b", "Lcom/oplus/aiunit/vision/fa2;", MapSchema.FIELD_NAME_KEY, "()Lcom/oplus/aiunit/vision/fa2;", "handler", "c", "Z", "mRunning", "Ljava/lang/Thread;", "Ljava/lang/Thread;", "mThread", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "subtopics", "Ljava/util/HashMap;", "Lcom/oplus/aiunit/vision/u92$d;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "timerItems", "J", "timerInc", "Ljava/util/Timer;", b2n.g, "Ljava/util/Timer;", "timer", "Ljava/util/Vector;", "Ljava/util/Vector;", "tmpArgs", "Ljava/lang/Exception;", "Ljava/lang/Exception;", "runningException", "<init>", "(Ljava/lang/String;Lcom/oplus/aiunit/vision/fa2;)V", "Companion", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public class u92 {

    @NotNull
    public static final String TAG = "BusClient";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final fa2 handler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean mRunning;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public Thread mThread;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HashSet<String> subtopics;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public volatile HashMap<Long, TimerItem> timerItems;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public volatile long timerInc;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public Timer timer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Vector<String> tmpArgs;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Exception runningException;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/u92$b;", "Ljava/util/TimerTask;", "", "run", "", "i", "J", "getTimerId", "()J", "setTimerId", "(J)V", "timerId", "Ljava/lang/Runnable;", "j", "Ljava/lang/Runnable;", "getRunnableTask", "()Ljava/lang/Runnable;", "setRunnableTask", "(Ljava/lang/Runnable;)V", "runnableTask", "Lcom/oplus/aiunit/vision/u92$e;", MapSchema.FIELD_NAME_KEY, "Lcom/oplus/aiunit/vision/u92$e;", "getCallBack", "()Lcom/oplus/aiunit/vision/u92$e;", "setCallBack", "(Lcom/oplus/aiunit/vision/u92$e;)V", "callBack", "<init>", "(Lcom/oplus/aiunit/vision/u92;JLjava/lang/Runnable;Lcom/oplus/aiunit/vision/u92$e;)V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
    public final class b extends TimerTask {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public long timerId;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Runnable runnableTask;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @Nullable
        public e callBack;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ u92 f17365l;

        public b(u92 this$0, @Nullable long j2, @Nullable Runnable runnable, e eVar) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f17365l = this$0;
            this.timerId = j2;
            this.runnableTask = runnable;
            this.callBack = eVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            ExecutorService executorServiceB;
            if (!this.f17365l.timerItems.containsKey(Long.valueOf(this.timerId))) {
                t7b.INSTANCE.b(this.f17365l.getName(), "timerTask " + this.timerId + ", had canceled.");
                return;
            }
            t7b.INSTANCE.b(this.f17365l.getName(), "timerTask run.");
            e eVar = this.callBack;
            if (eVar != null) {
                eVar.a();
            }
            if (this.runnableTask == null || (executorServiceB = bv6.INSTANCE.b()) == null) {
                return;
            }
            executorServiceB.execute(this.runnableTask);
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.u92$d, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/u92$d;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Runnable;", "a", "Ljava/lang/Runnable;", "getRunnable", "()Ljava/lang/Runnable;", "runnable", "", "b", "J", "getTimeout", "()J", "timeout", "<init>", "(Ljava/lang/Runnable;J)V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class TimerItem {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public final Runnable runnable;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final long timeout;

        public TimerItem(@Nullable Runnable runnable, long j2) {
            this.runnable = runnable;
            this.timeout = j2;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimerItem)) {
                return false;
            }
            TimerItem timerItem = (TimerItem) other;
            return Intrinsics.areEqual(this.runnable, timerItem.runnable) && this.timeout == timerItem.timeout;
        }

        public int hashCode() {
            Runnable runnable = this.runnable;
            return ((runnable == null ? 0 : runnable.hashCode()) * 31) + Long.hashCode(this.timeout);
        }

        @NotNull
        public String toString() {
            return "TimerItem(runnable=" + this.runnable + ", timeout=" + this.timeout + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/u92$e;", "", "", "a", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
    public interface e {
        void a();
    }

    public u92(@NotNull String name, @Nullable fa2 fa2Var) throws Exception {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.handler = fa2Var;
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "currentThread()");
        this.mThread = threadCurrentThread;
        this.subtopics = new HashSet<>();
        this.timerItems = new HashMap<>();
        this.tmpArgs = new Vector<>();
        try {
            this.mRunning = true;
            if (!TextUtils.isEmpty(name)) {
                c cVarG = g("/bus/join", name);
                if ((cVarG == null ? null : cVarG.getError()) != null) {
                    i();
                    throw new SpeechEngineException(ErrorCode.ERROR_BUSCLIENT_RUNTIME, cVarG.getError());
                }
                C("bus.event");
            }
            t7b.INSTANCE.g(TAG, Intrinsics.stringPlus(name, "\tcreated"));
        } catch (Exception e2) {
            e2.printStackTrace();
            t7b.INSTANCE.d(TAG, this.name + "\tcreate failed: " + ((Object) e2.getMessage()));
            i();
            throw e2;
        }
    }

    public static /* synthetic */ Long B(u92 u92Var, Runnable runnable, long j2, e eVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTimer");
        }
        if ((i & 4) != 0) {
            eVar = null;
        }
        return u92Var.A(runnable, j2, eVar);
    }

    public static final c h(u92 this$0, n8c multipart) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(multipart, "$multipart");
        return this$0.d(multipart);
    }

    public static /* synthetic */ boolean x(u92 u92Var, n8c n8cVar, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: publish");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return u92Var.w(n8cVar, z);
    }

    public static final void y(u92 this$0, n8c multipart, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(multipart, "$multipart");
        this$0.w(multipart, z);
    }

    @Nullable
    public final synchronized Long A(@Nullable Runnable runnable, long time, @Nullable e callBack) {
        if (!this.mRunning) {
            n();
            return -1L;
        }
        if (time == 0 && runnable != null) {
            ExecutorService executorServiceB = bv6.INSTANCE.b();
            if (executorServiceB != null) {
                executorServiceB.execute(runnable);
            }
            return 0L;
        }
        this.timerInc++;
        long j2 = this.timerInc;
        this.timerItems.put(Long.valueOf(j2), new TimerItem(runnable, time));
        if (this.timer == null) {
            this.timer = new Timer();
        }
        Timer timer = this.timer;
        if (timer != null) {
            timer.schedule(new b(this, j2, runnable, callBack), time);
        }
        return Long.valueOf(j2);
    }

    public final void C(@NotNull String... topics) {
        Intrinsics.checkNotNullParameter(topics, "topics");
        this.tmpArgs.clear();
        int length = topics.length;
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                String str = topics[i];
                if (!this.subtopics.contains(str)) {
                    this.subtopics.add(str);
                    this.tmpArgs.add(str);
                }
                if (i2 >= length) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        if (this.tmpArgs.size() > 0) {
            f("/bus/subscribe", this.tmpArgs);
        }
    }

    public final void D(@NotNull String... topics) {
        Intrinsics.checkNotNullParameter(topics, "topics");
        this.tmpArgs.clear();
        int length = topics.length;
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                String str = topics[i];
                if (this.subtopics.contains(str)) {
                    this.subtopics.remove(str);
                    this.tmpArgs.add(str);
                }
                if (i2 >= length) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        if (this.tmpArgs.size() > 0) {
            f("/bus/unsubscribe", this.tmpArgs);
        }
    }

    @Nullable
    public final c d(@NotNull final n8c multipart) {
        Intrinsics.checkNotNullParameter(multipart, "multipart");
        if (!this.mRunning) {
            n();
            return new c(null, "bus client is not running");
        }
        if (Intrinsics.areEqual(this.mThread, Thread.currentThread())) {
            n8c n8cVarG = ka2.INSTANCE.g(this, multipart);
            if (n8cVarG == null) {
                return null;
            }
            return new c(n8cVarG.d(1), n8cVarG.e(2));
        }
        FutureTask futureTask = new FutureTask(new Callable() { // from class: com.oplus.aiunit.vision.s92
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u92.h(this.i, multipart);
            }
        });
        B(this, futureTask, 0L, null, 4, null);
        try {
            return (c) futureTask.get();
        } catch (Exception e2) {
            return new c(null, Intrinsics.stringPlus("timer future get error: ", e2.getMessage()));
        }
    }

    @Nullable
    public final c e(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return d(new n8c().b("request").b(url));
    }

    @Nullable
    public final c f(@NotNull String url, @NotNull List<String> args) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(args, "args");
        return d(new n8c().b("request").b(url).a(args));
    }

    @Nullable
    public final c g(@NotNull String url, @NotNull String... args) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(args, "args");
        return d(new n8c().b("request").b(url).b((String[]) Arrays.copyOf(args, args.length)));
    }

    public final void i() {
        t7b.INSTANCE.d(TAG, "delete...");
        this.mRunning = false;
        this.subtopics.clear();
        this.tmpArgs.clear();
        this.timerItems.clear();
        this.timerInc = 0L;
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
        this.timer = null;
    }

    public void j(@NotNull PrintWriter pw) {
        String message;
        Intrinsics.checkNotNullParameter(pw, "pw");
        pw.println("Dump Of Client " + this.name + ':');
        pw.println(Intrinsics.stringPlus("running: ", Boolean.valueOf(this.mRunning)));
        Exception exc = this.runningException;
        if (exc == null) {
            message = "null";
        } else {
            Intrinsics.checkNotNull(exc);
            message = exc.getMessage();
        }
        pw.println(Intrinsics.stringPlus("runningErr: ", message));
        pw.println(Intrinsics.stringPlus("subscribed Topics: ", new ArrayList(this.subtopics)));
        pw.println();
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final fa2 getHandler() {
        return this.handler;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final synchronized void m(long timerId) {
        this.timerItems.remove(Long.valueOf(timerId));
    }

    public final void n() {
        try {
            throw new Exception(" name is " + this.name + ", bus client is not running");
        } catch (Exception e2) {
            e2.printStackTrace();
            t7b.INSTANCE.d(TAG, e2.getMessage());
        }
    }

    @Nullable
    public final n8c o(@NotNull n8c data) {
        String strE;
        Intrinsics.checkNotNullParameter(data, "data");
        if (!this.mRunning) {
            n();
            return null;
        }
        if (data.f() > 0 && (strE = data.e(0)) != null) {
            int iHashCode = strE.hashCode();
            if (iHashCode == -340323263) {
                strE.equals(AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE);
            } else if (iHashCode != -235365105) {
                if (iHashCode == 1095692943 && strE.equals("request")) {
                    return q(data);
                }
            } else if (strE.equals("publish")) {
                p(data);
            }
        }
        return null;
    }

    public final void p(n8c data) throws Exception {
        if (this.handler != null) {
            String strE = data.e(1);
            if (strE == null || !this.subtopics.contains(strE)) {
                t7b.INSTANCE.b(TAG, this.name + "\tdiscard unsubscribe topic: " + ((Object) strE));
                return;
            }
            if (data.f() > 2) {
                fa2 fa2Var = this.handler;
                byte[][] bArrG = data.g(2, data.f());
                fa2Var.a(strE, (byte[][]) Arrays.copyOf(bArrG, bArrG.length));
            } else {
                fa2 fa2Var2 = this.handler;
                byte[] bytes = "".getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                fa2Var2.a(strE, bytes);
            }
        }
    }

    public final n8c q(n8c data) throws Exception {
        c cVarB;
        String strE = data.e(1);
        c cVar = null;
        if (strE != null) {
            if (data.f() > 2) {
                fa2 handler = getHandler();
                if (handler != null) {
                    byte[][] bArrG = data.g(2, data.f());
                    cVarB = handler.b(strE, (byte[][]) Arrays.copyOf(bArrG, bArrG.length));
                    cVar = cVarB;
                }
            } else {
                fa2 handler2 = getHandler();
                if (handler2 != null) {
                    byte[] bytes = "".getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                    cVarB = handler2.b(strE, bytes);
                    cVar = cVarB;
                }
            }
        }
        if (cVar == null || (cVar.getResult() == null && cVar.getError() == null)) {
            return new n8c().b(AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE);
        }
        if (cVar.getResult() != null && cVar.getError() == null) {
            n8c n8cVarB = new n8c().b(AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE);
            byte[] result = cVar.getResult();
            Intrinsics.checkNotNull(result);
            return n8cVarB.c(result);
        }
        n8c n8cVarB2 = new n8c().b(AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE);
        byte[][] bArr = new byte[1][];
        byte[] result2 = cVar.getResult();
        if (result2 == null) {
            result2 = "".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(result2, "(this as java.lang.String).getBytes(charset)");
        }
        bArr[0] = result2;
        n8c n8cVarC = n8cVarB2.c(bArr);
        String[] strArr = new String[1];
        String error = cVar.getError();
        strArr[0] = error != null ? error : "";
        return n8cVarC.b(strArr);
    }

    public final void r(@NotNull String topic) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        x(this, new n8c().b("publish").b(topic), false, 2, null);
    }

    public final void s(@NotNull String topic, boolean logout, @NotNull String... parts) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(parts, "parts");
        w(new n8c().b("publish").b(topic).b((String[]) Arrays.copyOf(parts, parts.length)), logout);
    }

    public final void t(@NotNull String topic, boolean logout, @NotNull byte[]... parts) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(parts, "parts");
        w(new n8c().b("publish").b(topic).c((byte[][]) Arrays.copyOf(parts, parts.length)), logout);
    }

    public final void u(@NotNull String topic, @NotNull String... parts) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(parts, "parts");
        x(this, new n8c().b("publish").b(topic).b((String[]) Arrays.copyOf(parts, parts.length)), false, 2, null);
    }

    public final void v(@NotNull String topic, @NotNull byte[]... parts) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(parts, "parts");
        x(this, new n8c().b("publish").b(topic).c((byte[][]) Arrays.copyOf(parts, parts.length)), false, 2, null);
    }

    public final boolean w(@NotNull final n8c multipart, final boolean logout) {
        Intrinsics.checkNotNullParameter(multipart, "multipart");
        if (!this.mRunning) {
            n();
            return false;
        }
        if (!Intrinsics.areEqual(this.mThread, Thread.currentThread())) {
            B(this, new Runnable() { // from class: com.oplus.aiunit.vision.t92
                @Override // java.lang.Runnable
                public final void run() {
                    u92.y(this.i, multipart, logout);
                }
            }, 0L, null, 4, null);
            return true;
        }
        if (logout) {
            p8c.INSTANCE.a(this.name, "publish send", multipart);
        }
        ka2.INSTANCE.g(this, multipart);
        return true;
    }

    public boolean z(@NotNull String topic) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        return x(this, new n8c().b("removesticky").b(topic), false, 2, null);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u000eR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u0003\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/u92$c;", "", "", "a", "[B", "b", "()[B", "setResult", "([B)V", "result", "", "Ljava/lang/String;", "()Ljava/lang/String;", "setError", "(Ljava/lang/String;)V", "error", "c", "stringResult", "r", MapSchema.FIELD_NAME_ENTRY, "<init>", "([BLjava/lang/String;)V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
    public static final class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public byte[] result;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public String error;

        public c(@Nullable byte[] bArr, @Nullable String str) {
            this.result = bArr;
            this.error = str;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getError() {
            return this.error;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final byte[] getResult() {
            return this.result;
        }

        @NotNull
        public final String c() {
            byte[] bArr = this.result;
            if (bArr != null) {
                Intrinsics.checkNotNull(bArr);
                if (!(bArr.length == 0)) {
                    byte[] bArr2 = this.result;
                    Intrinsics.checkNotNull(bArr2);
                    return new String(bArr2, Charsets.UTF_8);
                }
            }
            return "";
        }

        public c(@NotNull String r) {
            Intrinsics.checkNotNullParameter(r, "r");
            byte[] bytes = r.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            this.result = bytes;
        }
    }
}
