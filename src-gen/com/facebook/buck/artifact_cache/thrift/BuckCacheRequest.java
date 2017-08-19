/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.artifact_cache.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-08-18")
public class BuckCacheRequest implements org.apache.thrift.TBase<BuckCacheRequest, BuckCacheRequest._Fields>, java.io.Serializable, Cloneable, Comparable<BuckCacheRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuckCacheRequest");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PAYLOADS_FIELD_DESC = new org.apache.thrift.protocol.TField("payloads", org.apache.thrift.protocol.TType.LIST, (short)100);
  private static final org.apache.thrift.protocol.TField FETCH_REQUEST_FIELD_DESC = new org.apache.thrift.protocol.TField("fetchRequest", org.apache.thrift.protocol.TType.STRUCT, (short)101);
  private static final org.apache.thrift.protocol.TField STORE_REQUEST_FIELD_DESC = new org.apache.thrift.protocol.TField("storeRequest", org.apache.thrift.protocol.TType.STRUCT, (short)102);
  private static final org.apache.thrift.protocol.TField MULTI_FETCH_REQUEST_FIELD_DESC = new org.apache.thrift.protocol.TField("multiFetchRequest", org.apache.thrift.protocol.TType.STRUCT, (short)103);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new BuckCacheRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new BuckCacheRequestTupleSchemeFactory();

  /**
   * 
   * @see BuckCacheRequestType
   */
  public BuckCacheRequestType type; // optional
  public java.util.List<PayloadInfo> payloads; // optional
  public BuckCacheFetchRequest fetchRequest; // optional
  public BuckCacheStoreRequest storeRequest; // optional
  public BuckCacheMultiFetchRequest multiFetchRequest; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see BuckCacheRequestType
     */
    TYPE((short)1, "type"),
    PAYLOADS((short)100, "payloads"),
    FETCH_REQUEST((short)101, "fetchRequest"),
    STORE_REQUEST((short)102, "storeRequest"),
    MULTI_FETCH_REQUEST((short)103, "multiFetchRequest");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TYPE
          return TYPE;
        case 100: // PAYLOADS
          return PAYLOADS;
        case 101: // FETCH_REQUEST
          return FETCH_REQUEST;
        case 102: // STORE_REQUEST
          return STORE_REQUEST;
        case 103: // MULTI_FETCH_REQUEST
          return MULTI_FETCH_REQUEST;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.TYPE,_Fields.PAYLOADS,_Fields.FETCH_REQUEST,_Fields.STORE_REQUEST,_Fields.MULTI_FETCH_REQUEST};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, BuckCacheRequestType.class)));
    tmpMap.put(_Fields.PAYLOADS, new org.apache.thrift.meta_data.FieldMetaData("payloads", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PayloadInfo.class))));
    tmpMap.put(_Fields.FETCH_REQUEST, new org.apache.thrift.meta_data.FieldMetaData("fetchRequest", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuckCacheFetchRequest.class)));
    tmpMap.put(_Fields.STORE_REQUEST, new org.apache.thrift.meta_data.FieldMetaData("storeRequest", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuckCacheStoreRequest.class)));
    tmpMap.put(_Fields.MULTI_FETCH_REQUEST, new org.apache.thrift.meta_data.FieldMetaData("multiFetchRequest", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuckCacheMultiFetchRequest.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuckCacheRequest.class, metaDataMap);
  }

  public BuckCacheRequest() {
    this.type = com.facebook.buck.artifact_cache.thrift.BuckCacheRequestType.UNKNOWN;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuckCacheRequest(BuckCacheRequest other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetPayloads()) {
      java.util.List<PayloadInfo> __this__payloads = new java.util.ArrayList<PayloadInfo>(other.payloads.size());
      for (PayloadInfo other_element : other.payloads) {
        __this__payloads.add(new PayloadInfo(other_element));
      }
      this.payloads = __this__payloads;
    }
    if (other.isSetFetchRequest()) {
      this.fetchRequest = new BuckCacheFetchRequest(other.fetchRequest);
    }
    if (other.isSetStoreRequest()) {
      this.storeRequest = new BuckCacheStoreRequest(other.storeRequest);
    }
    if (other.isSetMultiFetchRequest()) {
      this.multiFetchRequest = new BuckCacheMultiFetchRequest(other.multiFetchRequest);
    }
  }

  public BuckCacheRequest deepCopy() {
    return new BuckCacheRequest(this);
  }

  @Override
  public void clear() {
    this.type = com.facebook.buck.artifact_cache.thrift.BuckCacheRequestType.UNKNOWN;

    this.payloads = null;
    this.fetchRequest = null;
    this.storeRequest = null;
    this.multiFetchRequest = null;
  }

  /**
   * 
   * @see BuckCacheRequestType
   */
  public BuckCacheRequestType getType() {
    return this.type;
  }

  /**
   * 
   * @see BuckCacheRequestType
   */
  public BuckCacheRequest setType(BuckCacheRequestType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public int getPayloadsSize() {
    return (this.payloads == null) ? 0 : this.payloads.size();
  }

  public java.util.Iterator<PayloadInfo> getPayloadsIterator() {
    return (this.payloads == null) ? null : this.payloads.iterator();
  }

  public void addToPayloads(PayloadInfo elem) {
    if (this.payloads == null) {
      this.payloads = new java.util.ArrayList<PayloadInfo>();
    }
    this.payloads.add(elem);
  }

  public java.util.List<PayloadInfo> getPayloads() {
    return this.payloads;
  }

  public BuckCacheRequest setPayloads(java.util.List<PayloadInfo> payloads) {
    this.payloads = payloads;
    return this;
  }

  public void unsetPayloads() {
    this.payloads = null;
  }

  /** Returns true if field payloads is set (has been assigned a value) and false otherwise */
  public boolean isSetPayloads() {
    return this.payloads != null;
  }

  public void setPayloadsIsSet(boolean value) {
    if (!value) {
      this.payloads = null;
    }
  }

  public BuckCacheFetchRequest getFetchRequest() {
    return this.fetchRequest;
  }

  public BuckCacheRequest setFetchRequest(BuckCacheFetchRequest fetchRequest) {
    this.fetchRequest = fetchRequest;
    return this;
  }

  public void unsetFetchRequest() {
    this.fetchRequest = null;
  }

  /** Returns true if field fetchRequest is set (has been assigned a value) and false otherwise */
  public boolean isSetFetchRequest() {
    return this.fetchRequest != null;
  }

  public void setFetchRequestIsSet(boolean value) {
    if (!value) {
      this.fetchRequest = null;
    }
  }

  public BuckCacheStoreRequest getStoreRequest() {
    return this.storeRequest;
  }

  public BuckCacheRequest setStoreRequest(BuckCacheStoreRequest storeRequest) {
    this.storeRequest = storeRequest;
    return this;
  }

  public void unsetStoreRequest() {
    this.storeRequest = null;
  }

  /** Returns true if field storeRequest is set (has been assigned a value) and false otherwise */
  public boolean isSetStoreRequest() {
    return this.storeRequest != null;
  }

  public void setStoreRequestIsSet(boolean value) {
    if (!value) {
      this.storeRequest = null;
    }
  }

  public BuckCacheMultiFetchRequest getMultiFetchRequest() {
    return this.multiFetchRequest;
  }

  public BuckCacheRequest setMultiFetchRequest(BuckCacheMultiFetchRequest multiFetchRequest) {
    this.multiFetchRequest = multiFetchRequest;
    return this;
  }

  public void unsetMultiFetchRequest() {
    this.multiFetchRequest = null;
  }

  /** Returns true if field multiFetchRequest is set (has been assigned a value) and false otherwise */
  public boolean isSetMultiFetchRequest() {
    return this.multiFetchRequest != null;
  }

  public void setMultiFetchRequestIsSet(boolean value) {
    if (!value) {
      this.multiFetchRequest = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((BuckCacheRequestType)value);
      }
      break;

    case PAYLOADS:
      if (value == null) {
        unsetPayloads();
      } else {
        setPayloads((java.util.List<PayloadInfo>)value);
      }
      break;

    case FETCH_REQUEST:
      if (value == null) {
        unsetFetchRequest();
      } else {
        setFetchRequest((BuckCacheFetchRequest)value);
      }
      break;

    case STORE_REQUEST:
      if (value == null) {
        unsetStoreRequest();
      } else {
        setStoreRequest((BuckCacheStoreRequest)value);
      }
      break;

    case MULTI_FETCH_REQUEST:
      if (value == null) {
        unsetMultiFetchRequest();
      } else {
        setMultiFetchRequest((BuckCacheMultiFetchRequest)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case PAYLOADS:
      return getPayloads();

    case FETCH_REQUEST:
      return getFetchRequest();

    case STORE_REQUEST:
      return getStoreRequest();

    case MULTI_FETCH_REQUEST:
      return getMultiFetchRequest();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case PAYLOADS:
      return isSetPayloads();
    case FETCH_REQUEST:
      return isSetFetchRequest();
    case STORE_REQUEST:
      return isSetStoreRequest();
    case MULTI_FETCH_REQUEST:
      return isSetMultiFetchRequest();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof BuckCacheRequest)
      return this.equals((BuckCacheRequest)that);
    return false;
  }

  public boolean equals(BuckCacheRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_payloads = true && this.isSetPayloads();
    boolean that_present_payloads = true && that.isSetPayloads();
    if (this_present_payloads || that_present_payloads) {
      if (!(this_present_payloads && that_present_payloads))
        return false;
      if (!this.payloads.equals(that.payloads))
        return false;
    }

    boolean this_present_fetchRequest = true && this.isSetFetchRequest();
    boolean that_present_fetchRequest = true && that.isSetFetchRequest();
    if (this_present_fetchRequest || that_present_fetchRequest) {
      if (!(this_present_fetchRequest && that_present_fetchRequest))
        return false;
      if (!this.fetchRequest.equals(that.fetchRequest))
        return false;
    }

    boolean this_present_storeRequest = true && this.isSetStoreRequest();
    boolean that_present_storeRequest = true && that.isSetStoreRequest();
    if (this_present_storeRequest || that_present_storeRequest) {
      if (!(this_present_storeRequest && that_present_storeRequest))
        return false;
      if (!this.storeRequest.equals(that.storeRequest))
        return false;
    }

    boolean this_present_multiFetchRequest = true && this.isSetMultiFetchRequest();
    boolean that_present_multiFetchRequest = true && that.isSetMultiFetchRequest();
    if (this_present_multiFetchRequest || that_present_multiFetchRequest) {
      if (!(this_present_multiFetchRequest && that_present_multiFetchRequest))
        return false;
      if (!this.multiFetchRequest.equals(that.multiFetchRequest))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.getValue();

    hashCode = hashCode * 8191 + ((isSetPayloads()) ? 131071 : 524287);
    if (isSetPayloads())
      hashCode = hashCode * 8191 + payloads.hashCode();

    hashCode = hashCode * 8191 + ((isSetFetchRequest()) ? 131071 : 524287);
    if (isSetFetchRequest())
      hashCode = hashCode * 8191 + fetchRequest.hashCode();

    hashCode = hashCode * 8191 + ((isSetStoreRequest()) ? 131071 : 524287);
    if (isSetStoreRequest())
      hashCode = hashCode * 8191 + storeRequest.hashCode();

    hashCode = hashCode * 8191 + ((isSetMultiFetchRequest()) ? 131071 : 524287);
    if (isSetMultiFetchRequest())
      hashCode = hashCode * 8191 + multiFetchRequest.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(BuckCacheRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPayloads()).compareTo(other.isSetPayloads());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPayloads()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.payloads, other.payloads);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFetchRequest()).compareTo(other.isSetFetchRequest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFetchRequest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fetchRequest, other.fetchRequest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStoreRequest()).compareTo(other.isSetStoreRequest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStoreRequest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.storeRequest, other.storeRequest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMultiFetchRequest()).compareTo(other.isSetMultiFetchRequest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMultiFetchRequest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.multiFetchRequest, other.multiFetchRequest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("BuckCacheRequest(");
    boolean first = true;

    if (isSetType()) {
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    if (isSetPayloads()) {
      if (!first) sb.append(", ");
      sb.append("payloads:");
      if (this.payloads == null) {
        sb.append("null");
      } else {
        sb.append(this.payloads);
      }
      first = false;
    }
    if (isSetFetchRequest()) {
      if (!first) sb.append(", ");
      sb.append("fetchRequest:");
      if (this.fetchRequest == null) {
        sb.append("null");
      } else {
        sb.append(this.fetchRequest);
      }
      first = false;
    }
    if (isSetStoreRequest()) {
      if (!first) sb.append(", ");
      sb.append("storeRequest:");
      if (this.storeRequest == null) {
        sb.append("null");
      } else {
        sb.append(this.storeRequest);
      }
      first = false;
    }
    if (isSetMultiFetchRequest()) {
      if (!first) sb.append(", ");
      sb.append("multiFetchRequest:");
      if (this.multiFetchRequest == null) {
        sb.append("null");
      } else {
        sb.append(this.multiFetchRequest);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (fetchRequest != null) {
      fetchRequest.validate();
    }
    if (storeRequest != null) {
      storeRequest.validate();
    }
    if (multiFetchRequest != null) {
      multiFetchRequest.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BuckCacheRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BuckCacheRequestStandardScheme getScheme() {
      return new BuckCacheRequestStandardScheme();
    }
  }

  private static class BuckCacheRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<BuckCacheRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuckCacheRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = com.facebook.buck.artifact_cache.thrift.BuckCacheRequestType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 100: // PAYLOADS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list50 = iprot.readListBegin();
                struct.payloads = new java.util.ArrayList<PayloadInfo>(_list50.size);
                PayloadInfo _elem51;
                for (int _i52 = 0; _i52 < _list50.size; ++_i52)
                {
                  _elem51 = new PayloadInfo();
                  _elem51.read(iprot);
                  struct.payloads.add(_elem51);
                }
                iprot.readListEnd();
              }
              struct.setPayloadsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 101: // FETCH_REQUEST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.fetchRequest = new BuckCacheFetchRequest();
              struct.fetchRequest.read(iprot);
              struct.setFetchRequestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 102: // STORE_REQUEST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.storeRequest = new BuckCacheStoreRequest();
              struct.storeRequest.read(iprot);
              struct.setStoreRequestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 103: // MULTI_FETCH_REQUEST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.multiFetchRequest = new BuckCacheMultiFetchRequest();
              struct.multiFetchRequest.read(iprot);
              struct.setMultiFetchRequestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuckCacheRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        if (struct.isSetType()) {
          oprot.writeFieldBegin(TYPE_FIELD_DESC);
          oprot.writeI32(struct.type.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.payloads != null) {
        if (struct.isSetPayloads()) {
          oprot.writeFieldBegin(PAYLOADS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.payloads.size()));
            for (PayloadInfo _iter53 : struct.payloads)
            {
              _iter53.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.fetchRequest != null) {
        if (struct.isSetFetchRequest()) {
          oprot.writeFieldBegin(FETCH_REQUEST_FIELD_DESC);
          struct.fetchRequest.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.storeRequest != null) {
        if (struct.isSetStoreRequest()) {
          oprot.writeFieldBegin(STORE_REQUEST_FIELD_DESC);
          struct.storeRequest.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.multiFetchRequest != null) {
        if (struct.isSetMultiFetchRequest()) {
          oprot.writeFieldBegin(MULTI_FETCH_REQUEST_FIELD_DESC);
          struct.multiFetchRequest.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuckCacheRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BuckCacheRequestTupleScheme getScheme() {
      return new BuckCacheRequestTupleScheme();
    }
  }

  private static class BuckCacheRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<BuckCacheRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuckCacheRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetPayloads()) {
        optionals.set(1);
      }
      if (struct.isSetFetchRequest()) {
        optionals.set(2);
      }
      if (struct.isSetStoreRequest()) {
        optionals.set(3);
      }
      if (struct.isSetMultiFetchRequest()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetPayloads()) {
        {
          oprot.writeI32(struct.payloads.size());
          for (PayloadInfo _iter54 : struct.payloads)
          {
            _iter54.write(oprot);
          }
        }
      }
      if (struct.isSetFetchRequest()) {
        struct.fetchRequest.write(oprot);
      }
      if (struct.isSetStoreRequest()) {
        struct.storeRequest.write(oprot);
      }
      if (struct.isSetMultiFetchRequest()) {
        struct.multiFetchRequest.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuckCacheRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.type = com.facebook.buck.artifact_cache.thrift.BuckCacheRequestType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list55 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.payloads = new java.util.ArrayList<PayloadInfo>(_list55.size);
          PayloadInfo _elem56;
          for (int _i57 = 0; _i57 < _list55.size; ++_i57)
          {
            _elem56 = new PayloadInfo();
            _elem56.read(iprot);
            struct.payloads.add(_elem56);
          }
        }
        struct.setPayloadsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.fetchRequest = new BuckCacheFetchRequest();
        struct.fetchRequest.read(iprot);
        struct.setFetchRequestIsSet(true);
      }
      if (incoming.get(3)) {
        struct.storeRequest = new BuckCacheStoreRequest();
        struct.storeRequest.read(iprot);
        struct.setStoreRequestIsSet(true);
      }
      if (incoming.get(4)) {
        struct.multiFetchRequest = new BuckCacheMultiFetchRequest();
        struct.multiFetchRequest.read(iprot);
        struct.setMultiFetchRequestIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

