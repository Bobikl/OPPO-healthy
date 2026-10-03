package com.heytap.health.operation.medal.check;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.operation.medal.MedalUploadSaveManager;
import com.heytap.health.operation.medal.bean.MedalAllListBean;
import com.heytap.health.operation.medal.bean.MedalUploadBean;
import com.heytap.health.operation.medal.core.Utils;
import com.heytap.health.operations.bean.MedalListBean;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.oqb;
import com.oplus.aiunit.vision.z7b;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.sequences.Sequence;
import p010kotlin.sequences.SequencesKt__SequencesKt;
import p010kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0004J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H&J+\u0010\t\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u0013\u0010\u0010\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\nJ\b\u0010\u0011\u001a\u00020\u000bH\u0016R\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/operation/medal/check/IMedalCheck;", "", "", "Lcom/heytap/health/operations/bean/MedalListBean;", b2n.f, "", "b", "Lkotlin/Pair;", "Lcom/heytap/health/operation/medal/bean/MedalUploadBean;", MapSchema.FIELD_NAME_ENTRY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "result", "medalBean", "", "a", "c", "f", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "tag", "Ljava/util/List;", "unGetMedals", "Lcom/heytap/health/operation/medal/bean/MedalAllListBean;", "lastMedalAllList", "<init>", "()V", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIMedalCheck.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IMedalCheck.kt\ncom/heytap/health/operation/medal/check/IMedalCheck\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n766#2:74\n857#2:75\n858#2:77\n2634#2:78\n1#3:76\n1#3:79\n*S KotlinDebug\n*F\n+ 1 IMedalCheck.kt\ncom/heytap/health/operation/medal/check/IMedalCheck\n*L\n55#1:74\n55#1:75\n55#1:77\n55#1:78\n55#1:79\n*E\n"})
public abstract class IMedalCheck {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String tag = "medal_check_" + getClass().getSimpleName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public List<? extends MedalListBean> unGetMedals;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public List<? extends MedalAllListBean> lastMedalAllList;

    public boolean a(double result, @NotNull MedalListBean medalBean) {
        Intrinsics.checkNotNullParameter(medalBean, "medalBean");
        String target = medalBean.getTarget();
        Intrinsics.checkNotNullExpressionValue(target, "medalBean.target");
        return result >= Double.parseDouble(target) * f();
    }

    @NotNull
    public abstract List<String> b();

    @Nullable
    public abstract Object c(@NotNull Continuation<? super Double> continuation);

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x014f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object e(@NotNull Continuation<? super Pair<? extends List<? extends MedalUploadBean>, ? extends List<? extends MedalListBean>>> continuation) {
        IMedalCheck$medalCheck$1 iMedalCheck$medalCheck$1;
        Pair pair;
        Object objC;
        Exception e2;
        boolean z;
        if (continuation instanceof IMedalCheck$medalCheck$1) {
            iMedalCheck$medalCheck$1 = (IMedalCheck$medalCheck$1) continuation;
            int i = iMedalCheck$medalCheck$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iMedalCheck$medalCheck$1.label = i - Integer.MIN_VALUE;
            } else {
                iMedalCheck$medalCheck$1 = new IMedalCheck$medalCheck$1(this, continuation);
            }
        } else {
            iMedalCheck$medalCheck$1 = new IMedalCheck$medalCheck$1(this, continuation);
        }
        Object obj = iMedalCheck$medalCheck$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = iMedalCheck$medalCheck$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            pair = TuplesKt.to(new ArrayList(), new ArrayList());
            List<MedalListBean> listG = g();
            if (listG == null || listG.isEmpty()) {
                oqb.c(" > " + this.tag + " > medalCheck error medals is null");
                return pair;
            }
            try {
                oqb.a(" > " + this.tag + " > medalCheck  " + b());
                iMedalCheck$medalCheck$1.L$0 = this;
                iMedalCheck$medalCheck$1.L$1 = pair;
                iMedalCheck$medalCheck$1.label = 1;
                objC = c(iMedalCheck$medalCheck$1);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e3) {
                e2 = e3;
                oqb.b(" > " + this.tag + " > medalCheck error  " + e2.getStackTrace());
                oqb.a(" > " + this.tag + " > medalCheck error  " + e2.getMessage());
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Pair pair2 = (Pair) iMedalCheck$medalCheck$1.L$1;
            IMedalCheck iMedalCheck = (IMedalCheck) iMedalCheck$medalCheck$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                pair = pair2;
                this = iMedalCheck;
                objC = obj;
            } catch (Exception e4) {
                e2 = e4;
                pair = pair2;
                this = iMedalCheck;
                oqb.b(" > " + this.tag + " > medalCheck error  " + e2.getStackTrace());
                oqb.a(" > " + this.tag + " > medalCheck error  " + e2.getMessage());
            }
        }
        double dDoubleValue = ((Number) objC).doubleValue();
        oqb.b(" > " + this.tag + " > fetchData result  " + dDoubleValue);
        z7b.f("DFJ.MedalSecret", " > " + this.tag + " > fetchData result  " + dDoubleValue);
        List<MedalListBean> listG2 = this.g();
        if (listG2 != null) {
            ArrayList<MedalListBean> arrayList = new ArrayList();
            for (Object obj2 : listG2) {
                MedalListBean medalListBean = (MedalListBean) obj2;
                if (medalListBean.isGet()) {
                    z = false;
                } else {
                    oqb.a(" > " + this.tag + " > now medalCheck " + medalListBean.getCode());
                    Unit unit = Unit.INSTANCE;
                    if (this.a(dDoubleValue, medalListBean)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    arrayList.add(obj2);
                }
            }
            for (MedalListBean medalListBean2 : arrayList) {
                medalListBean2.setGetResult(1);
                oqb.a(" > " + this.tag + " > get medal " + this);
                List list = (List) pair.getFirst();
                MedalUploadBean medalUploadBeanH = Utils.h(medalListBean2, String.valueOf(dDoubleValue), 1, 0);
                Intrinsics.checkNotNullExpressionValue(medalUploadBeanH, "getUpdataInfo(it, result…EDAL, MedalUtils.FLAGAPP)");
                list.add(medalUploadBeanH);
                ((List) pair.getSecond()).add(medalListBean2);
            }
        }
        return pair;
    }

    public double f() {
        return 1.0d;
    }

    @Nullable
    public final List<MedalListBean> g() {
        Sequence sequenceAsSequence;
        Sequence map;
        Sequence sequenceFlattenSequenceOfIterable;
        Sequence sequenceFilter;
        if (this.lastMedalAllList != MedalUploadSaveManager.r().s()) {
            List<MedalAllListBean> listS = MedalUploadSaveManager.r().s();
            this.lastMedalAllList = listS;
            this.unGetMedals = (listS == null || (sequenceAsSequence = CollectionsKt___CollectionsKt.asSequence(listS)) == null || (map = SequencesKt___SequencesKt.map(sequenceAsSequence, new Function1<MedalAllListBean, List<MedalListBean>>() { // from class: com.heytap.health.operation.medal.check.IMedalCheck$unGetStepMedals$1
                @Override // p010kotlin.jvm.functions.Function1
                public final List<MedalListBean> invoke(@NotNull MedalAllListBean it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getMedalList();
                }
            })) == null || (sequenceFlattenSequenceOfIterable = SequencesKt__SequencesKt.flattenSequenceOfIterable(map)) == null || (sequenceFilter = SequencesKt___SequencesKt.filter(sequenceFlattenSequenceOfIterable, new Function1<MedalListBean, Boolean>() { // from class: com.heytap.health.operation.medal.check.IMedalCheck$unGetStepMedals$2
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(MedalListBean medalListBean) {
                    return Boolean.valueOf(!medalListBean.isGet() && this.this$0.b().contains(medalListBean.getTypeCode()));
                }
            })) == null) ? null : SequencesKt___SequencesKt.toList(sequenceFilter);
        }
        return this.unGetMedals;
    }
}
