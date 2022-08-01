package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynSequencePOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/DynamicAny.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


/**
    * DynSequence objects support the manipulation of IDL sequences.
    */
public class DynSequencePOATie extends DynSequencePOA
{

  // Constructors

  public DynSequencePOATie ( org.omg.DynamicAny.DynSequenceOperations delegate ) {
      this._impl = delegate;
  }
  public DynSequencePOATie ( org.omg.DynamicAny.DynSequenceOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public org.omg.DynamicAny.DynSequenceOperations _delegate() {
      return this._impl;
  }
  public void _delegate (org.omg.DynamicAny.DynSequenceOperations delegate ) {
      this._impl = delegate;
  }
  public org.omg.PortableServer.POA _default_POA() {
      if(_poa != null) {
          return _poa;
      }
      else {
          return super._default_POA();
      }
  }

  /**
          * Returns the current length of the sequence.
          */
  public int get_length ()
  {
    return _impl.get_length();
  } // get_length


  /**
          * Sets the length of the sequence.
          * Increasing the length of a sequence adds new elements at the tail without affecting the values
          * of already existing elements. Newly added elements are default-initialized.
          * Increasing the length of a sequence sets the current position to the first newly-added element
          * if the previous current position was -1. Otherwise, if the previous current position was not -1,
          * the current position is not affected.
          * Decreasing the length of a sequence removes elements from the tail without affecting the value
          * of those elements that remain. The new current position after decreasing the length of a sequence
          * is determined as follows:
          * <UL>
          * <LI>If the length of the sequence is set to zero, the current position is set to -1.
          * <LI>If the current position is -1 before decreasing the length, it remains at -1.
          * <LI>If the current position indicates a valid element and that element is not removed when the length
          *     is decreased, the current position remains unaffected.
          * <LI>If the current position indicates a valid element and that element is removed,
          *     the current position is set to -1.
          * </UL>
          *
          * @exception InvalidValue if this is a bounded sequence and len is larger than the bound
          */
  public void set_length (int len) throws org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    _impl.set_length(len);
  } // set_length


  /**
          * Returns the elements of the sequence.
          */
  public org.omg.CORBA.Any[] get_elements ()
  {
    return _impl.get_elements();
  } // get_elements


  /**
          * Sets the elements of a sequence.
          * The length of the DynSequence is set to the length of value. The current position is set to zero
          * if value has non-zero length and to -1 if value is a zero-length sequence.
          *
          * @exception TypeMismatch if value contains one or more elements whose TypeCode is not equivalent
          *            to the element TypeCode of the DynSequence
          * @exception InvalidValue if the length of value exceeds the bound of a bounded sequence
          */
  public void set_elements (org.omg.CORBA.Any[] value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    _impl.set_elements(value);
  } // set_elements


  /**
          * Returns the DynAnys representing the elements of the sequence.
          */
  public org.omg.DynamicAny.DynAny[] get_elements_as_dyn_any ()
  {
    return _impl.get_elements_as_dyn_any();
  } // get_elements_as_dyn_any


  /**
          * Sets the elements of a sequence using DynAnys.
          * The length of the DynSequence is set to the length of value. The current position is set to zero
          * if value has non-zero length and to -1 if value is a zero-length sequence.
          *
          * @exception TypeMismatch if value contains one or more elements whose TypeCode is not equivalent
          *            to the element TypeCode of the DynSequence
          * @exception InvalidValue if the length of value exceeds the bound of a bounded sequence
          */
  public void set_elements_as_dyn_any (org.omg.DynamicAny.DynAny[] value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    _impl.set_elements_as_dyn_any(value);
  } // set_elements_as_dyn_any


  /**
          * Returns the TypeCode associated with this DynAny object.
          * A DynAny object is created with a TypeCode value assigned to it.
          * This TypeCode value determines the type of the value handled through the DynAny object.
          * Note that the TypeCode associated with a DynAny object is initialized at the time the
          * DynAny is created and cannot be changed during lifetime of the DynAny object.
          *
          * @return The TypeCode associated with this DynAny object
          */
  public org.omg.CORBA.TypeCode type ()
  {
    return _impl.type();
  } // type


  /**
          * Initializes the value associated with a DynAny object with the value
          * associated with another DynAny object.
          * The current position of the target DynAny is set to zero for values that have components
          * and to -1 for values that do not have components.
          *
          * @param dyn_any
          * @exception TypeMismatch if the type of the passed DynAny is not equivalent to the type of target DynAny
          */
  public void assign (org.omg.DynamicAny.DynAny dyn_any) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch
  {
    _impl.assign(dyn_any);
  } // assign


  /**
          * Initializes the value associated with a DynAny object with the value contained in an any.
          * The current position of the target DynAny is set to zero for values that have components
          * and to -1 for values that do not have components.
          *
          * @exception TypeMismatch if the type of the passed Any is not equivalent to the type of target DynAny
          * @exception InvalidValue if the passed Any does not contain a legal value (such as a null string)
          */
  public void from_any (org.omg.CORBA.Any value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    _impl.from_any(value);
  } // from_any


  /**
          * Creates an any value from a DynAny object.
          * A copy of the TypeCode associated with the DynAny object is assigned to the resulting any.
          * The value associated with the DynAny object is copied into the any.
          *
          * @return a new Any object with the same value and TypeCode
          */
  public org.omg.CORBA.Any to_any ()
  {
    return _impl.to_any();
  } // to_any


  /**
          * Compares two DynAny values for equality.
          * Two DynAny values are equal if their TypeCodes are equivalent and, recursively, all component DynAnys
          * have equal values.
          * The current position of the two DynAnys being compared has no effect on the result of equal.
          *
          * @return true of the DynAnys are equal, false otherwise
          */
  public boolean equal (org.omg.DynamicAny.DynAny dyn_any)
  {
    return _impl.equal(dyn_any);
  } // equal


  /**
          * Destroys a DynAny object.
          * This operation frees any resources used to represent the data value associated with a DynAny object.
          * It must be invoked on references obtained from one of the creation operations on the ORB interface
          * or on a reference returned by DynAny.copy() to avoid resource leaks.
          * Invoking destroy on component DynAny objects (for example, on objects returned by the
          * current_component operation) does nothing.
          * Destruction of a DynAny object implies destruction of all DynAny objects obtained from it.
          * That is, references to components of a destroyed DynAny become invalid.
          * Invocations on such references raise OBJECT_NOT_EXIST.
          * It is possible to manipulate a component of a DynAny beyond the life time of the DynAny
          * from which the component was obtained by making a copy of the component with the copy operation
          * before destroying the DynAny from which the component was obtained.
          */
  public void destroy ()
  {
    _impl.destroy();
  } // destroy


  /**
          * Creates a new DynAny object whose value is a deep copy of the DynAny on which it is invoked.
          * The operation is polymorphic, that is, invoking it on one of the types derived from DynAny,
          * such as DynStruct, creates the derived type but returns its reference as the DynAny base type.
          *
          * @return a deep copy of the DynAny object
          */
  public org.omg.DynamicAny.DynAny copy ()
  {
    return _impl.copy();
  } // copy


  /**
          * Inserts a boolean value into the DynAny.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_boolean (boolean value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    _impl.insert_boolean(value);
  } // insert_boolean


  /**
          * Inserts a byte value into the DynAny. The IDL octet data type is mapped to the Java byte data type.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_octet (byte value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    _impl.insert_octet(value);
  } // insert_octet


  /**
          * Inserts a char value into the DynAny.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_char (char value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    _impl.insert_char(value);
  } // insert_char


  /**
          * Inserts a short value into the DynAny.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_short (short value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    _impl.insert_short(value);
  } // insert_short


  /**
          * Inserts a short value into the DynAny. The IDL ushort data type is mapped to the Java short data type.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_ushort (short value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    _impl.insert_ushort(value);
  } // insert_ushort


  /**
          * Inserts an integer value into the DynAny. The IDL long data type is mapped to the Java int data type.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_long (int value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    _impl.insert_long(value);
  } // insert_long


  /**
          * Inserts an integer value into the DynAny. The IDL ulong data type is mapped to the Java int data type.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_ulong (int value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    _impl.insert_ulong(value);
  } // insert_ulong


  /**
          * Inserts a float value into the DynAny.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_float (float value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    _impl.insert_float(value);
  } // insert_float


  /**
          * Inserts a double value into the DynAny.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_double (double value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    _impl.insert_double(value);
  } // insert_double


  /**
          * Inserts a string value into the DynAny.
          * Both bounded and unbounded strings are inserted using this method.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception InvalidValue if the string inserted is longer than the bound of a bounded string
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_string (String value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    _impl.insert_string(value);
  } // insert_string


  /**
          * Inserts a reference to a CORBA object into the DynAny.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_reference (org.omg.CORBA.Object value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    _impl.insert_reference(value);
  } // insert_reference


  /**
          * Inserts a TypeCode object into the DynAny.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_typecode (org.omg.CORBA.TypeCode value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    _impl.insert_typecode(value);
  } // insert_typecode


  /**
          * Inserts a long value into the DynAny. The IDL long long data type is mapped to the Java long data type.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_longlong (long value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    _impl.insert_longlong(value);
  } // insert_longlong


  /**
          * Inserts a long value into the DynAny.
          * The IDL unsigned long long data type is mapped to the Java long data type.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_ulonglong (long value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    _impl.insert_ulonglong(value);
  } // insert_ulonglong


  /**
          * Inserts a char value into the DynAny. The IDL wchar data type is mapped to the Java char data type.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_wchar (char value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    _impl.insert_wchar(value);
  } // insert_wchar


  /**
          * Inserts a string value into the DynAny.
          * Both bounded and unbounded strings are inserted using this method.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception InvalidValue if the string inserted is longer than the bound of a bounded string
          */
  public void insert_wstring (String value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    _impl.insert_wstring(value);
  } // insert_wstring


  /**
          * Inserts an Any value into the Any represented by this DynAny.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_any (org.omg.CORBA.Any value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    _impl.insert_any(value);
  } // insert_any


  /**
          * Inserts the Any value contained in the parameter DynAny into the Any represented by this DynAny.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_dyn_any (org.omg.DynamicAny.DynAny value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    _impl.insert_dyn_any(value);
  } // insert_dyn_any


  /**
          * Inserts a reference to a Serializable object into this DynAny.
          * The IDL ValueBase type is mapped to the Java Serializable type.
          *
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public void insert_val (java.io.Serializable value) throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    _impl.insert_val(value);
  } // insert_val


  /**
          * Extracts the boolean value from this DynAny.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public boolean get_boolean () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    return _impl.get_boolean();
  } // get_boolean


  /**
          * Extracts the byte value from this DynAny. The IDL octet data type is mapped to the Java byte data type.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public byte get_octet () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    return _impl.get_octet();
  } // get_octet


  /**
          * Extracts the char value from this DynAny.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public char get_char () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    return _impl.get_char();
  } // get_char


  /**
          * Extracts the short value from this DynAny.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public short get_short () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    return _impl.get_short();
  } // get_short


  /**
          * Extracts the short value from this DynAny. The IDL ushort data type is mapped to the Java short data type.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public short get_ushort () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    return _impl.get_ushort();
  } // get_ushort


  /**
          * Extracts the integer value from this DynAny. The IDL long data type is mapped to the Java int data type.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public int get_long () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    return _impl.get_long();
  } // get_long


  /**
          * Extracts the integer value from this DynAny. The IDL ulong data type is mapped to the Java int data type.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public int get_ulong () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    return _impl.get_ulong();
  } // get_ulong


  /**
          * Extracts the float value from this DynAny.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public float get_float () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    return _impl.get_float();
  } // get_float


  /**
          * Extracts the double value from this DynAny.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public double get_double () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    return _impl.get_double();
  } // get_double


  /**
          * Extracts the string value from this DynAny.
          * Both bounded and unbounded strings are extracted using this method.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public String get_string () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    return _impl.get_string();
  } // get_string


  /**
          * Extracts the reference to a CORBA Object from this DynAny.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public org.omg.CORBA.Object get_reference () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    return _impl.get_reference();
  } // get_reference


  /**
          * Extracts the TypeCode object from this DynAny.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public org.omg.CORBA.TypeCode get_typecode () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    return _impl.get_typecode();
  } // get_typecode


  /**
          * Extracts the long value from this DynAny. The IDL long long data type is mapped to the Java long data type.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public long get_longlong () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    return _impl.get_longlong();
  } // get_longlong


  /**
          * Extracts the long value from this DynAny.
          * The IDL unsigned long long data type is mapped to the Java long data type.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public long get_ulonglong () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    return _impl.get_ulonglong();
  } // get_ulonglong


  /**
          * Extracts the long value from this DynAny. The IDL wchar data type is mapped to the Java char data type.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public char get_wchar () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    return _impl.get_wchar();
  } // get_wchar


  /**
          * Extracts the string value from this DynAny.
          * Both bounded and unbounded strings are extracted using this method.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          */
  public String get_wstring () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    return _impl.get_wstring();
  } // get_wstring


  /**
          * Extracts an Any value contained in the Any represented by this DynAny.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public org.omg.CORBA.Any get_any () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    return _impl.get_any();
  } // get_any


  /**
          * Extracts the Any value contained in the Any represented by this DynAny and returns it wrapped
          * into a new DynAny.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public org.omg.DynamicAny.DynAny get_dyn_any () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    return _impl.get_dyn_any();
  } // get_dyn_any


  /**
          * Extracts a Serializable object from this DynAny.
          * The IDL ValueBase type is mapped to the Java Serializable type.
          *
          * @exception TypeMismatch if the accessed component in the DynAny is of a type
          * that is not equivalent to the requested type.
          * @exception TypeMismatch if called on a DynAny whose current component itself has components
          * @exception InvalidValue if this DynAny has components but has a current position of -1
          */
  public java.io.Serializable get_val () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch, org.omg.DynamicAny.DynAnyPackage.InvalidValue
  {
    return _impl.get_val();
  } // get_val


  /**
          * Sets the current position to index. The current position is indexed 0 to n-1, that is,
          * index zero corresponds to the first component. The operation returns true if the resulting
          * current position indicates a component of the DynAny and false if index indicates
          * a position that does not correspond to a component.
          * Calling seek with a negative index is legal. It sets the current position to -1 to indicate
          * no component and returns false. Passing a non-negative index value for a DynAny that does not
          * have a component at the corresponding position sets the current position to -1 and returns false.
          */
  public boolean seek (int index)
  {
    return _impl.seek(index);
  } // seek


  /**
          * Is equivalent to seek(0).
          */
  public void rewind ()
  {
    _impl.rewind();
  } // rewind


  /**
          * Advances the current position to the next component.
          * The operation returns true while the resulting current position indicates a component, false otherwise.
          * A false return value leaves the current position at -1.
          * Invoking next on a DynAny without components leaves the current position at -1 and returns false.
          */
  public boolean next ()
  {
    return _impl.next();
  } // next


  /**
          * Returns the number of components of a DynAny.
          * For a DynAny without components, it returns zero.
          * The operation only counts the components at the top level.
          * For example, if component_count is invoked on a DynStruct with a single member,
          * the return value is 1, irrespective of the type of the member.
          * <UL>
          * <LI>For sequences, the operation returns the current number of elements.
          * <LI>For structures, exceptions, and value types, the operation returns the number of members.
          * <LI>For arrays, the operation returns the number of elements.
          * <LI>For unions, the operation returns 2 if the discriminator indicates that a named member is active,
          * otherwise, it returns 1.
          * <LI>For DynFixed and DynEnum, the operation returns zero.
          * </UL>
          */
  public int component_count ()
  {
    return _impl.component_count();
  } // component_count


  /**
          * Returns the DynAny for the component at the current position.
          * It does not advance the current position, so repeated calls to current_component
          * without an intervening call to rewind, next, or seek return the same component.
          * The returned DynAny object reference can be used to get/set the value of the current component.
          * If the current component represents a complex type, the returned reference can be narrowed
          * based on the TypeCode to get the interface corresponding to the to the complex type.
          * Calling current_component on a DynAny that cannot have components,
          * such as a DynEnum or an empty exception, raises TypeMismatch.
          * Calling current_component on a DynAny whose current position is -1 returns a nil reference.
          * The iteration operations, together with current_component, can be used
          * to dynamically compose an any value. After creating a dynamic any, such as a DynStruct,
          * current_component and next can be used to initialize all the components of the value.
          * Once the dynamic value is completely initialized, to_any creates the corresponding any value.
          *
          * @exception TypeMismatch If called on a DynAny that cannot have components,
          * such as a DynEnum or an empty exception
          */
  public org.omg.DynamicAny.DynAny current_component () throws org.omg.DynamicAny.DynAnyPackage.TypeMismatch
  {
    return _impl.current_component();
  } // current_component

  private org.omg.DynamicAny.DynSequenceOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class DynSequencePOATie
