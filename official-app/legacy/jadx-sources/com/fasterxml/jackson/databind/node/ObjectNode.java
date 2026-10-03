package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.oplus.aiunit.vision.ela;
import com.oplus.aiunit.vision.eug;
import com.oplus.aiunit.vision.mla;
import com.oplus.aiunit.vision.uaf;
import com.oplus.aiunit.vision.wdk;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class ObjectNode extends ContainerNode<ObjectNode> {
    private static final long serialVersionUID = 1;
    protected final Map<String, ela> _children;

    public ObjectNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this._children = new LinkedHashMap();
    }

    @Override // com.oplus.aiunit.vision.ela
    public ela _at(mla mlaVar) {
        return get(mlaVar.g());
    }

    public boolean _childrenEqual(ObjectNode objectNode) {
        return this._children.equals(objectNode._children);
    }

    public ObjectNode _put(String str, ela elaVar) {
        this._children.put(str, elaVar);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.d
    public JsonToken asToken() {
        return JsonToken.START_OBJECT;
    }

    @Override // com.oplus.aiunit.vision.ela
    public Iterator<ela> elements() {
        return this._children.values().iterator();
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean equals(Comparator<ela> comparator, ela elaVar) {
        if (!(elaVar instanceof ObjectNode)) {
            return false;
        }
        Map<String, ela> map = this._children;
        Map<String, ela> map2 = ((ObjectNode) elaVar)._children;
        if (map2.size() != map.size()) {
            return false;
        }
        for (Map.Entry<String, ela> entry : map.entrySet()) {
            ela elaVar2 = map2.get(entry.getKey());
            if (elaVar2 == null || !entry.getValue().equals(comparator, elaVar2)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.oplus.aiunit.vision.ela
    public Iterator<String> fieldNames() {
        return this._children.keySet().iterator();
    }

    @Override // com.oplus.aiunit.vision.ela
    public Iterator<Map.Entry<String, ela>> fields() {
        return this._children.entrySet().iterator();
    }

    @Override // com.oplus.aiunit.vision.ela
    public List<ela> findParents(String str, List<ela> list) {
        for (Map.Entry<String, ela> entry : this._children.entrySet()) {
            if (str.equals(entry.getKey())) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(this);
            } else {
                list = entry.getValue().findParents(str, list);
            }
        }
        return list;
    }

    @Override // com.oplus.aiunit.vision.ela
    public ela findValue(String str) {
        for (Map.Entry<String, ela> entry : this._children.entrySet()) {
            if (str.equals(entry.getKey())) {
                return entry.getValue();
            }
            ela elaVarFindValue = entry.getValue().findValue(str);
            if (elaVarFindValue != null) {
                return elaVarFindValue;
            }
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.ela
    public List<ela> findValues(String str, List<ela> list) {
        for (Map.Entry<String, ela> entry : this._children.entrySet()) {
            if (str.equals(entry.getKey())) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(entry.getValue());
            } else {
                list = entry.getValue().findValues(str, list);
            }
        }
        return list;
    }

    @Override // com.oplus.aiunit.vision.ela
    public List<String> findValuesAsText(String str, List<String> list) {
        for (Map.Entry<String, ela> entry : this._children.entrySet()) {
            if (str.equals(entry.getKey())) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(entry.getValue().asText());
            } else {
                list = entry.getValue().findValuesAsText(str, list);
            }
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.oplus.aiunit.vision.ela
    public ela get(int i) {
        return null;
    }

    @Override // com.oplus.aiunit.vision.ela
    public JsonNodeType getNodeType() {
        return JsonNodeType.OBJECT;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this._children.hashCode();
    }

    @Override // com.oplus.aiunit.vision.wla.a
    public boolean isEmpty(eug eugVar) {
        return this._children.isEmpty();
    }

    @Override // com.oplus.aiunit.vision.ela
    public final boolean isObject() {
        return true;
    }

    @Deprecated
    public ela put(String str, ela elaVar) {
        if (elaVar == null) {
            elaVar = m4543nullNode();
        }
        return this._children.put(str, elaVar);
    }

    @Deprecated
    public ela putAll(Map<String, ? extends ela> map) {
        return setAll(map);
    }

    public ArrayNode putArray(String str) {
        ArrayNode arrayNode = arrayNode();
        _put(str, arrayNode);
        return arrayNode;
    }

    public ela putIfAbsent(String str, ela elaVar) {
        if (elaVar == null) {
            elaVar = m4543nullNode();
        }
        return this._children.putIfAbsent(str, elaVar);
    }

    public ObjectNode putNull(String str) {
        this._children.put(str, m4543nullNode());
        return this;
    }

    public ObjectNode putObject(String str) {
        ObjectNode objectNode = objectNode();
        _put(str, objectNode);
        return objectNode;
    }

    public ObjectNode putPOJO(String str, Object obj) {
        return _put(str, pojoNode(obj));
    }

    public ObjectNode putRawValue(String str, uaf uafVar) {
        return _put(str, rawValueNode(uafVar));
    }

    public ela remove(String str) {
        return this._children.remove(str);
    }

    public ela replace(String str, ela elaVar) {
        if (elaVar == null) {
            elaVar = m4543nullNode();
        }
        return this._children.put(str, elaVar);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.oplus.aiunit.vision.ela
    public ela required(String str) {
        ela elaVar = this._children.get(str);
        return elaVar != null ? elaVar : (ela) _reportRequiredViolation("No value for property '%s' of `ObjectNode`", str);
    }

    public ObjectNode retain(Collection<String> collection) {
        this._children.keySet().retainAll(collection);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.oplus.aiunit.vision.wla
    public void serialize(JsonGenerator jsonGenerator, eug eugVar) throws IOException {
        boolean z = (eugVar == null || eugVar.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS)) ? false : true;
        jsonGenerator.q0(this);
        for (Map.Entry<String, ela> entry : this._children.entrySet()) {
            BaseJsonNode baseJsonNode = (BaseJsonNode) entry.getValue();
            if (!z || !baseJsonNode.isArray() || !baseJsonNode.isEmpty(eugVar)) {
                jsonGenerator.S(entry.getKey());
                baseJsonNode.serialize(jsonGenerator, eugVar);
            }
        }
        jsonGenerator.P();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.oplus.aiunit.vision.wla
    public void serializeWithType(JsonGenerator jsonGenerator, eug eugVar, wdk wdkVar) throws IOException {
        boolean z = (eugVar == null || eugVar.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS)) ? false : true;
        WritableTypeId writableTypeIdG = wdkVar.g(jsonGenerator, wdkVar.d(this, JsonToken.START_OBJECT));
        for (Map.Entry<String, ela> entry : this._children.entrySet()) {
            BaseJsonNode baseJsonNode = (BaseJsonNode) entry.getValue();
            if (!z || !baseJsonNode.isArray() || !baseJsonNode.isEmpty(eugVar)) {
                jsonGenerator.S(entry.getKey());
                baseJsonNode.serialize(jsonGenerator, eugVar);
            }
        }
        wdkVar.h(jsonGenerator, writableTypeIdG);
    }

    public <T extends ela> T set(String str, ela elaVar) {
        if (elaVar == null) {
            elaVar = m4543nullNode();
        }
        this._children.put(str, elaVar);
        return this;
    }

    public <T extends ela> T setAll(Map<String, ? extends ela> map) {
        for (Map.Entry<String, ? extends ela> entry : map.entrySet()) {
            ela value = entry.getValue();
            if (value == null) {
                value = m4543nullNode();
            }
            this._children.put(entry.getKey(), value);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.oplus.aiunit.vision.ela
    public int size() {
        return this._children.size();
    }

    public <T extends ela> T without(String str) {
        this._children.remove(str);
        return this;
    }

    @Override // com.oplus.aiunit.vision.ela
    public ObjectNode deepCopy() {
        ObjectNode objectNode = new ObjectNode(this._nodeFactory);
        for (Map.Entry<String, ela> entry : this._children.entrySet()) {
            objectNode._children.put(entry.getKey(), entry.getValue().deepCopy());
        }
        return objectNode;
    }

    @Override // com.oplus.aiunit.vision.ela
    public ObjectNode findParent(String str) {
        for (Map.Entry<String, ela> entry : this._children.entrySet()) {
            if (str.equals(entry.getKey())) {
                return this;
            }
            ela elaVarFindParent = entry.getValue().findParent(str);
            if (elaVarFindParent != null) {
                return (ObjectNode) elaVarFindParent;
            }
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean isEmpty() {
        return this._children.isEmpty();
    }

    @Deprecated
    public ela putAll(ObjectNode objectNode) {
        return setAll(objectNode);
    }

    public ObjectNode remove(Collection<String> collection) {
        this._children.keySet().removeAll(collection);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode
    public ObjectNode removeAll() {
        this._children.clear();
        return this;
    }

    public ObjectNode retain(String... strArr) {
        return retain(Arrays.asList(strArr));
    }

    @Override // com.oplus.aiunit.vision.ela
    public ObjectNode with(String str) {
        ela elaVar = this._children.get(str);
        if (elaVar == null) {
            ObjectNode objectNode = objectNode();
            this._children.put(str, objectNode);
            return objectNode;
        }
        if (elaVar instanceof ObjectNode) {
            return (ObjectNode) elaVar;
        }
        throw new UnsupportedOperationException("Property '" + str + "' has value that is not of type ObjectNode (but " + elaVar.getClass().getName() + ")");
    }

    @Override // com.oplus.aiunit.vision.ela
    public ArrayNode withArray(String str) {
        ela elaVar = this._children.get(str);
        if (elaVar == null) {
            ArrayNode arrayNode = arrayNode();
            this._children.put(str, arrayNode);
            return arrayNode;
        }
        if (elaVar instanceof ArrayNode) {
            return (ArrayNode) elaVar;
        }
        throw new UnsupportedOperationException("Property '" + str + "' has value that is not of type ArrayNode (but " + elaVar.getClass().getName() + ")");
    }

    public <T extends ela> T without(Collection<String> collection) {
        this._children.keySet().removeAll(collection);
        return this;
    }

    public ObjectNode(JsonNodeFactory jsonNodeFactory, Map<String, ela> map) {
        super(jsonNodeFactory);
        this._children = map;
    }

    @Override // com.oplus.aiunit.vision.ela
    public ela path(int i) {
        return MissingNode.getInstance();
    }

    public ObjectNode put(String str, short s) {
        return _put(str, m4549numberNode(s));
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.oplus.aiunit.vision.ela
    public ela get(String str) {
        return this._children.get(str);
    }

    @Override // com.oplus.aiunit.vision.ela
    public ela path(String str) {
        ela elaVar = this._children.get(str);
        return elaVar != null ? elaVar : MissingNode.getInstance();
    }

    public ObjectNode put(String str, Short sh) {
        ela elaVarNumberNode;
        if (sh == null) {
            elaVarNumberNode = m4543nullNode();
        } else {
            elaVarNumberNode = m4549numberNode(sh.shortValue());
        }
        return _put(str, elaVarNumberNode);
    }

    public <T extends ela> T setAll(ObjectNode objectNode) {
        this._children.putAll(objectNode._children);
        return this;
    }

    public ObjectNode put(String str, int i) {
        return _put(str, m4547numberNode(i));
    }

    public ObjectNode put(String str, Integer num) {
        ela elaVarNumberNode;
        if (num == null) {
            elaVarNumberNode = m4543nullNode();
        } else {
            elaVarNumberNode = m4547numberNode(num.intValue());
        }
        return _put(str, elaVarNumberNode);
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ObjectNode)) {
            return _childrenEqual((ObjectNode) obj);
        }
        return false;
    }

    public ObjectNode put(String str, long j2) {
        return _put(str, m4548numberNode(j2));
    }

    public ObjectNode put(String str, Long l2) {
        ela elaVarNumberNode;
        if (l2 == null) {
            elaVarNumberNode = m4543nullNode();
        } else {
            elaVarNumberNode = m4548numberNode(l2.longValue());
        }
        return _put(str, elaVarNumberNode);
    }

    public ObjectNode put(String str, float f) {
        return _put(str, m4546numberNode(f));
    }

    public ObjectNode put(String str, Float f) {
        ela elaVarNumberNode;
        if (f == null) {
            elaVarNumberNode = m4543nullNode();
        } else {
            elaVarNumberNode = m4546numberNode(f.floatValue());
        }
        return _put(str, elaVarNumberNode);
    }

    public ObjectNode put(String str, double d) {
        return _put(str, m4545numberNode(d));
    }

    public ObjectNode put(String str, Double d) {
        ela elaVarNumberNode;
        if (d == null) {
            elaVarNumberNode = m4543nullNode();
        } else {
            elaVarNumberNode = m4545numberNode(d.doubleValue());
        }
        return _put(str, elaVarNumberNode);
    }

    public ObjectNode put(String str, BigDecimal bigDecimal) {
        ValueNode valueNodeNumberNode;
        if (bigDecimal == null) {
            valueNodeNumberNode = m4543nullNode();
        } else {
            valueNodeNumberNode = numberNode(bigDecimal);
        }
        return _put(str, valueNodeNumberNode);
    }

    public ObjectNode put(String str, BigInteger bigInteger) {
        ValueNode valueNodeNumberNode;
        if (bigInteger == null) {
            valueNodeNumberNode = m4543nullNode();
        } else {
            valueNodeNumberNode = numberNode(bigInteger);
        }
        return _put(str, valueNodeNumberNode);
    }

    public ObjectNode put(String str, String str2) {
        ela elaVarTextNode;
        if (str2 == null) {
            elaVarTextNode = m4543nullNode();
        } else {
            elaVarTextNode = m4550textNode(str2);
        }
        return _put(str, elaVarTextNode);
    }

    public ObjectNode put(String str, boolean z) {
        return _put(str, m4542booleanNode(z));
    }

    public ObjectNode put(String str, Boolean bool) {
        ela elaVarBooleanNode;
        if (bool == null) {
            elaVarBooleanNode = m4543nullNode();
        } else {
            elaVarBooleanNode = m4542booleanNode(bool.booleanValue());
        }
        return _put(str, elaVarBooleanNode);
    }

    public ObjectNode put(String str, byte[] bArr) {
        ela elaVarBinaryNode;
        if (bArr == null) {
            elaVarBinaryNode = m4543nullNode();
        } else {
            elaVarBinaryNode = m4540binaryNode(bArr);
        }
        return _put(str, elaVarBinaryNode);
    }
}
