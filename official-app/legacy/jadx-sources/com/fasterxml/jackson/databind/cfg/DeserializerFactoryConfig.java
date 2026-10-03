package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.oplus.aiunit.vision.fuk;
import com.oplus.aiunit.vision.k95;
import com.oplus.aiunit.vision.qc1;
import com.oplus.aiunit.vision.y6;
import com.oplus.aiunit.vision.yg0;
import com.oplus.aiunit.vision.zg0;
import com.oplus.aiunit.vision.zna;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class DeserializerFactoryConfig implements Serializable {
    private static final long serialVersionUID = 1;
    protected final y6[] _abstractTypeResolvers;
    protected final k95[] _additionalDeserializers;
    protected final zna[] _additionalKeyDeserializers;
    protected final qc1[] _modifiers;
    protected final fuk[] _valueInstantiators;
    protected static final k95[] NO_DESERIALIZERS = new k95[0];
    protected static final qc1[] NO_MODIFIERS = new qc1[0];
    protected static final y6[] NO_ABSTRACT_TYPE_RESOLVERS = new y6[0];
    protected static final fuk[] NO_VALUE_INSTANTIATORS = new fuk[0];
    protected static final zna[] DEFAULT_KEY_DESERIALIZERS = {new StdKeyDeserializers()};

    public DeserializerFactoryConfig() {
        this(null, null, null, null, null);
    }

    public Iterable<y6> abstractTypeResolvers() {
        return new zg0(this._abstractTypeResolvers);
    }

    public Iterable<qc1> deserializerModifiers() {
        return new zg0(this._modifiers);
    }

    public Iterable<k95> deserializers() {
        return new zg0(this._additionalDeserializers);
    }

    public boolean hasAbstractTypeResolvers() {
        return this._abstractTypeResolvers.length > 0;
    }

    public boolean hasDeserializerModifiers() {
        return this._modifiers.length > 0;
    }

    public boolean hasDeserializers() {
        return this._additionalDeserializers.length > 0;
    }

    public boolean hasKeyDeserializers() {
        return this._additionalKeyDeserializers.length > 0;
    }

    public boolean hasValueInstantiators() {
        return this._valueInstantiators.length > 0;
    }

    public Iterable<zna> keyDeserializers() {
        return new zg0(this._additionalKeyDeserializers);
    }

    public Iterable<fuk> valueInstantiators() {
        return new zg0(this._valueInstantiators);
    }

    public DeserializerFactoryConfig withAbstractTypeResolver(y6 y6Var) {
        if (y6Var == null) {
            throw new IllegalArgumentException("Cannot pass null resolver");
        }
        return new DeserializerFactoryConfig(this._additionalDeserializers, this._additionalKeyDeserializers, this._modifiers, (y6[]) yg0.j(this._abstractTypeResolvers, y6Var), this._valueInstantiators);
    }

    public DeserializerFactoryConfig withAdditionalDeserializers(k95 k95Var) {
        if (k95Var != null) {
            return new DeserializerFactoryConfig((k95[]) yg0.j(this._additionalDeserializers, k95Var), this._additionalKeyDeserializers, this._modifiers, this._abstractTypeResolvers, this._valueInstantiators);
        }
        throw new IllegalArgumentException("Cannot pass null Deserializers");
    }

    public DeserializerFactoryConfig withAdditionalKeyDeserializers(zna znaVar) {
        if (znaVar == null) {
            throw new IllegalArgumentException("Cannot pass null KeyDeserializers");
        }
        return new DeserializerFactoryConfig(this._additionalDeserializers, (zna[]) yg0.j(this._additionalKeyDeserializers, znaVar), this._modifiers, this._abstractTypeResolvers, this._valueInstantiators);
    }

    public DeserializerFactoryConfig withDeserializerModifier(qc1 qc1Var) {
        if (qc1Var == null) {
            throw new IllegalArgumentException("Cannot pass null modifier");
        }
        return new DeserializerFactoryConfig(this._additionalDeserializers, this._additionalKeyDeserializers, (qc1[]) yg0.j(this._modifiers, qc1Var), this._abstractTypeResolvers, this._valueInstantiators);
    }

    public DeserializerFactoryConfig withValueInstantiators(fuk fukVar) {
        if (fukVar == null) {
            throw new IllegalArgumentException("Cannot pass null resolver");
        }
        return new DeserializerFactoryConfig(this._additionalDeserializers, this._additionalKeyDeserializers, this._modifiers, this._abstractTypeResolvers, (fuk[]) yg0.j(this._valueInstantiators, fukVar));
    }

    public DeserializerFactoryConfig(k95[] k95VarArr, zna[] znaVarArr, qc1[] qc1VarArr, y6[] y6VarArr, fuk[] fukVarArr) {
        this._additionalDeserializers = k95VarArr == null ? NO_DESERIALIZERS : k95VarArr;
        this._additionalKeyDeserializers = znaVarArr == null ? DEFAULT_KEY_DESERIALIZERS : znaVarArr;
        this._modifiers = qc1VarArr == null ? NO_MODIFIERS : qc1VarArr;
        this._abstractTypeResolvers = y6VarArr == null ? NO_ABSTRACT_TYPE_RESOLVERS : y6VarArr;
        this._valueInstantiators = fukVarArr == null ? NO_VALUE_INSTANTIATORS : fukVarArr;
    }
}
