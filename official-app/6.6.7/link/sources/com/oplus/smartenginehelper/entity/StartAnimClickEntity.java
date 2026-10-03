package com.oplus.smartenginehelper.entity;

import com.oplus.smartenginehelper.ParserTag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/smartenginehelper/entity/StartAnimClickEntity;", "Lcom/oplus/smartenginehelper/entity/ClickEntity;", "()V", "setAnimSet", "", "animSetEntity", "Lcom/oplus/smartenginehelper/entity/AnimSetEntity;", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class StartAnimClickEntity extends ClickEntity {
    public StartAnimClickEntity() throws JSONException {
        getMJSONObject().put("type", ParserTag.TAG_CLICK_ANIM);
    }

    public final void setAnimSet(@NotNull AnimSetEntity animSetEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(animSetEntity, "animSetEntity");
        getMJSONObject().put(ParserTag.TAG_ANIM_SET, animSetEntity.getMJSONArray());
    }
}
