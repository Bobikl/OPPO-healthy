package com.heytap.health.device_settings.setting;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u001a=\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\f\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "enable", "", "mac", "Lkotlin/Function1;", "", "parse", "b", "(ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ljava/lang/String;", "TAG", "device_settings_release"}, k = 2, mv = {1, 8, 0})
public final class IWatchCallExtKt {

    @NotNull
    public static final String a = "IWatchCallExt";

    @Nullable
    public static final <T> Object b(boolean z, @NotNull String str, @NotNull Function1<? super byte[], ? extends T> function1, @NotNull Continuation<? super Boolean> continuation) {
        return CoroutineScopeKt.coroutineScope(new IWatchCallExtKt$sendCallSwitch$2(z, str, function1, null), continuation);
    }
}
