package com.heytap.health.esim.nsc.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.format.DateUtils;
import android.text.format.Formatter;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.esim.R$string;
import com.heytap.health.esim.nsc.UserComboManagerActivity;
import com.heytap.health.esim.nsc.dto.UserCombo;
import com.heytap.sporthealth.blib.helper.SimplifyDialogKt;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bJA\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\u001c\u0010\u0013\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\u001e\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/heytap/health/esim/nsc/utils/NSCHelper;", "", "", ClickApiEntity.TIME, "", b2n.g, "i", b2n.f, "", "size", "c", "", "type", "", "b", "D", "retryTimes", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "run", MapSchema.FIELD_NAME_ENTRY, "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/heytap/health/esim/nsc/dto/UserCombo;", "userCombos", "Lkotlin/Pair;", "a", "Landroid/app/Activity;", "activity", "stable", "mac", "", "d", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNSCHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NSCHelper.kt\ncom/heytap/health/esim/nsc/utils/NSCHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,100:1\n1477#2:101\n1502#2,3:102\n1505#2,3:112\n372#3,7:105\n*S KotlinDebug\n*F\n+ 1 NSCHelper.kt\ncom/heytap/health/esim/nsc/utils/NSCHelper\n*L\n63#1:101\n63#1:102,3\n63#1:112,3\n63#1:105,7\n*E\n"})
public final class NSCHelper {
    public static final int $stable = 0;

    @NotNull
    public static final NSCHelper INSTANCE = new NSCHelper();

    public static /* synthetic */ Object f(NSCHelper nSCHelper, int i, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 5;
        }
        return nSCHelper.e(i, function1, continuation);
    }

    @NotNull
    public final Pair<UserCombo, List<UserCombo>> a(@NotNull List<UserCombo> userCombos) {
        Intrinsics.checkNotNullParameter(userCombos, "userCombos");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : userCombos) {
            Boolean boolValueOf = Boolean.valueOf(!((UserCombo) obj).isPackage());
            Object arrayList = linkedHashMap.get(boolValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(boolValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        Object obj2 = linkedHashMap.get(Boolean.TRUE);
        Intrinsics.checkNotNull(obj2);
        Object objFirst = CollectionsKt___CollectionsKt.first((List<? extends Object>) obj2);
        List listEmptyList = (List) linkedHashMap.get(Boolean.FALSE);
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        return TuplesKt.to(objFirst, listEmptyList);
    }

    public final boolean b(int type) {
        return type == 1;
    }

    @NotNull
    public final String c(@NotNull Number size) {
        Intrinsics.checkNotNullParameter(size, "size");
        Context contextA = b78.a();
        float f = 1024;
        float fFloatValue = (size.floatValue() / f) / f;
        float f2 = 1000;
        String fileSize = Formatter.formatFileSize(contextA, (long) (fFloatValue * f2 * f2 * f2));
        Intrinsics.checkNotNullExpressionValue(fileSize, "formatFileSize(GlobalApp… * 1000 * 1000).toLong())");
        return StringsKt__StringsJVMKt.replace$default(fileSize, ".00", "", false, 4, (Object) null);
    }

    public final void d(@NotNull final Activity activity, final boolean stable, @NotNull final String mac) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(mac, "mac");
        SimplifyDialogKt.c0(activity, R$string.esim_redtea_user_combo_combo_error_title, activity.getString(R$string.esim_redtea_user_combo_combo_error_desc), R$string.esim_redtea_combo_manager, stable ? com.heytap.health.base.R$string.lib_base_back_return : com.heytap.health.base.R$string.lib_base_close, new Function2<DialogInterface, Integer, Unit>() { // from class: com.heytap.health.esim.nsc.utils.NSCHelper$openErrorRecommendDialog$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(DialogInterface dialogInterface, Integer num) {
                invoke(dialogInterface, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull DialogInterface dialog, int i) {
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                if (i == 0) {
                    if (stable) {
                        activity.finish();
                        return;
                    } else {
                        dialog.dismiss();
                        return;
                    }
                }
                if (i != 1) {
                    return;
                }
                Activity activity2 = activity;
                String str = mac;
                Intent intent = new Intent(activity2, (Class<?>) UserComboManagerActivity.class);
                intent.putExtra("settingsDeviceMac", str);
                activity2.startActivity(intent);
                if (stable) {
                    return;
                }
                dialog.dismiss();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super D>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [int] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0070 -> B:33:0x0073). Please report as a decompilation issue!!! */
    @Nullable
    public final <D> Object e(int i, @NotNull Function1<? super Continuation<? super D>, ? extends Object> function1, @NotNull Continuation<? super D> continuation) throws Exception {
        NSCHelper$runCatch$1 nSCHelper$runCatch$1;
        int i2;
        ?? r9;
        ?? r10;
        ?? r1;
        ?? r11;
        int i3;
        if (continuation instanceof NSCHelper$runCatch$1) {
            nSCHelper$runCatch$1 = (NSCHelper$runCatch$1) continuation;
            int i4 = nSCHelper$runCatch$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                nSCHelper$runCatch$1.label = i4 - Integer.MIN_VALUE;
            } else {
                nSCHelper$runCatch$1 = new NSCHelper$runCatch$1(this, continuation);
            }
        } else {
            nSCHelper$runCatch$1 = new NSCHelper$runCatch$1(this, continuation);
        }
        Object objInvoke = nSCHelper$runCatch$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = nSCHelper$runCatch$1.label;
        try {
            if (r2 == 0) {
                ResultKt.throwOnFailure(objInvoke);
                i2 = 0;
                r9 = i;
                r10 = function1;
                nSCHelper$runCatch$1.L$0 = r10;
                nSCHelper$runCatch$1.I$0 = r9;
                nSCHelper$runCatch$1.I$1 = i2;
                nSCHelper$runCatch$1.label = 1;
                if (DelayKt.delay(((long) i2) * 1000, nSCHelper$runCatch$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r1 = r10;
                r11 = r9;
                i3 = i2;
                nSCHelper$runCatch$1.L$0 = r1;
                nSCHelper$runCatch$1.I$0 = r11;
                nSCHelper$runCatch$1.I$1 = i3;
                nSCHelper$runCatch$1.label = 2;
                objInvoke = r1.invoke(nSCHelper$runCatch$1);
                r2 = r1;
                i = i3;
                function1 = r11;
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (r2 == 1) {
                int i5 = nSCHelper$runCatch$1.I$1;
                int i6 = nSCHelper$runCatch$1.I$0;
                Function1 function2 = (Function1) nSCHelper$runCatch$1.L$0;
                ResultKt.throwOnFailure(objInvoke);
                r1 = function2;
                i3 = i5;
                r11 = i6;
                nSCHelper$runCatch$1.L$0 = r1;
                nSCHelper$runCatch$1.I$0 = r11;
                nSCHelper$runCatch$1.I$1 = i3;
                nSCHelper$runCatch$1.label = 2;
                objInvoke = r1.invoke(nSCHelper$runCatch$1);
                r2 = r1;
                i = i3;
                function1 = r11;
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (r2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = nSCHelper$runCatch$1.I$1;
                boolean z = (Function1<? super Continuation<? super D>, ? extends Object>) nSCHelper$runCatch$1.I$0;
                Function1 function3 = (Function1) nSCHelper$runCatch$1.L$0;
                ResultKt.throwOnFailure(objInvoke);
                r2 = function3;
                i = i7;
                function1 = z;
            }
        } catch (Exception e2) {
            int i8 = i + 1;
            if (i8 > function1) {
                throw e2;
            }
            i2 = i8;
            r9 = function1;
            r10 = (Function1<? super Continuation<? super D>, ? extends Object>) r2;
        }
        return objInvoke;
    }

    @NotNull
    public final String g(long time) {
        String dateTime = DateUtils.formatDateTime(b78.a(), time, 21);
        Intrinsics.checkNotNullExpressionValue(dateTime, "formatDateTime(\n        …ls.FORMAT_SHOW_TIME\n    )");
        return dateTime;
    }

    @NotNull
    public final String h(long time) {
        String dateTime = DateUtils.formatDateTime(b78.a(), time, 24);
        Intrinsics.checkNotNullExpressionValue(dateTime, "formatDateTime(GlobalApp…DateUtils.FORMAT_NO_YEAR)");
        return dateTime;
    }

    @NotNull
    public final String i(long time) {
        String dateTime = DateUtils.formatDateTime(b78.a(), time, 20);
        Intrinsics.checkNotNullExpressionValue(dateTime, "formatDateTime(GlobalApp…teUtils.FORMAT_SHOW_YEAR)");
        return dateTime;
    }
}
