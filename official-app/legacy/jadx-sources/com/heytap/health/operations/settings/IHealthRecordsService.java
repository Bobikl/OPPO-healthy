package com.heytap.health.operations.settings;

import androidx.fragment.app.FragmentActivity;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u0000 \r2\u00020\u0001:\u0001\u000eJT\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\bH&¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/operations/settings/IHealthRecordsService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "Landroidx/fragment/app/FragmentActivity;", "activity", "", "gender", "title", DBHealthReviewPlan.DESC, "Lkotlin/Function1;", "", "onSuccess", "onFail", "U3", "Companion", "a", "operations_release"}, k = 1, mv = {1, 8, 0})
public interface IHealthRecordsService extends IProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String SERVICE_PATH = "/settings/IHealthRecordsService";

    /* JADX INFO: renamed from: com.heytap.health.operations.settings.IHealthRecordsService$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/heytap/health/operations/settings/IHealthRecordsService$a;", "", "", "SERVICE_PATH", "Ljava/lang/String;", "<init>", "()V", "operations_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @NotNull
        public static final String SERVICE_PATH = "/settings/IHealthRecordsService";
        public static final /* synthetic */ Companion a = new Companion();
    }

    void U3(@NotNull FragmentActivity activity, @NotNull String gender, @NotNull String title, @NotNull String desc, @Nullable Function1<? super String, Unit> onSuccess, @Nullable Function1<? super String, Unit> onFail);
}
