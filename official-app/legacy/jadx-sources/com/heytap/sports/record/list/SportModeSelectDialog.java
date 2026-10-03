package com.heytap.sports.record.list;

import android.content.Context;
import android.content.res.Resources;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.coui.appcompat.dialog.COUIAlertDialogBuilder;
import com.heytap.sports.record.list.adapter.SportModeAdapter;
import com.heytap.sports.record.list.bean.SportModeSelectData;
import com.heytap.sports.record.list.helper.DataHelper;
import com.heytap.sports.record.list.vm.SportRecordListViewModel;
import com.heytap.sports.share.util.ImageUtil;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.z30;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b'\u0010(J\"\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004J\u0013\u0010\b\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\tR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u000eR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lcom/heytap/sports/record/list/SportModeSelectDialog;", "Lcom/coui/appcompat/dialog/COUIAlertDialogBuilder;", "", "selectMode", "Lkotlin/Function1;", "", "callBack", "i0", "h0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/heytap/sports/record/list/bean/SportModeSelectData;", "j0", "Landroid/content/Context;", "Z", "Landroid/content/Context;", "context", "Lcom/heytap/sports/record/list/vm/SportRecordListViewModel;", "a0", "Lkotlin/Lazy;", "g0", "()Lcom/heytap/sports/record/list/vm/SportRecordListViewModel;", "viewModel", "Lcom/heytap/sports/record/list/adapter/SportModeAdapter;", "b0", "Lcom/heytap/sports/record/list/adapter/SportModeAdapter;", "sportModeAdapter", "", "c0", "hasLoad", "", "d0", "J", "showUpdateTime", "e0", "Ljava/util/List;", "allItemSportMode", "f0", "sportModeList", "<init>", "(Landroid/content/Context;)V", "Companion", "a", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSportModeSelectDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportModeSelectDialog.kt\ncom/heytap/sports/record/list/SportModeSelectDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n766#2:148\n857#2,2:149\n1549#2:151\n1620#2,3:152\n1603#2,9:155\n1855#2:164\n1856#2:166\n1612#2:167\n1045#2:168\n1#3:165\n*S KotlinDebug\n*F\n+ 1 SportModeSelectDialog.kt\ncom/heytap/sports/record/list/SportModeSelectDialog\n*L\n48#1:148\n48#1:149,2\n50#1:151\n50#1:152,3\n116#1:155,9\n116#1:164\n116#1:166\n116#1:167\n132#1:168\n116#1:165\n*E\n"})
public final class SportModeSelectDialog extends COUIAlertDialogBuilder {

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    @Nullable
    public SportModeAdapter sportModeAdapter;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public boolean hasLoad;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public long showUpdateTime;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    @NotNull
    public final List<SportModeSelectData> allItemSportMode;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    @NotNull
    public final List<Integer> sportModeList;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SportModeSelectDialog.kt\ncom/heytap/sports/record/list/SportModeSelectDialog\n*L\n1#1,328:1\n132#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((SportModeSelectData) t).getStartTimestamp()), Long.valueOf(((SportModeSelectData) t2).getStartTimestamp()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportModeSelectDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.viewModel = LazyKt__LazyJVMKt.lazy(new Function0<SportRecordListViewModel>() { // from class: com.heytap.sports.record.list.SportModeSelectDialog$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final SportRecordListViewModel invoke() {
                Object obj = this.this$0.context;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
                return (SportRecordListViewModel) new ViewModelProvider((ViewModelStoreOwner) obj).get(SportRecordListViewModel.class);
            }
        });
        DataHelper dataHelper = DataHelper.INSTANCE;
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        List<SportModeSelectData> listB = dataHelper.b(resources, DataHelper.SportNameType.SimpleName);
        this.allItemSportMode = listB;
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            SportModeSelectData sportModeSelectData = (SportModeSelectData) obj;
            if ((sportModeSelectData.getType() == -2 || sportModeSelectData.getHasSecondType()) ? false : true) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((SportModeSelectData) it.next()).getType()));
        }
        this.sportModeList = arrayList2;
    }

    public final SportRecordListViewModel g0() {
        return (SportRecordListViewModel) this.viewModel.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object h0(@NotNull Continuation<? super Unit> continuation) {
        SportModeSelectDialog$preloadData$1 sportModeSelectDialog$preloadData$1;
        if (continuation instanceof SportModeSelectDialog$preloadData$1) {
            sportModeSelectDialog$preloadData$1 = (SportModeSelectDialog$preloadData$1) continuation;
            int i = sportModeSelectDialog$preloadData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sportModeSelectDialog$preloadData$1.label = i - Integer.MIN_VALUE;
            } else {
                sportModeSelectDialog$preloadData$1 = new SportModeSelectDialog$preloadData$1(this, continuation);
            }
        } else {
            sportModeSelectDialog$preloadData$1 = new SportModeSelectDialog$preloadData$1(this, continuation);
        }
        Object objP = sportModeSelectDialog$preloadData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sportModeSelectDialog$preloadData$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                this = (SportModeSelectDialog) sportModeSelectDialog$preloadData$1.L$0;
                ResultKt.throwOnFailure(objP);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objP);
            }
            a7b.f("SportModeSelectDialog", "preloadData() ret:" + ((Map) objP));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objP);
        sportModeSelectDialog$preloadData$1.L$0 = this;
        sportModeSelectDialog$preloadData$1.label = 1;
        if (DelayKt.delay(500L, sportModeSelectDialog$preloadData$1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        a7b.f("SportModeSelectDialog", "preloadData(" + (!this.hasLoad) + ") params:" + this.allItemSportMode);
        if (!this.hasLoad) {
            SportRecordListViewModel sportRecordListViewModelG0 = this.g0();
            List<Integer> list = this.sportModeList;
            sportModeSelectDialog$preloadData$1.L$0 = null;
            sportModeSelectDialog$preloadData$1.label = 2;
            objP = sportRecordListViewModelG0.P(list, sportModeSelectDialog$preloadData$1);
            if (objP == coroutine_suspended) {
                return coroutine_suspended;
            }
            a7b.f("SportModeSelectDialog", "preloadData() ret:" + ((Map) objP));
        }
        return Unit.INSTANCE;
    }

    public final void i0(int selectMode, @NotNull Function1<? super Integer, Unit> callBack) {
        LifecycleCoroutineScope lifecycleScope;
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        if (System.currentTimeMillis() - this.showUpdateTime < 200) {
            return;
        }
        Object obj = this.context;
        LifecycleOwner lifecycleOwner = obj instanceof LifecycleOwner ? (LifecycleOwner) obj : null;
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new SportModeSelectDialog$show$1(this, selectMode, callBack, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object j0(Continuation<? super List<SportModeSelectData>> continuation) {
        SportModeSelectDialog$updateData$1 sportModeSelectDialog$updateData$1;
        AlertDialog alertDialogD;
        Object objP;
        SportModeSelectDialog sportModeSelectDialog = this;
        if (continuation instanceof SportModeSelectDialog$updateData$1) {
            sportModeSelectDialog$updateData$1 = (SportModeSelectDialog$updateData$1) continuation;
            int i = sportModeSelectDialog$updateData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sportModeSelectDialog$updateData$1.label = i - Integer.MIN_VALUE;
            } else {
                sportModeSelectDialog$updateData$1 = new SportModeSelectDialog$updateData$1(sportModeSelectDialog, continuation);
            }
        } else {
            sportModeSelectDialog$updateData$1 = new SportModeSelectDialog$updateData$1(sportModeSelectDialog, continuation);
        }
        Object obj = sportModeSelectDialog$updateData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sportModeSelectDialog$updateData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            alertDialogD = ImageUtil.INSTANCE.d(sportModeSelectDialog.context);
            z30.INSTANCE.c(alertDialogD);
            sportModeSelectDialog.hasLoad = true;
            a7b.f("SportModeSelectDialog", "queryFirstRecordTimestampMap params:" + sportModeSelectDialog.allItemSportMode);
            SportRecordListViewModel sportRecordListViewModelG0 = g0();
            List<Integer> list = sportModeSelectDialog.sportModeList;
            sportModeSelectDialog$updateData$1.L$0 = sportModeSelectDialog;
            sportModeSelectDialog$updateData$1.L$1 = alertDialogD;
            sportModeSelectDialog$updateData$1.label = 1;
            objP = sportRecordListViewModelG0.P(list, sportModeSelectDialog$updateData$1);
            if (objP == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AlertDialog alertDialog = (AlertDialog) sportModeSelectDialog$updateData$1.L$1;
            SportModeSelectDialog sportModeSelectDialog2 = (SportModeSelectDialog) sportModeSelectDialog$updateData$1.L$0;
            ResultKt.throwOnFailure(obj);
            alertDialogD = alertDialog;
            sportModeSelectDialog = sportModeSelectDialog2;
            objP = obj;
        }
        Map map = (Map) objP;
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(map.entrySet(), null, null, null, 0, null, new Function1<Map.Entry<? extends Integer, ? extends Long>, CharSequence>() { // from class: com.heytap.sports.record.list.SportModeSelectDialog$updateData$2
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final CharSequence invoke2(@NotNull Map.Entry<Integer, Long> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getKey() + ":" + it.getValue();
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends Integer, ? extends Long> entry) {
                return invoke2((Map.Entry<Integer, Long>) entry);
            }
        }, 31, null);
        StringBuilder sb = new StringBuilder();
        sb.append("queryFirstRecordTimestampMap params:");
        sb.append(strJoinToString$default);
        List<SportModeSelectData> list2 = sportModeSelectDialog.allItemSportMode;
        ArrayList arrayList = new ArrayList();
        for (SportModeSelectData sportModeSelectData : list2) {
            Long l2 = (Long) map.get(Boxing.boxInt(sportModeSelectData.getType()));
            SportModeSelectData sportModeSelectDataCopy$default = sportModeSelectData.getType() == -2 ? SportModeSelectData.copy$default(sportModeSelectData, 0, null, 0L, false, 15, null) : (l2 == null || l2.longValue() < 0) ? null : SportModeSelectData.copy$default(sportModeSelectData, 0, null, l2.longValue(), false, 11, null);
            if (sportModeSelectDataCopy$default != null) {
                arrayList.add(sportModeSelectDataCopy$default);
            }
        }
        alertDialogD.dismiss();
        return arrayList.size() == 1 ? CollectionsKt__CollectionsKt.emptyList() : CollectionsKt___CollectionsKt.sortedWith(arrayList, new b());
    }
}
