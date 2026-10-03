package com.oplus.phonenoareainquire;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.text.TextUtils;
import com.heytap.health.watch.contact.netnumber.R;
import com.oplus.aiunit.vision.cke;
import com.oplus.aiunit.vision.erl;
import com.oplus.aiunit.vision.gqe;
import com.oplus.aiunit.vision.zr8;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/database/MatrixCursor;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.oplus.phonenoareainquire.PhoneNoInquireProviderTransaction$querySingleNumber$1", f = "PhoneNoInquireProviderTransaction.kt", i = {0, 0, 1, 1, 2, 2}, l = {60, 61, 62}, m = "invokeSuspend", n = {"numberInfoJob", "defaultCarrierNameJob", "defaultCarrierNameJob", "cursorWithoutCarrierName", "cursorWithoutCarrierName", "numberInfo"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
public final class PhoneNoInquireProviderTransaction$querySingleNumber$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MatrixCursor>, Object> {
    final /* synthetic */ String $countryIso;
    final /* synthetic */ MatrixCursor $defaultRes;
    final /* synthetic */ boolean $isDomesticSim;
    final /* synthetic */ boolean $isForceQueryDomestic;
    final /* synthetic */ boolean $isNeedCarrierInfo;
    final /* synthetic */ boolean $isRoam;
    final /* synthetic */ boolean $needCarrierNameIfNoCityName;
    final /* synthetic */ String $phoneNumber;
    final /* synthetic */ PhoneNoInquireProvider $provider;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNoInquireProviderTransaction$querySingleNumber$1(PhoneNoInquireProvider phoneNoInquireProvider, boolean z, boolean z2, String str, String str2, MatrixCursor matrixCursor, boolean z3, boolean z4, boolean z5, Continuation<? super PhoneNoInquireProviderTransaction$querySingleNumber$1> continuation) {
        super(2, continuation);
        this.$provider = phoneNoInquireProvider;
        this.$isNeedCarrierInfo = z;
        this.$needCarrierNameIfNoCityName = z2;
        this.$phoneNumber = str;
        this.$countryIso = str2;
        this.$defaultRes = matrixCursor;
        this.$isForceQueryDomestic = z3;
        this.$isRoam = z4;
        this.$isDomesticSim = z5;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        PhoneNoInquireProviderTransaction$querySingleNumber$1 phoneNoInquireProviderTransaction$querySingleNumber$1 = new PhoneNoInquireProviderTransaction$querySingleNumber$1(this.$provider, this.$isNeedCarrierInfo, this.$needCarrierNameIfNoCityName, this.$phoneNumber, this.$countryIso, this.$defaultRes, this.$isForceQueryDomestic, this.$isRoam, this.$isDomesticSim, continuation);
        phoneNoInquireProviderTransaction$querySingleNumber$1.L$0 = obj;
        return phoneNoInquireProviderTransaction$querySingleNumber$1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:48:0x015f  */
    /* JADX WARN: Code duplicated, block: B:56:0x018a  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x01da  */
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Deferred deferredAsync$default;
        Object objAwait;
        Deferred deferred;
        Deferred deferred2;
        Cursor cursor;
        Object objAwait2;
        gqe.NumberInfo numberInfo;
        Object objAwait3;
        gqe.NumberInfo numberInfo2;
        Cursor cursor2;
        String str;
        boolean z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                deferredAsync$default = (Deferred) this.L$1;
                deferred = (Deferred) this.L$0;
                ResultKt.throwOnFailure(obj);
                objAwait = obj;
            } else if (i == 2) {
                Cursor cursor3 = (Cursor) this.L$1;
                deferred2 = (Deferred) this.L$0;
                ResultKt.throwOnFailure(obj);
                cursor = cursor3;
                objAwait2 = obj;
                numberInfo = (gqe.NumberInfo) objAwait2;
                this.L$0 = cursor;
                this.L$1 = numberInfo;
                this.label = 3;
                objAwait3 = deferred2.await(this);
                if (objAwait3 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                numberInfo2 = numberInfo;
                cursor2 = cursor;
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                numberInfo2 = (gqe.NumberInfo) this.L$1;
                cursor2 = (Cursor) this.L$0;
                ResultKt.throwOnFailure(obj);
                objAwait3 = obj;
            }
            str = (String) objAwait3;
            if (cursor2.getCount() <= 0 && cursor2.moveToFirst()) {
                String string = cursor2.getString(cursor2.getColumnIndex("_id"));
                String string2 = cursor2.getString(cursor2.getColumnIndex(PhoneNoInquireProvider.AREANO));
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                String string3 = cursor2.getString(cursor2.getColumnIndex(PhoneNoInquireProvider.CITYNAME));
                objectRef.element = string3;
                Context context = this.$provider.getContext();
                boolean zAreEqual = Intrinsics.areEqual(string3, context != null ? context.getString(R.string.UNKONW_AREA) : null);
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = str;
                if (numberInfo2 != null) {
                    if (!TextUtils.isEmpty(numberInfo2.getMLocation())) {
                        objectRef.element = numberInfo2.getMLocation();
                    }
                    if (!TextUtils.isEmpty(numberInfo2.getMCarrier())) {
                        objectRef2.element = numberInfo2.getMCarrier();
                    }
                }
                if (zAreEqual) {
                    z = false;
                } else {
                    CharSequence charSequence = (CharSequence) objectRef.element;
                    if (charSequence == null || charSequence.length() == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (this.$isNeedCarrierInfo) {
                    PhoneNoInquireProvider phoneNoInquireProvider = this.$provider;
                    if (phoneNoInquireProvider.VERSION_CN) {
                        String str2 = (String) objectRef2.element;
                        if (str2 != null) {
                            String str3 = this.$phoneNumber;
                            String str4 = this.$countryIso;
                            Object obj2 = objectRef.element;
                            Intrinsics.checkNotNullExpressionValue(obj2, "location");
                            objectRef.element = cke.g(str2, (String) obj2, z, phoneNoInquireProvider.getContext(), str3, str4);
                        }
                    } else if (this.$needCarrierNameIfNoCityName && this.$provider.VERSION_CN && !z && !TextUtils.isEmpty((CharSequence) objectRef2.element) && cke.a(this.$provider.getContext(), this.$phoneNumber, this.$countryIso)) {
                        objectRef.element = objectRef2.element;
                    }
                } else if (this.$needCarrierNameIfNoCityName) {
                    objectRef.element = objectRef2.element;
                }
                this.$defaultRes.addRow(new String[]{string, string2, (String) objectRef.element});
            } else if ((this.$isNeedCarrierInfo || this.$needCarrierNameIfNoCityName) && this.$provider.VERSION_CN) {
                if ((str != null ? !StringsKt.isBlank(str) : false) && cke.a(this.$provider.getContext(), this.$phoneNumber, this.$countryIso)) {
                    this.$defaultRes.addRow(new String[]{erl.IDENTIFY_UNIFIED_WEB_CONTAINER_VALUE, "0000", str});
                }
            }
            return this.$defaultRes;
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        zr8 zr8Var = zr8.INSTANCE;
        Deferred deferredAsync$default2 = BuildersKt.async$default(coroutineScope, zr8Var.d(), (CoroutineStart) null, new PhoneNoInquireProviderTransaction$querySingleNumber$1$cursorWithoutCarrierNameJob$1(this.$provider, this.$phoneNumber, this.$countryIso, this.$isForceQueryDomestic, this.$isRoam, this.$isDomesticSim, this.$defaultRes, null), 2, (Object) null);
        Deferred deferredAsync$default3 = BuildersKt.async$default(coroutineScope, zr8Var.d(), (CoroutineStart) null, new PhoneNoInquireProviderTransaction$querySingleNumber$1$numberInfoJob$1(this.$provider, this.$phoneNumber, null), 2, (Object) null);
        deferredAsync$default = BuildersKt.async$default(coroutineScope, zr8Var.d(), (CoroutineStart) null, new PhoneNoInquireProviderTransaction$querySingleNumber$1$defaultCarrierNameJob$1(this.$provider, this.$phoneNumber, this.$countryIso, null), 2, (Object) null);
        this.L$0 = deferredAsync$default3;
        this.L$1 = deferredAsync$default;
        this.label = 1;
        objAwait = deferredAsync$default2.await(this);
        if (objAwait == coroutine_suspended) {
            return coroutine_suspended;
        }
        deferred = deferredAsync$default3;
        deferred2 = deferredAsync$default;
        cursor = (Cursor) objAwait;
        this.L$0 = deferred2;
        this.L$1 = cursor;
        this.label = 2;
        objAwait2 = deferred.await(this);
        if (objAwait2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        numberInfo = (gqe.NumberInfo) objAwait2;
        this.L$0 = cursor;
        this.L$1 = numberInfo;
        this.label = 3;
        objAwait3 = deferred2.await(this);
        if (objAwait3 == coroutine_suspended) {
            return coroutine_suspended;
        }
        numberInfo2 = numberInfo;
        cursor2 = cursor;
        str = (String) objAwait3;
        if (cursor2.getCount() <= 0) {
            if (this.$isNeedCarrierInfo) {
                if (str != null ? !StringsKt.isBlank(str) : false) {
                    this.$defaultRes.addRow(new String[]{erl.IDENTIFY_UNIFIED_WEB_CONTAINER_VALUE, "0000", str});
                }
            } else {
                if (str != null ? !StringsKt.isBlank(str) : false) {
                    this.$defaultRes.addRow(new String[]{erl.IDENTIFY_UNIFIED_WEB_CONTAINER_VALUE, "0000", str});
                }
            }
        } else if (this.$isNeedCarrierInfo) {
            if (str != null ? !StringsKt.isBlank(str) : false) {
                this.$defaultRes.addRow(new String[]{erl.IDENTIFY_UNIFIED_WEB_CONTAINER_VALUE, "0000", str});
            }
        } else {
            if (str != null ? !StringsKt.isBlank(str) : false) {
                this.$defaultRes.addRow(new String[]{erl.IDENTIFY_UNIFIED_WEB_CONTAINER_VALUE, "0000", str});
            }
        }
        return this.$defaultRes;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super MatrixCursor> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }
}
