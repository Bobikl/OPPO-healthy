package com.heytap.health.wallet.bean;

import androidx.annotation.Keep;
import com.google.gson.GsonBuilder;
import com.oplus.aiunit.vision.t6b;
import io.protostuff.Tag;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class ProbeDataDto {

    @Tag(5)
    private String keyType;

    @Tag(1)
    private Long median;

    @Tag(2)
    private Long ntsSize;

    @Tag(3)
    private List<NtDataDto> pNtDataDtos;

    @Tag(4)
    private Integer sectorNo;

    public String getKeyType() {
        return this.keyType;
    }

    public Long getMedian() {
        return this.median;
    }

    public Long getNtsSize() {
        return this.ntsSize;
    }

    public Integer getSectorNo() {
        return this.sectorNo;
    }

    public List<NtDataDto> getpNtDataDtos() {
        return this.pNtDataDtos;
    }

    public void setKeyType(String str) {
        this.keyType = str;
    }

    public void setMedian(Long l2) {
        this.median = l2;
    }

    public void setNtsSize(Long l2) {
        this.ntsSize = l2;
    }

    public void setSectorNo(Integer num) {
        this.sectorNo = num;
    }

    public void setpNtDataDtos(List<NtDataDto> list) {
        this.pNtDataDtos = list;
    }

    public String toJson() {
        t6b.a("ProbeDataDto, toJson");
        return new GsonBuilder().create().toJson(this);
    }
}
