/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.accumulo.core.master.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all") public class Compacting implements org.apache.thrift.TBase<Compacting, Compacting._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Compacting");

  private static final org.apache.thrift.protocol.TField RUNNING_FIELD_DESC = new org.apache.thrift.protocol.TField("running", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField QUEUED_FIELD_DESC = new org.apache.thrift.protocol.TField("queued", org.apache.thrift.protocol.TType.I32, (short)2);

  public int running;
  public int queued;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RUNNING((short)1, "running"),
    QUEUED((short)2, "queued");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // RUNNING
          return RUNNING;
        case 2: // QUEUED
          return QUEUED;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __RUNNING_ISSET_ID = 0;
  private static final int __QUEUED_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RUNNING, new org.apache.thrift.meta_data.FieldMetaData("running", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.QUEUED, new org.apache.thrift.meta_data.FieldMetaData("queued", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Compacting.class, metaDataMap);
  }

  public Compacting() {
  }

  public Compacting(
    int running,
    int queued)
  {
    this();
    this.running = running;
    setRunningIsSet(true);
    this.queued = queued;
    setQueuedIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Compacting(Compacting other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.running = other.running;
    this.queued = other.queued;
  }

  public Compacting deepCopy() {
    return new Compacting(this);
  }

  @Override
  public void clear() {
    setRunningIsSet(false);
    this.running = 0;
    setQueuedIsSet(false);
    this.queued = 0;
  }

  public int getRunning() {
    return this.running;
  }

  public Compacting setRunning(int running) {
    this.running = running;
    setRunningIsSet(true);
    return this;
  }

  public void unsetRunning() {
    __isset_bit_vector.clear(__RUNNING_ISSET_ID);
  }

  /** Returns true if field running is set (has been assigned a value) and false otherwise */
  public boolean isSetRunning() {
    return __isset_bit_vector.get(__RUNNING_ISSET_ID);
  }

  public void setRunningIsSet(boolean value) {
    __isset_bit_vector.set(__RUNNING_ISSET_ID, value);
  }

  public int getQueued() {
    return this.queued;
  }

  public Compacting setQueued(int queued) {
    this.queued = queued;
    setQueuedIsSet(true);
    return this;
  }

  public void unsetQueued() {
    __isset_bit_vector.clear(__QUEUED_ISSET_ID);
  }

  /** Returns true if field queued is set (has been assigned a value) and false otherwise */
  public boolean isSetQueued() {
    return __isset_bit_vector.get(__QUEUED_ISSET_ID);
  }

  public void setQueuedIsSet(boolean value) {
    __isset_bit_vector.set(__QUEUED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RUNNING:
      if (value == null) {
        unsetRunning();
      } else {
        setRunning((Integer)value);
      }
      break;

    case QUEUED:
      if (value == null) {
        unsetQueued();
      } else {
        setQueued((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RUNNING:
      return new Integer(getRunning());

    case QUEUED:
      return new Integer(getQueued());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RUNNING:
      return isSetRunning();
    case QUEUED:
      return isSetQueued();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Compacting)
      return this.equals((Compacting)that);
    return false;
  }

  public boolean equals(Compacting that) {
    if (that == null)
      return false;

    boolean this_present_running = true;
    boolean that_present_running = true;
    if (this_present_running || that_present_running) {
      if (!(this_present_running && that_present_running))
        return false;
      if (this.running != that.running)
        return false;
    }

    boolean this_present_queued = true;
    boolean that_present_queued = true;
    if (this_present_queued || that_present_queued) {
      if (!(this_present_queued && that_present_queued))
        return false;
      if (this.queued != that.queued)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Compacting other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Compacting typedOther = (Compacting)other;

    lastComparison = Boolean.valueOf(isSetRunning()).compareTo(typedOther.isSetRunning());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRunning()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.running, typedOther.running);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQueued()).compareTo(typedOther.isSetQueued());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueued()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queued, typedOther.queued);
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
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // RUNNING
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.running = iprot.readI32();
            setRunningIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // QUEUED
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.queued = iprot.readI32();
            setQueuedIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(RUNNING_FIELD_DESC);
    oprot.writeI32(this.running);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(QUEUED_FIELD_DESC);
    oprot.writeI32(this.queued);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Compacting(");
    boolean first = true;

    sb.append("running:");
    sb.append(this.running);
    first = false;
    if (!first) sb.append(", ");
    sb.append("queued:");
    sb.append(this.queued);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}
