package vamservice.Pojo.JAVA; /**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class services_value extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3166728339181243967L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\n" +
          "\t\"type\": \"record\",\n" +
          "\t\"name\": \"services_value\",\n" +
          "\t\"fields\": [{\n" +
          "\t\t\"name\": \"start\",\n" +
          "\t\t\"type\": [\"null\", \"string\"]\n" +
          "\t}, {\n" +
          "\t\t\"name\": \"end\",\n" +
          "\t\t\"type\": [\"null\", \"string\"]\n" +
          "\t}, {\n" +
          "\t\t\"name\": \"globalaccess\",\n" +
          "\t\t\"type\": [\"null\", \"string\"]\n" +
          "\t}, {\n" +
          "\t\t\"name\": \"mailbox\",\n" +
          "\t\t\"type\": [\"null\", \"string\"]\n" +
          "\t}, {\n" +
          "\t\t\"name\": \"name\",\n" +
          "\t\t\"type\": [\"null\", \"string\"]\n" +
          "\t}, {\n" +
          "\t\t\"name\": \"suspended\",\n" +
          "\t\t\"type\": [\"null\", \"boolean\"]\n" +
          "\t}, {\n" +
          "\t\t\"name\": \"fullysignedup\",\n" +
          "\t\t\"type\": [\"null\", \"string\"]\n" +
          "\t}]\n" +
          "}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<services_value> ENCODER =
      new BinaryMessageEncoder<services_value>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<services_value> DECODER =
      new BinaryMessageDecoder<services_value>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<services_value> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<services_value> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<services_value> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<services_value>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this services_value to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a services_value from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a services_value instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static services_value fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence start;
   private java.lang.CharSequence end;
   private java.lang.CharSequence globalaccess;
   private java.lang.CharSequence mailbox;
   private java.lang.CharSequence name;
   private java.lang.Boolean suspended;
   private java.lang.CharSequence fullysignedup;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public services_value() {}

  /**
   * All-args constructor.
   * @param start The new value for start
   * @param end The new value for end
   * @param globalaccess The new value for globalaccess
   * @param mailbox The new value for mailbox
   * @param name The new value for name
   * @param suspended The new value for suspended
   * @param fullysignedup The new value for fullysignedup
   */
  public services_value(java.lang.CharSequence start, java.lang.CharSequence end, java.lang.CharSequence globalaccess, java.lang.CharSequence mailbox, java.lang.CharSequence name, java.lang.Boolean suspended, java.lang.CharSequence fullysignedup) {
    this.start = start;
    this.end = end;
    this.globalaccess = globalaccess;
    this.mailbox = mailbox;
    this.name = name;
    this.suspended = suspended;
    this.fullysignedup = fullysignedup;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return start;
    case 1: return end;
    case 2: return globalaccess;
    case 3: return mailbox;
    case 4: return name;
    case 5: return suspended;
    case 6: return fullysignedup;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: start = (java.lang.CharSequence)value$; break;
    case 1: end = (java.lang.CharSequence)value$; break;
    case 2: globalaccess = (java.lang.CharSequence)value$; break;
    case 3: mailbox = (java.lang.CharSequence)value$; break;
    case 4: name = (java.lang.CharSequence)value$; break;
    case 5: suspended = (java.lang.Boolean)value$; break;
    case 6: fullysignedup = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'start' field.
   * @return The value of the 'start' field.
   */
  public java.lang.CharSequence getStart() {
    return start;
  }


  /**
   * Sets the value of the 'start' field.
   * @param value the value to set.
   */
  public void setStart(java.lang.CharSequence value) {
    this.start = value;
  }

  /**
   * Gets the value of the 'end' field.
   * @return The value of the 'end' field.
   */
  public java.lang.CharSequence getEnd() {
    return end;
  }


  /**
   * Sets the value of the 'end' field.
   * @param value the value to set.
   */
  public void setEnd(java.lang.CharSequence value) {
    this.end = value;
  }

  /**
   * Gets the value of the 'globalaccess' field.
   * @return The value of the 'globalaccess' field.
   */
  public java.lang.CharSequence getGlobalaccess() {
    return globalaccess;
  }


  /**
   * Sets the value of the 'globalaccess' field.
   * @param value the value to set.
   */
  public void setGlobalaccess(java.lang.CharSequence value) {
    this.globalaccess = value;
  }

  /**
   * Gets the value of the 'mailbox' field.
   * @return The value of the 'mailbox' field.
   */
  public java.lang.CharSequence getMailbox() {
    return mailbox;
  }


  /**
   * Sets the value of the 'mailbox' field.
   * @param value the value to set.
   */
  public void setMailbox(java.lang.CharSequence value) {
    this.mailbox = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'suspended' field.
   * @return The value of the 'suspended' field.
   */
  public java.lang.Boolean getSuspended() {
    return suspended;
  }


  /**
   * Sets the value of the 'suspended' field.
   * @param value the value to set.
   */
  public void setSuspended(java.lang.Boolean value) {
    this.suspended = value;
  }

  /**
   * Gets the value of the 'fullysignedup' field.
   * @return The value of the 'fullysignedup' field.
   */
  public java.lang.CharSequence getFullysignedup() {
    return fullysignedup;
  }


  /**
   * Sets the value of the 'fullysignedup' field.
   * @param value the value to set.
   */
  public void setFullysignedup(java.lang.CharSequence value) {
    this.fullysignedup = value;
  }

  /**
   * Creates a new services_value RecordBuilder.
   * @return A new services_value RecordBuilder
   */
  public static services_value.Builder newBuilder() {
    return new services_value.Builder();
  }

  /**
   * Creates a new services_value RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new services_value RecordBuilder
   */
  public static services_value.Builder newBuilder(services_value.Builder other) {
    if (other == null) {
      return new services_value.Builder();
    } else {
      return new services_value.Builder(other);
    }
  }

  /**
   * Creates a new services_value RecordBuilder by copying an existing services_value instance.
   * @param other The existing instance to copy.
   * @return A new services_value RecordBuilder
   */
  public static services_value.Builder newBuilder(services_value other) {
    if (other == null) {
      return new services_value.Builder();
    } else {
      return new services_value.Builder(other);
    }
  }

  /**
   * RecordBuilder for services_value instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<services_value>
    implements org.apache.avro.data.RecordBuilder<services_value> {

    private java.lang.CharSequence start;
    private java.lang.CharSequence end;
    private java.lang.CharSequence globalaccess;
    private java.lang.CharSequence mailbox;
    private java.lang.CharSequence name;
    private java.lang.Boolean suspended;
    private java.lang.CharSequence fullysignedup;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(services_value.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.start)) {
        this.start = data().deepCopy(fields()[0].schema(), other.start);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.end)) {
        this.end = data().deepCopy(fields()[1].schema(), other.end);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.globalaccess)) {
        this.globalaccess = data().deepCopy(fields()[2].schema(), other.globalaccess);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.mailbox)) {
        this.mailbox = data().deepCopy(fields()[3].schema(), other.mailbox);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.name)) {
        this.name = data().deepCopy(fields()[4].schema(), other.name);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.suspended)) {
        this.suspended = data().deepCopy(fields()[5].schema(), other.suspended);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.fullysignedup)) {
        this.fullysignedup = data().deepCopy(fields()[6].schema(), other.fullysignedup);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
    }

    /**
     * Creates a Builder by copying an existing services_value instance
     * @param other The existing instance to copy.
     */
    private Builder(services_value other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.start)) {
        this.start = data().deepCopy(fields()[0].schema(), other.start);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.end)) {
        this.end = data().deepCopy(fields()[1].schema(), other.end);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.globalaccess)) {
        this.globalaccess = data().deepCopy(fields()[2].schema(), other.globalaccess);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.mailbox)) {
        this.mailbox = data().deepCopy(fields()[3].schema(), other.mailbox);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.name)) {
        this.name = data().deepCopy(fields()[4].schema(), other.name);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.suspended)) {
        this.suspended = data().deepCopy(fields()[5].schema(), other.suspended);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.fullysignedup)) {
        this.fullysignedup = data().deepCopy(fields()[6].schema(), other.fullysignedup);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'start' field.
      * @return The value.
      */
    public java.lang.CharSequence getStart() {
      return start;
    }


    /**
      * Sets the value of the 'start' field.
      * @param value The value of 'start'.
      * @return This builder.
      */
    public services_value.Builder setStart(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.start = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'start' field has been set.
      * @return True if the 'start' field has been set, false otherwise.
      */
    public boolean hasStart() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'start' field.
      * @return This builder.
      */
    public services_value.Builder clearStart() {
      start = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'end' field.
      * @return The value.
      */
    public java.lang.CharSequence getEnd() {
      return end;
    }


    /**
      * Sets the value of the 'end' field.
      * @param value The value of 'end'.
      * @return This builder.
      */
    public services_value.Builder setEnd(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.end = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'end' field has been set.
      * @return True if the 'end' field has been set, false otherwise.
      */
    public boolean hasEnd() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'end' field.
      * @return This builder.
      */
    public services_value.Builder clearEnd() {
      end = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'globalaccess' field.
      * @return The value.
      */
    public java.lang.CharSequence getGlobalaccess() {
      return globalaccess;
    }


    /**
      * Sets the value of the 'globalaccess' field.
      * @param value The value of 'globalaccess'.
      * @return This builder.
      */
    public services_value.Builder setGlobalaccess(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.globalaccess = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'globalaccess' field has been set.
      * @return True if the 'globalaccess' field has been set, false otherwise.
      */
    public boolean hasGlobalaccess() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'globalaccess' field.
      * @return This builder.
      */
    public services_value.Builder clearGlobalaccess() {
      globalaccess = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'mailbox' field.
      * @return The value.
      */
    public java.lang.CharSequence getMailbox() {
      return mailbox;
    }


    /**
      * Sets the value of the 'mailbox' field.
      * @param value The value of 'mailbox'.
      * @return This builder.
      */
    public services_value.Builder setMailbox(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.mailbox = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'mailbox' field has been set.
      * @return True if the 'mailbox' field has been set, false otherwise.
      */
    public boolean hasMailbox() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'mailbox' field.
      * @return This builder.
      */
    public services_value.Builder clearMailbox() {
      mailbox = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public services_value.Builder setName(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.name = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public services_value.Builder clearName() {
      name = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'suspended' field.
      * @return The value.
      */
    public java.lang.Boolean getSuspended() {
      return suspended;
    }


    /**
      * Sets the value of the 'suspended' field.
      * @param value The value of 'suspended'.
      * @return This builder.
      */
    public services_value.Builder setSuspended(java.lang.Boolean value) {
      validate(fields()[5], value);
      this.suspended = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'suspended' field has been set.
      * @return True if the 'suspended' field has been set, false otherwise.
      */
    public boolean hasSuspended() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'suspended' field.
      * @return This builder.
      */
    public services_value.Builder clearSuspended() {
      suspended = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'fullysignedup' field.
      * @return The value.
      */
    public java.lang.CharSequence getFullysignedup() {
      return fullysignedup;
    }


    /**
      * Sets the value of the 'fullysignedup' field.
      * @param value The value of 'fullysignedup'.
      * @return This builder.
      */
    public services_value.Builder setFullysignedup(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.fullysignedup = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'fullysignedup' field has been set.
      * @return True if the 'fullysignedup' field has been set, false otherwise.
      */
    public boolean hasFullysignedup() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'fullysignedup' field.
      * @return This builder.
      */
    public services_value.Builder clearFullysignedup() {
      fullysignedup = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public services_value build() {
      try {
        services_value record = new services_value();
        record.start = fieldSetFlags()[0] ? this.start : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.end = fieldSetFlags()[1] ? this.end : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.globalaccess = fieldSetFlags()[2] ? this.globalaccess : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.mailbox = fieldSetFlags()[3] ? this.mailbox : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.name = fieldSetFlags()[4] ? this.name : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.suspended = fieldSetFlags()[5] ? this.suspended : (java.lang.Boolean) defaultValue(fields()[5]);
        record.fullysignedup = fieldSetFlags()[6] ? this.fullysignedup : (java.lang.CharSequence) defaultValue(fields()[6]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<services_value>
    WRITER$ = (org.apache.avro.io.DatumWriter<services_value>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<services_value>
    READER$ = (org.apache.avro.io.DatumReader<services_value>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.start == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.start);
    }

    if (this.end == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.end);
    }

    if (this.globalaccess == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.globalaccess);
    }

    if (this.mailbox == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.mailbox);
    }

    if (this.name == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.name);
    }

    if (this.suspended == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeBoolean(this.suspended);
    }

    if (this.fullysignedup == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.fullysignedup);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.start = null;
      } else {
        this.start = in.readString(this.start instanceof Utf8 ? (Utf8)this.start : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.end = null;
      } else {
        this.end = in.readString(this.end instanceof Utf8 ? (Utf8)this.end : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.globalaccess = null;
      } else {
        this.globalaccess = in.readString(this.globalaccess instanceof Utf8 ? (Utf8)this.globalaccess : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.mailbox = null;
      } else {
        this.mailbox = in.readString(this.mailbox instanceof Utf8 ? (Utf8)this.mailbox : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.name = null;
      } else {
        this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.suspended = null;
      } else {
        this.suspended = in.readBoolean();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.fullysignedup = null;
      } else {
        this.fullysignedup = in.readString(this.fullysignedup instanceof Utf8 ? (Utf8)this.fullysignedup : null);
      }

    } else {
      for (int i = 0; i < 7; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.start = null;
          } else {
            this.start = in.readString(this.start instanceof Utf8 ? (Utf8)this.start : null);
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.end = null;
          } else {
            this.end = in.readString(this.end instanceof Utf8 ? (Utf8)this.end : null);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.globalaccess = null;
          } else {
            this.globalaccess = in.readString(this.globalaccess instanceof Utf8 ? (Utf8)this.globalaccess : null);
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.mailbox = null;
          } else {
            this.mailbox = in.readString(this.mailbox instanceof Utf8 ? (Utf8)this.mailbox : null);
          }
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.name = null;
          } else {
            this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          }
          break;

        case 5:
          if (in.readIndex() != 1) {
            in.readNull();
            this.suspended = null;
          } else {
            this.suspended = in.readBoolean();
          }
          break;

        case 6:
          if (in.readIndex() != 1) {
            in.readNull();
            this.fullysignedup = null;
          } else {
            this.fullysignedup = in.readString(this.fullysignedup instanceof Utf8 ? (Utf8)this.fullysignedup : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










