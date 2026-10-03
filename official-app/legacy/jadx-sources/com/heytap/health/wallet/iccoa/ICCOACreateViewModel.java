package com.heytap.health.wallet.iccoa;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.wallet.entrance.R$string;
import com.heytap.health.wallet.network.ErrorResponse;
import com.heytap.health.wallet.network.car.params.VerifyIssuerCardReq;
import com.heytap.health.wallet.network.car.rsp.VerifyIssuerCardRsp;
import com.heytap.health.wallet.router.WatchCardsUpdateService;
import com.heytap.health.wallet.transmit.WearMsgProcessorKt;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.CreateKeyError;
import com.oplus.aiunit.vision.CreateKeyResult;
import com.oplus.aiunit.vision.aec;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ol4;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.wq8;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.y6l;
import com.oppo.wear.wallet.proto.GetServiceStatusProto$GetServiceStatus;
import com.oppo.wear.wallet.proto.IccoaDkfConstant$ICCOAErrorCode;
import com.oppo.wear.wallet.proto.IccoaDkfConstant$State;
import com.oppo.wear.wallet.proto.UserStatement$UserStatementRequest;
import io.protostuff.MapSchema;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bK\u0010LJ\f\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0007J\\\u0010\u0015\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\nJ\\\u0010\u0018\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\n2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u0019\u001a\u00020\u0007J\b\u0010\u001a\u001a\u00020\u0007H\u0014J\u001b\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\nH\u0002R\u0014\u0010$\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001f\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002000%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010(R\u001d\u00105\u001a\b\u0012\u0004\u0012\u0002000*8\u0006¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b4\u0010.R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002060%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010(R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u0002060*8\u0006¢\u0006\f\n\u0004\b9\u0010,\u001a\u0004\b:\u0010.R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020<0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010(R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020<0%8\u0006¢\u0006\f\n\u0004\b?\u0010(\u001a\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010DR\u0018\u0010J\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006M"}, d2 = {"Lcom/heytap/health/wallet/iccoa/ICCOACreateViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/heytap/health/wallet/network/ErrorResponse;", "", ExifInterface.LONGITUDE_EAST, "Lcom/heytap/health/wallet/network/car/params/VerifyIssuerCardReq;", "req", "", "Q", "M", "", f04.KEY_FRIENDLY_NAME, "", f04.KEY_VEHICLE_OEM_ID, f04.KEY_VEHICLE_ID, "sessionId", f04.KEY_BRAND_ID, "", f04.KEY_WIRELESS_CAPABILITIES, "vehiclePkgName", f04.KEY_AUTH_MODEL, "G", f04.KEY_SHARED_ID, f04.KEY_FRIEND_SESSION_ID, UserInfo.SEX_FEMALE, SecureGcmConstants.MESSAGE_KEY, "onCleared", "J", "(Lcom/heytap/health/wallet/network/car/params/VerifyIssuerCardReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "O", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aid", "N", "i", "Ljava/lang/String;", "TAG", "Landroidx/lifecycle/MutableLiveData;", "Lcom/heytap/health/wallet/network/car/rsp/VerifyIssuerCardRsp;", "j", "Landroidx/lifecycle/MutableLiveData;", "_verifyResult", "Landroidx/lifecycle/LiveData;", MapSchema.FIELD_NAME_KEY, "Landroidx/lifecycle/LiveData;", "K", "()Landroidx/lifecycle/LiveData;", "verifyResult", "Lcom/oplus/aiunit/vision/gd4;", LogFieldKey.LEVEL_KEY, "_createKeyResult", LogFieldKey.MESSAGE_KEY, "I", "createKeyResult", "Lcom/oplus/aiunit/vision/fd4;", "n", "_createKeyError", "o", "H", "createKeyError", "", LogFieldKey.PROCESS_NAME_KEY, "_isShowAgree", "q", "L", "()Landroidx/lifecycle/MutableLiveData;", "isShowAgree", "r", "Z", "isVerifying", "s", "isCreating", "t", "Lcom/heytap/health/wallet/network/car/params/VerifyIssuerCardReq;", "currentVerifyReq", "<init>", "()V", "entrance_release"}, k = 1, mv = {1, 8, 0})
public final class ICCOACreateViewModel extends ViewModel {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "ICCOA_ViewModel";

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<VerifyIssuerCardRsp> _verifyResult;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final LiveData<VerifyIssuerCardRsp> verifyResult;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<CreateKeyResult> _createKeyResult;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final LiveData<CreateKeyResult> createKeyResult;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<CreateKeyError> _createKeyError;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final LiveData<CreateKeyError> createKeyError;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Boolean> _isShowAgree;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Boolean> isShowAgree;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public boolean isVerifying;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public boolean isCreating;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public VerifyIssuerCardReq currentVerifyReq;

    public ICCOACreateViewModel() {
        MutableLiveData<VerifyIssuerCardRsp> mutableLiveData = new MutableLiveData<>();
        this._verifyResult = mutableLiveData;
        this.verifyResult = mutableLiveData;
        MutableLiveData<CreateKeyResult> mutableLiveData2 = new MutableLiveData<>();
        this._createKeyResult = mutableLiveData2;
        this.createKeyResult = mutableLiveData2;
        MutableLiveData<CreateKeyError> mutableLiveData3 = new MutableLiveData<>();
        this._createKeyError = mutableLiveData3;
        this.createKeyError = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>();
        this._isShowAgree = mutableLiveData4;
        this.isShowAgree = mutableLiveData4;
    }

    public final int E(@Nullable ErrorResponse errorResponse) {
        String code;
        try {
            ErrorResponse errorResponseC = ICCOACreateRepositoryKt.c();
            if (errorResponseC == null || (code = errorResponseC.getCode()) == null) {
                return -1;
            }
            return Integer.parseInt(code);
        } catch (Exception unused) {
            return -1;
        }
    }

    public final void F(@Nullable String friendlyName, @Nullable String shareId, @Nullable String friendSessionId, @Nullable String brandId, @Nullable byte[] vehicleOemId, @Nullable String authedModel, @Nullable List<String> wirelessCapabilities, @Nullable String vehiclePkgName) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), wq8.INSTANCE.e(), null, new ICCOACreateViewModel$confirmDigitalKeySharing$1(friendlyName, shareId, friendSessionId, brandId, vehicleOemId, authedModel, wirelessCapabilities, vehiclePkgName, this, null), 2, null);
    }

    public final void G(@Nullable String friendlyName, @Nullable byte[] vehicleOemId, @Nullable byte[] vehicleId, @Nullable String sessionId, @Nullable String brandId, @Nullable List<String> wirelessCapabilities, @Nullable String vehiclePkgName, @Nullable String authedModel) {
        t6b.b(this.TAG, "createIccoaCard called");
        if (this.isCreating) {
            t6b.i(this.TAG, "createIccoaCard is already running, ignore this call");
        } else {
            this.isCreating = true;
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), wq8.INSTANCE.e(), null, new ICCOACreateViewModel$createIccoaCard$1(friendlyName, vehicleOemId, vehicleId, sessionId, brandId, wirelessCapabilities, vehiclePkgName, authedModel, this, null), 2, null);
        }
    }

    @NotNull
    public final LiveData<CreateKeyError> H() {
        return this.createKeyError;
    }

    @NotNull
    public final LiveData<CreateKeyResult> I() {
        return this.createKeyResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J(VerifyIssuerCardReq verifyIssuerCardReq, Continuation<? super Unit> continuation) {
        ICCOACreateViewModel$getICCOAAgree$1 iCCOACreateViewModel$getICCOAAgree$1;
        if (continuation instanceof ICCOACreateViewModel$getICCOAAgree$1) {
            iCCOACreateViewModel$getICCOAAgree$1 = (ICCOACreateViewModel$getICCOAAgree$1) continuation;
            int i = iCCOACreateViewModel$getICCOAAgree$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iCCOACreateViewModel$getICCOAAgree$1.label = i - Integer.MIN_VALUE;
            } else {
                iCCOACreateViewModel$getICCOAAgree$1 = new ICCOACreateViewModel$getICCOAAgree$1(this, continuation);
            }
        } else {
            iCCOACreateViewModel$getICCOAAgree$1 = new ICCOACreateViewModel$getICCOAAgree$1(this, continuation);
        }
        Object objE = iCCOACreateViewModel$getICCOAAgree$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = iCCOACreateViewModel$getICCOAAgree$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                verifyIssuerCardReq = (VerifyIssuerCardReq) iCCOACreateViewModel$getICCOAAgree$1.L$1;
                this = (ICCOACreateViewModel) iCCOACreateViewModel$getICCOAAgree$1.L$0;
                ResultKt.throwOnFailure(objE);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (ICCOACreateViewModel) iCCOACreateViewModel$getICCOAAgree$1.L$0;
                ResultKt.throwOnFailure(objE);
            }
            this._isShowAgree.postValue(Boxing.boxBoolean(false));
            t6b.b(this.TAG, "User already agreed, continue with card creation");
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objE);
        t6b.b(this.TAG, "getICCOAAgree");
        UserStatement$UserStatementRequest.Builder builderNewBuilder = UserStatement$UserStatementRequest.newBuilder();
        builderNewBuilder.setShowAgreement(false);
        builderNewBuilder.setScene("Createkey");
        UserStatement$UserStatementRequest userStatement$UserStatementRequestBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(userStatement$UserStatementRequestBuild, "request.build()");
        iCCOACreateViewModel$getICCOAAgree$1.L$0 = this;
        iCCOACreateViewModel$getICCOAAgree$1.L$1 = verifyIssuerCardReq;
        iCCOACreateViewModel$getICCOAAgree$1.label = 1;
        objE = ICCOACreateRepositoryKt.e(userStatement$UserStatementRequestBuild, iCCOACreateViewModel$getICCOAAgree$1);
        if (objE == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (Intrinsics.areEqual((Boolean) objE, Boxing.boxBoolean(true))) {
            iCCOACreateViewModel$getICCOAAgree$1.L$0 = this;
            iCCOACreateViewModel$getICCOAAgree$1.L$1 = null;
            iCCOACreateViewModel$getICCOAAgree$1.label = 2;
            if (this.R(verifyIssuerCardReq, iCCOACreateViewModel$getICCOAAgree$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            this._isShowAgree.postValue(Boxing.boxBoolean(false));
            t6b.b(this.TAG, "User already agreed, continue with card creation");
        } else {
            this._isShowAgree.postValue(Boxing.boxBoolean(true));
            t6b.b(this.TAG, "User not agreed, show authorization dialog");
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final LiveData<VerifyIssuerCardRsp> K() {
        return this.verifyResult;
    }

    @NotNull
    public final MutableLiveData<Boolean> L() {
        return this.isShowAgree;
    }

    public final void M() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), wq8.INSTANCE.e(), null, new ICCOACreateViewModel$sendGoToAgree$1(this, null), 2, null);
    }

    public final void N(String aid) {
        t6b.b(this.TAG, "send car Image aid = " + aid);
        Object objNavigation = x0.d().b("/main/watchCardsUpdate").navigation();
        Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.wallet.router.WatchCardsUpdateService");
        ((WatchCardsUpdateService) objNavigation).j7(aid);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O(Continuation<? super Unit> continuation) {
        ICCOACreateViewModel$setWatchVersionCache$1 iCCOACreateViewModel$setWatchVersionCache$1;
        String str;
        Object objC;
        Exception e2;
        String str2;
        if (continuation instanceof ICCOACreateViewModel$setWatchVersionCache$1) {
            iCCOACreateViewModel$setWatchVersionCache$1 = (ICCOACreateViewModel$setWatchVersionCache$1) continuation;
            int i = iCCOACreateViewModel$setWatchVersionCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iCCOACreateViewModel$setWatchVersionCache$1.label = i - Integer.MIN_VALUE;
            } else {
                iCCOACreateViewModel$setWatchVersionCache$1 = new ICCOACreateViewModel$setWatchVersionCache$1(this, continuation);
            }
        } else {
            iCCOACreateViewModel$setWatchVersionCache$1 = new ICCOACreateViewModel$setWatchVersionCache$1(this, continuation);
        }
        Object obj = iCCOACreateViewModel$setWatchVersionCache$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = iCCOACreateViewModel$setWatchVersionCache$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            str = "0";
            try {
                String currActiveMac = gl4.managerApi.getCurrActiveMac();
                iCCOACreateViewModel$setWatchVersionCache$1.L$0 = this;
                iCCOACreateViewModel$setWatchVersionCache$1.L$1 = "0";
                iCCOACreateViewModel$setWatchVersionCache$1.label = 1;
                objC = WearMsgProcessorKt.c(currActiveMac, iCCOACreateViewModel$setWatchVersionCache$1);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e3) {
                e2 = e3;
                t6b.d(this.TAG, "exception encountered while getApkVersion e = " + e2.getMessage());
                aec.v(false);
                str2 = str;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) iCCOACreateViewModel$setWatchVersionCache$1.L$1;
            ICCOACreateViewModel iCCOACreateViewModel = (ICCOACreateViewModel) iCCOACreateViewModel$setWatchVersionCache$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                str = str3;
                this = iCCOACreateViewModel;
                objC = obj;
            } catch (Exception e4) {
                str = str3;
                this = iCCOACreateViewModel;
                e2 = e4;
                t6b.d(this.TAG, "exception encountered while getApkVersion e = " + e2.getMessage());
                aec.v(false);
                str2 = str;
            }
        }
        str2 = (String) objC;
        if (Integer.parseInt(str2) >= 10000) {
            aec.w(str2);
        }
        t6b.b(this.TAG, "setWatchVersionCache completed, version: " + str2 + ", isSupportAgree: " + aec.l());
        return Unit.INSTANCE;
    }

    public final void P() {
        MutableLiveData<CreateKeyError> mutableLiveData = this._createKeyError;
        String string = b78.a().getString(R$string.iccoa_fail_text);
        Intrinsics.checkNotNullExpressionValue(string, "getAppContext().getStrin…R.string.iccoa_fail_text)");
        mutableLiveData.postValue(new CreateKeyError(string, "", -1, false, 8, null));
    }

    public final void Q(@NotNull VerifyIssuerCardReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        t6b.b(this.TAG, "verifyIssuerCard: " + req);
        if (this.isVerifying) {
            t6b.i(this.TAG, "verifyIssuerCard is already running, ignore this call");
            return;
        }
        ol4 ol4Var = gl4.managerApi;
        if (!ol4Var.isCurrentConnected()) {
            MutableLiveData<CreateKeyError> mutableLiveData = this._createKeyError;
            String string = b78.a().getString(R$string.iccoa_fail_text);
            Intrinsics.checkNotNullExpressionValue(string, "getAppContext()\n        …R.string.iccoa_fail_text)");
            String string2 = b78.a().getString(R$string.iccoa_key_bt_disconnect);
            Intrinsics.checkNotNullExpressionValue(string2, "getAppContext()\n        ….iccoa_key_bt_disconnect)");
            mutableLiveData.postValue(new CreateKeyError(string, string2, E(ICCOACreateRepositoryKt.c()), false, 8, null));
            return;
        }
        if (!y6l.a(ol4Var.getCurrentConnectId()).a()) {
            this.isVerifying = true;
            this.currentVerifyReq = req;
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), wq8.INSTANCE.e(), null, new ICCOACreateViewModel$verifyIssuerCard$1(this, req, null), 2, null);
        } else {
            MutableLiveData<CreateKeyError> mutableLiveData2 = this._createKeyError;
            String string3 = b78.a().getString(R$string.iccoa_fail_text);
            Intrinsics.checkNotNullExpressionValue(string3, "getAppContext()\n        …R.string.iccoa_fail_text)");
            String string4 = b78.a().getString(R$string.iccoa_key_watch_stubmode);
            Intrinsics.checkNotNullExpressionValue(string4, "getAppContext()\n        …iccoa_key_watch_stubmode)");
            mutableLiveData2.postValue(new CreateKeyError(string3, string4, E(ICCOACreateRepositoryKt.c()), false, 8, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0166  */
    /* JADX WARN: Code duplicated, block: B:59:0x016d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0175  */
    /* JADX WARN: Code duplicated, block: B:66:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object R(VerifyIssuerCardReq verifyIssuerCardReq, Continuation<? super Unit> continuation) {
        ICCOACreateViewModel$verifyPreCard$1 iCCOACreateViewModel$verifyPreCard$1;
        VerifyIssuerCardReq verifyIssuerCardReq2;
        Object objD;
        IccoaDkfConstant$State state;
        IccoaDkfConstant$State state2;
        IccoaDkfConstant$State state3;
        IccoaDkfConstant$State state4;
        VerifyIssuerCardRsp verifyIssuerCardRsp;
        ErrorResponse errorResponseC;
        String string;
        ICCOACreateViewModel iCCOACreateViewModel = this;
        if (continuation instanceof ICCOACreateViewModel$verifyPreCard$1) {
            iCCOACreateViewModel$verifyPreCard$1 = (ICCOACreateViewModel$verifyPreCard$1) continuation;
            int i = iCCOACreateViewModel$verifyPreCard$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iCCOACreateViewModel$verifyPreCard$1.label = i - Integer.MIN_VALUE;
            } else {
                iCCOACreateViewModel$verifyPreCard$1 = new ICCOACreateViewModel$verifyPreCard$1(iCCOACreateViewModel, continuation);
            }
        } else {
            iCCOACreateViewModel$verifyPreCard$1 = new ICCOACreateViewModel$verifyPreCard$1(iCCOACreateViewModel, continuation);
        }
        Object objG = iCCOACreateViewModel$verifyPreCard$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = iCCOACreateViewModel$verifyPreCard$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                VerifyIssuerCardReq verifyIssuerCardReq3 = (VerifyIssuerCardReq) iCCOACreateViewModel$verifyPreCard$1.L$1;
                ICCOACreateViewModel iCCOACreateViewModel2 = (ICCOACreateViewModel) iCCOACreateViewModel$verifyPreCard$1.L$0;
                ResultKt.throwOnFailure(objG);
                verifyIssuerCardReq2 = verifyIssuerCardReq3;
                iCCOACreateViewModel = iCCOACreateViewModel2;
                objD = objG;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iCCOACreateViewModel = (ICCOACreateViewModel) iCCOACreateViewModel$verifyPreCard$1.L$0;
                ResultKt.throwOnFailure(objG);
            }
            verifyIssuerCardRsp = (VerifyIssuerCardRsp) objG;
            if (verifyIssuerCardRsp != null) {
                iCCOACreateViewModel._verifyResult.postValue(verifyIssuerCardRsp);
            } else {
                String str = iCCOACreateViewModel.TAG;
                ErrorResponse errorResponseC2 = ICCOACreateRepositoryKt.c();
                t6b.i(str, "getStatus error: " + (errorResponseC2 != null ? errorResponseC2.getCode() : null));
                MutableLiveData<CreateKeyError> mutableLiveData = iCCOACreateViewModel._createKeyError;
                String string2 = b78.a().getString(R$string.iccoa_fail_text);
                Intrinsics.checkNotNullExpressionValue(string2, "getAppContext()\n        …R.string.iccoa_fail_text)");
                errorResponseC = ICCOACreateRepositoryKt.c();
                if (errorResponseC != null || (string = errorResponseC.getMessage()) == null) {
                    string = b78.b().getString(com.oppo.lib.common.R$string.system_error_please_try_again);
                    Intrinsics.checkNotNullExpressionValue(string, "getApplication()\n       …m_error_please_try_again)");
                }
                mutableLiveData.postValue(new CreateKeyError(string2, string, iCCOACreateViewModel.E(ICCOACreateRepositoryKt.c()), false, 8, null));
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objG);
        iCCOACreateViewModel$verifyPreCard$1.L$0 = iCCOACreateViewModel;
        verifyIssuerCardReq2 = verifyIssuerCardReq;
        iCCOACreateViewModel$verifyPreCard$1.L$1 = verifyIssuerCardReq2;
        iCCOACreateViewModel$verifyPreCard$1.label = 1;
        objD = ICCOACreateRepositoryKt.d(iCCOACreateViewModel$verifyPreCard$1);
        if (objD == coroutine_suspended) {
            return coroutine_suspended;
        }
        GetServiceStatusProto$GetServiceStatus getServiceStatusProto$GetServiceStatus = (GetServiceStatusProto$GetServiceStatus) objD;
        t6b.b(iCCOACreateViewModel.TAG, "getStatus = " + getServiceStatusProto$GetServiceStatus);
        t6b.b(iCCOACreateViewModel.TAG, "getStatus code= " + ((getServiceStatusProto$GetServiceStatus == null || (state4 = getServiceStatusProto$GetServiceStatus.getState()) == null) ? null : state4.getCode()));
        t6b.b(iCCOACreateViewModel.TAG, "getStatus codeValue= " + ((getServiceStatusProto$GetServiceStatus == null || (state3 = getServiceStatusProto$GetServiceStatus.getState()) == null) ? null : Boxing.boxInt(state3.getCodeValue())));
        t6b.b(iCCOACreateViewModel.TAG, "getStatus message= " + ((getServiceStatusProto$GetServiceStatus == null || (state2 = getServiceStatusProto$GetServiceStatus.getState()) == null) ? null : state2.getErrorMessage()));
        t6b.b(iCCOACreateViewModel.TAG, "getStatus additionalInfo= " + ((getServiceStatusProto$GetServiceStatus == null || (state = getServiceStatusProto$GetServiceStatus.getState()) == null) ? null : state.getAdditionalInfo()));
        if (getServiceStatusProto$GetServiceStatus == null) {
            MutableLiveData<CreateKeyError> mutableLiveData2 = iCCOACreateViewModel._createKeyError;
            String string3 = b78.a().getString(R$string.iccoa_fail_text);
            Intrinsics.checkNotNullExpressionValue(string3, "getAppContext()\n        …R.string.iccoa_fail_text)");
            String string4 = b78.b().getString(R$string.iccoa_key_device_support);
            Intrinsics.checkNotNullExpressionValue(string4, "getApplication()\n       …iccoa_key_device_support)");
            mutableLiveData2.postValue(new CreateKeyError(string3, string4, 213023, false, 8, null));
            return Unit.INSTANCE;
        }
        IccoaDkfConstant$State state5 = getServiceStatusProto$GetServiceStatus.getState();
        if ((state5 != null ? state5.getCode() : null) == IccoaDkfConstant$ICCOAErrorCode.ICCOA_ERROR_CODE_SUCCESS) {
            iCCOACreateViewModel$verifyPreCard$1.L$0 = iCCOACreateViewModel;
            iCCOACreateViewModel$verifyPreCard$1.L$1 = null;
            iCCOACreateViewModel$verifyPreCard$1.label = 2;
            objG = ICCOACreateRepositoryKt.g(verifyIssuerCardReq2, iCCOACreateViewModel$verifyPreCard$1);
            if (objG == coroutine_suspended) {
                return coroutine_suspended;
            }
            verifyIssuerCardRsp = (VerifyIssuerCardRsp) objG;
            if (verifyIssuerCardRsp != null) {
                iCCOACreateViewModel._verifyResult.postValue(verifyIssuerCardRsp);
            } else {
                String str2 = iCCOACreateViewModel.TAG;
                ErrorResponse errorResponseC3 = ICCOACreateRepositoryKt.c();
                if (errorResponseC3 != null) {
                }
                t6b.i(str2, "getStatus error: " + (errorResponseC3 != null ? errorResponseC3.getCode() : null));
                MutableLiveData<CreateKeyError> mutableLiveData3 = iCCOACreateViewModel._createKeyError;
                String string5 = b78.a().getString(R$string.iccoa_fail_text);
                Intrinsics.checkNotNullExpressionValue(string5, "getAppContext()\n        …R.string.iccoa_fail_text)");
                errorResponseC = ICCOACreateRepositoryKt.c();
                if (errorResponseC != null) {
                    string = b78.b().getString(com.oppo.lib.common.R$string.system_error_please_try_again);
                    Intrinsics.checkNotNullExpressionValue(string, "getApplication()\n       …m_error_please_try_again)");
                } else {
                    string = b78.b().getString(com.oppo.lib.common.R$string.system_error_please_try_again);
                    Intrinsics.checkNotNullExpressionValue(string, "getApplication()\n       …m_error_please_try_again)");
                }
                mutableLiveData3.postValue(new CreateKeyError(string5, string, iCCOACreateViewModel.E(ICCOACreateRepositoryKt.c()), false, 8, null));
            }
        } else {
            String str3 = iCCOACreateViewModel.TAG;
            ErrorResponse errorResponseC4 = ICCOACreateRepositoryKt.c();
            t6b.i(str3, "getStatus error2: " + (errorResponseC4 != null ? errorResponseC4.getCode() : null));
            IccoaDkfConstant$State state6 = getServiceStatusProto$GetServiceStatus.getState();
            IccoaDkfConstant$ICCOAErrorCode code = state6 != null ? state6.getCode() : null;
            IccoaDkfConstant$State state7 = getServiceStatusProto$GetServiceStatus.getState();
            String additionalInfo = state7 != null ? state7.getAdditionalInfo() : null;
            if (code == IccoaDkfConstant$ICCOAErrorCode.ICCOA_ERROR_CODE_NETWORK_UNAVAILABLE) {
                additionalInfo = b78.b().getString(R$string.network_not);
            }
            if (code == IccoaDkfConstant$ICCOAErrorCode.ICCOA_ERROR_CODE_APPLET_BUSY) {
                additionalInfo = b78.b().getString(R$string.iccoa_key_num_limit);
            }
            MutableLiveData<CreateKeyError> mutableLiveData4 = iCCOACreateViewModel._createKeyError;
            String string6 = b78.a().getString(R$string.iccoa_fail_text);
            Intrinsics.checkNotNullExpressionValue(string6, "getAppContext().getStrin…R.string.iccoa_fail_text)");
            if (additionalInfo == null) {
                additionalInfo = b78.b().getString(com.oppo.lib.common.R$string.system_error_please_try_again);
                Intrinsics.checkNotNullExpressionValue(additionalInfo, "getApplication()\n       …m_error_please_try_again)");
            }
            String str4 = additionalInfo;
            IccoaDkfConstant$State state8 = getServiceStatusProto$GetServiceStatus.getState();
            mutableLiveData4.postValue(new CreateKeyError(string6, str4, state8 != null ? state8.getCodeValue() : -1, false, 8, null));
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
    }
}
