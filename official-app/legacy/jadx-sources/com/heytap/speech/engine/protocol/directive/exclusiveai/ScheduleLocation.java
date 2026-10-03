package com.heytap.speech.engine.protocol.directive.exclusiveai;

import androidx.annotation.Keep;
import com.amap.api.services.district.DistrictSearchQuery;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/exclusiveai/ScheduleLocation;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", DistrictSearchQuery.KEYWORDS_CITY, "getCity", "setCity", "lat", "getLat", "setLat", "lng", "getLng", "setLng", "source", "", "getSource", "()Ljava/lang/Integer;", "setSource", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "text", "getText", ClickApiEntity.SET_TEXT, "title", "getTitle", "setTitle", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ScheduleLocation extends DirectivePayload {

    @Nullable
    private String address;

    @Nullable
    private String city;

    @Nullable
    private String lat;

    @Nullable
    private String lng;

    @Nullable
    private Integer source;

    @Nullable
    private String text;

    @Nullable
    private String title;

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final String getCity() {
        return this.city;
    }

    @Nullable
    public final String getLat() {
        return this.lat;
    }

    @Nullable
    public final String getLng() {
        return this.lng;
    }

    @Nullable
    public final Integer getSource() {
        return this.source;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setAddress(@Nullable String str) {
        this.address = str;
    }

    public final void setCity(@Nullable String str) {
        this.city = str;
    }

    public final void setLat(@Nullable String str) {
        this.lat = str;
    }

    public final void setLng(@Nullable String str) {
        this.lng = str;
    }

    public final void setSource(@Nullable Integer num) {
        this.source = num;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
