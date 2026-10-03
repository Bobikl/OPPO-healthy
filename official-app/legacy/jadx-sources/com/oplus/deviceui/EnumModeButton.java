package com.oplus.deviceui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import com.oplus.aiunit.vision.EnumModeData;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.gtf;
import com.oplus.deviceui.model.ModeItem;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0002'(B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b!\u0010%J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\u0006H\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006)"}, d2 = {"Lcom/oplus/deviceui/EnumModeButton;", "Lcom/oplus/deviceui/NormalModeButton;", "Landroid/content/Context;", "context", "Lcom/oplus/deviceui/model/ModeItem;", "mode", "", "x", "Lcom/oplus/deviceui/EnumModeButton$b;", "listener", "setOnChangeListener", "y", "z", c8l.KEY_B, "Lorg/json/JSONObject;", "jsonObject", "Lcom/oplus/aiunit/vision/qo6;", "A", "r", "Lcom/oplus/deviceui/EnumModeButton$b;", "mListener", "s", "Lcom/oplus/deviceui/model/ModeItem;", "mModeItem", "t", "Lcom/oplus/aiunit/vision/qo6;", "mCurrentMode", "u", "mPreviousMode", "", "v", "Ljava/util/List;", "mModeList", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "a", "b", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class EnumModeButton extends NormalModeButton {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public b mListener;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public ModeItem mModeItem;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public EnumModeData mCurrentMode;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public EnumModeData mPreviousMode;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final List<EnumModeData> mModeList;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/oplus/deviceui/EnumModeButton$b;", "", "", "value", "", "c", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
    public interface b {
        void c(int value);
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/oplus/deviceui/EnumModeButton$c", "Lcom/oplus/deviceui/NormalModeButton$c;", "", "selected", "", "a", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
    public static final class c implements NormalModeButton.c {
        public c() {
        }

        @Override // com.oplus.deviceui.NormalModeButton.c
        public void a(boolean selected) {
            EnumModeButton.this.z();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumModeButton(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mModeList = new ArrayList();
    }

    public final EnumModeData A(Context context, JSONObject jsonObject) {
        int iOptInt = jsonObject.optInt(EnumModeData.TAG_ENUMVALUE);
        String name = jsonObject.optString("name");
        int iOptInt2 = jsonObject.optInt("state");
        String strOptString = jsonObject.optString("icon");
        String strOptString2 = jsonObject.optString("icon");
        String str = strOptString2 != null ? strOptString2 : strOptString;
        Drawable drawableG = gtf.INSTANCE.g(context, context, str);
        Intrinsics.checkNotNullExpressionValue(name, "name");
        return new EnumModeData(iOptInt, name, iOptInt2, drawableG, str);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0050  */
    public final void B() {
        Drawable icon;
        boolean z;
        Integer color;
        String iconUri;
        String enumName;
        EnumModeData enumModeData = this.mCurrentMode;
        if (enumModeData != null && (enumName = enumModeData.getEnumName()) != null) {
            setName(enumName);
        }
        EnumModeData enumModeData2 = this.mCurrentMode;
        if (enumModeData2 == null || (iconUri = enumModeData2.getIconUri()) == null) {
            EnumModeData enumModeData3 = this.mCurrentMode;
            if (enumModeData3 != null && (icon = enumModeData3.getIcon()) != null) {
                setIcon(icon);
            }
        } else {
            EnumModeData enumModeData4 = this.mCurrentMode;
            r(iconUri, enumModeData4 != null ? enumModeData4.getIcon() : null);
        }
        ModeItem modeItem = this.mModeItem;
        if (modeItem != null && (color = modeItem.getColor()) != null) {
            setSelectedColor(color.intValue());
        }
        EnumModeData enumModeData5 = this.mCurrentMode;
        if (enumModeData5 != null) {
            z = enumModeData5.getState() == 1;
        }
        ModeItem modeItem2 = this.mModeItem;
        boolean enabled = modeItem2 != null ? modeItem2.getEnabled() : false;
        ModeItem modeItem3 = this.mModeItem;
        q(z, enabled, modeItem3 != null ? modeItem3.getIsLoading() : false);
        this.mPreviousMode = this.mCurrentMode;
    }

    public final void setOnChangeListener(@NotNull b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mListener = listener;
    }

    public final void x(@NotNull Context context, @NotNull ModeItem mode) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.mModeItem = mode;
        y(mode, context);
        B();
        setListener(new c());
    }

    public final void y(ModeItem mode, Context context) throws JSONException {
        String stateData = mode.getStateData();
        JSONObject jSONObject = stateData != null ? new JSONObject(stateData) : null;
        if (jSONObject != null) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("enumList");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("currValue");
            if (jSONObjectOptJSONObject != null) {
                this.mCurrentMode = A(context, jSONObjectOptJSONObject);
            }
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject data = jSONArrayOptJSONArray.getJSONObject(i);
                    Intrinsics.checkNotNullExpressionValue(data, "data");
                    this.mModeList.add(A(context, data));
                }
            }
        }
    }

    public final void z() {
        EnumModeData enumModeData = this.mCurrentMode;
        if (enumModeData != null && enumModeData.getState() == 0) {
            EnumModeData enumModeData2 = this.mCurrentMode;
            if (enumModeData2 != null) {
                enumModeData2.f(1);
            }
        } else if (this.mModeList.size() > 0) {
            int iIndexOf = CollectionsKt___CollectionsKt.indexOf((List<? extends EnumModeData>) ((List<? extends Object>) this.mModeList), this.mCurrentMode) + 1;
            if (iIndexOf >= this.mModeList.size() || iIndexOf < 0) {
                iIndexOf = 0;
            }
            this.mCurrentMode = this.mModeList.get(iIndexOf);
        }
        b bVar = this.mListener;
        if (bVar != null) {
            EnumModeData enumModeData3 = this.mCurrentMode;
            bVar.c(enumModeData3 != null ? enumModeData3.getEnumValue() : 0);
        }
        B();
        Log.d("UDeviceEnumModeButton", "nextMode: " + this.mCurrentMode);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumModeButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mModeList = new ArrayList();
    }
}
