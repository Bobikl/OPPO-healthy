package com.fasterxml.jackson.databind.cfg;

import com.oplus.aiunit.vision.fug;
import com.oplus.aiunit.vision.uc1;
import com.oplus.aiunit.vision.yg0;
import com.oplus.aiunit.vision.zg0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class SerializerFactoryConfig implements Serializable {
    private static final long serialVersionUID = 1;
    protected final fug[] _additionalKeySerializers;
    protected final fug[] _additionalSerializers;
    protected final uc1[] _modifiers;
    protected static final fug[] NO_SERIALIZERS = new fug[0];
    protected static final uc1[] NO_MODIFIERS = new uc1[0];

    public SerializerFactoryConfig() {
        this(null, null, null);
    }

    public boolean hasKeySerializers() {
        return this._additionalKeySerializers.length > 0;
    }

    public boolean hasSerializerModifiers() {
        return this._modifiers.length > 0;
    }

    public boolean hasSerializers() {
        return this._additionalSerializers.length > 0;
    }

    public Iterable<fug> keySerializers() {
        return new zg0(this._additionalKeySerializers);
    }

    public Iterable<uc1> serializerModifiers() {
        return new zg0(this._modifiers);
    }

    public Iterable<fug> serializers() {
        return new zg0(this._additionalSerializers);
    }

    public SerializerFactoryConfig withAdditionalKeySerializers(fug fugVar) {
        if (fugVar == null) {
            throw new IllegalArgumentException("Cannot pass null Serializers");
        }
        return new SerializerFactoryConfig(this._additionalSerializers, (fug[]) yg0.j(this._additionalKeySerializers, fugVar), this._modifiers);
    }

    public SerializerFactoryConfig withAdditionalSerializers(fug fugVar) {
        if (fugVar != null) {
            return new SerializerFactoryConfig((fug[]) yg0.j(this._additionalSerializers, fugVar), this._additionalKeySerializers, this._modifiers);
        }
        throw new IllegalArgumentException("Cannot pass null Serializers");
    }

    public SerializerFactoryConfig withSerializerModifier(uc1 uc1Var) {
        if (uc1Var == null) {
            throw new IllegalArgumentException("Cannot pass null modifier");
        }
        return new SerializerFactoryConfig(this._additionalSerializers, this._additionalKeySerializers, (uc1[]) yg0.j(this._modifiers, uc1Var));
    }

    public SerializerFactoryConfig(fug[] fugVarArr, fug[] fugVarArr2, uc1[] uc1VarArr) {
        this._additionalSerializers = fugVarArr == null ? NO_SERIALIZERS : fugVarArr;
        this._additionalKeySerializers = fugVarArr2 == null ? NO_SERIALIZERS : fugVarArr2;
        this._modifiers = uc1VarArr == null ? NO_MODIFIERS : uc1VarArr;
    }
}
