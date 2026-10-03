package com.heytap.speech.engine.protocol.directive.cuiedu;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import com.platform.sdk.center.cons.AcConstants;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0007\u0018\u0000 M2\u00020\u0001:\u0001NB\u0007¢\u0006\u0004\bK\u0010LR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR$\u0010%\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR$\u0010(\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0004\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR$\u0010,\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R*\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R0\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020;\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010B\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010-\u001a\u0004\bC\u0010/\"\u0004\bD\u00101R$\u0010E\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010\u0004\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR$\u0010H\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010-\u001a\u0004\bI\u0010/\"\u0004\bJ\u00101¨\u0006O"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/cuiedu/EduCutImageCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "icon", "Ljava/lang/String;", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "source", "getSource", "setSource", "title", "getTitle", "setTitle", Feedback.WIDGET_SUBTITLE, "getSubTitle", "setSubTitle", DBHealthReviewPlan.DESC, "getDesc", "setDesc", "", AcConstants.K_HTML, "Ljava/lang/Boolean;", "getHtml", "()Ljava/lang/Boolean;", "setHtml", "(Ljava/lang/Boolean;)V", "imgUrl", "getImgUrl", "setImgUrl", "docRecordId", "getDocRecordId", "setDocRecordId", "roomGroupId", "getRoomGroupId", "setRoomGroupId", "parentRoomId", "getParentRoomId", "setParentRoomId", "parentRoomRecordId", "getParentRoomRecordId", "setParentRoomRecordId", "", "rotate", "Ljava/lang/Integer;", "getRotate", "()Ljava/lang/Integer;", "setRotate", "(Ljava/lang/Integer;)V", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/cuiedu/Room;", "rooms", "Ljava/util/ArrayList;", "getRooms", "()Ljava/util/ArrayList;", "setRooms", "(Ljava/util/ArrayList;)V", "Ljava/util/HashMap;", "", "extend", "Ljava/util/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "pageSize", "getPageSize", "setPageSize", "innerSource", "getInnerSource", "setInnerSource", "lastIndex", "getLastIndex", "setLastIndex", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class EduCutImageCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String desc;

    @Nullable
    private String docRecordId;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private Boolean html;

    @Nullable
    private String icon;

    @Nullable
    private String imgUrl;

    @Nullable
    private String innerSource;

    @Nullable
    private Integer lastIndex;

    @Nullable
    private Integer pageSize;

    @Nullable
    private String parentRoomId;

    @Nullable
    private String parentRoomRecordId;

    @Nullable
    private String roomGroupId;

    @Nullable
    private ArrayList<Room> rooms;

    @Nullable
    private Integer rotate;

    @Nullable
    private String source;

    @Nullable
    private String subTitle;

    @Nullable
    private String title;

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getDocRecordId() {
        return this.docRecordId;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final Boolean getHtml() {
        return this.html;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @Nullable
    public final String getInnerSource() {
        return this.innerSource;
    }

    @Nullable
    public final Integer getLastIndex() {
        return this.lastIndex;
    }

    @Nullable
    public final Integer getPageSize() {
        return this.pageSize;
    }

    @Nullable
    public final String getParentRoomId() {
        return this.parentRoomId;
    }

    @Nullable
    public final String getParentRoomRecordId() {
        return this.parentRoomRecordId;
    }

    @Nullable
    public final String getRoomGroupId() {
        return this.roomGroupId;
    }

    @Nullable
    public final ArrayList<Room> getRooms() {
        return this.rooms;
    }

    @Nullable
    public final Integer getRotate() {
        return this.rotate;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setDocRecordId(@Nullable String str) {
        this.docRecordId = str;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setHtml(@Nullable Boolean bool) {
        this.html = bool;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setImgUrl(@Nullable String str) {
        this.imgUrl = str;
    }

    public final void setInnerSource(@Nullable String str) {
        this.innerSource = str;
    }

    public final void setLastIndex(@Nullable Integer num) {
        this.lastIndex = num;
    }

    public final void setPageSize(@Nullable Integer num) {
        this.pageSize = num;
    }

    public final void setParentRoomId(@Nullable String str) {
        this.parentRoomId = str;
    }

    public final void setParentRoomRecordId(@Nullable String str) {
        this.parentRoomRecordId = str;
    }

    public final void setRoomGroupId(@Nullable String str) {
        this.roomGroupId = str;
    }

    public final void setRooms(@Nullable ArrayList<Room> arrayList) {
        this.rooms = arrayList;
    }

    public final void setRotate(@Nullable Integer num) {
        this.rotate = num;
    }

    public final void setSource(@Nullable String str) {
        this.source = str;
    }

    public final void setSubTitle(@Nullable String str) {
        this.subTitle = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
