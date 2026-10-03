package com.oppo.obus.common.report.core.entity.v32;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import com.oppo.obus.common.configmetadata.core.entity.AreaConfig;
import com.oppo.obus.common.protobuf.ProtobufSerializable;
import io.protostuff.Tag;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class Message implements ProtobufSerializable {
    private static final long serialVersionUID = -467210921755017417L;

    @SerializedName("local_conf")
    @JsonProperty("local_conf")
    @Tag(3)
    private AreaConfig clientConf;

    @SerializedName("common_head")
    @JsonProperty("common_head")
    @Tag(1)
    private Head commonHead;

    @SerializedName("datas")
    @JsonProperty("datas")
    @Tag(2)
    private List<DataItem> datas;

    public Message() {
    }

    public Message(Head head, List<DataItem> list, AreaConfig areaConfig) {
        this.commonHead = head;
        this.datas = list;
        this.clientConf = areaConfig;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof Message;
    }

    public Message copyWithNewDatas(List<DataItem> list) {
        return new Message().setDatas(list).setCommonHead(this.commonHead).setClientConf(this.clientConf);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        if (!message.canEqual(this)) {
            return false;
        }
        Head commonHead = getCommonHead();
        Head commonHead2 = message.getCommonHead();
        if (commonHead != null ? !commonHead.equals(commonHead2) : commonHead2 != null) {
            return false;
        }
        List<DataItem> datas = getDatas();
        List<DataItem> datas2 = message.getDatas();
        if (datas != null ? !datas.equals(datas2) : datas2 != null) {
            return false;
        }
        AreaConfig clientConf = getClientConf();
        AreaConfig clientConf2 = message.getClientConf();
        return clientConf != null ? clientConf.equals(clientConf2) : clientConf2 == null;
    }

    public AreaConfig getClientConf() {
        return this.clientConf;
    }

    public Head getCommonHead() {
        return this.commonHead;
    }

    public List<DataItem> getDatas() {
        return this.datas;
    }

    public int hashCode() {
        Head commonHead = getCommonHead();
        int iHashCode = commonHead == null ? 43 : commonHead.hashCode();
        List<DataItem> datas = getDatas();
        int i = (iHashCode + 59) * 59;
        int iHashCode2 = datas == null ? 43 : datas.hashCode();
        AreaConfig clientConf = getClientConf();
        return ((i + iHashCode2) * 59) + (clientConf != null ? clientConf.hashCode() : 43);
    }

    @JsonProperty("local_conf")
    public Message setClientConf(AreaConfig areaConfig) {
        this.clientConf = areaConfig;
        return this;
    }

    @JsonProperty("common_head")
    public Message setCommonHead(Head head) {
        this.commonHead = head;
        return this;
    }

    @JsonProperty("datas")
    public Message setDatas(List<DataItem> list) {
        this.datas = list;
        return this;
    }

    public String toString() {
        return "Message(commonHead=" + getCommonHead() + ", datas=" + getDatas() + ", clientConf=" + getClientConf() + ")";
    }
}
