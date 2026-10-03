package com.heytap.store.platform.htrouter.facade.service;

import android.net.Uri;
import com.heytap.store.platform.htrouter.facade.template.IProvider;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lcom/heytap/store/platform/htrouter/facade/service/PathReplaceService;", "Lcom/heytap/store/platform/htrouter/facade/template/IProvider;", "forString", "", "path", "forUri", "Landroid/net/Uri;", ParserTag.TAG_URI, "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
public interface PathReplaceService extends IProvider {
    @NotNull
    String forString(@NotNull String path);

    @NotNull
    Uri forUri(@NotNull Uri uri);
}
