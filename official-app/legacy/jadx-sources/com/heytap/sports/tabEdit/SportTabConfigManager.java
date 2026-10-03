package com.heytap.sports.tabEdit;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.tabEdit.net.a;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.oea;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.wq8;
import com.oplus.aiunit.vision.yii;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringNumberConversionsKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0006\u0010\u0003\u001a\u00020\u0002J\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u001b\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0005J\u0013\u0010\r\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0005J!\u0010\u000e\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0016\u0010\u0014\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002R#\u0010\u001b\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u001e\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001c\u0010\"\u001a\n \u0016*\u0004\u0018\u00010\u001f0\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lcom/heytap/sports/tabEdit/SportTabConfigManager;", "", "", LogFieldKey.MESSAGE_KEY, "o", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", b2n.g, "displayed", "", LogFieldKey.PROCESS_NAME_KEY, "q", MapSchema.FIELD_NAME_ENTRY, "r", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "csv", "n", "modes", "f", "Lcom/heytap/sports/tabEdit/net/a;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", b2n.f, "()Lcom/heytap/sports/tabEdit/net/a;", oea.FEATURE_API_REQUEST, "b", "i", "encryptApi", "Lcom/oplus/aiunit/vision/v9g;", MapSchema.FIELD_NAME_KEY, "()Lcom/oplus/aiunit/vision/v9g;", "sp", LogFieldKey.LEVEL_KEY, "()Ljava/lang/String;", "spKey", "j", "noWatchKey", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSportTabConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportTabConfigManager.kt\ncom/heytap/sports/tabEdit/SportTabConfigManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n766#2:177\n857#2,2:178\n766#2:180\n857#2,2:181\n1603#2,9:183\n1855#2:192\n1856#2:194\n1612#2:195\n1#3:193\n*S KotlinDebug\n*F\n+ 1 SportTabConfigManager.kt\ncom/heytap/sports/tabEdit/SportTabConfigManager\n*L\n89#1:177\n89#1:178,2\n97#1:180\n97#1:181,2\n172#1:183,9\n172#1:192\n172#1:194\n172#1:195\n172#1:193\n*E\n"})
public final class SportTabConfigManager {

    @NotNull
    public static final SportTabConfigManager INSTANCE = new SportTabConfigManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy api = LazyKt__LazyJVMKt.lazy(new Function0<a>() { // from class: com.heytap.sports.tabEdit.SportTabConfigManager$api$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        public final a invoke() {
            return (a) com.heytap.health.network.core.a.j(a.class);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy encryptApi = LazyKt__LazyJVMKt.lazy(new Function0<a>() { // from class: com.heytap.sports.tabEdit.SportTabConfigManager$encryptApi$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        public final a invoke() {
            return (a) com.heytap.health.network.core.a.l(a.class);
        }
    });
    public static final int $stable = 8;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object e(@NotNull Continuation<? super Unit> continuation) {
        SportTabConfigManager$ensureConfigLoaded$1 sportTabConfigManager$ensureConfigLoaded$1;
        if (continuation instanceof SportTabConfigManager$ensureConfigLoaded$1) {
            sportTabConfigManager$ensureConfigLoaded$1 = (SportTabConfigManager$ensureConfigLoaded$1) continuation;
            int i = sportTabConfigManager$ensureConfigLoaded$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sportTabConfigManager$ensureConfigLoaded$1.label = i - Integer.MIN_VALUE;
            } else {
                sportTabConfigManager$ensureConfigLoaded$1 = new SportTabConfigManager$ensureConfigLoaded$1(this, continuation);
            }
        } else {
            sportTabConfigManager$ensureConfigLoaded$1 = new SportTabConfigManager$ensureConfigLoaded$1(this, continuation);
        }
        Object obj = sportTabConfigManager$ensureConfigLoaded$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sportTabConfigManager$ensureConfigLoaded$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                this = (SportTabConfigManager) sportTabConfigManager$ensureConfigLoaded$1.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        sportTabConfigManager$ensureConfigLoaded$1.L$0 = this;
        sportTabConfigManager$ensureConfigLoaded$1.label = 1;
        if (o(sportTabConfigManager$ensureConfigLoaded$1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        sportTabConfigManager$ensureConfigLoaded$1.L$0 = null;
        sportTabConfigManager$ensureConfigLoaded$1.label = 2;
        if (this.q(sportTabConfigManager$ensureConfigLoaded$1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    public final String f(List<Integer> modes) {
        return CollectionsKt___CollectionsKt.joinToString$default(modes, ",", null, null, 0, null, null, 62, null);
    }

    public final a g() {
        return (a) api.getValue();
    }

    @NotNull
    public final List<Integer> h() {
        if (m()) {
            return CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt__CollectionsJVMKt.listOf(-2), (Iterable) yii.INSTANCE.e());
        }
        String cached = k().E(l(), "");
        StringBuilder sb = new StringBuilder();
        sb.append("getDisplayedTabs: sp=");
        sb.append(cached);
        if (cached == null || cached.length() == 0) {
            return CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt__CollectionsJVMKt.listOf(-2), (Iterable) yii.INSTANCE.e());
        }
        Intrinsics.checkNotNullExpressionValue(cached, "cached");
        List<Integer> listN = n(cached);
        if (listN.isEmpty()) {
            return CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt__CollectionsJVMKt.listOf(-2), (Iterable) yii.INSTANCE.e());
        }
        List listListOf = CollectionsKt__CollectionsJVMKt.listOf(-2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listN) {
            if (((Number) obj).intValue() != -2) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList);
    }

    public final a i() {
        return (a) encryptApi.getValue();
    }

    public final String j() {
        return "sport_tab_no_watch_" + um.c().getSsoid();
    }

    public final v9g k() {
        return v9g.x("health_common_sp_name");
    }

    public final String l() {
        return "sport_tab_config_v2_" + um.c().getSsoid();
    }

    public final boolean m() {
        return k().r(j(), false);
    }

    public final List<Integer> n(String csv) {
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) csv, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(StringsKt__StringsKt.trim((CharSequence) it.next()).toString());
            if (intOrNull != null) {
                arrayList.add(intOrNull);
            }
        }
        return arrayList;
    }

    @Nullable
    public final Object o(@NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(wq8.INSTANCE.e(), new SportTabConfigManager$refreshNoWatchState$2(null), continuation);
    }

    public final void p(@NotNull List<Integer> displayed) {
        Intrinsics.checkNotNullParameter(displayed, "displayed");
        ArrayList arrayList = new ArrayList();
        for (Object obj : displayed) {
            if (((Number) obj).intValue() != -2) {
                arrayList.add(obj);
            }
        }
        String strF = f(arrayList);
        StringBuilder sb = new StringBuilder();
        sb.append("saveDisplayedTabs: ");
        sb.append(strF);
        k().U(l(), strF);
    }

    @Nullable
    public final Object q(@NotNull Continuation<? super List<Integer>> continuation) {
        return BuildersKt.withContext(wq8.INSTANCE.e(), new SportTabConfigManager$syncFromCloud$2(null), continuation);
    }

    @Nullable
    public final Object r(@NotNull List<Integer> list, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(wq8.INSTANCE.e(), new SportTabConfigManager$uploadToCloud$2(list, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
