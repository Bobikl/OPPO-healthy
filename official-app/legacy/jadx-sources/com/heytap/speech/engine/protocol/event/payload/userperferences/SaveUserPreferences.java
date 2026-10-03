package com.heytap.speech.engine.protocol.event.payload.userperferences;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.userpreferences.ConfigUserPreferences;
import com.heytap.speech.engine.protocol.event.Payload;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/userperferences/SaveUserPreferences;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/userpreferences/ConfigUserPreferences$PreferenceConfig;", "selectedConfigs", "Ljava/util/ArrayList;", "getSelectedConfigs", "()Ljava/util/ArrayList;", "setSelectedConfigs", "(Ljava/util/ArrayList;)V", "Lcom/heytap/speech/engine/protocol/directive/userpreferences/ConfigUserPreferences$ConfigButton;", "bottomButtons", "getBottomButtons", "setBottomButtons", "Ljava/util/HashMap;", "", "", "extend", "Ljava/util/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class SaveUserPreferences extends Payload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private ArrayList<ConfigUserPreferences.ConfigButton> bottomButtons;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private ArrayList<ConfigUserPreferences.PreferenceConfig> selectedConfigs;

    @Nullable
    public final ArrayList<ConfigUserPreferences.ConfigButton> getBottomButtons() {
        return this.bottomButtons;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final ArrayList<ConfigUserPreferences.PreferenceConfig> getSelectedConfigs() {
        return this.selectedConfigs;
    }

    public final void setBottomButtons(@Nullable ArrayList<ConfigUserPreferences.ConfigButton> arrayList) {
        this.bottomButtons = arrayList;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setSelectedConfigs(@Nullable ArrayList<ConfigUserPreferences.PreferenceConfig> arrayList) {
        this.selectedConfigs = arrayList;
    }
}
