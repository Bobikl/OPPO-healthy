package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\b\u0012\u0004\u0012\u00020\u00020\tH\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/z94;", "", "Lcom/oplus/aiunit/vision/i8c;", "msgRecord", "", "send", "", "c", "d", "", "Lcom/oplus/aiunit/vision/k8c;", "e", "", "a", "J", ClickApiEntity.DELAY, "", "b", "Ljava/util/List;", "sendedMsgs", "recvMsgs", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "<init>", "()V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMsgAnalyzer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MsgAnalyzer.kt\ncom/oplus/wearable/linkservice/sdk/util/ContinuousMsgAnalyzer\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n988#2:130\n1017#2,3:131\n1020#2,3:141\n603#2:154\n372#3,7:134\n125#4:144\n152#4,2:145\n154#4:150\n1789#5,3:147\n1789#5,3:151\n766#5:155\n857#5,2:156\n1045#5:158\n1855#5,2:159\n766#5:161\n857#5,2:162\n1045#5:164\n1855#5,2:165\n*S KotlinDebug\n*F\n+ 1 MsgAnalyzer.kt\ncom/oplus/wearable/linkservice/sdk/util/ContinuousMsgAnalyzer\n*L\n116#1:130\n116#1:131,3\n116#1:141,3\n62#1:154\n116#1:134,7\n118#1:144\n118#1:145,2\n118#1:150\n120#1:147,3\n56#1:151,3\n75#1:155\n75#1:156,2\n75#1:158\n75#1:159,2\n80#1:161\n80#1:162,2\n80#1:164\n80#1:165,2\n*E\n"})
public final class z94 {
    public final long a = 5000;

    @NotNull
    public final List<MsgRecord> b = new ArrayList();

    @NotNull
    public final List<MsgRecord> c = new ArrayList();

    @NotNull
    public final Handler d;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 MsgAnalyzer.kt\ncom/oplus/wearable/linkservice/sdk/util/ContinuousMsgAnalyzer\n*L\n1#1,328:1\n62#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Long.valueOf(((MsgRecord) t).getTime()), Long.valueOf(((MsgRecord) t2).getTime()));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 MsgAnalyzer.kt\ncom/oplus/wearable/linkservice/sdk/util/ContinuousMsgAnalyzer\n*L\n1#1,328:1\n75#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            MsgStatic msgStatic = (MsgStatic) t;
            MsgStatic msgStatic2 = (MsgStatic) t2;
            return ComparisonsKt.compareValues(Integer.valueOf((msgStatic.getMsgSize() * 10000) + msgStatic.getDataLength()), Integer.valueOf((msgStatic2.getMsgSize() * 10000) + msgStatic2.getDataLength()));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 MsgAnalyzer.kt\ncom/oplus/wearable/linkservice/sdk/util/ContinuousMsgAnalyzer\n*L\n1#1,328:1\n80#2:329\n*E\n"})
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            MsgStatic msgStatic = (MsgStatic) t;
            MsgStatic msgStatic2 = (MsgStatic) t2;
            return ComparisonsKt.compareValues(Integer.valueOf((msgStatic.getMsgSize() * 10000) + msgStatic.getDataLength()), Integer.valueOf((msgStatic2.getMsgSize() * 10000) + msgStatic2.getDataLength()));
        }
    }

    public z94() {
        HandlerThread handlerThread = new HandlerThread("ContinuousMsgAnalyzer");
        handlerThread.start();
        this.d = new Handler(handlerThread.getLooper(), new Handler.Callback() { // from class: com.oplus.aiunit.vision.y94
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return z94.b(this.i, message);
            }
        });
    }

    public static final boolean b(z94 z94Var, Message message) {
        Intrinsics.checkNotNullParameter(z94Var, "this$0");
        Intrinsics.checkNotNullParameter(message, "it");
        try {
            Iterator<T> it = z94Var.b.iterator();
            int dataLength = 0;
            while (it.hasNext()) {
                dataLength += ((MsgRecord) it.next()).getDataLength();
            }
            if (z94Var.b.size() < 2) {
                m8b.m("MessageWatcher", " ContinuousMsgAnalyzer all send msg[size:" + z94Var.b.size() + "] send finished > totalSize:" + dataLength + " ");
            } else {
                List list = SequencesKt.toList(SequencesKt.sortedWith(CollectionsKt.asSequence(z94Var.b), new a()));
                long time = ((MsgRecord) CollectionsKt.last(list)).getTime() - ((MsgRecord) list.get(0)).getTime();
                float fRoundToInt = MathKt.roundToInt((dataLength / RangesKt.coerceAtLeast(time, 1L)) * 100) / 100.0f;
                m8b.m("MessageWatcher", StringsKt.trimIndent("\n                        ContinuousMsgAnalyzer all send msg[size:" + z94Var.b.size() + "] send finished >  totalSize:" + dataLength + " time:" + time + "s speed:" + fRoundToInt + " b/s\n                    "));
                m8b.m("MessageWatcher", "ContinuousMsgAnalyzer send detail ");
                List<MsgStatic> listE = z94Var.e(z94Var.b);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listE) {
                    if (((MsgStatic) obj).getMsgSize() > 0) {
                        arrayList.add(obj);
                    }
                }
                Iterator it2 = CollectionsKt.sortedWith(arrayList, new b()).iterator();
                while (it2.hasNext()) {
                    m8b.m("MessageWatcher", ((MsgStatic) it2.next()).toString());
                }
                m8b.m("MessageWatcher", "ContinuousMsgAnalyzer recv detail");
                List<MsgStatic> listE2 = z94Var.e(z94Var.c);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listE2) {
                    if (((MsgStatic) obj2).getMsgSize() > 0) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it3 = CollectionsKt.sortedWith(arrayList2, new c()).iterator();
                while (it3.hasNext()) {
                    m8b.m("MessageWatcher", ((MsgStatic) it3.next()).toString());
                }
            }
            z94Var.b.clear();
            z94Var.c.clear();
        } catch (Exception e) {
            m8b.b("MessageWatcher", "ContinuousMsgAnalyzer init e:" + e.getMessage());
        }
        return true;
    }

    public void c(@NotNull MsgRecord msgRecord, boolean send) {
        Intrinsics.checkNotNullParameter(msgRecord, "msgRecord");
        if (send) {
            this.b.add(msgRecord);
            m8b.f("MessageWatcher", "send " + Thread.currentThread().getId() + " > " + Thread.currentThread().getName() + " msg: " + msgRecord);
        } else {
            this.c.add(msgRecord);
            m8b.f("MessageWatcher", "recv " + Thread.currentThread().getId() + " > " + Thread.currentThread().getName() + " msg: " + msgRecord + " ");
        }
        this.d.removeCallbacksAndMessages(null);
        this.d.sendEmptyMessageDelayed(0, this.a);
    }

    public void d() {
        this.b.clear();
        this.c.clear();
        this.d.removeCallbacksAndMessages(null);
    }

    public final List<MsgStatic> e(List<MsgRecord> list) {
        Sequence sequenceAsSequence = CollectionsKt.asSequence(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceAsSequence) {
            MsgRecord msgRecord = (MsgRecord) obj;
            MsgStatic msgStatic = new MsgStatic(msgRecord.getSid(), msgRecord.getCid(), 0, 0, 12, null);
            Object arrayList = linkedHashMap.get(msgStatic);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(msgStatic, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int size = ((List) entry.getValue()).size();
            Iterator it = ((Iterable) entry.getValue()).iterator();
            int dataLength = 0;
            while (it.hasNext()) {
                dataLength += ((MsgRecord) it.next()).getDataLength();
            }
            MsgStatic msgStatic2 = (MsgStatic) entry.getKey();
            msgStatic2.d(size);
            msgStatic2.c(dataLength);
            arrayList2.add(msgStatic2);
        }
        return arrayList2;
    }
}
