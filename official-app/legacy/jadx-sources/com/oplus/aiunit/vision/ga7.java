package com.oplus.aiunit.vision;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.garmin.fit.Profile$Type;
import com.heytap.sports.record.details.SkiFieldListFragment;

/* JADX INFO: loaded from: classes13.dex */
public class ga7 extends bxb {
    public static final int AccumulateFieldNum = 10;
    public static final int ArrayFieldNum = 4;
    public static final int BitsFieldNum = 9;
    public static final int ComponentsFieldNum = 5;
    public static final int DeveloperDataIndexFieldNum = 0;
    public static final int FieldDefinitionNumberFieldNum = 1;
    public static final int FieldNameFieldNum = 3;
    public static final int FitBaseTypeIdFieldNum = 2;
    public static final int FitBaseUnitIdFieldNum = 13;
    public static final int NativeFieldNumFieldNum = 15;
    public static final int NativeMesgNumFieldNum = 14;
    public static final int OffsetFieldNum = 7;
    public static final int ScaleFieldNum = 6;
    public static final int UnitsFieldNum = 8;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("field_description", 206);
        h = bxbVar;
        Profile$Type profile$Type = Profile$Type.UINT8;
        bxbVar.e(new w97("developer_data_index", 0, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("field_definition_number", 1, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("fit_base_type_id", 2, 2, 1.0d, 0.0d, "", false, Profile$Type.FIT_BASE_TYPE));
        Profile$Type profile$Type2 = Profile$Type.STRING;
        bxbVar.e(new w97(SkiFieldListFragment.ARGUMENTS_KEY_FIELD_NAME, 3, 7, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("array", 4, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("components", 5, 7, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("scale", 6, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97(TypedValues.CycleType.S_WAVE_OFFSET, 7, 1, 1.0d, 0.0d, "", false, Profile$Type.SINT8));
        bxbVar.e(new w97("units", 8, 7, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("bits", 9, 7, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("accumulate", 10, 7, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("fit_base_unit_id", 13, 132, 1.0d, 0.0d, "", false, Profile$Type.FIT_BASE_UNIT));
        bxbVar.e(new w97("native_mesg_num", 14, 132, 1.0d, 0.0d, "", false, Profile$Type.MESG_NUM));
        bxbVar.e(new w97("native_field_num", 15, 2, 1.0d, 0.0d, "", false, profile$Type));
    }

    public ga7() {
        super(w07.b(206));
    }

    public Short A() {
        return n(1, 0, 65535);
    }

    public String B(int i) {
        return o(3, i, 65535);
    }

    public Short C() {
        return n(2, 0, 65535);
    }

    public Byte D() {
        return j(7, 0, 65535);
    }

    public Short E() {
        return n(6, 0, 65535);
    }

    public String F(int i) {
        return o(8, i, 65535);
    }

    public Short z() {
        return n(0, 0, 65535);
    }

    public ga7(bxb bxbVar) {
        super(bxbVar);
    }
}
