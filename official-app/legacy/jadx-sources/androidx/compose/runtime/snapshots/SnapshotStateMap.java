package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.a8i;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import com.oplus.smartenginehelper.ParserTag;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.codec.language.bm.Languages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.InlineMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u00020\u0004:\u0001LB\u0005¢\u0006\u0002\u0010\u0005J1\u0010&\u001a\u00020'2\u001e\u0010(\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*\u0012\u0004\u0012\u00020'0)H\u0080\bø\u0001\u0000¢\u0006\u0002\b+J1\u0010,\u001a\u00020'2\u001e\u0010(\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*\u0012\u0004\u0012\u00020'0)H\u0080\bø\u0001\u0000¢\u0006\u0002\b-J\b\u0010.\u001a\u00020/H\u0016J\u0015\u00100\u001a\u00020'2\u0006\u00101\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00102J\u0015\u00103\u001a\u00020'2\u0006\u00104\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00102J\u0018\u00105\u001a\u0004\u0018\u00018\u00012\u0006\u00101\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u00106J\b\u00107\u001a\u00020'H\u0016J4\u00108\u001a\u0002H9\"\u0004\b\u0002\u001092\u001e\u0010:\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0004\u0012\u0002H90)H\u0082\b¢\u0006\u0002\u0010;J\u0010\u0010<\u001a\u00020/2\u0006\u00104\u001a\u00020\u0011H\u0016J\u001f\u0010=\u001a\u0004\u0018\u00018\u00012\u0006\u00101\u001a\u00028\u00002\u0006\u00104\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010>J\u001e\u0010?\u001a\u00020/2\u0014\u0010@\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\u0017\u0010A\u001a\u0004\u0018\u00018\u00012\u0006\u00101\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00106J1\u0010B\u001a\u00020'2\u001e\u0010(\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u0012\u0004\u0012\u00020'0)H\u0080\bø\u0001\u0000¢\u0006\u0002\bCJ\u0017\u0010D\u001a\u00020'2\u0006\u00104\u001a\u00028\u0001H\u0000¢\u0006\u0004\bE\u00102J\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007J5\u0010G\u001a\u00020/2*\u0010:\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010H\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010H0)H\u0082\bJ9\u0010I\u001a\u0002H9\"\u0004\b\u0002\u001092#\u0010:\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c\u0012\u0004\u0012\u0002H90)¢\u0006\u0002\bJH\u0082\b¢\u0006\u0002\u0010;J9\u0010K\u001a\u0002H9\"\u0004\b\u0002\u001092#\u0010:\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c\u0012\u0004\u0012\u0002H90)¢\u0006\u0002\bJH\u0082\b¢\u0006\u0002\u0010;R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078AX\u0080\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r0\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c8@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0005\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001aR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006M"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "Landroidx/compose/runtime/snapshots/StateObject;", "()V", "debuggerDisplayValue", "", "getDebuggerDisplayValue$annotations", "getDebuggerDisplayValue", "()Ljava/util/Map;", "entries", "", "", "getEntries", "()Ljava/util/Set;", "<set-?>", "Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "keys", "getKeys", "modification", "", "getModification$runtime_release", "()I", "readable", "Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "getReadable$runtime_release$annotations", "getReadable$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "size", "getSize", "values", "", "getValues", "()Ljava/util/Collection;", "all", "", "predicate", "Lkotlin/Function1;", "", "all$runtime_release", Languages.ANY, "any$runtime_release", "clear", "", "containsKey", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", ParserTag.TAG_GET, "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "mutate", "R", "block", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "prependStateRecord", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", EventType.STATE_PACKAGE_CHANGED_REMOVE, "removeIf", "removeIf$runtime_release", "removeValue", "removeValue$runtime_release", "toMap", a8i.UPDATE, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "withCurrent", "Lkotlin/ExtensionFunctionType;", "writable", "StateMapStateRecord", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n154#1:361\n121#1:362\n155#1,2:364\n157#1:367\n125#1:368\n158#1,2:374\n162#1:379\n129#1,4:380\n133#1:385\n121#1:386\n134#1,8:388\n125#1:396\n142#1,5:402\n149#1,3:410\n129#1,4:413\n133#1:418\n121#1:419\n134#1,8:421\n125#1:429\n142#1,5:435\n149#1,3:443\n129#1,4:446\n133#1:451\n121#1:452\n134#1,8:454\n125#1:462\n142#1,5:468\n149#1,3:476\n129#1,4:482\n133#1:487\n121#1:488\n134#1,8:490\n125#1:498\n142#1,5:504\n149#1,3:512\n121#1:515\n121#1:528\n125#1:531\n121#1:541\n125#1:544\n2180#2:363\n2073#2,2:369\n1686#2:371\n2075#2,2:372\n2077#2,3:376\n2180#2:387\n2073#2,2:397\n1686#2:399\n2075#2,2:400\n2077#2,3:407\n2180#2:420\n2073#2,2:430\n1686#2:432\n2075#2,2:433\n2077#2,3:440\n2180#2:453\n2073#2,2:463\n1686#2:465\n2075#2,2:466\n2077#2,3:473\n2180#2:489\n2073#2,2:499\n1686#2:501\n2075#2,2:502\n2077#2,3:509\n2180#2:516\n2180#2:517\n2073#2,2:518\n1686#2:520\n2075#2,5:522\n2180#2:529\n2073#2,2:532\n1686#2:534\n2075#2,5:536\n2180#2:542\n2073#2,2:545\n1686#2:547\n2075#2,5:549\n70#3:366\n70#3:384\n70#3:417\n70#3:450\n70#3:486\n70#3:521\n70#3:527\n70#3:530\n70#3:535\n70#3:543\n70#3:548\n288#4,2:479\n1#5:481\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n*L\n69#1:361\n69#1:362\n69#1:364,2\n69#1:367\n69#1:368\n69#1:374,2\n69#1:379\n70#1:380,4\n70#1:385\n70#1:386\n70#1:388,8\n70#1:396\n70#1:402,5\n70#1:410,3\n71#1:413,4\n71#1:418\n71#1:419\n71#1:421,8\n71#1:429\n71#1:435,5\n71#1:443,3\n72#1:446,4\n72#1:451\n72#1:452\n72#1:454,8\n72#1:462\n72#1:468,5\n72#1:476,3\n85#1:482,4\n85#1:487\n85#1:488\n85#1:490,8\n85#1:498\n85#1:504,5\n85#1:512,3\n117#1:515\n133#1:528\n141#1:531\n154#1:541\n157#1:544\n69#1:363\n69#1:369,2\n69#1:371\n69#1:372,2\n69#1:376,3\n70#1:387\n70#1:397,2\n70#1:399\n70#1:400,2\n70#1:407,3\n71#1:420\n71#1:430,2\n71#1:432\n71#1:433,2\n71#1:440,3\n72#1:453\n72#1:463,2\n72#1:465\n72#1:466,2\n72#1:473,3\n85#1:489\n85#1:499,2\n85#1:501\n85#1:502,2\n85#1:509,3\n117#1:516\n121#1:517\n125#1:518,2\n125#1:520\n125#1:522,5\n133#1:529\n141#1:532,2\n141#1:534\n141#1:536,5\n154#1:542\n157#1:545,2\n157#1:547\n157#1:549,5\n69#1:366\n70#1:384\n71#1:417\n72#1:450\n85#1:486\n125#1:521\n132#1:527\n140#1:530\n141#1:535\n156#1:543\n157#1:548\n77#1:479,2\n*E\n"})
public final class SnapshotStateMap<K, V> implements Map<K, V>, StateObject, KMutableMap {
    public static final int $stable = 0;

    @NotNull
    private StateRecord firstStateRecord = new StateMapStateRecord(ExtensionsKt.persistentHashMapOf());

    @NotNull
    private final Set<Map.Entry<K, V>> entries = new SnapshotMapEntrySet(this);

    @NotNull
    private final Set<K> keys = new SnapshotMapKeySet(this);

    @NotNull
    private final Collection<V> values = new SnapshotMapValueSet(this);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\b\u0000\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u001a\u0010\n\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/snapshots/StateRecord;", "map", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "getMap$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "setMap$runtime_release", "modification", "", "getModification$runtime_release", "()I", "setModification$runtime_release", "(I)V", "assign", "", "value", "create", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,360:1\n70#2:361\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n*L\n174#1:361\n*E\n"})
    public static final class StateMapStateRecord<K, V> extends StateRecord {

        @NotNull
        private PersistentMap<K, ? extends V> map;
        private int modification;

        public StateMapStateRecord(@NotNull PersistentMap<K, ? extends V> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.map = map;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@NotNull StateRecord value) {
            Intrinsics.checkNotNullParameter(value, "value");
            StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) value;
            synchronized (SnapshotStateMapKt.sync) {
                this.map = stateMapStateRecord.map;
                this.modification = stateMapStateRecord.modification;
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create() {
            return new StateMapStateRecord(this.map);
        }

        @NotNull
        public final PersistentMap<K, V> getMap$runtime_release() {
            return this.map;
        }

        /* JADX INFO: renamed from: getModification$runtime_release, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        public final void setMap$runtime_release(@NotNull PersistentMap<K, ? extends V> persistentMap) {
            Intrinsics.checkNotNullParameter(persistentMap, "<set-?>");
            this.map = persistentMap;
        }

        public final void setModification$runtime_release(int i) {
            this.modification = i;
        }
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    private final <R> R mutate(Function1<? super Map<K, V>, ? extends R> block) {
        PersistentMap<K, V> map$runtime_release;
        int modification;
        R rInvoke;
        Snapshot current;
        boolean z;
        do {
            synchronized (SnapshotStateMapKt.sync) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                    map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                    modification = stateMapStateRecord.getModification();
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                } catch (Throwable th) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            InlineMarker.finallyEnd(1);
            Intrinsics.checkNotNull(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            rInvoke = block.invoke(builder);
            PersistentMap<K, V> persistentMapBuild = builder.build();
            if (Intrinsics.areEqual(persistentMapBuild, map$runtime_release)) {
                break;
            }
            synchronized (SnapshotStateMapKt.sync) {
                try {
                    StateRecord firstStateRecord2 = getFirstStateRecord();
                    Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
                    SnapshotKt.getSnapshotInitializer();
                    synchronized (SnapshotKt.getLock()) {
                        try {
                            current = Snapshot.INSTANCE.getCurrent();
                            StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                            if (stateMapStateRecord3.getModification() == modification) {
                                stateMapStateRecord3.setMap$runtime_release(persistentMapBuild);
                                stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
                                z = true;
                            } else {
                                z = false;
                            }
                            InlineMarker.finallyStart(1);
                        } catch (Throwable th2) {
                            InlineMarker.finallyStart(1);
                            InlineMarker.finallyEnd(1);
                            throw th2;
                        }
                    }
                    InlineMarker.finallyEnd(1);
                    SnapshotKt.notifyWrite(current, this);
                    InlineMarker.finallyStart(1);
                } catch (Throwable th3) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th3;
                }
            }
            InlineMarker.finallyEnd(1);
        } while (!z);
        return rInvoke;
    }

    private final void update(Function1<? super PersistentMap<K, ? extends V>, ? extends PersistentMap<K, ? extends V>> block) {
        Snapshot current;
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
        PersistentMap<K, ? extends V> persistentMapInvoke = block.invoke(stateMapStateRecord.getMap$runtime_release());
        if (persistentMapInvoke != stateMapStateRecord.getMap$runtime_release()) {
            synchronized (SnapshotStateMapKt.sync) {
                try {
                    StateRecord firstStateRecord2 = getFirstStateRecord();
                    Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
                    SnapshotKt.getSnapshotInitializer();
                    synchronized (SnapshotKt.getLock()) {
                        try {
                            current = Snapshot.INSTANCE.getCurrent();
                            StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                            stateMapStateRecord3.setMap$runtime_release(persistentMapInvoke);
                            stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
                            InlineMarker.finallyStart(1);
                        } finally {
                            InlineMarker.finallyStart(1);
                            InlineMarker.finallyEnd(1);
                        }
                    }
                    InlineMarker.finallyEnd(1);
                    SnapshotKt.notifyWrite(current, this);
                    InlineMarker.finallyStart(1);
                } catch (Throwable th) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
        }
    }

    private final <R> R withCurrent(Function1<? super StateMapStateRecord<K, V>, ? extends R> block) {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return block.invoke(SnapshotKt.current((StateMapStateRecord) firstStateRecord));
    }

    private final <R> R writable(Function1<? super StateMapStateRecord<K, V>, ? extends R> block) {
        Snapshot current;
        R rInvoke;
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) firstStateRecord;
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            try {
                current = Snapshot.INSTANCE.getCurrent();
                rInvoke = block.invoke(SnapshotKt.writableRecord(stateMapStateRecord, this, current));
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        SnapshotKt.notifyWrite(current, this);
        return rInvoke;
    }

    public final boolean all$runtime_release(@NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<E> it = ((ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator();
        while (it.hasNext()) {
            if (!predicate.invoke((Map.Entry) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean any$runtime_release(@NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<E> it = ((ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator();
        while (it.hasNext()) {
            if (predicate.invoke((Map.Entry) it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        Snapshot current;
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
        stateMapStateRecord.getMap$runtime_release();
        PersistentMap<K, V> persistentMapPersistentHashMapOf = ExtensionsKt.persistentHashMapOf();
        if (persistentMapPersistentHashMapOf != stateMapStateRecord.getMap$runtime_release()) {
            synchronized (SnapshotStateMapKt.sync) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = Snapshot.INSTANCE.getCurrent();
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                    stateMapStateRecord3.setMap$runtime_release(persistentMapPersistentHashMapOf);
                    stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
                }
                SnapshotKt.notifyWrite(current, this);
            }
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return getReadable$runtime_release().getMap$runtime_release().containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return getReadable$runtime_release().getMap$runtime_release().containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object key) {
        return getReadable$runtime_release().getMap$runtime_release().get(key);
    }

    @JvmName(name = "getDebuggerDisplayValue")
    @NotNull
    public final Map<K, V> getDebuggerDisplayValue() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return ((StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord)).getMap$runtime_release();
    }

    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return this.entries;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @NotNull
    public Set<K> getKeys() {
        return this.keys;
    }

    public final int getModification$runtime_release() {
        return getReadable$runtime_release().getModification();
    }

    @NotNull
    public final StateMapStateRecord<K, V> getReadable$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (StateMapStateRecord) SnapshotKt.readable((StateMapStateRecord) firstStateRecord, this);
    }

    public int getSize() {
        return getReadable$runtime_release().getMap$runtime_release().size();
    }

    @NotNull
    public Collection<V> getValues() {
        return this.values;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getReadable$runtime_release().getMap$runtime_release().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.firstStateRecord = (StateMapStateRecord) value;
    }

    @Override // java.util.Map
    @Nullable
    public V put(K key, V value) {
        PersistentMap<K, V> map$runtime_release;
        int modification;
        V vPut;
        Snapshot current;
        boolean z;
        do {
            synchronized (SnapshotStateMapKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification = stateMapStateRecord.getModification();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            vPut = builder.put(key, value);
            PersistentMap<K, V> persistentMapBuild = builder.build();
            if (Intrinsics.areEqual(persistentMapBuild, map$runtime_release)) {
                break;
            }
            synchronized (SnapshotStateMapKt.sync) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = Snapshot.INSTANCE.getCurrent();
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                    if (stateMapStateRecord3.getModification() == modification) {
                        stateMapStateRecord3.setMap$runtime_release(persistentMapBuild);
                        z = true;
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z);
        return vPut;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007d */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void putAll(@NotNull Map<? extends K, ? extends V> from) {
        PersistentMap<K, V> map$runtime_release;
        int modification;
        Snapshot current;
        boolean z;
        Intrinsics.checkNotNullParameter(from, "from");
        do {
            synchronized (SnapshotStateMapKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification = stateMapStateRecord.getModification();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            builder.putAll(from);
            PersistentMap<K, V> persistentMapBuild = builder.build();
            if (Intrinsics.areEqual(persistentMapBuild, map$runtime_release)) {
                return;
            }
            synchronized (SnapshotStateMapKt.sync) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    try {
                        current = Snapshot.INSTANCE.getCurrent();
                        StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                        if (stateMapStateRecord3.getModification() == modification) {
                            stateMapStateRecord3.setMap$runtime_release(persistentMapBuild);
                            z = true;
                            stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z);
    }

    @Override // java.util.Map
    @Nullable
    public V remove(Object key) {
        PersistentMap<K, V> map$runtime_release;
        int modification;
        V vRemove;
        Snapshot current;
        boolean z;
        do {
            synchronized (SnapshotStateMapKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification = stateMapStateRecord.getModification();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            vRemove = builder.remove(key);
            PersistentMap<K, V> persistentMapBuild = builder.build();
            if (Intrinsics.areEqual(persistentMapBuild, map$runtime_release)) {
                break;
            }
            synchronized (SnapshotStateMapKt.sync) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = Snapshot.INSTANCE.getCurrent();
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                    if (stateMapStateRecord3.getModification() == modification) {
                        stateMapStateRecord3.setMap$runtime_release(persistentMapBuild);
                        z = true;
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z);
        return vRemove;
    }

    public final boolean removeIf$runtime_release(@NotNull Function1<? super Map.Entry<K, V>, Boolean> predicate) {
        PersistentMap<K, V> map$runtime_release;
        int modification;
        Snapshot current;
        boolean z;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean z2 = false;
        do {
            synchronized (SnapshotStateMapKt.sync) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                    map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                    modification = stateMapStateRecord.getModification();
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                } catch (Throwable th) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            InlineMarker.finallyEnd(1);
            Intrinsics.checkNotNull(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            for (Map.Entry<K, V> entry : entrySet()) {
                if (predicate.invoke(entry).booleanValue()) {
                    builder.remove(entry.getKey());
                    z2 = true;
                }
            }
            Unit unit2 = Unit.INSTANCE;
            PersistentMap<K, V> persistentMapBuild = builder.build();
            if (Intrinsics.areEqual(persistentMapBuild, map$runtime_release)) {
                break;
            }
            synchronized (SnapshotStateMapKt.sync) {
                try {
                    StateRecord firstStateRecord2 = getFirstStateRecord();
                    Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
                    SnapshotKt.getSnapshotInitializer();
                    synchronized (SnapshotKt.getLock()) {
                        try {
                            current = Snapshot.INSTANCE.getCurrent();
                            StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                            if (stateMapStateRecord3.getModification() == modification) {
                                stateMapStateRecord3.setMap$runtime_release(persistentMapBuild);
                                stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
                                z = true;
                            } else {
                                z = false;
                            }
                            InlineMarker.finallyStart(1);
                        } catch (Throwable th2) {
                            InlineMarker.finallyStart(1);
                            InlineMarker.finallyEnd(1);
                            throw th2;
                        }
                    }
                    InlineMarker.finallyEnd(1);
                    SnapshotKt.notifyWrite(current, this);
                    InlineMarker.finallyStart(1);
                } catch (Throwable th3) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th3;
                }
            }
            InlineMarker.finallyEnd(1);
        } while (!z);
        return z2;
    }

    public final boolean removeValue$runtime_release(V value) {
        Object next;
        Iterator<T> it = entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((Map.Entry) next).getValue(), value));
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @NotNull
    public final Map<K, V> toMap() {
        return getReadable$runtime_release().getMap$runtime_release();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }
}
