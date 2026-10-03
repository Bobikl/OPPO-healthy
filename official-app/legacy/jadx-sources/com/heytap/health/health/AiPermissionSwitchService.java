package com.heytap.health.health;

import android.content.Context;
import com.alibaba.android.arouter.facade.template.IProvider;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J$\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\n\u001a\u00020\u0002H&J$\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\f"}, d2 = {"Lcom/heytap/health/health/AiPermissionSwitchService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "", "i8", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "", "resultCallBack", "R5", "h3", "j6", "health_release"}, k = 1, mv = {1, 8, 0})
public interface AiPermissionSwitchService extends IProvider {
    void R5(@NotNull Context context, @NotNull Function1<? super Boolean, Unit> resultCallBack);

    boolean h3();

    boolean i8();

    void j6(@NotNull Context context, @NotNull Function1<? super Boolean, Unit> resultCallBack);
}
