package com.heytap.health.sport.coach;

import com.heytap.health.device_settings.setting.IDeviceSettingService;
import com.heytap.health.sport.coach.bean.SportMotive;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.rei;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.xm3;
import com.oplus.weatherservicesdk.data.Weather;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.SafeContinuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0015\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u0007\u001a&\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000\u001a)\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015\"\u0014\u0010\u001a\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015\"\u0014\u0010\u001b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015\"\u0014\u0010\u001c\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015\"\u0014\u0010\u001d\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015\"\u0014\u0010\u001e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015\" \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/heytap/health/sport/coach/bean/SportMotive;", MapSchema.FIELD_NAME_ENTRY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "motive", "", "f", "(Lcom/heytap/health/sport/coach/bean/SportMotive;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sleepRecovery", "", "a", "(I)Ljava/lang/Float;", "Lkotlin/Pair;", "b", "d", "c", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "ioScope", "INDEX_SLEEP_RECOVERY", "I", "INDEX_AMOUNT_OF_EXERCISE_RECOMMEND", "INDEX_AMOUNT_OF_EXERCISE_RECOMMEND_RANGE_MIN", "INDEX_AMOUNT_OF_EXERCISE_RECOMMEND_RANGE_MAX", "INDEX_AMOUNT_OF_EXERCISE_HEALTHY_LIFE_RECOMMEND_RANGE_MIN", "INDEX_AMOUNT_OF_EXERCISE_HEALTHY_LIFE_RECOMMEND_RANGE_MAX", "INDEX_AMOUNT_OF_EXERCISE_KEEP_PHYS_RECOMMEND_RANGE_MIN", "INDEX_AMOUNT_OF_EXERCISE_KEEP_PHYS_RECOMMEND_RANGE_MAX", "INDEX_AMOUNT_OF_EXERCISE_IMPROVE_RECOMMEND_RANGE_MIN", "INDEX_AMOUNT_OF_EXERCISE_IMPROVE_RECOMMEND_RANGE_MAX", "", "Ljava/util/List;", "source", "sport_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCoachCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoachCommon.kt\ncom/heytap/health/sport/coach/CoachCommonKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,275:1\n1#2:276\n1549#3:277\n1620#3,2:278\n1549#3:280\n1620#3,3:281\n1622#3:284\n*S KotlinDebug\n*F\n+ 1 CoachCommon.kt\ncom/heytap/health/sport/coach/CoachCommonKt\n*L\n159#1:277\n159#1:278,2\n160#1:280\n160#1:281,3\n159#1:284\n*E\n"})
public final class CoachCommonKt {
    public static final int INDEX_AMOUNT_OF_EXERCISE_HEALTHY_LIFE_RECOMMEND_RANGE_MAX = 5;
    public static final int INDEX_AMOUNT_OF_EXERCISE_HEALTHY_LIFE_RECOMMEND_RANGE_MIN = 4;
    public static final int INDEX_AMOUNT_OF_EXERCISE_IMPROVE_RECOMMEND_RANGE_MAX = 9;
    public static final int INDEX_AMOUNT_OF_EXERCISE_IMPROVE_RECOMMEND_RANGE_MIN = 8;
    public static final int INDEX_AMOUNT_OF_EXERCISE_KEEP_PHYS_RECOMMEND_RANGE_MAX = 7;
    public static final int INDEX_AMOUNT_OF_EXERCISE_KEEP_PHYS_RECOMMEND_RANGE_MIN = 6;
    public static final int INDEX_AMOUNT_OF_EXERCISE_RECOMMEND = 1;
    public static final int INDEX_AMOUNT_OF_EXERCISE_RECOMMEND_RANGE_MAX = 3;
    public static final int INDEX_AMOUNT_OF_EXERCISE_RECOMMEND_RANGE_MIN = 2;
    public static final int INDEX_SLEEP_RECOVERY = 0;

    @NotNull
    public static final CoroutineScope a = CoroutineScopeKt.CoroutineScope(new CoroutineName("CoachCommon" + Dispatchers.getIO()));

    @NotNull
    public static final List<List<Float>> b;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportMotive.values().length];
            try {
                iArr[SportMotive.HEALTHY_LIFE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportMotive.KEEP_PHYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SportMotive.IMPROVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "motive", "", "a", "(I)V"}, k = 3, mv = {1, 8, 0})
    public static final class b<T> implements xm3 {
        public final /* synthetic */ Continuation<Integer> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Continuation<? super Integer> continuation) {
            this.a = continuation;
        }

        public final void a(int i) {
            a7b.f("CoachCommon", "completed getExerciseMotive()");
            Continuation<Integer> continuation = this.a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5287constructorimpl(Integer.valueOf(i)));
        }

        @Override // com.oplus.aiunit.vision.xm3
        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c<T> implements xm3 {
        public final /* synthetic */ Continuation<Boolean> a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Continuation<? super Boolean> continuation) {
            this.a = continuation;
        }

        @Override // com.oplus.aiunit.vision.xm3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onResult(Boolean bool) {
            a7b.f("CoachCommon", "completed setExerciseMotive(" + bool + ")");
            Continuation<Boolean> continuation = this.a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5287constructorimpl(Boolean.TRUE));
        }
    }

    static {
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) "0\t0.4\t0\t2.1\t0\t1.6\t0.1\t1.7\t0.3\t2.1\n1\t0.5\t0\t2.1\t0\t1.6\t0.1\t1.7\t0.3\t2.1\n2\t0.6\t0\t2.2\t0\t1.7\t0.1\t1.8\t0.3\t2.2\n3\t0.8\t0\t2.6\t0\t2.1\t0.1\t2.2\t0.3\t2.6\n4\t0.9\t0\t2.5\t0\t2\t0.1\t2.1\t0.3\t2.5\n5\t1.1\t0.1\t2.6\t0.1\t2.1\t0.2\t2.2\t0.4\t2.6\n6\t1.2\t0.2\t2.7\t0.2\t2.2\t0.3\t2.3\t0.5\t2.7\n7\t1.3\t0.4\t2.8\t0.4\t2.3\t0.5\t2.4\t0.7\t2.8\n8\t1.5\t0.5\t2.9\t0.5\t2.4\t0.6\t2.5\t0.8\t2.9\n9\t1.6\t0.7\t3\t0.7\t2.5\t0.8\t2.6\t1\t3\n10\t1.8\t0.8\t3.1\t0.8\t2.6\t0.9\t2.7\t1.1\t3.1\n11\t1.9\t0.9\t3.2\t0.9\t2.7\t1\t2.8\t1.2\t3.2\n12\t2\t1.1\t3.3\t1.1\t2.8\t1.2\t2.9\t1.4\t3.3\n13\t2.2\t1.2\t3.4\t1.2\t2.9\t1.3\t3\t1.5\t3.4\n14\t2.3\t1.3\t3.5\t1.3\t3\t1.4\t3.1\t1.6\t3.5\n15\t2.4\t1.5\t3.6\t1.5\t3.1\t1.6\t3.2\t1.8\t3.6\n16\t2.5\t1.6\t3.7\t1.6\t3.2\t1.7\t3.3\t1.9\t3.7\n17\t2.6\t1.7\t3.8\t1.7\t3.3\t1.8\t3.4\t2\t3.8\n18\t2.8\t1.8\t3.9\t1.8\t3.4\t1.9\t3.5\t2.1\t3.9\n19\t2.9\t1.9\t4\t1.9\t3.5\t2\t3.6\t2.2\t4\n20\t3\t2\t4.1\t2\t3.6\t2.1\t3.7\t2.3\t4.1\n21\t3.1\t2.1\t4.2\t2.1\t3.7\t2.2\t3.8\t2.4\t4.2\n22\t3.2\t2.2\t4.2\t2.2\t3.7\t2.3\t3.8\t2.5\t4.2\n23\t3.3\t2.3\t4.3\t2.3\t3.8\t2.4\t3.9\t2.6\t4.3\n24\t3.4\t2.4\t4.4\t2.4\t3.9\t2.5\t4\t2.7\t4.4\n25\t3.4\t2.5\t4.5\t2.5\t4\t2.6\t4.1\t2.8\t4.5\n26\t3.5\t2.6\t4.5\t2.6\t4\t2.7\t4.1\t2.9\t4.5\n27\t3.6\t2.7\t4.6\t2.7\t4.1\t2.8\t4.2\t3\t4.6\n28\t3.7\t2.7\t4.7\t2.7\t4.2\t2.8\t4.3\t3\t4.7\n29\t3.8\t2.8\t4.7\t2.8\t4.2\t2.9\t4.3\t3.1\t4.7\n30\t3.8\t2.9\t4.8\t2.9\t4.3\t3\t4.4\t3.2\t4.8\n31\t3.9\t2.9\t4.8\t2.9\t4.3\t3\t4.4\t3.2\t4.8\n32\t4\t3\t4.9\t3\t4.4\t3.1\t4.5\t3.3\t4.9\n33\t4\t3.1\t5\t3.1\t4.5\t3.2\t4.6\t3.4\t5\n34\t4.1\t3.1\t5\t3.1\t4.5\t3.2\t4.6\t3.4\t5\n35\t4.1\t3.2\t5.1\t3.2\t4.6\t3.3\t4.7\t3.5\t5.1\n36\t4.2\t3.3\t5.2\t3.3\t4.7\t3.4\t4.8\t3.6\t5.2\n37\t4.3\t3.3\t5.2\t3.3\t4.7\t3.4\t4.8\t3.6\t5.2\n38\t4.3\t3.4\t5.3\t3.4\t4.8\t3.5\t4.9\t3.7\t5.3\n39\t4.4\t3.4\t5.3\t3.4\t4.8\t3.5\t4.9\t3.7\t5.3\n40\t4.4\t3.5\t5.4\t3.5\t4.9\t3.6\t5\t3.8\t5.4\n41\t4.5\t3.5\t5.4\t3.5\t4.9\t3.6\t5\t3.8\t5.4\n42\t4.5\t3.6\t5.5\t3.6\t5\t3.7\t5.1\t3.9\t5.5\n43\t4.6\t3.6\t5.5\t3.6\t5\t3.7\t5.1\t3.9\t5.5\n44\t4.6\t3.7\t5.6\t3.7\t5.1\t3.8\t5.2\t4\t5.6\n45\t4.6\t3.7\t5.6\t3.7\t5.1\t3.8\t5.2\t4\t5.6\n46\t4.7\t3.7\t5.6\t3.7\t5.1\t3.8\t5.2\t4\t5.6\n47\t4.7\t3.8\t5.7\t3.8\t5.2\t3.9\t5.3\t4.1\t5.7\n48\t4.8\t3.8\t5.7\t3.8\t5.2\t3.9\t5.3\t4.1\t5.7\n49\t4.8\t3.9\t5.8\t3.9\t5.3\t4\t5.4\t4.2\t5.8\n50\t4.9\t3.9\t5.8\t3.9\t5.3\t4\t5.4\t4.2\t5.8\n51\t4.9\t3.9\t5.9\t3.9\t5.4\t4\t5.5\t4.2\t5.9\n52\t5\t4\t5.9\t4\t5.4\t4.1\t5.5\t4.3\t5.9\n53\t5\t4\t5.9\t4\t5.4\t4.1\t5.5\t4.3\t5.9\n54\t5\t4.1\t6\t4.1\t5.5\t4.2\t5.6\t4.4\t6\n55\t5.1\t4.1\t6\t4.1\t5.5\t4.2\t5.6\t4.4\t6\n56\t5.1\t4.2\t6.1\t4.2\t5.6\t4.3\t5.7\t4.5\t6.1\n57\t5.2\t4.2\t6.1\t4.2\t5.6\t4.3\t5.7\t4.5\t6.1\n58\t5.2\t4.3\t6.2\t4.3\t5.7\t4.4\t5.8\t4.6\t6.2\n59\t5.3\t4.3\t6.2\t4.3\t5.7\t4.4\t5.8\t4.6\t6.2\n60\t5.3\t4.4\t6.3\t4.4\t5.8\t4.5\t5.9\t4.7\t6.3\n61\t5.4\t4.4\t6.3\t4.4\t5.8\t4.5\t5.9\t4.7\t6.3\n62\t5.4\t4.5\t6.4\t4.5\t5.9\t4.6\t6\t4.8\t6.4\n63\t5.5\t4.5\t6.4\t4.5\t5.9\t4.6\t6\t4.8\t6.4\n64\t5.5\t4.6\t6.5\t4.6\t6\t4.7\t6.1\t4.9\t6.5\n65\t5.6\t4.6\t6.5\t4.6\t6\t4.7\t6.1\t4.9\t6.5\n66\t5.6\t4.7\t6.6\t4.7\t6.1\t4.8\t6.2\t5\t6.6\n67\t5.7\t4.7\t6.7\t4.7\t6.2\t4.8\t6.3\t5\t6.7\n68\t5.8\t4.8\t6.7\t4.8\t6.2\t4.9\t6.3\t5.1\t6.7\n69\t5.8\t4.9\t6.8\t4.9\t6.3\t5\t6.4\t5.2\t6.8\n70\t5.9\t4.9\t6.9\t4.9\t6.4\t5\t6.5\t5.2\t6.9\n71\t6\t5\t7\t5\t6.5\t5.1\t6.6\t5.3\t7\n72\t6\t5.1\t7.1\t5.1\t6.6\t5.2\t6.7\t5.4\t7.1\n73\t6.1\t5.1\t7.2\t5.1\t6.7\t5.2\t6.8\t5.4\t7.2\n74\t6.2\t5.2\t7.3\t5.2\t6.8\t5.3\t6.9\t5.5\t7.3\n75\t6.3\t5.3\t7.4\t5.3\t6.9\t5.4\t7\t5.6\t7.4\n76\t6.3\t5.4\t7.5\t5.4\t7\t5.5\t7.1\t5.7\t7.5\n77\t6.4\t5.5\t7.6\t5.5\t7.1\t5.6\t7.2\t5.8\t7.6\n78\t6.5\t5.5\t7.7\t5.5\t7.2\t5.6\t7.3\t5.8\t7.7\n79\t6.6\t5.6\t7.8\t5.6\t7.3\t5.7\t7.4\t5.9\t7.8\n80\t6.7\t5.7\t7.9\t5.7\t7.4\t5.8\t7.5\t6\t7.9\n81\t6.8\t5.8\t8\t5.8\t7.5\t5.9\t7.6\t6.1\t8\n82\t6.9\t5.9\t8.1\t5.9\t7.6\t6\t7.7\t6.2\t8.1\n83\t7\t6\t8.2\t6\t7.7\t6.1\t7.8\t6.3\t8.2\n84\t7.1\t6.1\t8.3\t6.1\t7.8\t6.2\t7.9\t6.4\t8.3\n85\t7.2\t6.2\t8.4\t6.2\t7.9\t6.3\t8\t6.5\t8.4\n86\t7.3\t6.3\t8.5\t6.3\t8\t6.4\t8.1\t6.6\t8.5\n87\t7.4\t6.4\t8.6\t6.4\t8.1\t6.5\t8.2\t6.7\t8.6\n88\t7.5\t6.5\t8.7\t6.5\t8.2\t6.6\t8.3\t6.8\t8.7\n89\t7.6\t6.6\t8.8\t6.6\t8.3\t6.7\t8.4\t6.9\t8.8\n90\t7.7\t6.7\t8.9\t6.7\t8.4\t6.8\t8.5\t7\t8.9\n91\t7.8\t6.9\t9\t6.9\t8.5\t7\t8.6\t7.2\t9\n92\t7.9\t7\t9.1\t7\t8.6\t7.1\t8.7\t7.3\t9.1\n93\t8\t7.1\t9.2\t7.1\t8.7\t7.2\t8.8\t7.4\t9.2\n94\t8.1\t7.2\t9.3\t7.2\t8.8\t7.3\t8.9\t7.5\t9.3\n95\t8.3\t7.3\t9.5\t7.3\t9\t7.4\t9.1\t7.6\t9.5\n96\t8.4\t7.4\t9.6\t7.4\t9.1\t7.5\t9.2\t7.7\t9.6\n97\t8.5\t7.5\t9.7\t7.5\t9.2\t7.6\t9.3\t7.8\t9.7\n98\t8.6\t7.6\t9.8\t7.6\t9.3\t7.7\t9.4\t7.9\t9.8\n99\t8.7\t7.8\t9.9\t7.8\t9.4\t7.9\t9.5\t8.1\t9.9\n100\t8.8\t7.9\t10\t7.9\t9.5\t8\t9.6\t8.2\t10", new String[]{Weather.SEPARATOR}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{"\t"}, false, 0, 6, (Object) null);
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default2, 10));
            Iterator it2 = listSplit$default2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Float.valueOf(Float.parseFloat((String) it2.next())));
            }
            arrayList.add(arrayList2);
        }
        b = arrayList;
    }

    @Nullable
    public static final Float a(int i) {
        Object next;
        Iterator<T> it = b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual((Float) CollectionsKt___CollectionsKt.getOrNull((List) next, 0), i));
        List list = (List) next;
        if (list != null) {
            return (Float) CollectionsKt___CollectionsKt.getOrNull(list, 1);
        }
        return null;
    }

    @Nullable
    public static final Pair<Float, Float> b(int i) {
        Object next;
        Float f;
        Iterator<T> it = b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual((Float) CollectionsKt___CollectionsKt.getOrNull((List) next, 0), i));
        List list = (List) next;
        if (list == null || (f = (Float) CollectionsKt___CollectionsKt.getOrNull(list, 2)) == null) {
            return null;
        }
        Float fValueOf = Float.valueOf(f.floatValue());
        Float f2 = (Float) CollectionsKt___CollectionsKt.getOrNull(list, 3);
        if (f2 != null) {
            return new Pair<>(fValueOf, Float.valueOf(f2.floatValue()));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object c(int i, @NotNull Continuation<? super Pair<Float, Float>> continuation) {
        CoachCommonKt$getAmountOfExerciseRecommendInSportMotive$3 coachCommonKt$getAmountOfExerciseRecommendInSportMotive$3;
        if (continuation instanceof CoachCommonKt$getAmountOfExerciseRecommendInSportMotive$3) {
            coachCommonKt$getAmountOfExerciseRecommendInSportMotive$3 = (CoachCommonKt$getAmountOfExerciseRecommendInSportMotive$3) continuation;
            int i2 = coachCommonKt$getAmountOfExerciseRecommendInSportMotive$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                coachCommonKt$getAmountOfExerciseRecommendInSportMotive$3.label = i2 - Integer.MIN_VALUE;
            } else {
                coachCommonKt$getAmountOfExerciseRecommendInSportMotive$3 = new CoachCommonKt$getAmountOfExerciseRecommendInSportMotive$3(continuation);
            }
        } else {
            coachCommonKt$getAmountOfExerciseRecommendInSportMotive$3 = new CoachCommonKt$getAmountOfExerciseRecommendInSportMotive$3(continuation);
        }
        Object objE = coachCommonKt$getAmountOfExerciseRecommendInSportMotive$3.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = coachCommonKt$getAmountOfExerciseRecommendInSportMotive$3.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objE);
            coachCommonKt$getAmountOfExerciseRecommendInSportMotive$3.I$0 = i;
            coachCommonKt$getAmountOfExerciseRecommendInSportMotive$3.label = 1;
            objE = e(coachCommonKt$getAmountOfExerciseRecommendInSportMotive$3);
            if (objE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = coachCommonKt$getAmountOfExerciseRecommendInSportMotive$3.I$0;
            ResultKt.throwOnFailure(objE);
        }
        return d(i, (SportMotive) objE);
    }

    @Nullable
    public static final Pair<Float, Float> d(int i, @Nullable SportMotive sportMotive) {
        Object next;
        Pair pair;
        Float f;
        Iterator<T> it = b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual((Float) CollectionsKt___CollectionsKt.getOrNull((List) next, 0), i));
        List list = (List) next;
        if (list == null) {
            return null;
        }
        int i2 = sportMotive == null ? -1 : a.$EnumSwitchMapping$0[sportMotive.ordinal()];
        if (i2 == 1) {
            pair = TuplesKt.to(4, 5);
        } else if (i2 != 2) {
            pair = i2 != 3 ? null : TuplesKt.to(8, 9);
        } else {
            pair = TuplesKt.to(6, 7);
        }
        if (pair == null || (f = (Float) CollectionsKt___CollectionsKt.getOrNull(list, ((Number) pair.getFirst()).intValue())) == null) {
            return null;
        }
        Float fValueOf = Float.valueOf(f.floatValue());
        Float f2 = (Float) CollectionsKt___CollectionsKt.getOrNull(list, ((Number) pair.getSecond()).intValue());
        if (f2 != null) {
            return new Pair<>(fValueOf, Float.valueOf(f2.floatValue()));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object e(@NotNull Continuation<? super SportMotive> continuation) {
        CoachCommonKt$getExerciseMotive$1 coachCommonKt$getExerciseMotive$1;
        if (continuation instanceof CoachCommonKt$getExerciseMotive$1) {
            coachCommonKt$getExerciseMotive$1 = (CoachCommonKt$getExerciseMotive$1) continuation;
            int i = coachCommonKt$getExerciseMotive$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                coachCommonKt$getExerciseMotive$1.label = i - Integer.MIN_VALUE;
            } else {
                coachCommonKt$getExerciseMotive$1 = new CoachCommonKt$getExerciseMotive$1(continuation);
            }
        } else {
            coachCommonKt$getExerciseMotive$1 = new CoachCommonKt$getExerciseMotive$1(continuation);
        }
        Object orThrow = coachCommonKt$getExerciseMotive$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = coachCommonKt$getExerciseMotive$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(orThrow);
            Object objNavigation = x0.d().b("/device_settings/DeviceSettingServiceImpl").navigation();
            IDeviceSettingService iDeviceSettingService = objNavigation instanceof IDeviceSettingService ? (IDeviceSettingService) objNavigation : null;
            if (iDeviceSettingService == null) {
                return null;
            }
            a7b.f("CoachCommon", "start getExerciseMotive()");
            coachCommonKt$getExerciseMotive$1.L$0 = iDeviceSettingService;
            coachCommonKt$getExerciseMotive$1.L$1 = coachCommonKt$getExerciseMotive$1;
            coachCommonKt$getExerciseMotive$1.label = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(coachCommonKt$getExerciseMotive$1));
            iDeviceSettingService.V3(new b(safeContinuation));
            orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(coachCommonKt$getExerciseMotive$1);
            }
            if (orThrow == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(orThrow);
        }
        return rei.a(((Number) orThrow).intValue());
    }

    @Nullable
    public static final Object f(@NotNull SportMotive sportMotive, @NotNull Continuation<? super Boolean> continuation) {
        Object objNavigation = x0.d().b("/device_settings/DeviceSettingServiceImpl").navigation();
        IDeviceSettingService iDeviceSettingService = objNavigation instanceof IDeviceSettingService ? (IDeviceSettingService) objNavigation : null;
        if (iDeviceSettingService == null) {
            return Boxing.boxBoolean(false);
        }
        a7b.f("CoachCommon", "start setExerciseMotive()");
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        iDeviceSettingService.t9(sportMotive.getMotive(), new c(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
