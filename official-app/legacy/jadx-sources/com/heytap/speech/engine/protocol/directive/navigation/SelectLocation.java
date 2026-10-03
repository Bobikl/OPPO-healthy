package com.heytap.speech.engine.protocol.directive.navigation;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.platform.usercenter.network.header.HeaderConstant;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000  2\u00020\u0001:\u0002!\"B\u0007¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR6\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006#"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/navigation/SelectLocation;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "logo", "Ljava/lang/String;", "getLogo", "()Ljava/lang/String;", "setLogo", "(Ljava/lang/String;)V", "headerText", "getHeaderText", "setHeaderText", "packageName", "getPackageName", "setPackageName", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/navigation/SelectLocation$Location;", "Lkotlin/collections/ArrayList;", "locations", "Ljava/util/ArrayList;", "getLocations", "()Ljava/util/ArrayList;", "setLocations", "(Ljava/util/ArrayList;)V", "text", "getText", ClickApiEntity.SET_TEXT, "speakText", "getSpeakText", "setSpeakText", "<init>", "()V", "Companion", "a", HeaderConstant.HEAD_K_302_LOCATION, "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class SelectLocation extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.1";

    @Nullable
    private String headerText;

    @Nullable
    private ArrayList<Location> locations;

    @Nullable
    private String logo;

    @Nullable
    private String packageName;

    @Nullable
    private String speakText;

    @Nullable
    private String text;

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/navigation/SelectLocation$Location;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "carContent", "", "getCarContent", "()Ljava/lang/String;", "setCarContent", "(Ljava/lang/String;)V", "content", "getContent", "setContent", "distance", "getDistance", "setDistance", "lat", "getLat", "setLat", "lng", "getLng", "setLng", "title", "getTitle", "setTitle", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Location extends DirectivePayload {

        @Nullable
        private String carContent;

        @Nullable
        private String content;

        @Nullable
        private String distance;

        @Nullable
        private String lat;

        @Nullable
        private String lng;

        @Nullable
        private String title;

        @Nullable
        public final String getCarContent() {
            return this.carContent;
        }

        @Nullable
        public final String getContent() {
            return this.content;
        }

        @Nullable
        public final String getDistance() {
            return this.distance;
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
        public final String getTitle() {
            return this.title;
        }

        public final void setCarContent(@Nullable String str) {
            this.carContent = str;
        }

        public final void setContent(@Nullable String str) {
            this.content = str;
        }

        public final void setDistance(@Nullable String str) {
            this.distance = str;
        }

        public final void setLat(@Nullable String str) {
            this.lat = str;
        }

        public final void setLng(@Nullable String str) {
            this.lng = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }
    }

    @Nullable
    public final String getHeaderText() {
        return this.headerText;
    }

    @Nullable
    public final ArrayList<Location> getLocations() {
        return this.locations;
    }

    @Nullable
    public final String getLogo() {
        return this.logo;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final String getSpeakText() {
        return this.speakText;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final void setHeaderText(@Nullable String str) {
        this.headerText = str;
    }

    public final void setLocations(@Nullable ArrayList<Location> arrayList) {
        this.locations = arrayList;
    }

    public final void setLogo(@Nullable String str) {
        this.logo = str;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    public final void setSpeakText(@Nullable String str) {
        this.speakText = str;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }
}
