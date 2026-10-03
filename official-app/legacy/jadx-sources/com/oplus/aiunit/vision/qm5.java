package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/qm5;", "Lcom/oplus/aiunit/vision/e03;", "", "i", "I", MapSchema.FIELD_NAME_KEY, "()I", "type", "icon", "title", Feedback.WIDGET_SUBTITLE, "", "enable", "color", CardAction.LIFE_CIRCLE_VALUE_SHOW, "showRedDot", "<init>", "(ILjava/lang/Integer;ILjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Boolean;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public class qm5 extends e03 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int type;

    public /* synthetic */ qm5(int i, Integer num, int i2, Integer num2, boolean z, Integer num3, boolean z2, Boolean bool, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? null : num, i2, (i3 & 8) != 0 ? null : num2, (i3 & 16) != 0 ? true : z, (i3 & 32) != 0 ? null : num3, (i3 & 64) != 0 ? true : z2, (i3 & 128) != 0 ? Boolean.FALSE : bool);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public qm5(int i, @Nullable Integer num, int i2, @Nullable Integer num2, boolean z, @Nullable Integer num3, boolean z2, @Nullable Boolean bool) {
        super(num, i2, num2, z, num3, null, z2, bool, 32, null);
        this.type = i;
    }
}
