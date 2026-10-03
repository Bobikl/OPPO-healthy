package com.heytap.speech.engine.protocol.directive.recommend;

import androidx.annotation.Keep;
import com.coloros.sceneservice.dataprovider.bean.scene.SceneBankData;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.commercial.ActionInfo;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import com.oplus.aiunit.vision.l7m;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\f\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0005 !\"#$B\u0007¢\u0006\u0004\b\u001d\u0010\u001eR0\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0005\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\t¨\u0006%"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/recommend/OperationCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "Ljava/util/HashMap;", "", "expInfo", "Ljava/util/HashMap;", "getExpInfo", "()Ljava/util/HashMap;", "setExpInfo", "(Ljava/util/HashMap;)V", "Lcom/heytap/speech/engine/protocol/directive/recommend/OperationCard$Title;", "title", "Lcom/heytap/speech/engine/protocol/directive/recommend/OperationCard$Title;", "getTitle", "()Lcom/heytap/speech/engine/protocol/directive/recommend/OperationCard$Title;", "setTitle", "(Lcom/heytap/speech/engine/protocol/directive/recommend/OperationCard$Title;)V", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/recommend/OperationCard$Item;", "queryItems", "Ljava/util/ArrayList;", "getQueryItems", "()Ljava/util/ArrayList;", "setQueryItems", "(Ljava/util/ArrayList;)V", "", "extend", "getExtend", "setExtend", "<init>", "()V", "Companion", "a", "FileCollection", l7m.ITEM_PREFIX, "MultiModalInfo", SceneBankData.KEY_TITLE, "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class OperationCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.1";

    @Nullable
    private HashMap<String, String> expInfo;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private ArrayList<Item> queryItems;

    @Nullable
    private Title title;

    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/recommend/OperationCard$FileCollection;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "icon", "", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "iconDark", "getIconDark", "setIconDark", "name", "getName", "setName", "size", "", "getSize", "()Ljava/lang/Integer;", "setSize", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "thumbnail", "getThumbnail", "setThumbnail", "url", "getUrl", "setUrl", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class FileCollection extends DirectivePayload {

        @Nullable
        private String icon;

        @Nullable
        private String iconDark;

        @Nullable
        private String name;

        @Nullable
        private Integer size;

        @Nullable
        private String thumbnail;

        @Nullable
        private String url;

        @Nullable
        public final String getIcon() {
            return this.icon;
        }

        @Nullable
        public final String getIconDark() {
            return this.iconDark;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final Integer getSize() {
            return this.size;
        }

        @Nullable
        public final String getThumbnail() {
            return this.thumbnail;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public final void setIcon(@Nullable String str) {
            this.icon = str;
        }

        public final void setIconDark(@Nullable String str) {
            this.iconDark = str;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setSize(@Nullable Integer num) {
            this.size = num;
        }

        public final void setThumbnail(@Nullable String str) {
            this.thumbnail = str;
        }

        public final void setUrl(@Nullable String str) {
            this.url = str;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/recommend/OperationCard$Item;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "actionInfos", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "getActionInfos", "()Ljava/util/ArrayList;", "setActionInfos", "(Ljava/util/ArrayList;)V", "darkIcon", "", "getDarkIcon", "()Ljava/lang/String;", "setDarkIcon", "(Ljava/lang/String;)V", "icon", "getIcon", "setIcon", "itemId", "getItemId", "setItemId", "multimodalInfo", "Lcom/heytap/speech/engine/protocol/directive/recommend/OperationCard$MultiModalInfo;", "getMultimodalInfo", "()Lcom/heytap/speech/engine/protocol/directive/recommend/OperationCard$MultiModalInfo;", "setMultimodalInfo", "(Lcom/heytap/speech/engine/protocol/directive/recommend/OperationCard$MultiModalInfo;)V", SearchIntents.EXTRA_QUERY, "getQuery", "setQuery", "title", "getTitle", "setTitle", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Item extends DirectivePayload {

        @Nullable
        private ArrayList<ActionInfo> actionInfos;

        @Nullable
        private String darkIcon;

        @Nullable
        private String icon;

        @Nullable
        private String itemId;

        @Nullable
        private MultiModalInfo multimodalInfo;

        @Nullable
        private String query;

        @Nullable
        private String title;

        @Nullable
        public final ArrayList<ActionInfo> getActionInfos() {
            return this.actionInfos;
        }

        @Nullable
        public final String getDarkIcon() {
            return this.darkIcon;
        }

        @Nullable
        public final String getIcon() {
            return this.icon;
        }

        @Nullable
        public final String getItemId() {
            return this.itemId;
        }

        @Nullable
        public final MultiModalInfo getMultimodalInfo() {
            return this.multimodalInfo;
        }

        @Nullable
        public final String getQuery() {
            return this.query;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public final void setActionInfos(@Nullable ArrayList<ActionInfo> arrayList) {
            this.actionInfos = arrayList;
        }

        public final void setDarkIcon(@Nullable String str) {
            this.darkIcon = str;
        }

        public final void setIcon(@Nullable String str) {
            this.icon = str;
        }

        public final void setItemId(@Nullable String str) {
            this.itemId = str;
        }

        public final void setMultimodalInfo(@Nullable MultiModalInfo multiModalInfo) {
            this.multimodalInfo = multiModalInfo;
        }

        public final void setQuery(@Nullable String str) {
            this.query = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR\u001c\u0010 \u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000f¨\u0006#"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/recommend/OperationCard$MultiModalInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "action", "", "getAction", "()Ljava/lang/Integer;", "setAction", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", DBHealthReviewPlan.DESC, "", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "fileCollection", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/recommend/OperationCard$FileCollection;", "getFileCollection", "()Ljava/util/ArrayList;", "setFileCollection", "(Ljava/util/ArrayList;)V", "id", "getId", "setId", "itemType", "getItemType", "setItemType", SearchIntents.EXTRA_QUERY, "getQuery", "setQuery", "title", "getTitle", "setTitle", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class MultiModalInfo extends DirectivePayload {

        @Nullable
        private Integer action;

        @Nullable
        private String desc;

        @Nullable
        private ArrayList<FileCollection> fileCollection;

        @Nullable
        private Integer id;

        @Nullable
        private Integer itemType;

        @Nullable
        private String query;

        @Nullable
        private String title;

        @Nullable
        public final Integer getAction() {
            return this.action;
        }

        @Nullable
        public final String getDesc() {
            return this.desc;
        }

        @Nullable
        public final ArrayList<FileCollection> getFileCollection() {
            return this.fileCollection;
        }

        @Nullable
        public final Integer getId() {
            return this.id;
        }

        @Nullable
        public final Integer getItemType() {
            return this.itemType;
        }

        @Nullable
        public final String getQuery() {
            return this.query;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public final void setAction(@Nullable Integer num) {
            this.action = num;
        }

        public final void setDesc(@Nullable String str) {
            this.desc = str;
        }

        public final void setFileCollection(@Nullable ArrayList<FileCollection> arrayList) {
            this.fileCollection = arrayList;
        }

        public final void setId(@Nullable Integer num) {
            this.id = num;
        }

        public final void setItemType(@Nullable Integer num) {
            this.itemType = num;
        }

        public final void setQuery(@Nullable String str) {
            this.query = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/recommend/OperationCard$Title;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", Feedback.WIDGET_SUBTITLE, "", "getSubTitle", "()Ljava/lang/String;", "setSubTitle", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Title extends DirectivePayload {

        @Nullable
        private String subTitle;

        @Nullable
        private String title;

        @Nullable
        public final String getSubTitle() {
            return this.subTitle;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public final void setSubTitle(@Nullable String str) {
            this.subTitle = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }
    }

    @Nullable
    public final HashMap<String, String> getExpInfo() {
        return this.expInfo;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final ArrayList<Item> getQueryItems() {
        return this.queryItems;
    }

    @Nullable
    public final Title getTitle() {
        return this.title;
    }

    public final void setExpInfo(@Nullable HashMap<String, String> map) {
        this.expInfo = map;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setQueryItems(@Nullable ArrayList<Item> arrayList) {
        this.queryItems = arrayList;
    }

    public final void setTitle(@Nullable Title title) {
        this.title = title;
    }
}
