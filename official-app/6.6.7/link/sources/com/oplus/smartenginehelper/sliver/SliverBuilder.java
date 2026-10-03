package com.oplus.smartenginehelper.sliver;

import com.oplus.smartenginehelper.entity.ViewEntity;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/oplus/smartenginehelper/sliver/SliverBuilder;", "", "()V", "mChildJSONArray", "Lorg/json/JSONArray;", "addSliverView", "", "viewEntity", "Lcom/oplus/smartenginehelper/entity/ViewEntity;", "build", "", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class SliverBuilder {
    private JSONArray mChildJSONArray = new JSONArray();

    public final void addSliverView(@NotNull ViewEntity viewEntity) {
        Intrinsics.checkNotNullParameter(viewEntity, "viewEntity");
        this.mChildJSONArray.put(viewEntity.getMJSONObject());
    }

    @NotNull
    public final byte[] build() {
        String string = this.mChildJSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "mChildJSONArray.toString()");
        Charset charset = Charsets.UTF_8;
        if (string == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = string.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
