package com.heytap.health.wallet.entrance.vmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.wallet.bean.IotCardInfo;
import com.heytap.health.wallet.bean.MultiActivateCardInfoRspVo;
import com.heytap.health.wallet.network.ErrorResponse;
import com.heytap.health.wallet.network.common.rsp.CombinationSwitchStatus;
import com.heytap.health.wallet.network.door.rsp.CardDisplayEntity;
import com.heytap.health.wallet.network.door.rsp.CardDisplayList;
import com.heytap.health.wallet.network.door.rsp.CardDisplayRsp;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.store.base.core.state.Constants;
import com.heytap.wallet.business.autoswitch.SwipeRepositoryKt;
import com.oplus.aiunit.vision.SwipeConfigs;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.bm5;
import com.oplus.aiunit.vision.el4;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.j7l;
import com.oplus.aiunit.vision.mc7;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.ydc;
import com.oppo.wear.wallet.proto.SwipeSetting$SwipeMannerId;
import com.oppo.wear.wallet.proto.SwipeSetting$SwitchCardConfig;
import com.oppo.wear.wallet.proto.SwipeSetting$SwitchCardItem;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 O2\u00020\u0001:\u0001PB\u0007¢\u0006\u0004\bM\u0010NJ\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\r\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0002J\"\u0010\u0012\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0010J\"\u0010\u0013\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0010J\"\u0010\u0014\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0010J\u0013\u0010\u0015\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u0019\u001a\u00020\nJ\u0006\u0010\u001a\u001a\u00020\nJ\u0006\u0010\u001c\u001a\u00020\u001bR\"\u0010!\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001b0\u001b0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010#\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001b0\u001b0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010 R\"\u0010(\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001b0\u001b0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010 R\u001e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010 R\u001a\u00100\u001a\u00020\u00038\u0006X\u0086D¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00103\u001a\u00020\u00038\u0006X\u0086D¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010-R\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\u00100\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010 R\u0018\u00108\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010-R\u0018\u0010:\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010-R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001b0?8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001b0?8F¢\u0006\u0006\u001a\u0004\bC\u0010AR\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020$0?8F¢\u0006\u0006\u001a\u0004\bE\u0010AR\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001b0?8F¢\u0006\u0006\u001a\u0004\bG\u0010AR\u0019\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0?8F¢\u0006\u0006\u001a\u0004\bI\u0010AR\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00100?8F¢\u0006\u0006\u001a\u0004\bK\u0010A\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Q"}, d2 = {"Lcom/heytap/health/wallet/entrance/vmodel/EntranceTunningParamVm;", "Landroidx/lifecycle/ViewModel;", "Ljava/util/HashSet;", "", "aidsToSend", "", "Lcom/oppo/wear/wallet/proto/SwipeSetting$SwitchCardItem;", "G", "Lcom/heytap/health/wallet/network/door/rsp/CardDisplayList;", "cardDisplayList", "", "N", LogSenderConst.FILENAME, ExifInterface.LONGITUDE_WEST, "aid", "appCode", "", "index", "Y", "X", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.GPS_DIRECTION_TRUE, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "H", "L", "M", UserInfo.SEX_FEMALE, "", "U", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "i", "Landroidx/lifecycle/MutableLiveData;", "innerSetCloudIndexSuccess", "j", "innerRestoreIndexSuccess", "Lcom/heytap/health/wallet/network/door/rsp/CardDisplayEntity;", MapSchema.FIELD_NAME_KEY, "innerCardDisplayEntity", LogFieldKey.LEVEL_KEY, "innerLoading", "Lcom/heytap/health/wallet/network/ErrorResponse;", LogFieldKey.MESSAGE_KEY, "innerErrorResponse", "n", "Ljava/lang/String;", "Q", "()Ljava/lang/String;", "sendToWatchError", "o", "K", "getFromWatchError", LogFieldKey.PROCESS_NAME_KEY, "q", "innerTotalIndex", "r", "innerAid", "s", "innerAppCode", "Lcom/oplus/aiunit/vision/el4$b;", "t", "Lcom/oplus/aiunit/vision/el4$b;", "filTransferListener", "Landroidx/lifecycle/LiveData;", "R", "()Landroidx/lifecycle/LiveData;", "setCloudIndexSuccess", SecureGcmConstants.MESSAGE_KEY, "restoreIndexSuccess", "I", "cardDisplayEntity", "O", Constants.LOADING, "J", "errorMsg", "S", "totalIndex", "<init>", "()V", "Companion", "a", "entrance_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEntranceTunningParamVm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntranceTunningParamVm.kt\ncom/heytap/health/wallet/entrance/vmodel/EntranceTunningParamVm\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,368:1\n1549#2:369\n1620#2,3:370\n1549#2:373\n1620#2,3:374\n1855#2:377\n1855#2,2:378\n1856#2:380\n*S KotlinDebug\n*F\n+ 1 EntranceTunningParamVm.kt\ncom/heytap/health/wallet/entrance/vmodel/EntranceTunningParamVm\n*L\n194#1:369\n194#1:370,3\n215#1:373\n215#1:374,3\n307#1:377\n308#1:378,2\n307#1:380\n*E\n"})
public final class EntranceTunningParamVm extends ViewModel {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Boolean> innerSetCloudIndexSuccess;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<Boolean> innerRestoreIndexSuccess;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public MutableLiveData<CardDisplayEntity> innerCardDisplayEntity;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<Boolean> innerLoading;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public MutableLiveData<ErrorResponse> innerErrorResponse;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String sendToWatchError;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final String getFromWatchError;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public String fileName;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public MutableLiveData<Integer> innerTotalIndex;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public String innerAid;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public String innerAppCode;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final el4.b filTransferListener;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"com/heytap/health/wallet/entrance/vmodel/EntranceTunningParamVm$b", "Lcom/oplus/aiunit/vision/el4$b;", "", "macAddress", "Lcom/oplus/aiunit/vision/mc7;", "fileTaskInfo", "", "c", "a", "b", "entrance_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements el4.b {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.el4.b
        public void a(@NotNull String macAddress, @NotNull mc7 fileTaskInfo) {
            Intrinsics.checkNotNullParameter(macAddress, "macAddress");
            Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
            a7b.f("TunningParamVm", "file transfer onProgressChanged!");
        }

        @Override // com.oplus.aiunit.vision.el4.b
        public void b(@NotNull String macAddress, @NotNull mc7 fileTaskInfo) {
            Intrinsics.checkNotNullParameter(macAddress, "macAddress");
            Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
            a7b.f("TunningParamVm", "file transfer completed! aid = " + EntranceTunningParamVm.this.innerAid);
            EntranceTunningParamVm entranceTunningParamVm = EntranceTunningParamVm.this;
            entranceTunningParamVm.L(entranceTunningParamVm.innerAid, EntranceTunningParamVm.this.innerAppCode);
            gl4.devicePrimary.fileApi.j("conf", this);
        }

        @Override // com.oplus.aiunit.vision.el4.b
        public void c(@NotNull String macAddress, @NotNull mc7 fileTaskInfo) {
            Intrinsics.checkNotNullParameter(macAddress, "macAddress");
            Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
            a7b.f("TunningParamVm", "file transfer onTransferRequested!");
        }
    }

    public EntranceTunningParamVm() {
        Boolean bool = Boolean.FALSE;
        this.innerSetCloudIndexSuccess = new MutableLiveData<>(bool);
        this.innerRestoreIndexSuccess = new MutableLiveData<>(bool);
        this.innerCardDisplayEntity = new MutableLiveData<>();
        this.innerLoading = new MutableLiveData<>(bool);
        this.innerErrorResponse = new MutableLiveData<>();
        this.sendToWatchError = "sendToWatchError";
        this.getFromWatchError = "getFromWatchError";
        this.innerTotalIndex = new MutableLiveData<>();
        this.filTransferListener = new b();
    }

    public final void F() {
        this.innerErrorResponse.setValue(null);
    }

    public final List<SwipeSetting$SwitchCardItem> G(HashSet<String> aidsToSend) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(aidsToSend, 10));
        Iterator<T> it = aidsToSend.iterator();
        while (it.hasNext()) {
            arrayList.add(SwipeSetting$SwitchCardItem.newBuilder().setMannerId(SwipeSetting$SwipeMannerId.COMBINATION_CARD).setAid((String) it.next()).build());
        }
        return arrayList;
    }

    public final void H(@Nullable String aid, @Nullable String appCode) {
        this.innerAid = aid;
        this.innerAppCode = appCode;
        t6b.b("TunningParamVm", "getAndSendRfFile");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EntranceTunningParamVm$getAndSendRfFile$1(this, null), 3, null);
    }

    @NotNull
    public final LiveData<CardDisplayEntity> I() {
        return this.innerCardDisplayEntity;
    }

    @NotNull
    public final LiveData<ErrorResponse> J() {
        return this.innerErrorResponse;
    }

    @NotNull
    /* JADX INFO: renamed from: K, reason: from getter */
    public final String getGetFromWatchError() {
        return this.getFromWatchError;
    }

    public final void L(@Nullable String aid, @Nullable String appCode) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EntranceTunningParamVm$getIndexPatamCfgFromDevice$1(aid, appCode, this, null), 3, null);
    }

    public final void M() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EntranceTunningParamVm$getLinkUrl$1(this, null), 3, null);
    }

    public final void N(CardDisplayList cardDisplayList) {
        if (cardDisplayList != null) {
            List<CardDisplayRsp> cardDisplayRsps = cardDisplayList.getCardDisplayRsps();
            if (cardDisplayRsps != null && (cardDisplayRsps.isEmpty() ^ true)) {
                List<CardDisplayRsp> cardDisplayRsps2 = cardDisplayList.getCardDisplayRsps();
                Intrinsics.checkNotNull(cardDisplayRsps2);
                Iterator<T> it = cardDisplayRsps2.iterator();
                while (it.hasNext()) {
                    List<CardDisplayEntity> cardTypeDisplays = ((CardDisplayRsp) it.next()).getCardTypeDisplays();
                    if (cardTypeDisplays != null) {
                        for (CardDisplayEntity cardDisplayEntity : cardTypeDisplays) {
                            Integer type = cardDisplayEntity.getType();
                            if (type != null && type.equals(1)) {
                                this.innerCardDisplayEntity.postValue(cardDisplayEntity);
                            }
                        }
                    }
                }
            }
        }
    }

    @NotNull
    public final LiveData<Boolean> O() {
        return this.innerLoading;
    }

    @NotNull
    public final LiveData<Boolean> P() {
        return this.innerRestoreIndexSuccess;
    }

    @NotNull
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final String getSendToWatchError() {
        return this.sendToWatchError;
    }

    @NotNull
    public final LiveData<Boolean> R() {
        return this.innerSetCloudIndexSuccess;
    }

    @NotNull
    public final LiveData<Integer> S() {
        return this.innerTotalIndex;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d8 A[LOOP:0: B:47:0x00d2->B:49:0x00d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:56:0x0118  */
    /* JADX WARN: Code duplicated, block: B:58:0x0132  */
    /* JADX WARN: Code duplicated, block: B:60:0x0182 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x0183  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x0132, please report this as an issue */
    @Nullable
    public final Object T(@NotNull Continuation<? super Unit> continuation) {
        EntranceTunningParamVm$handleTunningCard$1 entranceTunningParamVm$handleTunningCard$1;
        ArrayList arrayList;
        Iterator<T> it;
        EntranceTunningParamVm entranceTunningParamVm;
        List list;
        boolean zBooleanValue;
        EntranceTunningParamVm entranceTunningParamVm2;
        if (continuation instanceof EntranceTunningParamVm$handleTunningCard$1) {
            entranceTunningParamVm$handleTunningCard$1 = (EntranceTunningParamVm$handleTunningCard$1) continuation;
            int i = entranceTunningParamVm$handleTunningCard$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                entranceTunningParamVm$handleTunningCard$1.label = i - Integer.MIN_VALUE;
            } else {
                entranceTunningParamVm$handleTunningCard$1 = new EntranceTunningParamVm$handleTunningCard$1(this, continuation);
            }
        } else {
            entranceTunningParamVm$handleTunningCard$1 = new EntranceTunningParamVm$handleTunningCard$1(this, continuation);
        }
        Object objZ = entranceTunningParamVm$handleTunningCard$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = entranceTunningParamVm$handleTunningCard$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                this = (EntranceTunningParamVm) entranceTunningParamVm$handleTunningCard$1.L$0;
                ResultKt.throwOnFailure(objZ);
            } else if (i2 == 2) {
                this = (EntranceTunningParamVm) entranceTunningParamVm$handleTunningCard$1.L$0;
                ResultKt.throwOnFailure(objZ);
                SwipeRepositoryKt.E((MultiActivateCardInfoRspVo) objZ);
                List<IotCardInfo> listM = SwipeRepositoryKt.m();
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listM, 10));
                it = listM.iterator();
                while (it.hasNext()) {
                    arrayList.add(((IotCardInfo) it.next()).getAid());
                }
                List list2 = CollectionsKt___CollectionsKt.toList(arrayList);
                entranceTunningParamVm$handleTunningCard$1.L$0 = this;
                entranceTunningParamVm$handleTunningCard$1.L$1 = arrayList;
                entranceTunningParamVm$handleTunningCard$1.label = 3;
                objZ = SwipeRepositoryKt.H(true, list2, entranceTunningParamVm$handleTunningCard$1);
                if (objZ == coroutine_suspended) {
                    return coroutine_suspended;
                }
                entranceTunningParamVm = this;
                list = arrayList;
                zBooleanValue = ((Boolean) objZ).booleanValue();
                t6b.b("TunningParamVm", "handleTunningCard cardList = " + list);
                if (!zBooleanValue) {
                    t6b.b("TunningParamVm", "handleTunningCard setCloudConfig fail");
                    ydc.n().v(59, "");
                    entranceTunningParamVm.innerLoading.postValue(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }
                ydc.n().v(58, "");
                t6b.b("TunningParamVm", "handleTunningCard managerId = " + SwipeRepositoryKt.u());
                SwipeSetting$SwitchCardConfig swipeSetting$SwitchCardConfigBuild = SwipeSetting$SwitchCardConfig.newBuilder().setMannerId(SwipeRepositoryKt.u()).addAllItems(entranceTunningParamVm.G(CollectionsKt___CollectionsKt.toHashSet(list))).build();
                entranceTunningParamVm$handleTunningCard$1.L$0 = entranceTunningParamVm;
                entranceTunningParamVm$handleTunningCard$1.L$1 = null;
                entranceTunningParamVm$handleTunningCard$1.label = 4;
                objZ = SwipeRepositoryKt.L(swipeSetting$SwitchCardConfigBuild, entranceTunningParamVm$handleTunningCard$1);
                if (objZ == coroutine_suspended) {
                    return coroutine_suspended;
                }
                entranceTunningParamVm2 = entranceTunningParamVm;
            } else if (i2 == 3) {
                list = (List) entranceTunningParamVm$handleTunningCard$1.L$1;
                entranceTunningParamVm = (EntranceTunningParamVm) entranceTunningParamVm$handleTunningCard$1.L$0;
                ResultKt.throwOnFailure(objZ);
                zBooleanValue = ((Boolean) objZ).booleanValue();
                t6b.b("TunningParamVm", "handleTunningCard cardList = " + list);
                if (!zBooleanValue) {
                    t6b.b("TunningParamVm", "handleTunningCard setCloudConfig fail");
                    ydc.n().v(59, "");
                    entranceTunningParamVm.innerLoading.postValue(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }
                ydc.n().v(58, "");
                t6b.b("TunningParamVm", "handleTunningCard managerId = " + SwipeRepositoryKt.u());
                SwipeSetting$SwitchCardConfig swipeSetting$SwitchCardConfigBuild2 = SwipeSetting$SwitchCardConfig.newBuilder().setMannerId(SwipeRepositoryKt.u()).addAllItems(entranceTunningParamVm.G(CollectionsKt___CollectionsKt.toHashSet(list))).build();
                entranceTunningParamVm$handleTunningCard$1.L$0 = entranceTunningParamVm;
                entranceTunningParamVm$handleTunningCard$1.L$1 = null;
                entranceTunningParamVm$handleTunningCard$1.label = 4;
                objZ = SwipeRepositoryKt.L(swipeSetting$SwitchCardConfigBuild2, entranceTunningParamVm$handleTunningCard$1);
                if (objZ == coroutine_suspended) {
                    return coroutine_suspended;
                }
                entranceTunningParamVm2 = entranceTunningParamVm;
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                entranceTunningParamVm2 = (EntranceTunningParamVm) entranceTunningParamVm$handleTunningCard$1.L$0;
                ResultKt.throwOnFailure(objZ);
            }
            t6b.b("TunningParamVm", "handleTunningCard sendDeviceSuccess = " + ((Boolean) objZ).booleanValue());
            entranceTunningParamVm2.innerLoading.postValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objZ);
        SwipeConfigs swipeConfigs = SwipeRepositoryKt.y().get(j7l.t());
        if (swipeConfigs == null || !((swipeConfigs.getSupportSwitch() || swipeConfigs.getSupportSmartSwitch()) && swipeConfigs.getSwitchOn())) {
            t6b.b("TunningParamVm", "handleTunningCard watch isNotSupport or switch is Off");
            this.innerLoading.postValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
        entranceTunningParamVm$handleTunningCard$1.L$0 = this;
        entranceTunningParamVm$handleTunningCard$1.label = 1;
        objZ = SwipeRepositoryKt.z(entranceTunningParamVm$handleTunningCard$1);
        if (objZ == coroutine_suspended) {
            return coroutine_suspended;
        }
        CombinationSwitchStatus combinationSwitchStatus = (CombinationSwitchStatus) objZ;
        if (combinationSwitchStatus.isSupport()) {
            String switchStatus = combinationSwitchStatus.getSwitchStatus();
            if (!(switchStatus == null || switchStatus.length() == 0)) {
                entranceTunningParamVm$handleTunningCard$1.L$0 = this;
                entranceTunningParamVm$handleTunningCard$1.label = 2;
                objZ = SwipeRepositoryKt.v(entranceTunningParamVm$handleTunningCard$1);
                if (objZ == coroutine_suspended) {
                    return coroutine_suspended;
                }
                SwipeRepositoryKt.E((MultiActivateCardInfoRspVo) objZ);
                List<IotCardInfo> listM2 = SwipeRepositoryKt.m();
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listM2, 10));
                it = listM2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((IotCardInfo) it.next()).getAid());
                }
                List list3 = CollectionsKt___CollectionsKt.toList(arrayList);
                entranceTunningParamVm$handleTunningCard$1.L$0 = this;
                entranceTunningParamVm$handleTunningCard$1.L$1 = arrayList;
                entranceTunningParamVm$handleTunningCard$1.label = 3;
                objZ = SwipeRepositoryKt.H(true, list3, entranceTunningParamVm$handleTunningCard$1);
                if (objZ == coroutine_suspended) {
                    return coroutine_suspended;
                }
                entranceTunningParamVm = this;
                list = arrayList;
                zBooleanValue = ((Boolean) objZ).booleanValue();
                t6b.b("TunningParamVm", "handleTunningCard cardList = " + list);
                if (!zBooleanValue) {
                    t6b.b("TunningParamVm", "handleTunningCard setCloudConfig fail");
                    ydc.n().v(59, "");
                    entranceTunningParamVm.innerLoading.postValue(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }
                ydc.n().v(58, "");
                t6b.b("TunningParamVm", "handleTunningCard managerId = " + SwipeRepositoryKt.u());
                SwipeSetting$SwitchCardConfig swipeSetting$SwitchCardConfigBuild3 = SwipeSetting$SwitchCardConfig.newBuilder().setMannerId(SwipeRepositoryKt.u()).addAllItems(entranceTunningParamVm.G(CollectionsKt___CollectionsKt.toHashSet(list))).build();
                entranceTunningParamVm$handleTunningCard$1.L$0 = entranceTunningParamVm;
                entranceTunningParamVm$handleTunningCard$1.L$1 = null;
                entranceTunningParamVm$handleTunningCard$1.label = 4;
                objZ = SwipeRepositoryKt.L(swipeSetting$SwitchCardConfigBuild3, entranceTunningParamVm$handleTunningCard$1);
                if (objZ == coroutine_suspended) {
                    return coroutine_suspended;
                }
                entranceTunningParamVm2 = entranceTunningParamVm;
                t6b.b("TunningParamVm", "handleTunningCard sendDeviceSuccess = " + ((Boolean) objZ).booleanValue());
                entranceTunningParamVm2.innerLoading.postValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
        }
        t6b.b("TunningParamVm", "handleTunningCard cloud not isSupport");
        this.innerLoading.postValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }

    public final boolean U() {
        SwipeConfigs swipeConfigs = SwipeRepositoryKt.y().get(j7l.t());
        t6b.b("TunningParamVm", "isSuperCardSwitchOn originCfg = " + swipeConfigs);
        if (swipeConfigs != null) {
            return (swipeConfigs.getSupportSwitch() || swipeConfigs.getSupportSmartSwitch()) && swipeConfigs.getSwitchOn();
        }
        return false;
    }

    public final void V(@Nullable String aid, @Nullable String appCode, int index) {
        t6b.b("TunningParamVm", "restoreParamIndex setSwipeParamIndex aid = " + aid + " ,index = " + index);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EntranceTunningParamVm$restoreParamIndex$1(this, aid, appCode, index, null), 3, null);
    }

    public final void W(String fileName) {
        bm5 bm5Var = gl4.devicePrimary;
        bm5Var.fileApi.m("conf", this.filTransferListener);
        bm5Var.fileApi.a(j7l.t(), "conf", 12, SwipeRepositoryKt.A() + fileName);
    }

    public final void X(@Nullable String aid, @Nullable String appCode, int index) {
        t6b.b("TunningParamVm", "setSwipeParamIndex aid = " + aid + ",index = " + index);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EntranceTunningParamVm$setSwipeParamIndex$1(this, aid, appCode, index, null), 3, null);
    }

    public final void Y(@Nullable String aid, @Nullable String appCode, int index) {
        t6b.b("TunningParamVm", "uploadTunningParam appCode = " + appCode + ",index = " + index);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EntranceTunningParamVm$uploadTunningParam$1(this, index, appCode, null), 3, null);
    }
}
