package com.oplus.smartenginehelper.entity;

import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/oplus/smartenginehelper/entity/ButtonEntity;", "Lcom/oplus/smartenginehelper/entity/TextEntity;", "id", "", "(Ljava/lang/String;)V", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public class ButtonEntity extends TextEntity {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonEntity(@NotNull String id) throws JSONException {
        super(id);
        Intrinsics.checkNotNullParameter(id, "id");
        getMJSONObject().put("type", ParserTag.TYPE_BUTTON);
    }
}
