package com.heytap.health.sport.services;

import android.content.Context;
import android.util.Pair;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.databaseengine.model.RunExtra;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/sport/services/SportNotifyService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "", "q3", "O3", "Lcom/heytap/databaseengine/model/RunExtra;", "extra", "Landroid/util/Pair;", "", "", "o3", "Landroid/content/Context;", "context", "G9", "sport_release"}, k = 1, mv = {1, 8, 0})
public interface SportNotifyService extends IProvider {
    void G9(@NotNull Context context);

    void O3();

    @NotNull
    Pair<String, Integer> o3(@NotNull RunExtra extra);

    void q3();
}
