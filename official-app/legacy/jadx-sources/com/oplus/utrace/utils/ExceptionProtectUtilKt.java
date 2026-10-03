package com.oplus.utrace.utils;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u0005*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"OPLUS_CUSTOMIZE_CTA_USER_EXPERIENCE", "", "TAG", "readParcelableSafe", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "loader", "Ljava/lang/ClassLoader;", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroid/os/Parcelable;", "utrace-lib_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ExceptionProtectUtilKt {

    @NotNull
    private static final String OPLUS_CUSTOMIZE_CTA_USER_EXPERIENCE = "oplus_customize_cta_user_experience";

    @NotNull
    private static final String TAG = "UTrace.Lib.ProtectUtil";

    @Nullable
    public static final <T extends Parcelable> T readParcelableSafe(@NotNull Parcel parcel, @Nullable ClassLoader classLoader) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(parcel, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            Parcelable parcelable = parcel.readParcelable(classLoader);
            if (!(parcelable instanceof Parcelable)) {
                parcelable = null;
            }
            objM5287constructorimpl = Result.m5287constructorimpl(parcelable);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            Logs.INSTANCE.w(TAG, "readParcelableSafe: " + thM5290exceptionOrNullimpl.getMessage(), thM5290exceptionOrNullimpl);
        }
        return (T) (Result.m5293isFailureimpl(objM5287constructorimpl) ? null : objM5287constructorimpl);
    }
}
