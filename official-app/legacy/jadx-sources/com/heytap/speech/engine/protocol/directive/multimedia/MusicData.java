package com.heytap.speech.engine.protocol.directive.multimedia;

import androidx.annotation.Keep;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.aiunit.vision.n28;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR.\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001c\u0010#\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u001c\u0010&\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0006\"\u0004\b(\u0010\bR\u001c\u0010)\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR.\u0010,\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R\u001c\u0010/\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\b¨\u00062"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/multimedia/MusicData;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "actionTarget", "", "getActionTarget", "()Ljava/lang/String;", "setActionTarget", "(Ljava/lang/String;)V", "albumName", "getAlbumName", "setAlbumName", "artistName", "getArtistName", "setArtistName", "data", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/multimedia/MusicInfo;", "Lkotlin/collections/ArrayList;", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", n28.KEYWORD, "getKeyword", "setKeyword", "listName", "getListName", "setListName", "paramValue", "getParamValue", "setParamValue", SearchIntents.EXTRA_QUERY, "getQuery", "setQuery", Fields.SDK_VERSION, "getSdkVersion", "setSdkVersion", "searchType", "getSearchType", "setSearchType", "semanticslots", "getSemanticslots", "setSemanticslots", "songList", "getSongList", "setSongList", "tagName", "getTagName", "setTagName", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MusicData extends DirectivePayload {

    @Nullable
    private String actionTarget;

    @Nullable
    private String albumName;

    @Nullable
    private String artistName;

    @Nullable
    private ArrayList<MusicInfo> data;

    @Nullable
    private String keyword;

    @Nullable
    private String listName;

    @Nullable
    private String paramValue;

    @Nullable
    private String query;

    @Nullable
    private String sdkVersion;

    @Nullable
    private String searchType;

    @Nullable
    private String semanticslots;

    @Nullable
    private ArrayList<String> songList;

    @Nullable
    private String tagName;

    @Nullable
    public final String getActionTarget() {
        return this.actionTarget;
    }

    @Nullable
    public final String getAlbumName() {
        return this.albumName;
    }

    @Nullable
    public final String getArtistName() {
        return this.artistName;
    }

    @Nullable
    public final ArrayList<MusicInfo> getData() {
        return this.data;
    }

    @Nullable
    public final String getKeyword() {
        return this.keyword;
    }

    @Nullable
    public final String getListName() {
        return this.listName;
    }

    @Nullable
    public final String getParamValue() {
        return this.paramValue;
    }

    @Nullable
    public final String getQuery() {
        return this.query;
    }

    @Nullable
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @Nullable
    public final String getSearchType() {
        return this.searchType;
    }

    @Nullable
    public final String getSemanticslots() {
        return this.semanticslots;
    }

    @Nullable
    public final ArrayList<String> getSongList() {
        return this.songList;
    }

    @Nullable
    public final String getTagName() {
        return this.tagName;
    }

    public final void setActionTarget(@Nullable String str) {
        this.actionTarget = str;
    }

    public final void setAlbumName(@Nullable String str) {
        this.albumName = str;
    }

    public final void setArtistName(@Nullable String str) {
        this.artistName = str;
    }

    public final void setData(@Nullable ArrayList<MusicInfo> arrayList) {
        this.data = arrayList;
    }

    public final void setKeyword(@Nullable String str) {
        this.keyword = str;
    }

    public final void setListName(@Nullable String str) {
        this.listName = str;
    }

    public final void setParamValue(@Nullable String str) {
        this.paramValue = str;
    }

    public final void setQuery(@Nullable String str) {
        this.query = str;
    }

    public final void setSdkVersion(@Nullable String str) {
        this.sdkVersion = str;
    }

    public final void setSearchType(@Nullable String str) {
        this.searchType = str;
    }

    public final void setSemanticslots(@Nullable String str) {
        this.semanticslots = str;
    }

    public final void setSongList(@Nullable ArrayList<String> arrayList) {
        this.songList = arrayList;
    }

    public final void setTagName(@Nullable String str) {
        this.tagName = str;
    }
}
