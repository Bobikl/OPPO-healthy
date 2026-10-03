package com.heytap.health.oobe.setups.pair.legals;

import android.text.TextUtils;
import com.heytap.health.base.utils.AsyncResult;
import com.heytap.health.devicemanager.UserInfoHelper;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.oobe.Variants;
import com.heytap.health.oobe.dto.FailOOBEKt;
import com.heytap.health.watchpair.R$string;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a61;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.h6e;
import com.oplus.aiunit.vision.j3d;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.um;
import io.protostuff.MapSchema;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ2\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\rH\u0002J\f\u0010\u0010\u001a\u00020\u0007*\u00020\u0007H\u0002J\f\u0010\u0011\u001a\u00020\u0007*\u00020\u0007H\u0002J\u0013\u0010\u0012\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/oobe/setups/pair/legals/NewPhone;", "Lcom/oplus/aiunit/vision/a61;", "Lcom/oplus/aiunit/vision/h6e;", LogFieldKey.PROCESS_NAME_KEY, "", LogFieldKey.LEVEL_KEY, "(Lcom/oplus/aiunit/vision/h6e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "watchAccountNumber", b2n.f, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "str1", "str2", "Lkotlin/Function2;", "block", b2n.g, "j", "i", MapSchema.FIELD_NAME_KEY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNewPhone.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewPhone.kt\ncom/heytap/health/oobe/setups/pair/legals/NewPhone\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,151:1\n1747#2,3:152\n*S KotlinDebug\n*F\n+ 1 NewPhone.kt\ncom/heytap/health/oobe/setups/pair/legals/NewPhone\n*L\n41#1:152,3\n*E\n"})
public final class NewPhone extends a61 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object g(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        NewPhone$checkAccountNumberRule$1 newPhone$checkAccountNumberRule$1;
        if (continuation instanceof NewPhone$checkAccountNumberRule$1) {
            newPhone$checkAccountNumberRule$1 = (NewPhone$checkAccountNumberRule$1) continuation;
            int i = newPhone$checkAccountNumberRule$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                newPhone$checkAccountNumberRule$1.label = i - Integer.MIN_VALUE;
            } else {
                newPhone$checkAccountNumberRule$1 = new NewPhone$checkAccountNumberRule$1(this, continuation);
            }
        } else {
            newPhone$checkAccountNumberRule$1 = new NewPhone$checkAccountNumberRule$1(this, continuation);
        }
        Object objK = newPhone$checkAccountNumberRule$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = newPhone$checkAccountNumberRule$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objK);
            newPhone$checkAccountNumberRule$1.L$0 = this;
            newPhone$checkAccountNumberRule$1.L$1 = str;
            newPhone$checkAccountNumberRule$1.label = 1;
            objK = k(newPhone$checkAccountNumberRule$1);
            if (objK == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) newPhone$checkAccountNumberRule$1.L$1;
            this = (NewPhone) newPhone$checkAccountNumberRule$1.L$0;
            ResultKt.throwOnFailure(objK);
        }
        String str2 = (String) objK;
        if (!(str.length() == 0)) {
            if (!(str2.length() == 0) && !Intrinsics.areEqual(str, str2)) {
                boolean zH = this.h(this.i(str), this.i(str2), new Function2<String, String, Boolean>() { // from class: com.heytap.health.oobe.setups.pair.legals.NewPhone$checkAccountNumberRule$result$1
                    @Override // p010kotlin.jvm.functions.Function2
                    @NotNull
                    public final Boolean invoke(@NotNull String str3, @NotNull String str4) {
                        Intrinsics.checkNotNullParameter(str3, "long");
                        Intrinsics.checkNotNullParameter(str4, "short");
                        return Boolean.valueOf(StringsKt__StringsJVMKt.startsWith$default(str3, str4, false, 2, null));
                    }
                });
                if (zH) {
                    zH = this.h(this.j(str), this.j(str2), new Function2<String, String, Boolean>() { // from class: com.heytap.health.oobe.setups.pair.legals.NewPhone$checkAccountNumberRule$2
                        @Override // p010kotlin.jvm.functions.Function2
                        @NotNull
                        public final Boolean invoke(@NotNull String str3, @NotNull String str4) {
                            Intrinsics.checkNotNullParameter(str3, "long");
                            Intrinsics.checkNotNullParameter(str4, "short");
                            return Boolean.valueOf(StringsKt__StringsJVMKt.endsWith$default(str3, str4, false, 2, null));
                        }
                    });
                }
                return Boxing.boxBoolean(zH);
            }
        }
        return Boxing.boxBoolean(true);
    }

    public final boolean h(String str1, String str2, Function2<? super String, ? super String, Boolean> block) {
        if (!(str1.length() == 0)) {
            if (!(str2.length() == 0)) {
                if (str1.length() == str2.length()) {
                    return Intrinsics.areEqual(str1, str2);
                }
                if (str1.length() <= str2.length()) {
                    str2 = str1;
                    str1 = str2;
                }
                return block.invoke(str1, str2).booleanValue();
            }
        }
        return true;
    }

    public final String i(String str) {
        Matcher matcher = Pattern.compile("^(\\d+|[a-zA-Z0-9_-]+)").matcher(str);
        String strGroup = matcher.find() ? matcher.group(1) : "";
        Intrinsics.checkNotNullExpressionValue(strGroup, "compile(\"^(\\\\d+|[a-zA-Z0…          }\n            }");
        return strGroup;
    }

    public final String j(String str) {
        Matcher matcher = Pattern.compile("(\\d+|@.*\\..*)$").matcher(str);
        String strGroup = matcher.find() ? matcher.group(1) : "";
        Intrinsics.checkNotNullExpressionValue(strGroup, "compile(\"(\\\\d+|@.*\\\\..*)…          }\n            }");
        return strGroup;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x0095, please report this as an issue */
    public final Object k(Continuation<? super String> continuation) {
        NewPhone$getCurrAccountInfo$1 newPhone$getCurrAccountInfo$1;
        Object objM5287constructorimpl;
        Throwable thM5290exceptionOrNullimpl;
        if (continuation instanceof NewPhone$getCurrAccountInfo$1) {
            newPhone$getCurrAccountInfo$1 = (NewPhone$getCurrAccountInfo$1) continuation;
            int i = newPhone$getCurrAccountInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                newPhone$getCurrAccountInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                newPhone$getCurrAccountInfo$1 = new NewPhone$getCurrAccountInfo$1(this, continuation);
            }
        } else {
            newPhone$getCurrAccountInfo$1 = new NewPhone$getCurrAccountInfo$1(this, continuation);
        }
        Object objB = newPhone$getCurrAccountInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = newPhone$getCurrAccountInfo$1.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    this = (NewPhone) newPhone$getCurrAccountInfo$1.L$0;
                    ResultKt.throwOnFailure(objB);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    this = (NewPhone) newPhone$getCurrAccountInfo$1.L$0;
                    ResultKt.throwOnFailure(objB);
                }
                objM5287constructorimpl = Result.m5287constructorimpl((String) objB);
                thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
                if (thM5290exceptionOrNullimpl == null) {
                    return objM5287constructorimpl;
                }
                j3d.INSTANCE.b(this.getTAG(), "getCurrAccountInfo faile:" + thM5290exceptionOrNullimpl.getMessage());
                return "";
            }
            ResultKt.throwOnFailure(objB);
            String ssoid = um.c().getSsoid();
            Intrinsics.checkNotNullExpressionValue(ssoid, "getAccountManager().ssoid");
            AsyncResult<String> asyncResultF = UserInfoHelper.f(ssoid);
            newPhone$getCurrAccountInfo$1.L$0 = this;
            newPhone$getCurrAccountInfo$1.label = 1;
            if (asyncResultF.b(newPhone$getCurrAccountInfo$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            Result.Companion companion = Result.INSTANCE;
            String ssoid2 = um.c().getSsoid();
            Intrinsics.checkNotNullExpressionValue(ssoid2, "getAccountManager().ssoid");
            AsyncResult<String> asyncResultF2 = UserInfoHelper.f(ssoid2);
            newPhone$getCurrAccountInfo$1.L$0 = this;
            newPhone$getCurrAccountInfo$1.label = 2;
            objB = asyncResultF2.b(newPhone$getCurrAccountInfo$1);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
            objM5287constructorimpl = Result.m5287constructorimpl((String) objB);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl == null) {
            return objM5287constructorimpl;
        }
        j3d.INSTANCE.b(this.getTAG(), "getCurrAccountInfo faile:" + thM5290exceptionOrNullimpl.getMessage());
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.oplus.aiunit.vision.pva
    @Nullable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Object a(@NotNull h6e h6eVar, @NotNull Continuation<? super Boolean> continuation) {
        NewPhone$trial$1 newPhone$trial$1;
        Variants variants;
        boolean z;
        if (continuation instanceof NewPhone$trial$1) {
            newPhone$trial$1 = (NewPhone$trial$1) continuation;
            int i = newPhone$trial$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                newPhone$trial$1.label = i - Integer.MIN_VALUE;
            } else {
                newPhone$trial$1 = new NewPhone$trial$1(this, continuation);
            }
        } else {
            newPhone$trial$1 = new NewPhone$trial$1(this, continuation);
        }
        Object obj = newPhone$trial$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = newPhone$trial$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Variants pairingData = h6eVar.getPairingData();
            if (!pairingData.isPairNewPhone()) {
                return Boxing.boxBoolean(true);
            }
            String accountNumber = pairingData.getAccountNumber();
            newPhone$trial$1.L$0 = h6eVar;
            newPhone$trial$1.L$1 = pairingData;
            newPhone$trial$1.label = 1;
            Object objG = g(accountNumber, newPhone$trial$1);
            if (objG == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objG;
            variants = pairingData;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            variants = (Variants) newPhone$trial$1.L$1;
            h6eVar = (h6e) newPhone$trial$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            throw FailOOBEKt.g(variants);
        }
        List<UserDeviceInfo> listB = h6eVar.b();
        boolean z2 = false;
        if (listB != null) {
            List<UserDeviceInfo> list = listB;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (Intrinsics.areEqual(((UserDeviceInfo) it.next()).getMac(), h6eVar.getPairingData().getAddress())) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2 || TextUtils.isEmpty(variants.getAccountNumber())) {
            return Boxing.boxBoolean(true);
        }
        throw FailOOBEKt.f(variants, qtf.l(R$string.pair_fail_new_phone_no_bond), null, 4, null);
    }
}
