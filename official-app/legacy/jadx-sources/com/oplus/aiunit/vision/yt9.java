package com.oplus.aiunit.vision;

import com.heytap.databaseengine.apiv3.data.DataSet;
import com.heytap.databaseengine.callback.ICommonListener;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H&J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\u0002H&J\b\u0010\u0010\u001a\u00020\u0002H&J\b\u0010\u0011\u001a\u00020\u0002H&J\u001d\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/yt9;", "", "", "packageName", "", "scopeList", "", "f", "scope", b2n.g, TraceConstants.KEY_PKG_NAME, "Lcom/heytap/databaseengine/callback/ICommonListener;", "listener", "", MapSchema.FIELD_NAME_ENTRY, "d", b2n.f, "j", "", "packageNames", "Lcom/heytap/databaseengine/apiv3/data/DataSet$b;", "i", "([Ljava/lang/String;)Lcom/heytap/databaseengine/apiv3/data/DataSet$b;", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface yt9 {
    @NotNull
    String d();

    void e(@NotNull String pkgName, @NotNull ICommonListener listener);

    boolean f(@NotNull String packageName, @NotNull List<String> scopeList);

    @NotNull
    String g();

    boolean h(@NotNull String scope);

    @NotNull
    DataSet.b i(@NotNull String[] packageNames);

    @NotNull
    String j();
}
