package com.oplus.smartenginehelper.entity;

import com.oplus.smartenginehelper.ParserTag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b¨\u0006\u000f"}, d2 = {"Lcom/oplus/smartenginehelper/entity/LineBatteryEntity;", "Lcom/oplus/smartenginehelper/entity/ViewEntity;", ParserTag.TAG_ID, "", "(Ljava/lang/String;)V", "setIsChanging", "", "isChanging", "", "setPower", LineBatteryEntity.POWER, "", ClickApiEntity.SET_VISIBILITY, "visibility", "Companion", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class LineBatteryEntity extends ViewEntity {
    private static final String ISCHARGING = "ischanging";
    private static final String POWER = "power";
    private static final String VISIBILITY = "visibility";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineBatteryEntity(@NotNull String str) throws JSONException {
        super(str);
        Intrinsics.checkNotNullParameter(str, ParserTag.TAG_ID);
        getMJSONObject().put("type", "LinkBatteryViewEntity");
    }

    public final void setIsChanging(boolean isChanging) throws JSONException {
        getMJSONObject().put(ISCHARGING, isChanging);
    }

    public final void setPower(int power) throws JSONException {
        getMJSONObject().put(POWER, power);
    }

    public final void setVisibility(boolean visibility) throws JSONException {
        getMJSONObject().put("visibility", visibility);
    }
}
