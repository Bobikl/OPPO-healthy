package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\fR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u001f\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00188\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u0010\u0010\u001aR\u001f\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00188\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001f¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/x0c;", "", "", "sid", "cid", "", "data", "", "e", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "f", "", "enable", "d", "c", "a", "Z", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/oplus/aiunit/vision/i8c;", "b", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_msgSendFlow", "_msgRecvFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "msgFlow", "msgRecvFlow", "", "Lcom/oplus/aiunit/vision/z94;", "Ljava/util/List;", "msgAnalysers", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMessageWatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageWatcher.kt\ncom/oplus/wearable/linkservice/sdk/util/MessageWatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1855#2,2:63\n1855#2,2:65\n1855#2,2:67\n*S KotlinDebug\n*F\n+ 1 MessageWatcher.kt\ncom/oplus/wearable/linkservice/sdk/util/MessageWatcher\n*L\n37#1:63,2\n48#1:65,2\n55#1:67,2\n*E\n"})
public final class x0c {

    @NotNull
    public static final x0c INSTANCE = new x0c();
    public static volatile boolean a;

    @NotNull
    public static final MutableStateFlow<MsgRecord> b;

    @NotNull
    public static final MutableStateFlow<MsgRecord> c;

    @NotNull
    public static final StateFlow<MsgRecord> d;

    @NotNull
    public static final StateFlow<MsgRecord> e;

    @NotNull
    public static final List<z94> f;

    static {
        MutableStateFlow<MsgRecord> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        b = MutableStateFlow;
        MutableStateFlow<MsgRecord> MutableStateFlow2 = StateFlowKt.MutableStateFlow((Object) null);
        c = MutableStateFlow2;
        d = FlowKt.asStateFlow(MutableStateFlow);
        e = FlowKt.asStateFlow(MutableStateFlow2);
        f = CollectionsKt.listOf(new z94());
    }

    @NotNull
    public final StateFlow<MsgRecord> a() {
        return d;
    }

    @NotNull
    public final StateFlow<MsgRecord> b() {
        return e;
    }

    public final boolean c() {
        return a;
    }

    public final void d(boolean enable) {
        a = enable;
        Iterator<T> it = f.iterator();
        while (it.hasNext()) {
            ((z94) it.next()).d();
        }
    }

    public final void e(int sid, int cid, @Nullable byte[] data) {
        if (a) {
            MsgRecord msgRecord = new MsgRecord(sid, cid, System.currentTimeMillis() / ((long) 1000), data != null ? data.length : 1);
            b.setValue(msgRecord);
            Iterator<T> it = f.iterator();
            while (it.hasNext()) {
                ((z94) it.next()).c(msgRecord, true);
            }
        }
    }

    public final void f(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (a) {
            int serviceId = event.getServiceId();
            int commandId = event.getCommandId();
            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
            byte[] data = event.getData();
            MsgRecord msgRecord = new MsgRecord(serviceId, commandId, jCurrentTimeMillis, data != null ? data.length : 1);
            c.setValue(msgRecord);
            Iterator<T> it = f.iterator();
            while (it.hasNext()) {
                ((z94) it.next()).c(msgRecord, false);
            }
        }
    }
}
