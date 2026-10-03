package com.heytap.nearx.cloudconfig.bean;

import com.oplus.aiunit.vision.s15;
import com.oplus.aiunit.vision.t15;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@s15(addedVersion = 0, tableName = "hey_config")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\bY\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 d2\u00020\u0001:\u0001dB×\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005¢\u0006\u0002\u0010\u0019J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\t\u0010S\u001a\u00020\u0005HÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0005HÆ\u0003J\t\u0010W\u001a\u00020\u0005HÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\u0005HÆ\u0003J\t\u0010[\u001a\u00020\u0005HÆ\u0003J\t\u0010\\\u001a\u00020\u0005HÆ\u0003JÛ\u0001\u0010]\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u0005HÆ\u0001J\u0013\u0010^\u001a\u00020_2\b\u0010`\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010a\u001a\u00020bHÖ\u0001J\t\u0010c\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001e\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\u001e\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R\u001e\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R\u001e\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001f\"\u0004\b+\u0010!R\u001e\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R\u001e\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001f\"\u0004\b/\u0010!R\u001e\u0010\u0015\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u0010!R\u001e\u0010\u0016\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!R\u001e\u0010\u0017\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010!R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u0010!R\u001e\u0010\u0018\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001f\"\u0004\b9\u0010!R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001f\"\u0004\b;\u0010!R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001f\"\u0004\b=\u0010!R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001f\"\u0004\b?\u0010!R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001f\"\u0004\bA\u0010!R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001f\"\u0004\bC\u0010!R\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001f\"\u0004\bE\u0010!R\u001e\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u001f\"\u0004\bG\u0010!¨\u0006e"}, d2 = {"Lcom/heytap/nearx/cloudconfig/bean/CoreEntity;", "", "_id", "", "data1", "", "data2", "data3", com.heytap.nearx.tangramconfig.bean.CoreEntity.DATA4, com.heytap.nearx.tangramconfig.bean.CoreEntity.DATA5, com.heytap.nearx.tangramconfig.bean.CoreEntity.DATA6, com.heytap.nearx.tangramconfig.bean.CoreEntity.DATA7, com.heytap.nearx.tangramconfig.bean.CoreEntity.DATA8, com.heytap.nearx.tangramconfig.bean.CoreEntity.DATA9, com.heytap.nearx.tangramconfig.bean.CoreEntity.DATA10, com.heytap.nearx.tangramconfig.bean.CoreEntity.DATA11, com.heytap.nearx.tangramconfig.bean.CoreEntity.DATA12, com.heytap.nearx.tangramconfig.bean.CoreEntity.DATA13, com.heytap.nearx.tangramconfig.bean.CoreEntity.DATA14, com.heytap.nearx.tangramconfig.bean.CoreEntity.DATA15, com.heytap.nearx.tangramconfig.bean.CoreEntity.DATA16, com.heytap.nearx.tangramconfig.bean.CoreEntity.DATA17, com.heytap.nearx.tangramconfig.bean.CoreEntity.DATA18, com.heytap.nearx.tangramconfig.bean.CoreEntity.DATA19, com.heytap.nearx.tangramconfig.bean.CoreEntity.DATA20, "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get_id", "()J", "set_id", "(J)V", "getData1", "()Ljava/lang/String;", "setData1", "(Ljava/lang/String;)V", "getData10", "setData10", "getData11", "setData11", "getData12", "setData12", "getData13", "setData13", "getData14", "setData14", "getData15", "setData15", "getData16", "setData16", "getData17", "setData17", "getData18", "setData18", "getData19", "setData19", "getData2", "setData2", "getData20", "setData20", "getData3", "setData3", "getData4", "setData4", "getData5", "setData5", "getData6", "setData6", "getData7", "setData7", "getData8", "setData8", "getData9", "setData9", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public final /* data */ class CoreEntity {

    @NotNull
    public static final String TABLE = "hey_config";
    private long _id;

    @t15
    @NotNull
    private String data1;

    @t15
    @NotNull
    private String data10;

    @t15
    @NotNull
    private String data11;

    @t15
    @NotNull
    private String data12;

    @t15
    @NotNull
    private String data13;

    @t15
    @NotNull
    private String data14;

    @t15
    @NotNull
    private String data15;

    @t15
    @NotNull
    private String data16;

    @t15
    @NotNull
    private String data17;

    @t15
    @NotNull
    private String data18;

    @t15
    @NotNull
    private String data19;

    @t15
    @NotNull
    private String data2;

    @t15
    @NotNull
    private String data20;

    @t15
    @NotNull
    private String data3;

    @t15
    @NotNull
    private String data4;

    @t15
    @NotNull
    private String data5;

    @t15
    @NotNull
    private String data6;

    @t15
    @NotNull
    private String data7;

    @t15
    @NotNull
    private String data8;

    @t15
    @NotNull
    private String data9;

    public CoreEntity() {
        this(0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long get_id() {
        return this._id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getData9() {
        return this.data9;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getData10() {
        return this.data10;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getData11() {
        return this.data11;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getData12() {
        return this.data12;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getData13() {
        return this.data13;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getData14() {
        return this.data14;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getData15() {
        return this.data15;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getData16() {
        return this.data16;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getData17() {
        return this.data17;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getData18() {
        return this.data18;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getData1() {
        return this.data1;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getData19() {
        return this.data19;
    }

    @NotNull
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getData20() {
        return this.data20;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getData2() {
        return this.data2;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getData3() {
        return this.data3;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getData4() {
        return this.data4;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getData5() {
        return this.data5;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getData6() {
        return this.data6;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getData7() {
        return this.data7;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getData8() {
        return this.data8;
    }

    @NotNull
    public final CoreEntity copy(long _id, @NotNull String data1, @NotNull String data2, @NotNull String data3, @NotNull String data4, @NotNull String data5, @NotNull String data6, @NotNull String data7, @NotNull String data8, @NotNull String data9, @NotNull String data10, @NotNull String data11, @NotNull String data12, @NotNull String data13, @NotNull String data14, @NotNull String data15, @NotNull String data16, @NotNull String data17, @NotNull String data18, @NotNull String data19, @NotNull String data20) {
        Intrinsics.checkParameterIsNotNull(data1, "data1");
        Intrinsics.checkParameterIsNotNull(data2, "data2");
        Intrinsics.checkParameterIsNotNull(data3, "data3");
        Intrinsics.checkParameterIsNotNull(data4, "data4");
        Intrinsics.checkParameterIsNotNull(data5, "data5");
        Intrinsics.checkParameterIsNotNull(data6, "data6");
        Intrinsics.checkParameterIsNotNull(data7, "data7");
        Intrinsics.checkParameterIsNotNull(data8, "data8");
        Intrinsics.checkParameterIsNotNull(data9, "data9");
        Intrinsics.checkParameterIsNotNull(data10, "data10");
        Intrinsics.checkParameterIsNotNull(data11, "data11");
        Intrinsics.checkParameterIsNotNull(data12, "data12");
        Intrinsics.checkParameterIsNotNull(data13, "data13");
        Intrinsics.checkParameterIsNotNull(data14, "data14");
        Intrinsics.checkParameterIsNotNull(data15, "data15");
        Intrinsics.checkParameterIsNotNull(data16, "data16");
        Intrinsics.checkParameterIsNotNull(data17, "data17");
        Intrinsics.checkParameterIsNotNull(data18, "data18");
        Intrinsics.checkParameterIsNotNull(data19, "data19");
        Intrinsics.checkParameterIsNotNull(data20, "data20");
        return new CoreEntity(_id, data1, data2, data3, data4, data5, data6, data7, data8, data9, data10, data11, data12, data13, data14, data15, data16, data17, data18, data19, data20);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoreEntity)) {
            return false;
        }
        CoreEntity coreEntity = (CoreEntity) other;
        return this._id == coreEntity._id && Intrinsics.areEqual(this.data1, coreEntity.data1) && Intrinsics.areEqual(this.data2, coreEntity.data2) && Intrinsics.areEqual(this.data3, coreEntity.data3) && Intrinsics.areEqual(this.data4, coreEntity.data4) && Intrinsics.areEqual(this.data5, coreEntity.data5) && Intrinsics.areEqual(this.data6, coreEntity.data6) && Intrinsics.areEqual(this.data7, coreEntity.data7) && Intrinsics.areEqual(this.data8, coreEntity.data8) && Intrinsics.areEqual(this.data9, coreEntity.data9) && Intrinsics.areEqual(this.data10, coreEntity.data10) && Intrinsics.areEqual(this.data11, coreEntity.data11) && Intrinsics.areEqual(this.data12, coreEntity.data12) && Intrinsics.areEqual(this.data13, coreEntity.data13) && Intrinsics.areEqual(this.data14, coreEntity.data14) && Intrinsics.areEqual(this.data15, coreEntity.data15) && Intrinsics.areEqual(this.data16, coreEntity.data16) && Intrinsics.areEqual(this.data17, coreEntity.data17) && Intrinsics.areEqual(this.data18, coreEntity.data18) && Intrinsics.areEqual(this.data19, coreEntity.data19) && Intrinsics.areEqual(this.data20, coreEntity.data20);
    }

    @NotNull
    public final String getData1() {
        return this.data1;
    }

    @NotNull
    public final String getData10() {
        return this.data10;
    }

    @NotNull
    public final String getData11() {
        return this.data11;
    }

    @NotNull
    public final String getData12() {
        return this.data12;
    }

    @NotNull
    public final String getData13() {
        return this.data13;
    }

    @NotNull
    public final String getData14() {
        return this.data14;
    }

    @NotNull
    public final String getData15() {
        return this.data15;
    }

    @NotNull
    public final String getData16() {
        return this.data16;
    }

    @NotNull
    public final String getData17() {
        return this.data17;
    }

    @NotNull
    public final String getData18() {
        return this.data18;
    }

    @NotNull
    public final String getData19() {
        return this.data19;
    }

    @NotNull
    public final String getData2() {
        return this.data2;
    }

    @NotNull
    public final String getData20() {
        return this.data20;
    }

    @NotNull
    public final String getData3() {
        return this.data3;
    }

    @NotNull
    public final String getData4() {
        return this.data4;
    }

    @NotNull
    public final String getData5() {
        return this.data5;
    }

    @NotNull
    public final String getData6() {
        return this.data6;
    }

    @NotNull
    public final String getData7() {
        return this.data7;
    }

    @NotNull
    public final String getData8() {
        return this.data8;
    }

    @NotNull
    public final String getData9() {
        return this.data9;
    }

    public final long get_id() {
        return this._id;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this._id) * 31;
        String str = this.data1;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.data2;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.data3;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.data4;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.data5;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.data6;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.data7;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.data8;
        int iHashCode9 = (iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.data9;
        int iHashCode10 = (iHashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.data10;
        int iHashCode11 = (iHashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.data11;
        int iHashCode12 = (iHashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.data12;
        int iHashCode13 = (iHashCode12 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.data13;
        int iHashCode14 = (iHashCode13 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.data14;
        int iHashCode15 = (iHashCode14 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.data15;
        int iHashCode16 = (iHashCode15 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.data16;
        int iHashCode17 = (iHashCode16 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.data17;
        int iHashCode18 = (iHashCode17 + (str17 != null ? str17.hashCode() : 0)) * 31;
        String str18 = this.data18;
        int iHashCode19 = (iHashCode18 + (str18 != null ? str18.hashCode() : 0)) * 31;
        String str19 = this.data19;
        int iHashCode20 = (iHashCode19 + (str19 != null ? str19.hashCode() : 0)) * 31;
        String str20 = this.data20;
        return iHashCode20 + (str20 != null ? str20.hashCode() : 0);
    }

    public final void setData1(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.data1 = str;
    }

    public final void setData10(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.data10 = str;
    }

    public final void setData11(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.data11 = str;
    }

    public final void setData12(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.data12 = str;
    }

    public final void setData13(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.data13 = str;
    }

    public final void setData14(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.data14 = str;
    }

    public final void setData15(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.data15 = str;
    }

    public final void setData16(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.data16 = str;
    }

    public final void setData17(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.data17 = str;
    }

    public final void setData18(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.data18 = str;
    }

    public final void setData19(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.data19 = str;
    }

    public final void setData2(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.data2 = str;
    }

    public final void setData20(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.data20 = str;
    }

    public final void setData3(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.data3 = str;
    }

    public final void setData4(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.data4 = str;
    }

    public final void setData5(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.data5 = str;
    }

    public final void setData6(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.data6 = str;
    }

    public final void setData7(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.data7 = str;
    }

    public final void setData8(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.data8 = str;
    }

    public final void setData9(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.data9 = str;
    }

    public final void set_id(long j2) {
        this._id = j2;
    }

    @NotNull
    public String toString() {
        return "CoreEntity(_id=" + this._id + ", data1=" + this.data1 + ", data2=" + this.data2 + ", data3=" + this.data3 + ", data4=" + this.data4 + ", data5=" + this.data5 + ", data6=" + this.data6 + ", data7=" + this.data7 + ", data8=" + this.data8 + ", data9=" + this.data9 + ", data10=" + this.data10 + ", data11=" + this.data11 + ", data12=" + this.data12 + ", data13=" + this.data13 + ", data14=" + this.data14 + ", data15=" + this.data15 + ", data16=" + this.data16 + ", data17=" + this.data17 + ", data18=" + this.data18 + ", data19=" + this.data19 + ", data20=" + this.data20 + ")";
    }

    public CoreEntity(long j2, @NotNull String data1, @NotNull String data2, @NotNull String data3, @NotNull String data4, @NotNull String data5, @NotNull String data6, @NotNull String data7, @NotNull String data8, @NotNull String data9, @NotNull String data10, @NotNull String data11, @NotNull String data12, @NotNull String data13, @NotNull String data14, @NotNull String data15, @NotNull String data16, @NotNull String data17, @NotNull String data18, @NotNull String data19, @NotNull String data20) {
        Intrinsics.checkParameterIsNotNull(data1, "data1");
        Intrinsics.checkParameterIsNotNull(data2, "data2");
        Intrinsics.checkParameterIsNotNull(data3, "data3");
        Intrinsics.checkParameterIsNotNull(data4, "data4");
        Intrinsics.checkParameterIsNotNull(data5, "data5");
        Intrinsics.checkParameterIsNotNull(data6, "data6");
        Intrinsics.checkParameterIsNotNull(data7, "data7");
        Intrinsics.checkParameterIsNotNull(data8, "data8");
        Intrinsics.checkParameterIsNotNull(data9, "data9");
        Intrinsics.checkParameterIsNotNull(data10, "data10");
        Intrinsics.checkParameterIsNotNull(data11, "data11");
        Intrinsics.checkParameterIsNotNull(data12, "data12");
        Intrinsics.checkParameterIsNotNull(data13, "data13");
        Intrinsics.checkParameterIsNotNull(data14, "data14");
        Intrinsics.checkParameterIsNotNull(data15, "data15");
        Intrinsics.checkParameterIsNotNull(data16, "data16");
        Intrinsics.checkParameterIsNotNull(data17, "data17");
        Intrinsics.checkParameterIsNotNull(data18, "data18");
        Intrinsics.checkParameterIsNotNull(data19, "data19");
        Intrinsics.checkParameterIsNotNull(data20, "data20");
        this._id = j2;
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
        this.data5 = data5;
        this.data6 = data6;
        this.data7 = data7;
        this.data8 = data8;
        this.data9 = data9;
        this.data10 = data10;
        this.data11 = data11;
        this.data12 = data12;
        this.data13 = data13;
        this.data14 = data14;
        this.data15 = data15;
        this.data16 = data16;
        this.data17 = data17;
        this.data18 = data18;
        this.data19 = data19;
        this.data20 = data20;
    }

    public /* synthetic */ CoreEntity(long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j2, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? "" : str15, (i & 65536) != 0 ? "" : str16, (i & 131072) != 0 ? "" : str17, (i & 262144) != 0 ? "" : str18, (i & 524288) != 0 ? "" : str19, (i & 1048576) != 0 ? "" : str20);
    }
}
