package org.omg.CORBA;


/**
* org/omg/CORBA/ValueDefPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/ir.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

public class ValueDefPOATie extends ValueDefPOA
{

  // Constructors

  public ValueDefPOATie ( org.omg.CORBA.ValueDefOperations delegate ) {
      this._impl = delegate;
  }
  public ValueDefPOATie ( org.omg.CORBA.ValueDefOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public org.omg.CORBA.ValueDefOperations _delegate() {
      return this._impl;
  }
  public void _delegate (org.omg.CORBA.ValueDefOperations delegate ) {
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

  // read/write interface
  public org.omg.CORBA.InterfaceDef[] supported_interfaces ()
  {
    return _impl.supported_interfaces();
  } // supported_interfaces

  // read/write interface
  public void supported_interfaces (org.omg.CORBA.InterfaceDef[] newSupported_interfaces)
  {
    _impl.supported_interfaces(newSupported_interfaces);
  } // supported_interfaces

  public org.omg.CORBA.Initializer[] initializers ()
  {
    return _impl.initializers();
  } // initializers
  public void initializers (org.omg.CORBA.Initializer[] newInitializers)
  {
    _impl.initializers(newInitializers);
  } // initializers

  public org.omg.CORBA.ValueDef base_value ()
  {
    return _impl.base_value();
  } // base_value
  public void base_value (org.omg.CORBA.ValueDef newBase_value)
  {
    _impl.base_value(newBase_value);
  } // base_value

  public org.omg.CORBA.ValueDef[] abstract_base_values ()
  {
    return _impl.abstract_base_values();
  } // abstract_base_values
  public void abstract_base_values (org.omg.CORBA.ValueDef[] newAbstract_base_values)
  {
    _impl.abstract_base_values(newAbstract_base_values);
  } // abstract_base_values

  public boolean is_abstract ()
  {
    return _impl.is_abstract();
  } // is_abstract
  public void is_abstract (boolean newIs_abstract)
  {
    _impl.is_abstract(newIs_abstract);
  } // is_abstract

  public boolean is_custom ()
  {
    return _impl.is_custom();
  } // is_custom
  public void is_custom (boolean newIs_custom)
  {
    _impl.is_custom(newIs_custom);
  } // is_custom

  public byte flags ()
  {
    return _impl.flags();
  } // flags
  public void flags (byte newFlags)
  {
    _impl.flags(newFlags);
  } // flags


  // always 0
  public boolean has_safe_base ()
  {
    return _impl.has_safe_base();
  } // has_safe_base

  // always 0
  public void has_safe_base (boolean newHas_safe_base)
  {
    _impl.has_safe_base(newHas_safe_base);
  } // has_safe_base


  // read interface
  public boolean is_a (String value_id)
  {
    return _impl.is_a(value_id);
  } // is_a

  public org.omg.CORBA.ValueDefPackage.FullValueDescription describe_value ()
  {
    return _impl.describe_value();
  } // describe_value


  // write interface
  public org.omg.CORBA.ValueMemberDef create_value_member (String id, String name, String version, org.omg.CORBA.IDLType type_def, short access)
  {
    return _impl.create_value_member(id, name, version, type_def, access);
  } // create_value_member

  public org.omg.CORBA.AttributeDef create_attribute (String id, String name, String version, org.omg.CORBA.IDLType type, org.omg.CORBA.AttributeMode mode)
  {
    return _impl.create_attribute(id, name, version, type, mode);
  } // create_attribute

  public org.omg.CORBA.OperationDef create_operation (String id, String name, String version, org.omg.CORBA.IDLType result, org.omg.CORBA.OperationMode mode, org.omg.CORBA.ParameterDescription[] params, org.omg.CORBA.ExceptionDef[] exceptions, String[] contexts)
  {
    return _impl.create_operation(id, name, version, result, mode, params, exceptions, contexts);
  } // create_operation


  // read interface
  public org.omg.CORBA.Contained lookup (String search_name)
  {
    return _impl.lookup(search_name);
  } // lookup

  public org.omg.CORBA.Contained[] contents (org.omg.CORBA.DefinitionKind limit_type, boolean exclude_inherited)
  {
    return _impl.contents(limit_type, exclude_inherited);
  } // contents

  public org.omg.CORBA.Contained[] lookup_name (String search_name, int levels_to_search, org.omg.CORBA.DefinitionKind limit_type, boolean exclude_inherited)
  {
    return _impl.lookup_name(search_name, levels_to_search, limit_type, exclude_inherited);
  } // lookup_name

  public org.omg.CORBA.ContainerPackage.Description[] describe_contents (org.omg.CORBA.DefinitionKind limit_type, boolean exclude_inherited, int max_returned_objs)
  {
    return _impl.describe_contents(limit_type, exclude_inherited, max_returned_objs);
  } // describe_contents


  // write interface
  public org.omg.CORBA.ModuleDef create_module (String id, String name, String version)
  {
    return _impl.create_module(id, name, version);
  } // create_module

  public org.omg.CORBA.ConstantDef create_constant (String id, String name, String version, org.omg.CORBA.IDLType type, org.omg.CORBA.Any value)
  {
    return _impl.create_constant(id, name, version, type, value);
  } // create_constant

  public org.omg.CORBA.StructDef create_struct (String id, String name, String version, org.omg.CORBA.StructMember[] members)
  {
    return _impl.create_struct(id, name, version, members);
  } // create_struct

  public org.omg.CORBA.UnionDef create_union (String id, String name, String version, org.omg.CORBA.IDLType discriminator_type, org.omg.CORBA.UnionMember[] members)
  {
    return _impl.create_union(id, name, version, discriminator_type, members);
  } // create_union

  public org.omg.CORBA.EnumDef create_enum (String id, String name, String version, String[] members)
  {
    return _impl.create_enum(id, name, version, members);
  } // create_enum

  public org.omg.CORBA.AliasDef create_alias (String id, String name, String version, org.omg.CORBA.IDLType original_type)
  {
    return _impl.create_alias(id, name, version, original_type);
  } // create_alias

  public org.omg.CORBA.ExceptionDef create_exception (String id, String name, String version, org.omg.CORBA.StructMember[] members)
  {
    return _impl.create_exception(id, name, version, members);
  } // create_exception

  public org.omg.CORBA.InterfaceDef create_interface (String id, String name, String version, boolean is_abstract, org.omg.CORBA.InterfaceDef[] base_interfaces)
  {
    return _impl.create_interface(id, name, version, is_abstract, base_interfaces);
  } // create_interface


  // orbos 98-01-18: Objects By Value
  public org.omg.CORBA.ValueDef create_value (String id, String name, String version, boolean is_custom, boolean is_abstract, byte flags, org.omg.CORBA.ValueDef base_value, boolean has_safe_base, org.omg.CORBA.ValueDef[] abstract_base_values, org.omg.CORBA.InterfaceDef[] supported_interfaces, org.omg.CORBA.Initializer[] initializers)
  {
    return _impl.create_value(id, name, version, is_custom, is_abstract, flags, base_value, has_safe_base, abstract_base_values, supported_interfaces, initializers);
  } // create_value


  // orbos 98-01-18: Objects By Value
  public org.omg.CORBA.ValueBoxDef create_value_box (String id, String name, String version, org.omg.CORBA.IDLType original_type_def)
  {
    return _impl.create_value_box(id, name, version, original_type_def);
  } // create_value_box

  public org.omg.CORBA.NativeDef create_native (String id, String name, String version)
  {
    return _impl.create_native(id, name, version);
  } // create_native


  // read interface
  public org.omg.CORBA.DefinitionKind def_kind ()
  {
    return _impl.def_kind();
  } // def_kind


  // write interface
  public void destroy ()
  {
    _impl.destroy();
  } // destroy


  // read/write interface
  public String id ()
  {
    return _impl.id();
  } // id

  // read/write interface
  public void id (String newId)
  {
    _impl.id(newId);
  } // id

  public String name ()
  {
    return _impl.name();
  } // name
  public void name (String newName)
  {
    _impl.name(newName);
  } // name

  public String version ()
  {
    return _impl.version();
  } // version
  public void version (String newVersion)
  {
    _impl.version(newVersion);
  } // version


  // read interface
  public org.omg.CORBA.Container defined_in ()
  {
    return _impl.defined_in();
  } // defined_in

  public String absolute_name ()
  {
    return _impl.absolute_name();
  } // absolute_name

  public org.omg.CORBA.Repository containing_repository ()
  {
    return _impl.containing_repository();
  } // containing_repository

  public org.omg.CORBA.ContainedPackage.Description describe ()
  {
    return _impl.describe();
  } // describe


  // write interface
  public void move (org.omg.CORBA.Container new_container, String new_name, String new_version)
  {
    _impl.move(new_container, new_name, new_version);
  } // move

  public org.omg.CORBA.TypeCode type ()
  {
    return _impl.type();
  } // type

  private org.omg.CORBA.ValueDefOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class ValueDefPOATie
