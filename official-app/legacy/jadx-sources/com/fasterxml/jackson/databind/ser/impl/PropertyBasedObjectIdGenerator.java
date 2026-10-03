package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.oplus.aiunit.vision.cbd;

/* JADX INFO: loaded from: classes13.dex */
public class PropertyBasedObjectIdGenerator extends ObjectIdGenerators$PropertyGenerator {
    private static final long serialVersionUID = 1;
    protected final BeanPropertyWriter _property;

    public PropertyBasedObjectIdGenerator(cbd cbdVar, BeanPropertyWriter beanPropertyWriter) {
        this(cbdVar.f(), beanPropertyWriter);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator, com.fasterxml.jackson.annotation.ObjectIdGenerators$Base, com.fasterxml.jackson.annotation.ObjectIdGenerator
    public boolean canUseFor(ObjectIdGenerator<?> objectIdGenerator) {
        if (objectIdGenerator.getClass() != getClass()) {
            return false;
        }
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = (PropertyBasedObjectIdGenerator) objectIdGenerator;
        return propertyBasedObjectIdGenerator.getScope() == this._scope && propertyBasedObjectIdGenerator._property == this._property;
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator<Object> forScope(Class<?> cls) {
        return cls == this._scope ? this : new PropertyBasedObjectIdGenerator(cls, this._property);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerators$Base, com.fasterxml.jackson.annotation.ObjectIdGenerator
    public Object generateId(Object obj) {
        try {
            return this._property.get(obj);
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new IllegalStateException("Problem accessing property '" + this._property.getName() + "': " + e3.getMessage(), e3);
        }
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator.IdKey key(Object obj) {
        if (obj == null) {
            return null;
        }
        return new ObjectIdGenerator.IdKey(getClass(), this._scope, obj);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator<Object> newForSerialization(Object obj) {
        return this;
    }

    public PropertyBasedObjectIdGenerator(Class<?> cls, BeanPropertyWriter beanPropertyWriter) {
        super(cls);
        this._property = beanPropertyWriter;
    }
}
