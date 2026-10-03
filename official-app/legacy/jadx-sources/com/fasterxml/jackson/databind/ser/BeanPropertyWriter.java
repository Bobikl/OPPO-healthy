package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.a;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.oplus.aiunit.vision.ela;
import com.oplus.aiunit.vision.eug;
import com.oplus.aiunit.vision.fia;
import com.oplus.aiunit.vision.hla;
import com.oplus.aiunit.vision.j60;
import com.oplus.aiunit.vision.jfg;
import com.oplus.aiunit.vision.nc3;
import com.oplus.aiunit.vision.rc1;
import com.oplus.aiunit.vision.tla;
import com.oplus.aiunit.vision.wdk;
import com.oplus.aiunit.vision.wtg;
import com.oplus.aiunit.vision.yla;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
@fia
public class BeanPropertyWriter extends PropertyWriter {
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    private static final long serialVersionUID = 1;
    protected transient Method _accessorMethod;
    protected final JavaType _cfgSerializationType;
    protected final transient j60 _contextAnnotations;
    protected final JavaType _declaredType;
    protected transient a _dynamicSerializers;
    protected transient Field _field;
    protected final Class<?>[] _includeInViews;
    protected transient HashMap<Object, Object> _internalSettings;
    protected final AnnotatedMember _member;
    protected final SerializedString _name;
    protected JavaType _nonTrivialBaseType;
    protected yla<Object> _nullSerializer;
    protected yla<Object> _serializer;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected wdk _typeSerializer;
    protected final PropertyName _wrapperName;

    public BeanPropertyWriter(rc1 rc1Var, AnnotatedMember annotatedMember, j60 j60Var, JavaType javaType, yla<?> ylaVar, wdk wdkVar, JavaType javaType2, boolean z, Object obj, Class<?>[] clsArr) {
        super(rc1Var);
        this._member = annotatedMember;
        this._contextAnnotations = j60Var;
        this._name = new SerializedString(rc1Var.getName());
        this._wrapperName = rc1Var.getWrapperName();
        this._declaredType = javaType;
        this._serializer = ylaVar;
        this._dynamicSerializers = ylaVar == null ? a.c() : null;
        this._typeSerializer = wdkVar;
        this._cfgSerializationType = javaType2;
        if (annotatedMember instanceof AnnotatedField) {
            this._accessorMethod = null;
            this._field = (Field) annotatedMember.getMember();
        } else if (annotatedMember instanceof AnnotatedMethod) {
            this._accessorMethod = (Method) annotatedMember.getMember();
            this._field = null;
        } else {
            this._accessorMethod = null;
            this._field = null;
        }
        this._suppressNulls = z;
        this._suppressableValue = obj;
        this._nullSerializer = null;
        this._includeInViews = clsArr;
    }

    public void _depositSchemaProperty(ObjectNode objectNode, ela elaVar) {
        objectNode.set(getName(), elaVar);
    }

    public yla<Object> _findAndAddDynamic(a aVar, Class<?> cls, eug eugVar) throws JsonMappingException {
        JavaType javaType = this._nonTrivialBaseType;
        a.d dVarF = javaType != null ? aVar.f(eugVar.constructSpecializedType(javaType, cls), eugVar, this) : aVar.g(cls, eugVar, this);
        a aVar2 = dVarF.b;
        if (aVar != aVar2) {
            this._dynamicSerializers = aVar2;
        }
        return dVarF.a;
    }

    public boolean _handleSelfReference(Object obj, JsonGenerator jsonGenerator, eug eugVar, yla<?> ylaVar) throws IOException {
        if (ylaVar.usesObjectId()) {
            return false;
        }
        if (eugVar.isEnabled(SerializationFeature.FAIL_ON_SELF_REFERENCES)) {
            if (!(ylaVar instanceof BeanSerializerBase)) {
                return false;
            }
            eugVar.reportBadDefinition(getType(), "Direct self-reference leading to cycle");
            return false;
        }
        if (!eugVar.isEnabled(SerializationFeature.WRITE_SELF_REFERENCES_AS_NULL)) {
            return false;
        }
        if (this._nullSerializer == null) {
            return true;
        }
        if (!jsonGenerator.t().f()) {
            jsonGenerator.R(this._name);
        }
        this._nullSerializer.serialize(null, jsonGenerator, eugVar);
        return true;
    }

    public BeanPropertyWriter _new(PropertyName propertyName) {
        return new BeanPropertyWriter(this, propertyName);
    }

    public void assignNullSerializer(yla<Object> ylaVar) {
        yla<Object> ylaVar2 = this._nullSerializer;
        if (ylaVar2 != null && ylaVar2 != ylaVar) {
            throw new IllegalStateException(String.format("Cannot override _nullSerializer: had a %s, trying to set to %s", nc3.h(this._nullSerializer), nc3.h(ylaVar)));
        }
        this._nullSerializer = ylaVar;
    }

    public void assignSerializer(yla<Object> ylaVar) {
        yla<Object> ylaVar2 = this._serializer;
        if (ylaVar2 != null && ylaVar2 != ylaVar) {
            throw new IllegalStateException(String.format("Cannot override _serializer: had a %s, trying to set to %s", nc3.h(this._serializer), nc3.h(ylaVar)));
        }
        this._serializer = ylaVar;
    }

    public void assignTypeSerializer(wdk wdkVar) {
        this._typeSerializer = wdkVar;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public void depositSchemaProperty(hla hlaVar, eug eugVar) throws JsonMappingException {
        if (hlaVar != null) {
            if (isRequired()) {
                hlaVar.h(this);
            } else {
                hlaVar.f(this);
            }
        }
    }

    public void fixAccess(SerializationConfig serializationConfig) {
        this._member.fixAccess(serializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public final Object get(Object obj) throws Exception {
        Method method = this._accessorMethod;
        return method == null ? this._field.get(obj) : method.invoke(obj, null);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        AnnotatedMember annotatedMember = this._member;
        if (annotatedMember == null) {
            return null;
        }
        return (A) annotatedMember.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        j60 j60Var = this._contextAnnotations;
        if (j60Var == null) {
            return null;
        }
        return (A) j60Var.get(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public PropertyName getFullName() {
        return new PropertyName(this._name.getValue());
    }

    @Deprecated
    public Type getGenericPropertyType() {
        Method method = this._accessorMethod;
        if (method != null) {
            return method.getGenericReturnType();
        }
        Field field = this._field;
        if (field != null) {
            return field.getGenericType();
        }
        return null;
    }

    public Object getInternalSetting(Object obj) {
        HashMap<Object, Object> map = this._internalSettings;
        if (map == null) {
            return null;
        }
        return map.get(obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this._member;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty, com.oplus.aiunit.vision.tec
    public String getName() {
        return this._name.getValue();
    }

    @Deprecated
    public Class<?> getPropertyType() {
        Method method = this._accessorMethod;
        if (method != null) {
            return method.getReturnType();
        }
        Field field = this._field;
        if (field != null) {
            return field.getType();
        }
        return null;
    }

    @Deprecated
    public Class<?> getRawSerializationType() {
        JavaType javaType = this._cfgSerializationType;
        if (javaType == null) {
            return null;
        }
        return javaType.getRawClass();
    }

    public JavaType getSerializationType() {
        return this._cfgSerializationType;
    }

    public wtg getSerializedName() {
        return this._name;
    }

    public yla<Object> getSerializer() {
        return this._serializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public JavaType getType() {
        return this._declaredType;
    }

    public wdk getTypeSerializer() {
        return this._typeSerializer;
    }

    public Class<?>[] getViews() {
        return this._includeInViews;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public PropertyName getWrapperName() {
        return this._wrapperName;
    }

    public boolean hasNullSerializer() {
        return this._nullSerializer != null;
    }

    public boolean hasSerializer() {
        return this._serializer != null;
    }

    public boolean isUnwrapping() {
        return false;
    }

    public Object readResolve() {
        AnnotatedMember annotatedMember = this._member;
        if (annotatedMember instanceof AnnotatedField) {
            this._accessorMethod = null;
            this._field = (Field) annotatedMember.getMember();
        } else if (annotatedMember instanceof AnnotatedMethod) {
            this._accessorMethod = (Method) annotatedMember.getMember();
            this._field = null;
        }
        if (this._serializer == null) {
            this._dynamicSerializers = a.c();
        }
        return this;
    }

    public Object removeInternalSetting(Object obj) {
        HashMap<Object, Object> map = this._internalSettings;
        if (map == null) {
            return null;
        }
        Object objRemove = map.remove(obj);
        if (this._internalSettings.size() == 0) {
            this._internalSettings = null;
        }
        return objRemove;
    }

    public BeanPropertyWriter rename(NameTransformer nameTransformer) {
        String strTransform = nameTransformer.transform(this._name.getValue());
        return strTransform.equals(this._name.toString()) ? this : _new(PropertyName.construct(strTransform));
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, eug eugVar) throws Exception {
        Method method = this._accessorMethod;
        Object objInvoke = method == null ? this._field.get(obj) : method.invoke(obj, null);
        if (objInvoke == null) {
            yla<Object> ylaVar = this._nullSerializer;
            if (ylaVar != null) {
                ylaVar.serialize(null, jsonGenerator, eugVar);
                return;
            } else {
                jsonGenerator.T();
                return;
            }
        }
        yla<?> ylaVar_findAndAddDynamic = this._serializer;
        if (ylaVar_findAndAddDynamic == null) {
            Class<?> cls = objInvoke.getClass();
            a aVar = this._dynamicSerializers;
            yla<?> ylaVarK = aVar.k(cls);
            ylaVar_findAndAddDynamic = ylaVarK == null ? _findAndAddDynamic(aVar, cls, eugVar) : ylaVarK;
        }
        Object obj2 = this._suppressableValue;
        if (obj2 != null) {
            if (MARKER_FOR_EMPTY == obj2) {
                if (ylaVar_findAndAddDynamic.isEmpty(eugVar, objInvoke)) {
                    serializeAsPlaceholder(obj, jsonGenerator, eugVar);
                    return;
                }
            } else if (obj2.equals(objInvoke)) {
                serializeAsPlaceholder(obj, jsonGenerator, eugVar);
                return;
            }
        }
        if (objInvoke == obj && _handleSelfReference(obj, jsonGenerator, eugVar, ylaVar_findAndAddDynamic)) {
            return;
        }
        wdk wdkVar = this._typeSerializer;
        if (wdkVar == null) {
            ylaVar_findAndAddDynamic.serialize(objInvoke, jsonGenerator, eugVar);
        } else {
            ylaVar_findAndAddDynamic.serializeWithType(objInvoke, jsonGenerator, eugVar, wdkVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, eug eugVar) throws Exception {
        Method method = this._accessorMethod;
        Object objInvoke = method == null ? this._field.get(obj) : method.invoke(obj, null);
        if (objInvoke == null) {
            if (this._nullSerializer != null) {
                jsonGenerator.R(this._name);
                this._nullSerializer.serialize(null, jsonGenerator, eugVar);
                return;
            }
            return;
        }
        yla<?> ylaVar_findAndAddDynamic = this._serializer;
        if (ylaVar_findAndAddDynamic == null) {
            Class<?> cls = objInvoke.getClass();
            a aVar = this._dynamicSerializers;
            yla<?> ylaVarK = aVar.k(cls);
            ylaVar_findAndAddDynamic = ylaVarK == null ? _findAndAddDynamic(aVar, cls, eugVar) : ylaVarK;
        }
        Object obj2 = this._suppressableValue;
        if (obj2 != null) {
            if (MARKER_FOR_EMPTY == obj2) {
                if (ylaVar_findAndAddDynamic.isEmpty(eugVar, objInvoke)) {
                    return;
                }
            } else if (obj2.equals(objInvoke)) {
                return;
            }
        }
        if (objInvoke == obj && _handleSelfReference(obj, jsonGenerator, eugVar, ylaVar_findAndAddDynamic)) {
            return;
        }
        jsonGenerator.R(this._name);
        wdk wdkVar = this._typeSerializer;
        if (wdkVar == null) {
            ylaVar_findAndAddDynamic.serialize(objInvoke, jsonGenerator, eugVar);
        } else {
            ylaVar_findAndAddDynamic.serializeWithType(objInvoke, jsonGenerator, eugVar, wdkVar);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsOmittedField(Object obj, JsonGenerator jsonGenerator, eug eugVar) throws Exception {
        if (jsonGenerator.l()) {
            return;
        }
        jsonGenerator.e0(this._name.getValue());
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsPlaceholder(Object obj, JsonGenerator jsonGenerator, eug eugVar) throws Exception {
        yla<Object> ylaVar = this._nullSerializer;
        if (ylaVar != null) {
            ylaVar.serialize(null, jsonGenerator, eugVar);
        } else {
            jsonGenerator.T();
        }
    }

    public Object setInternalSetting(Object obj, Object obj2) {
        if (this._internalSettings == null) {
            this._internalSettings = new HashMap<>();
        }
        return this._internalSettings.put(obj, obj2);
    }

    public void setNonTrivialBaseType(JavaType javaType) {
        this._nonTrivialBaseType = javaType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("property '");
        sb.append(getName());
        sb.append("' (");
        if (this._accessorMethod != null) {
            sb.append("via method ");
            sb.append(this._accessorMethod.getDeclaringClass().getName());
            sb.append("#");
            sb.append(this._accessorMethod.getName());
        } else if (this._field != null) {
            sb.append("field \"");
            sb.append(this._field.getDeclaringClass().getName());
            sb.append("#");
            sb.append(this._field.getName());
        } else {
            sb.append("virtual");
        }
        if (this._serializer == null) {
            sb.append(", no static serializer");
        } else {
            sb.append(", static serializer of type " + this._serializer.getClass().getName());
        }
        sb.append(')');
        return sb.toString();
    }

    public BeanPropertyWriter unwrappingWriter(NameTransformer nameTransformer) {
        return new UnwrappingBeanPropertyWriter(this, nameTransformer);
    }

    public boolean willSuppressNulls() {
        return this._suppressNulls;
    }

    public boolean wouldConflictWithName(PropertyName propertyName) {
        PropertyName propertyName2 = this._wrapperName;
        if (propertyName2 != null) {
            return propertyName2.equals(propertyName);
        }
        return propertyName.hasSimpleName(this._name.getValue()) && !propertyName.hasNamespace();
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    @Deprecated
    public void depositSchemaProperty(ObjectNode objectNode, eug eugVar) throws JsonMappingException {
        ela elaVarA;
        JavaType serializationType = getSerializationType();
        Type type = serializationType == null ? getType() : serializationType.getRawClass();
        Object serializer = getSerializer();
        if (serializer == null) {
            serializer = eugVar.findValueSerializer(getType(), this);
        }
        boolean z = !isRequired();
        if (serializer instanceof jfg) {
            elaVarA = ((jfg) serializer).getSchema(eugVar, type, z);
        } else {
            elaVarA = tla.a();
        }
        _depositSchemaProperty(objectNode, elaVarA);
    }

    @Deprecated
    public BeanPropertyWriter(rc1 rc1Var, AnnotatedMember annotatedMember, j60 j60Var, JavaType javaType, yla<?> ylaVar, wdk wdkVar, JavaType javaType2, boolean z, Object obj) {
        this(rc1Var, annotatedMember, j60Var, javaType, ylaVar, wdkVar, javaType2, z, obj, null);
    }

    public BeanPropertyWriter() {
        super(PropertyMetadata.STD_REQUIRED_OR_OPTIONAL);
        this._member = null;
        this._contextAnnotations = null;
        this._name = null;
        this._wrapperName = null;
        this._includeInViews = null;
        this._declaredType = null;
        this._serializer = null;
        this._dynamicSerializers = null;
        this._typeSerializer = null;
        this._cfgSerializationType = null;
        this._accessorMethod = null;
        this._field = null;
        this._suppressNulls = false;
        this._suppressableValue = null;
        this._nullSerializer = null;
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter) {
        this(beanPropertyWriter, beanPropertyWriter._name);
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, PropertyName propertyName) {
        super(beanPropertyWriter);
        this._name = new SerializedString(propertyName.getSimpleName());
        this._wrapperName = beanPropertyWriter._wrapperName;
        this._contextAnnotations = beanPropertyWriter._contextAnnotations;
        this._declaredType = beanPropertyWriter._declaredType;
        this._member = beanPropertyWriter._member;
        this._accessorMethod = beanPropertyWriter._accessorMethod;
        this._field = beanPropertyWriter._field;
        this._serializer = beanPropertyWriter._serializer;
        this._nullSerializer = beanPropertyWriter._nullSerializer;
        if (beanPropertyWriter._internalSettings != null) {
            this._internalSettings = new HashMap<>(beanPropertyWriter._internalSettings);
        }
        this._cfgSerializationType = beanPropertyWriter._cfgSerializationType;
        this._dynamicSerializers = beanPropertyWriter._dynamicSerializers;
        this._suppressNulls = beanPropertyWriter._suppressNulls;
        this._suppressableValue = beanPropertyWriter._suppressableValue;
        this._includeInViews = beanPropertyWriter._includeInViews;
        this._typeSerializer = beanPropertyWriter._typeSerializer;
        this._nonTrivialBaseType = beanPropertyWriter._nonTrivialBaseType;
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, SerializedString serializedString) {
        super(beanPropertyWriter);
        this._name = serializedString;
        this._wrapperName = beanPropertyWriter._wrapperName;
        this._member = beanPropertyWriter._member;
        this._contextAnnotations = beanPropertyWriter._contextAnnotations;
        this._declaredType = beanPropertyWriter._declaredType;
        this._accessorMethod = beanPropertyWriter._accessorMethod;
        this._field = beanPropertyWriter._field;
        this._serializer = beanPropertyWriter._serializer;
        this._nullSerializer = beanPropertyWriter._nullSerializer;
        if (beanPropertyWriter._internalSettings != null) {
            this._internalSettings = new HashMap<>(beanPropertyWriter._internalSettings);
        }
        this._cfgSerializationType = beanPropertyWriter._cfgSerializationType;
        this._dynamicSerializers = beanPropertyWriter._dynamicSerializers;
        this._suppressNulls = beanPropertyWriter._suppressNulls;
        this._suppressableValue = beanPropertyWriter._suppressableValue;
        this._includeInViews = beanPropertyWriter._includeInViews;
        this._typeSerializer = beanPropertyWriter._typeSerializer;
        this._nonTrivialBaseType = beanPropertyWriter._nonTrivialBaseType;
    }
}
