package com.heytap.sports.course;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.sporthealth.blib.data.NetResult;
import com.oplus.aiunit.vision.KeepTransSubList;
import com.oplus.aiunit.vision.k2g;
import com.oplus.aiunit.vision.l2g;
import com.oplus.aiunit.vision.lbd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/heytap/sports/course/RunningCourseListViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "Lcom/oplus/aiunit/vision/nna;", "v", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/l2g;", "j", "Lcom/oplus/aiunit/vision/l2g;", "repository", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRunningCourseListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunningCourseListViewModel.kt\ncom/heytap/sports/course/RunningCourseListViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n766#2:58\n857#2,2:59\n*S KotlinDebug\n*F\n+ 1 RunningCourseListViewModel.kt\ncom/heytap/sports/course/RunningCourseListViewModel\n*L\n30#1:58\n30#1:59,2\n*E\n"})
public final class RunningCourseListViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l2g repository = new l2g();

    /* JADX WARN: Code duplicated, block: B:41:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object v(@NotNull Continuation<? super List<KeepTransSubList>> continuation) {
        RunningCourseListViewModel$fetchRunningCourseListData$1 runningCourseListViewModel$fetchRunningCourseListData$1;
        List listEmptyList;
        RunningCourseSubData runningCourseSubDataB;
        List list;
        NetResult netResult;
        if (continuation instanceof RunningCourseListViewModel$fetchRunningCourseListData$1) {
            runningCourseListViewModel$fetchRunningCourseListData$1 = (RunningCourseListViewModel$fetchRunningCourseListData$1) continuation;
            int i = runningCourseListViewModel$fetchRunningCourseListData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                runningCourseListViewModel$fetchRunningCourseListData$1.label = i - Integer.MIN_VALUE;
            } else {
                runningCourseListViewModel$fetchRunningCourseListData$1 = new RunningCourseListViewModel$fetchRunningCourseListData$1(this, continuation);
            }
        } else {
            runningCourseListViewModel$fetchRunningCourseListData$1 = new RunningCourseListViewModel$fetchRunningCourseListData$1(this, continuation);
        }
        Object objC = runningCourseListViewModel$fetchRunningCourseListData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = runningCourseListViewModel$fetchRunningCourseListData$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                this = (RunningCourseListViewModel) runningCourseListViewModel$fetchRunningCourseListData$1.L$0;
                ResultKt.throwOnFailure(objC);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) runningCourseListViewModel$fetchRunningCourseListData$1.L$0;
                ResultKt.throwOnFailure(objC);
            }
            Intrinsics.checkNotNullExpressionValue(objC, "repository.queryOwnerCourseList().awaitOnce()");
            netResult = (NetResult) objC;
            if (netResult.isSucceed() || netResult.body == 0) {
                runningCourseSubDataB = null;
            } else {
                runningCourseSubDataB = (RunningCourseSubData) netResult.body;
                k2g.INSTANCE.c(runningCourseSubDataB);
            }
            listEmptyList = list;
            return a.INSTANCE.c(listEmptyList, runningCourseSubDataB);
        }
        ResultKt.throwOnFailure(objC);
        lbd<NetResult<List<KeepTransSubList>>> lbdVarB = this.repository.b();
        runningCourseListViewModel$fetchRunningCourseListData$1.L$0 = this;
        runningCourseListViewModel$fetchRunningCourseListData$1.label = 1;
        objC = RxExtendKt.c(lbdVarB, runningCourseListViewModel$fetchRunningCourseListData$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        Intrinsics.checkNotNullExpressionValue(objC, "repository.queryKeepList().awaitOnce()");
        NetResult netResult2 = (NetResult) objC;
        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        if (netResult2.isSucceed()) {
            D d = netResult2.body;
            Intrinsics.checkNotNullExpressionValue(d, "keepNetResult.body");
            if (!((Collection) d).isEmpty()) {
                D d2 = netResult2.body;
                Intrinsics.checkNotNullExpressionValue(d2, "keepNetResult.body");
                listEmptyList = new ArrayList();
                for (Object obj : (Iterable) d2) {
                    if (SetsKt__SetsKt.setOf((Object[]) new Integer[]{Boxing.boxInt(4), Boxing.boxInt(5), Boxing.boxInt(6)}).contains(Boxing.boxInt(((KeepTransSubList) obj).getTarget()))) {
                        listEmptyList.add(obj);
                    }
                }
            }
        }
        runningCourseSubDataB = k2g.INSTANCE.b();
        if (runningCourseSubDataB == null) {
            lbd<NetResult<RunningCourseSubData>> lbdVarC = this.repository.c();
            runningCourseListViewModel$fetchRunningCourseListData$1.L$0 = listEmptyList;
            runningCourseListViewModel$fetchRunningCourseListData$1.label = 2;
            objC = RxExtendKt.c(lbdVarC, runningCourseListViewModel$fetchRunningCourseListData$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = listEmptyList;
            Intrinsics.checkNotNullExpressionValue(objC, "repository.queryOwnerCourseList().awaitOnce()");
            netResult = (NetResult) objC;
            if (netResult.isSucceed()) {
                runningCourseSubDataB = null;
            } else {
                runningCourseSubDataB = null;
            }
            listEmptyList = list;
        }
        return a.INSTANCE.c(listEmptyList, runningCourseSubDataB);
    }
}
