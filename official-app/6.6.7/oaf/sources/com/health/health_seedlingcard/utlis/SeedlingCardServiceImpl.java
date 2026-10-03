package com.health.health_seedlingcard.utlis;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.health.SeedlingCardService;
import com.oplus.aiunit.vision.cs8;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.m8b;
import java.time.LocalDate;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.ExecutorsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Route(path = "/seeding/seeding_card_service")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\n\u001a\u00020\t*\u00020\b¨\u0006\u000f"}, d2 = {"Lcom/health/health_seedlingcard/utlis/SeedlingCardServiceImpl;", "Lcom/heytap/health/health/SeedlingCardService;", "", "v7", "v", "Landroid/content/Context;", "context", "init", "Ljava/time/LocalDate;", "", "c", "<init>", "()V", "Companion", "a", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
public final class SeedlingCardServiceImpl implements SeedlingCardService {

    @NotNull
    public static final String TAG = "SeedlingCardService";

    public final int c(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return (localDate.getYear() * 10000) + (localDate.getMonthValue() * 100) + localDate.getDayOfMonth();
    }

    public void init(@Nullable Context context) {
    }

    public void v() {
        ExecutorService executorServiceE = cs8.e("SeedlingCard");
        Intrinsics.checkNotNullExpressionValue(executorServiceE, "newSingleThreadExecutor(\"SeedlingCard\")");
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(executorServiceE)), (CoroutineContext) null, (CoroutineStart) null, new SeedlingCardServiceImpl$sendMenstrualCardShowDayTOMetis$1(this, null), 3, (Object) null);
    }

    public void v7() {
        SeedCardSendDataToMetisHelper.Companion companion = SeedCardSendDataToMetisHelper.INSTANCE;
        Context contextA = e88.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        companion.c(contextA);
        m8b.f(TAG, "sendMenstrualDataTOMetis");
    }
}
