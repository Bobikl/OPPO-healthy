package com.heytap.speech.engine.protocol.directive.myai;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.ThinkingResult;
import com.heytap.speech.engine.protocol.directive.common.commercial.ActionInfo;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import com.oplus.aiunit.vision.sbe;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 92\u00020\u0001:\b:;<=>?@AB\u0007¢\u0006\u0004\b7\u00108R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010&\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR$\u0010*\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00101\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006B"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "contentType", "Ljava/lang/Integer;", "getContentType", "()Ljava/lang/Integer;", "setContentType", "(Ljava/lang/Integer;)V", "Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$WikiInfo;", "wikiInfo", "Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$WikiInfo;", "getWikiInfo", "()Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$WikiInfo;", "setWikiInfo", "(Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$WikiInfo;)V", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$CommonListInfo;", "commonInfos", "Ljava/util/ArrayList;", "getCommonInfos", "()Ljava/util/ArrayList;", "setCommonInfos", "(Ljava/util/ArrayList;)V", "", "guideText", "Ljava/lang/String;", "getGuideText", "()Ljava/lang/String;", "setGuideText", "(Ljava/lang/String;)V", "", "needExtraTrack", "Ljava/lang/Boolean;", "getNeedExtraTrack", "()Ljava/lang/Boolean;", "setNeedExtraTrack", "(Ljava/lang/Boolean;)V", "extraTrackUrl", "getExtraTrackUrl", "setExtraTrackUrl", "Lcom/heytap/speech/engine/protocol/directive/common/ThinkingResult;", "thinkingResult", "Lcom/heytap/speech/engine/protocol/directive/common/ThinkingResult;", "getThinkingResult", "()Lcom/heytap/speech/engine/protocol/directive/common/ThinkingResult;", "setThinkingResult", "(Lcom/heytap/speech/engine/protocol/directive/common/ThinkingResult;)V", "Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$MoreInfo;", "moreInfo", "Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$MoreInfo;", "getMoreInfo", "()Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$MoreInfo;", "setMoreInfo", "(Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$MoreInfo;)V", "<init>", "()V", "Companion", "AwemeInfo", "CommonListInfo", "a", "InnerReportInfo", "MoreInfo", "ProductExtra", "ProductInfo", "WikiInfo", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class PictureSearchCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private ArrayList<CommonListInfo> commonInfos;

    @Nullable
    private Integer contentType;

    @Nullable
    private String extraTrackUrl;

    @Nullable
    private String guideText;

    @Nullable
    private MoreInfo moreInfo;

    @Nullable
    private Boolean needExtraTrack;

    @Nullable
    private ThinkingResult thinkingResult;

    @Nullable
    private WikiInfo wikiInfo;

    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR(\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$AwemeInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "authorNickName", "", "getAuthorNickName", "()Ljava/lang/String;", "setAuthorNickName", "(Ljava/lang/String;)V", "authorUrl", "getAuthorUrl", "setAuthorUrl", "coverUrl", "getCoverUrl", "setCoverUrl", "innerReportInfo", "Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$InnerReportInfo;", "getInnerReportInfo", "()Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$InnerReportInfo;", "setInnerReportInfo", "(Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$InnerReportInfo;)V", "jumpLinks", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "getJumpLinks", "()Ljava/util/ArrayList;", "setJumpLinks", "(Ljava/util/ArrayList;)V", "title", "getTitle", "setTitle", "trackInfo", "Ljava/util/HashMap;", "", "getTrackInfo", "()Ljava/util/HashMap;", "setTrackInfo", "(Ljava/util/HashMap;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AwemeInfo extends DirectivePayload {

        @Nullable
        private String authorNickName;

        @Nullable
        private String authorUrl;

        @Nullable
        private String coverUrl;

        @Nullable
        private InnerReportInfo innerReportInfo;

        @Nullable
        private ArrayList<ActionInfo> jumpLinks;

        @Nullable
        private String title;

        @Nullable
        private HashMap<String, Object> trackInfo;

        @Nullable
        public final String getAuthorNickName() {
            return this.authorNickName;
        }

        @Nullable
        public final String getAuthorUrl() {
            return this.authorUrl;
        }

        @Nullable
        public final String getCoverUrl() {
            return this.coverUrl;
        }

        @Nullable
        public final InnerReportInfo getInnerReportInfo() {
            return this.innerReportInfo;
        }

        @Nullable
        public final ArrayList<ActionInfo> getJumpLinks() {
            return this.jumpLinks;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final HashMap<String, Object> getTrackInfo() {
            return this.trackInfo;
        }

        public final void setAuthorNickName(@Nullable String str) {
            this.authorNickName = str;
        }

        public final void setAuthorUrl(@Nullable String str) {
            this.authorUrl = str;
        }

        public final void setCoverUrl(@Nullable String str) {
            this.coverUrl = str;
        }

        public final void setInnerReportInfo(@Nullable InnerReportInfo innerReportInfo) {
            this.innerReportInfo = innerReportInfo;
        }

        public final void setJumpLinks(@Nullable ArrayList<ActionInfo> arrayList) {
            this.jumpLinks = arrayList;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        public final void setTrackInfo(@Nullable HashMap<String, Object> map) {
            this.trackInfo = map;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$CommonListInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "awemeInfo", "Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$AwemeInfo;", "getAwemeInfo", "()Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$AwemeInfo;", "setAwemeInfo", "(Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$AwemeInfo;)V", "contentType", "", "getContentType", "()Ljava/lang/Integer;", "setContentType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "index", "getIndex", "setIndex", "productInfo", "Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$ProductInfo;", "getProductInfo", "()Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$ProductInfo;", "setProductInfo", "(Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$ProductInfo;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class CommonListInfo extends DirectivePayload {

        @Nullable
        private AwemeInfo awemeInfo;

        @Nullable
        private Integer contentType;

        @Nullable
        private Integer index;

        @Nullable
        private ProductInfo productInfo;

        @Nullable
        public final AwemeInfo getAwemeInfo() {
            return this.awemeInfo;
        }

        @Nullable
        public final Integer getContentType() {
            return this.contentType;
        }

        @Nullable
        public final Integer getIndex() {
            return this.index;
        }

        @Nullable
        public final ProductInfo getProductInfo() {
            return this.productInfo;
        }

        public final void setAwemeInfo(@Nullable AwemeInfo awemeInfo) {
            this.awemeInfo = awemeInfo;
        }

        public final void setContentType(@Nullable Integer num) {
            this.contentType = num;
        }

        public final void setIndex(@Nullable Integer num) {
            this.index = num;
        }

        public final void setProductInfo(@Nullable ProductInfo productInfo) {
            this.productInfo = productInfo;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$InnerReportInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "searchId", "", "getSearchId", "()Ljava/lang/String;", "setSearchId", "(Ljava/lang/String;)V", "searchResultId", "getSearchResultId", "setSearchResultId", "tokenType", "getTokenType", "setTokenType", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class InnerReportInfo extends DirectivePayload {

        @Nullable
        private String searchId;

        @Nullable
        private String searchResultId;

        @Nullable
        private String tokenType;

        @Nullable
        public final String getSearchId() {
            return this.searchId;
        }

        @Nullable
        public final String getSearchResultId() {
            return this.searchResultId;
        }

        @Nullable
        public final String getTokenType() {
            return this.tokenType;
        }

        public final void setSearchId(@Nullable String str) {
            this.searchId = str;
        }

        public final void setSearchResultId(@Nullable String str) {
            this.searchResultId = str;
        }

        public final void setTokenType(@Nullable String str) {
            this.tokenType = str;
        }
    }

    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$MoreInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "innerReportInfo", "Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$InnerReportInfo;", "getInnerReportInfo", "()Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$InnerReportInfo;", "setInnerReportInfo", "(Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$InnerReportInfo;)V", "jumpLinks", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "getJumpLinks", "()Ljava/util/ArrayList;", "setJumpLinks", "(Ljava/util/ArrayList;)V", "jumpText", "", "getJumpText", "()Ljava/lang/String;", "setJumpText", "(Ljava/lang/String;)V", "trackInfo", "Ljava/util/HashMap;", "", "getTrackInfo", "()Ljava/util/HashMap;", "setTrackInfo", "(Ljava/util/HashMap;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class MoreInfo extends DirectivePayload {

        @Nullable
        private InnerReportInfo innerReportInfo;

        @Nullable
        private ArrayList<ActionInfo> jumpLinks;

        @Nullable
        private String jumpText;

        @Nullable
        private HashMap<String, Object> trackInfo;

        @Nullable
        public final InnerReportInfo getInnerReportInfo() {
            return this.innerReportInfo;
        }

        @Nullable
        public final ArrayList<ActionInfo> getJumpLinks() {
            return this.jumpLinks;
        }

        @Nullable
        public final String getJumpText() {
            return this.jumpText;
        }

        @Nullable
        public final HashMap<String, Object> getTrackInfo() {
            return this.trackInfo;
        }

        public final void setInnerReportInfo(@Nullable InnerReportInfo innerReportInfo) {
            this.innerReportInfo = innerReportInfo;
        }

        public final void setJumpLinks(@Nullable ArrayList<ActionInfo> arrayList) {
            this.jumpLinks = arrayList;
        }

        public final void setJumpText(@Nullable String str) {
            this.jumpText = str;
        }

        public final void setTrackInfo(@Nullable HashMap<String, Object> map) {
            this.trackInfo = map;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$ProductExtra;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "firstTag", "", "getFirstTag", "()Ljava/lang/String;", "setFirstTag", "(Ljava/lang/String;)V", "secondTag", "getSecondTag", "setSecondTag", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ProductExtra extends DirectivePayload {

        @Nullable
        private String firstTag;

        @Nullable
        private String secondTag;

        @Nullable
        public final String getFirstTag() {
            return this.firstTag;
        }

        @Nullable
        public final String getSecondTag() {
            return this.secondTag;
        }

        public final void setFirstTag(@Nullable String str) {
            this.firstTag = str;
        }

        public final void setSecondTag(@Nullable String str) {
            this.secondTag = str;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR(\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$ProductInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "coverUrl", "", "getCoverUrl", "()Ljava/lang/String;", "setCoverUrl", "(Ljava/lang/String;)V", "extraInfos", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$ProductExtra;", "getExtraInfos", "()Ljava/util/ArrayList;", "setExtraInfos", "(Ljava/util/ArrayList;)V", "innerReportInfo", "Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$InnerReportInfo;", "getInnerReportInfo", "()Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$InnerReportInfo;", "setInnerReportInfo", "(Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$InnerReportInfo;)V", "jumpLinks", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "getJumpLinks", "setJumpLinks", sbe.PAY_SDK_PRODUCTNAME, "getProductName", "setProductName", "trackInfo", "Ljava/util/HashMap;", "", "getTrackInfo", "()Ljava/util/HashMap;", "setTrackInfo", "(Ljava/util/HashMap;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ProductInfo extends DirectivePayload {

        @Nullable
        private String coverUrl;

        @Nullable
        private ArrayList<ProductExtra> extraInfos;

        @Nullable
        private InnerReportInfo innerReportInfo;

        @Nullable
        private ArrayList<ActionInfo> jumpLinks;

        @Nullable
        private String productName;

        @Nullable
        private HashMap<String, Object> trackInfo;

        @Nullable
        public final String getCoverUrl() {
            return this.coverUrl;
        }

        @Nullable
        public final ArrayList<ProductExtra> getExtraInfos() {
            return this.extraInfos;
        }

        @Nullable
        public final InnerReportInfo getInnerReportInfo() {
            return this.innerReportInfo;
        }

        @Nullable
        public final ArrayList<ActionInfo> getJumpLinks() {
            return this.jumpLinks;
        }

        @Nullable
        public final String getProductName() {
            return this.productName;
        }

        @Nullable
        public final HashMap<String, Object> getTrackInfo() {
            return this.trackInfo;
        }

        public final void setCoverUrl(@Nullable String str) {
            this.coverUrl = str;
        }

        public final void setExtraInfos(@Nullable ArrayList<ProductExtra> arrayList) {
            this.extraInfos = arrayList;
        }

        public final void setInnerReportInfo(@Nullable InnerReportInfo innerReportInfo) {
            this.innerReportInfo = innerReportInfo;
        }

        public final void setJumpLinks(@Nullable ArrayList<ActionInfo> arrayList) {
            this.jumpLinks = arrayList;
        }

        public final void setProductName(@Nullable String str) {
            this.productName = str;
        }

        public final void setTrackInfo(@Nullable HashMap<String, Object> map) {
            this.trackInfo = map;
        }
    }

    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR(\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020'\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$WikiInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "brandIcon", "", "getBrandIcon", "()Ljava/lang/String;", "setBrandIcon", "(Ljava/lang/String;)V", "brandName", "getBrandName", "setBrandName", "coverUrl", "getCoverUrl", "setCoverUrl", "innerReportInfo", "Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$InnerReportInfo;", "getInnerReportInfo", "()Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$InnerReportInfo;", "setInnerReportInfo", "(Lcom/heytap/speech/engine/protocol/directive/myai/PictureSearchCard$InnerReportInfo;)V", "jumpLinks", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "getJumpLinks", "()Ljava/util/ArrayList;", "setJumpLinks", "(Ljava/util/ArrayList;)V", Feedback.WIDGET_SUBTITLE, "getSubTitle", "setSubTitle", "summary", "getSummary", "setSummary", "title", "getTitle", "setTitle", "trackInfo", "Ljava/util/HashMap;", "", "getTrackInfo", "()Ljava/util/HashMap;", "setTrackInfo", "(Ljava/util/HashMap;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class WikiInfo extends DirectivePayload {

        @Nullable
        private String brandIcon;

        @Nullable
        private String brandName;

        @Nullable
        private String coverUrl;

        @Nullable
        private InnerReportInfo innerReportInfo;

        @Nullable
        private ArrayList<ActionInfo> jumpLinks;

        @Nullable
        private String subTitle;

        @Nullable
        private String summary;

        @Nullable
        private String title;

        @Nullable
        private HashMap<String, Object> trackInfo;

        @Nullable
        public final String getBrandIcon() {
            return this.brandIcon;
        }

        @Nullable
        public final String getBrandName() {
            return this.brandName;
        }

        @Nullable
        public final String getCoverUrl() {
            return this.coverUrl;
        }

        @Nullable
        public final InnerReportInfo getInnerReportInfo() {
            return this.innerReportInfo;
        }

        @Nullable
        public final ArrayList<ActionInfo> getJumpLinks() {
            return this.jumpLinks;
        }

        @Nullable
        public final String getSubTitle() {
            return this.subTitle;
        }

        @Nullable
        public final String getSummary() {
            return this.summary;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final HashMap<String, Object> getTrackInfo() {
            return this.trackInfo;
        }

        public final void setBrandIcon(@Nullable String str) {
            this.brandIcon = str;
        }

        public final void setBrandName(@Nullable String str) {
            this.brandName = str;
        }

        public final void setCoverUrl(@Nullable String str) {
            this.coverUrl = str;
        }

        public final void setInnerReportInfo(@Nullable InnerReportInfo innerReportInfo) {
            this.innerReportInfo = innerReportInfo;
        }

        public final void setJumpLinks(@Nullable ArrayList<ActionInfo> arrayList) {
            this.jumpLinks = arrayList;
        }

        public final void setSubTitle(@Nullable String str) {
            this.subTitle = str;
        }

        public final void setSummary(@Nullable String str) {
            this.summary = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        public final void setTrackInfo(@Nullable HashMap<String, Object> map) {
            this.trackInfo = map;
        }
    }

    @Nullable
    public final ArrayList<CommonListInfo> getCommonInfos() {
        return this.commonInfos;
    }

    @Nullable
    public final Integer getContentType() {
        return this.contentType;
    }

    @Nullable
    public final String getExtraTrackUrl() {
        return this.extraTrackUrl;
    }

    @Nullable
    public final String getGuideText() {
        return this.guideText;
    }

    @Nullable
    public final MoreInfo getMoreInfo() {
        return this.moreInfo;
    }

    @Nullable
    public final Boolean getNeedExtraTrack() {
        return this.needExtraTrack;
    }

    @Nullable
    public final ThinkingResult getThinkingResult() {
        return this.thinkingResult;
    }

    @Nullable
    public final WikiInfo getWikiInfo() {
        return this.wikiInfo;
    }

    public final void setCommonInfos(@Nullable ArrayList<CommonListInfo> arrayList) {
        this.commonInfos = arrayList;
    }

    public final void setContentType(@Nullable Integer num) {
        this.contentType = num;
    }

    public final void setExtraTrackUrl(@Nullable String str) {
        this.extraTrackUrl = str;
    }

    public final void setGuideText(@Nullable String str) {
        this.guideText = str;
    }

    public final void setMoreInfo(@Nullable MoreInfo moreInfo) {
        this.moreInfo = moreInfo;
    }

    public final void setNeedExtraTrack(@Nullable Boolean bool) {
        this.needExtraTrack = bool;
    }

    public final void setThinkingResult(@Nullable ThinkingResult thinkingResult) {
        this.thinkingResult = thinkingResult;
    }

    public final void setWikiInfo(@Nullable WikiInfo wikiInfo) {
        this.wikiInfo = wikiInfo;
    }
}
