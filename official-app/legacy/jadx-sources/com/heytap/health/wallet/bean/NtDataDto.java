package com.heytap.health.wallet.bean;

import androidx.annotation.Keep;
import com.google.gson.GsonBuilder;
import io.protostuff.Tag;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class NtDataDto {

    @Tag(1)
    private Long nt;

    @Tag(2)
    private Long ntEnc;

    @Tag(3)
    private Integer[] parity;

    public NtDataDto() {
    }

    public Long getNt() {
        return this.nt;
    }

    public Long getNtEnc() {
        return this.ntEnc;
    }

    public Integer[] getParity() {
        return this.parity;
    }

    public void setNt(Long l2) {
        this.nt = l2;
    }

    public void setNtEnc(Long l2) {
        this.ntEnc = l2;
    }

    public void setParity(Integer[] numArr) {
        this.parity = numArr;
    }

    public String toJson() {
        return new GsonBuilder().create().toJson(this);
    }

    public NtDataDto(Long l2, Long l3, Integer[] numArr) {
        this.nt = l2;
        this.ntEnc = l3;
        this.parity = numArr;
    }
}
