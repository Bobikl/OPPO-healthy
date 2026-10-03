package com.heytap.health.wallet.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.health.wallet.bean.IotCardInfo;
import com.heytap.health.wallet.bean.MultiActivateCardInfo;
import com.heytap.health.wallet.bean.MultiActivateCardInfoRspVo;
import com.heytap.health.wallet.task.AbsActiveCardTask;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.wallet.business.autoswitch.SwipeRepositoryKt;
import com.oplus.aiunit.vision.j7l;
import com.oplus.aiunit.vision.o6l;
import com.oplus.aiunit.vision.ouc;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.wq8;
import com.oppo.wear.wallet.proto.SwipeSetting$SwipeMannerId;
import com.oppo.wear.wallet.proto.SwipeSetting$SwitchCardConfig;
import com.oppo.wear.wallet.proto.SwipeSetting$SwitchCardItem;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001AB\u0007¢\u0006\u0004\b>\u0010?J3\u0010\b\u001a\u00020\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0003H\u0002J)\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J \u0010\u001b\u001a\u00020\u00102\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\u001e\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u000e\u0010 \u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0003J\u000e\u0010!\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0003J\u0006\u0010#\u001a\u00020\u0010J\u0010\u0010%\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010\rJ\u0006\u0010&\u001a\u00020\u0006J\u0006\u0010'\u001a\u00020\u0006J\u0006\u0010(\u001a\u00020\u0010R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020-0\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020-0\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020-0\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010/R\"\u00109\u001a\u0010\u0012\f\u0012\n 6*\u0004\u0018\u00010\u00060\u0006058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060:8F¢\u0006\u0006\u001a\u0004\b;\u0010<\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006B"}, d2 = {"Lcom/heytap/health/wallet/viewmodel/SwipeViewModel;", "Landroidx/lifecycle/ViewModel;", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "aidsToSend", "", "isSwitchOn", ExifInterface.GPS_DIRECTION_TRUE, "(Ljava/util/HashSet;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aid", ExifInterface.LONGITUDE_WEST, "(ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/wallet/bean/MultiActivateCardInfoRspVo;", "multiActivateCardInfoRspVo", SecureGcmConstants.MESSAGE_KEY, "", "G", "", "cardList", "X", "(ZLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Y", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "U", "Lcom/oppo/wear/wallet/proto/SwipeSetting$SwitchCardItem;", "K", "a0", "Lcom/oppo/wear/wallet/proto/SwipeSetting$SwipeMannerId;", "L", "O", "M", "I", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Z", "H", "iotMultiActivateCardInfos", "S", "N", "R", "J", "", "i", "Ljava/util/Set;", "assistAids", "Lcom/heytap/health/wallet/bean/IotCardInfo;", "j", "Ljava/util/List;", "ableBusList", MapSchema.FIELD_NAME_KEY, "ableCarList", LogFieldKey.LEVEL_KEY, "ableDoorList", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", LogFieldKey.MESSAGE_KEY, "Landroidx/lifecycle/MutableLiveData;", "_isLoading", "Landroidx/lifecycle/LiveData;", "Q", "()Landroidx/lifecycle/LiveData;", "isLoading", "<init>", "()V", "Companion", "a", "walletmain_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwipeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeViewModel.kt\ncom/heytap/health/wallet/viewmodel/SwipeViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,413:1\n1549#2:414\n1620#2,3:415\n766#2:418\n857#2,2:419\n1549#2:421\n1620#2,3:422\n*S KotlinDebug\n*F\n+ 1 SwipeViewModel.kt\ncom/heytap/health/wallet/viewmodel/SwipeViewModel\n*L\n120#1:414\n120#1:415,3\n190#1:418\n190#1:419,2\n382#1:421\n382#1:422,3\n*E\n"})
public final class SwipeViewModel extends ViewModel {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public Set<String> assistAids = new LinkedHashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends IotCardInfo> ableBusList = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public List<? extends IotCardInfo> ableCarList = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends IotCardInfo> ableDoorList = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Boolean> _isLoading = new MutableLiveData<>(Boolean.TRUE);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/heytap/health/wallet/viewmodel/SwipeViewModel$b", "Lcom/heytap/health/wallet/task/AbsActiveCardTask$d;", "", "msg", "", "onSuccess", "errorCode", "a", "walletmain_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements AbsActiveCardTask.d {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // com.heytap.health.wallet.task.AbsActiveCardTask.d
        public void a(@Nullable String errorCode, @NotNull String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            t6b.d("SwipeVM", "activeCard fail = " + msg);
        }

        @Override // com.heytap.health.wallet.task.AbsActiveCardTask.d
        public void onSuccess(@NotNull String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            j7l.K(this.a);
            o6l.G(this.a, true);
        }
    }

    public SwipeViewModel() {
        t6b.b("SwipeVM", "init");
    }

    public final void G(String aid) {
        t6b.b("SwipeVM", "activeCard");
        new ouc().e(aid, new b(aid), false, false);
    }

    public final void H() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), wq8.INSTANCE.e(), null, new SwipeViewModel$cloudSupportMultiCard$1(this, null), 2, null);
    }

    public final void I(@NotNull String aid) {
        Intrinsics.checkNotNullParameter(aid, "aid");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), wq8.INSTANCE.f(), null, new SwipeViewModel$doRestock$1(this, aid, null), 2, null);
    }

    public final void J() {
        SwipeRepositoryKt.I();
    }

    public final List<SwipeSetting$SwitchCardItem> K(HashSet<String> aidsToSend) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(aidsToSend, 10));
        Iterator<T> it = aidsToSend.iterator();
        while (it.hasNext()) {
            arrayList.add(SwipeSetting$SwitchCardItem.newBuilder().setMannerId(SwipeSetting$SwipeMannerId.COMBINATION_CARD).setAid((String) it.next()).build());
        }
        return arrayList;
    }

    public final SwipeSetting$SwipeMannerId L(boolean isSwitchOn) {
        t6b.b("SwipeVM", "getAimManner = " + isSwitchOn + ",managerId = " + SwipeRepositoryKt.u());
        return !isSwitchOn ? SwipeSetting$SwipeMannerId.SWIPEMANNERID_NONE : SwipeRepositoryKt.u();
    }

    public final void M() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SwipeViewModel$getSwipeCfgFromDevice$1(this, null), 3, null);
    }

    public final boolean N() {
        return SwipeRepositoryKt.B();
    }

    public final void O() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SwipeViewModel$initData$1(this, null), 3, null);
    }

    public final boolean P(MultiActivateCardInfoRspVo multiActivateCardInfoRspVo, String aid) {
        if (multiActivateCardInfoRspVo != null) {
            List<MultiActivateCardInfo> iotMultiActivateCardInfos = multiActivateCardInfoRspVo.getIotMultiActivateCardInfos();
            if (!(iotMultiActivateCardInfos == null || iotMultiActivateCardInfos.isEmpty())) {
                List<IotCardInfo> listC = SwipeRepositoryKt.c(multiActivateCardInfoRspVo);
                if (listC.isEmpty()) {
                    return false;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : listC) {
                    String aid2 = ((IotCardInfo) obj).getAid();
                    Intrinsics.checkNotNullExpressionValue(aid2, "it.aid");
                    if (StringsKt__StringsKt.contains$default((CharSequence) aid2, (CharSequence) aid, false, 2, (Object) null)) {
                        arrayList.add(obj);
                    }
                }
                return !arrayList.isEmpty();
            }
        }
        t6b.b("SwipeVM", "isInBlackList, null or empty data!");
        return false;
    }

    @NotNull
    public final LiveData<Boolean> Q() {
        return this._isLoading;
    }

    public final boolean R() {
        return SwipeRepositoryKt.C();
    }

    public final void S(@Nullable MultiActivateCardInfoRspVo iotMultiActivateCardInfos) {
        if (iotMultiActivateCardInfos != null) {
            List<MultiActivateCardInfo> iotMultiActivateCardInfos2 = iotMultiActivateCardInfos.getIotMultiActivateCardInfos();
            if (!(iotMultiActivateCardInfos2 == null || iotMultiActivateCardInfos2.isEmpty())) {
                this.ableBusList = SwipeRepositoryKt.e(iotMultiActivateCardInfos);
                this.ableCarList = SwipeRepositoryKt.g(iotMultiActivateCardInfos);
                this.ableDoorList = SwipeRepositoryKt.h(iotMultiActivateCardInfos);
                t6b.b("SwipeVM", "refreshSwipeList ableBusList = " + this.ableBusList);
                t6b.b("SwipeVM", "refreshSwipeList ableCarList = " + this.ableCarList);
                t6b.b("SwipeVM", "refreshSwipeList ableDoorList = " + this.ableDoorList);
                return;
            }
        }
        t6b.b("SwipeVM", "refreshAbleSwipeList, null or empty data!");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object T(HashSet<String> hashSet, boolean z, Continuation<? super Boolean> continuation) {
        SwipeViewModel$sendSelChangeCfg$1 swipeViewModel$sendSelChangeCfg$1;
        if (continuation instanceof SwipeViewModel$sendSelChangeCfg$1) {
            swipeViewModel$sendSelChangeCfg$1 = (SwipeViewModel$sendSelChangeCfg$1) continuation;
            int i = swipeViewModel$sendSelChangeCfg$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                swipeViewModel$sendSelChangeCfg$1.label = i - Integer.MIN_VALUE;
            } else {
                swipeViewModel$sendSelChangeCfg$1 = new SwipeViewModel$sendSelChangeCfg$1(this, continuation);
            }
        } else {
            swipeViewModel$sendSelChangeCfg$1 = new SwipeViewModel$sendSelChangeCfg$1(this, continuation);
        }
        Object objL = swipeViewModel$sendSelChangeCfg$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = swipeViewModel$sendSelChangeCfg$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objL);
            SwipeSetting$SwitchCardConfig swipeSetting$SwitchCardConfigBuild = SwipeSetting$SwitchCardConfig.newBuilder().setMannerId(L(z)).addAllItems(K(hashSet)).build();
            swipeViewModel$sendSelChangeCfg$1.L$0 = this;
            swipeViewModel$sendSelChangeCfg$1.L$1 = hashSet;
            swipeViewModel$sendSelChangeCfg$1.Z$0 = z;
            swipeViewModel$sendSelChangeCfg$1.label = 1;
            objL = SwipeRepositoryKt.L(swipeSetting$SwitchCardConfigBuild, swipeViewModel$sendSelChangeCfg$1);
            if (objL == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = swipeViewModel$sendSelChangeCfg$1.Z$0;
            hashSet = (HashSet) swipeViewModel$sendSelChangeCfg$1.L$1;
            this = (SwipeViewModel) swipeViewModel$sendSelChangeCfg$1.L$0;
            ResultKt.throwOnFailure(objL);
        }
        boolean zBooleanValue = ((Boolean) objL).booleanValue();
        t6b.b("SwipeVM", "sendDeviceSuccess = " + zBooleanValue);
        if (zBooleanValue) {
            SwipeRepositoryKt.N(z);
            this.a0(hashSet);
        } else {
            SwipeRepositoryKt.N(!z);
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    public final Object U(boolean z, List<String> list, Continuation<? super Boolean> continuation) {
        HashSet<String> hashSet = new HashSet<>();
        if (z) {
            hashSet = CollectionsKt___CollectionsKt.toHashSet(list);
        }
        t6b.b("SwipeVM", "sendSelChangeCfg aidsToSend  = " + hashSet);
        return T(hashSet, z, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.Collection] */
    public final boolean V(boolean isSwitchOn) {
        T arrayList;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (isSwitchOn) {
            List<IotCardInfo> listM = SwipeRepositoryKt.m();
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listM, 10));
            Iterator<T> it = listM.iterator();
            while (it.hasNext()) {
                arrayList.add(((IotCardInfo) it.next()).getAid());
            }
        } else {
            List<IotCardInfo> listW = SwipeRepositoryKt.w();
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listW, 10));
            Iterator<T> it2 = listW.iterator();
            while (it2.hasNext()) {
                arrayList.add(((IotCardInfo) it2.next()).getAid());
            }
        }
        objectRef.element = arrayList;
        t6b.b("SwipeVM", "setSwitchCloudConfig cardList = " + arrayList);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), wq8.INSTANCE.f(), null, new SwipeViewModel$setSwitchCloudConfig$1(booleanRef, this, isSwitchOn, objectRef, null), 2, null);
        return booleanRef.element;
    }

    public final Object W(boolean z, String str, Continuation<? super Boolean> continuation) {
        t6b.b("SwipeVM", "suspRestockCardCloudConfig isSwitchOn = " + z + "  aid= " + str);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), wq8.INSTANCE.e(), null, new SwipeViewModel$suspRestockCardCloudConfig$2(this, str, z, null), 2, null);
        return Boxing.boxBoolean(false);
    }

    public final Object X(boolean z, List<String> list, Continuation<? super Boolean> continuation) {
        this._isLoading.postValue(Boxing.boxBoolean(true));
        t6b.b("SwipeVM", "suspSetSwitchCloudConfig isSwitchOn = " + z + " cardList = " + list + " ");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), wq8.INSTANCE.e(), null, new SwipeViewModel$suspSetSwitchCloudConfig$2(list, this, z, null), 2, null);
        return Boxing.boxBoolean(false);
    }

    public final Object Y(boolean z, Continuation<? super Boolean> continuation) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), wq8.INSTANCE.e(), null, new SwipeViewModel$suspSetSwitchStatus$2(booleanRef, z, null), 2, null);
        return Boxing.boxBoolean(booleanRef.element);
    }

    public final void Z(@NotNull String aid) {
        Intrinsics.checkNotNullParameter(aid, "aid");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), wq8.INSTANCE.e(), null, new SwipeViewModel$updateDefaultCard$1(this, aid, null), 2, null);
    }

    public final void a0(HashSet<String> aidsToSend) {
        this.assistAids.clear();
        this.assistAids.addAll(aidsToSend);
        SwipeRepositoryKt.Q(this.assistAids);
    }
}
