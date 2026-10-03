package com.oplus.utrace.utils;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u0005*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"OPLUS_CUSTOMIZE_CTA_USER_EXPERIENCE", "", "TAG", "readParcelableSafe", "T", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "loader", "Ljava/lang/ClassLoader;", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroid/os/Parcelable;", "utrace-lib_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ExceptionProtectUtilKt {

    @NotNull
    private static final String OPLUS_CUSTOMIZE_CTA_USER_EXPERIENCE = "oplus_customize_cta_user_experience";

    @NotNull
    private static final String TAG = "UTrace.Lib.ProtectUtil";

    @Nullable
    public static final <T extends Parcelable> T readParcelableSafe(@NotNull Parcel parcel, @Nullable ClassLoader classLoader) {
        Object obj;
        Intrinsics.checkNotNullParameter(parcel, "<this>");
        try {
            Result.Companion companion = Result.Companion;
            Parcelable parcelable = parcel.readParcelable(classLoader);
            if (!(parcelable instanceof Parcelable)) {
                parcelable = null;
            }
            obj = Result.constructor-impl(parcelable);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logs.INSTANCE.w(TAG, "readParcelableSafe: " + th2.getMessage(), th2);
        }
        return (T) (Result.isFailure-impl(obj) ? null : obj);
    }
}
