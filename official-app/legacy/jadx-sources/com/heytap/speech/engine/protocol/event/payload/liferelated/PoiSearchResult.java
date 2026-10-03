package com.heytap.speech.engine.protocol.event.payload.liferelated;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/liferelated/PoiSearchResult;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "", "code", "Ljava/lang/Integer;", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/event/payload/liferelated/PoiSearchResult$PoiResult;", "poiList", "Ljava/util/ArrayList;", "getPoiList", "()Ljava/util/ArrayList;", "setPoiList", "(Ljava/util/ArrayList;)V", "<init>", "()V", "Companion", "a", "PoiResult", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class PoiSearchResult extends Payload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private Integer code;

    @Nullable
    private ArrayList<PoiResult> poiList;

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/liferelated/PoiSearchResult$PoiResult;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "()V", "coordinateSystem", "", "getCoordinateSystem", "()Ljava/lang/String;", "setCoordinateSystem", "(Ljava/lang/String;)V", "latitude", "getLatitude", "setLatitude", "longitude", "getLongitude", "setLongitude", "name", "getName", "setName", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class PoiResult extends Payload {

        @Nullable
        private String coordinateSystem;

        @Nullable
        private String latitude;

        @Nullable
        private String longitude;

        @Nullable
        private String name;

        @Nullable
        public final String getCoordinateSystem() {
            return this.coordinateSystem;
        }

        @Nullable
        public final String getLatitude() {
            return this.latitude;
        }

        @Nullable
        public final String getLongitude() {
            return this.longitude;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        public final void setCoordinateSystem(@Nullable String str) {
            this.coordinateSystem = str;
        }

        public final void setLatitude(@Nullable String str) {
            this.latitude = str;
        }

        public final void setLongitude(@Nullable String str) {
            this.longitude = str;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }
    }

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final ArrayList<PoiResult> getPoiList() {
        return this.poiList;
    }

    public final void setCode(@Nullable Integer num) {
        this.code = num;
    }

    public final void setPoiList(@Nullable ArrayList<PoiResult> arrayList) {
        this.poiList = arrayList;
    }
}
