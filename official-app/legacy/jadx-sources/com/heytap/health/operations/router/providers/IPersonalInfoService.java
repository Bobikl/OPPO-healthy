package com.heytap.health.operations.router.providers;

import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.android.arouter.facade.template.IProvider;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\bH&J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\bH&¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/operations/router/providers/IPersonalInfoService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "oldValue", "", "U1", "", "L", "T5", "operations_release"}, k = 1, mv = {1, 8, 0})
public interface IPersonalInfoService extends IProvider {
    void L(@NotNull AppCompatActivity activity, @NotNull String oldValue);

    void T5(@NotNull AppCompatActivity activity, @NotNull String oldValue);

    void U1(@NotNull AppCompatActivity activity, int oldValue);
}
