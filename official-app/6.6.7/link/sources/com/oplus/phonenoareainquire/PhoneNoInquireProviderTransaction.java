package com.oplus.phonenoareainquire;

import android.database.Cursor;
import android.database.MatrixCursor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014JL\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007J\u0006\u0010\u0010\u001a\u00020\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/oplus/phonenoareainquire/PhoneNoInquireProviderTransaction;", "", "Lcom/oplus/phonenoareainquire/PhoneNoInquireProvider;", "provider", "", "phoneNumber", "countryIso", "", "isNeedCarrierInfo", "needCarrierNameIfNoCityName", "isForceQueryDomestic", "isRoam", "isDomesticSim", "Landroid/database/Cursor;", "b", "", "a", "TAG", "Ljava/lang/String;", "<init>", "()V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
public final class PhoneNoInquireProviderTransaction {

    @NotNull
    public static final PhoneNoInquireProviderTransaction INSTANCE = new PhoneNoInquireProviderTransaction();

    @NotNull
    public static final String TAG = "PhoneNoInquireProviderTransaction";

    public final void a() {
        BuildersKt.runBlocking$default((CoroutineContext) null, new PhoneNoInquireProviderTransaction$init$1(null), 1, (Object) null);
    }

    @NotNull
    public final Cursor b(@NotNull PhoneNoInquireProvider provider, @NotNull String phoneNumber, @Nullable String countryIso, boolean isNeedCarrierInfo, boolean needCarrierNameIfNoCityName, boolean isForceQueryDomestic, boolean isRoam, boolean isDomesticSim) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", PhoneNoInquireProvider.AREANO, PhoneNoInquireProvider.CITYNAME}, 1);
        BuildersKt.runBlocking$default((CoroutineContext) null, new PhoneNoInquireProviderTransaction$querySingleNumber$1(provider, isNeedCarrierInfo, needCarrierNameIfNoCityName, phoneNumber, countryIso, matrixCursor, isForceQueryDomestic, isRoam, isDomesticSim, null), 1, (Object) null);
        return matrixCursor;
    }
}
