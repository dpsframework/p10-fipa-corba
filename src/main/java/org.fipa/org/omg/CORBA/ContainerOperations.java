package org.omg.CORBA;


/**
* org/omg/CORBA/ContainerOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/ir.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


// orbos 98-01-18: Objects By Value -- end
public interface ContainerOperations  extends org.omg.CORBA.IRObjectOperations
{

  // read interface
  org.omg.CORBA.Contained lookup (String search_name);
  org.omg.CORBA.Contained[] contents (org.omg.CORBA.DefinitionKind limit_type, boolean exclude_inherited);
  org.omg.CORBA.Contained[] lookup_name (String search_name, int levels_to_search, org.omg.CORBA.DefinitionKind limit_type, boolean exclude_inherited);
  org.omg.CORBA.ContainerPackage.Description[] describe_contents (org.omg.CORBA.DefinitionKind limit_type, boolean exclude_inherited, int max_returned_objs);

  // write interface
  org.omg.CORBA.ModuleDef create_module (String id, String name, String version);
  org.omg.CORBA.ConstantDef create_constant (String id, String name, String version, org.omg.CORBA.IDLType type, org.omg.CORBA.Any value);
  org.omg.CORBA.StructDef create_struct (String id, String name, String version, org.omg.CORBA.StructMember[] members);
  org.omg.CORBA.UnionDef create_union (String id, String name, String version, org.omg.CORBA.IDLType discriminator_type, org.omg.CORBA.UnionMember[] members);
  org.omg.CORBA.EnumDef create_enum (String id, String name, String version, String[] members);
  org.omg.CORBA.AliasDef create_alias (String id, String name, String version, org.omg.CORBA.IDLType original_type);
  org.omg.CORBA.ExceptionDef create_exception (String id, String name, String version, org.omg.CORBA.StructMember[] members);
  org.omg.CORBA.InterfaceDef create_interface (String id, String name, String version, boolean is_abstract, org.omg.CORBA.InterfaceDef[] base_interfaces);

  // orbos 98-01-18: Objects By Value
  org.omg.CORBA.ValueDef create_value (String id, String name, String version, boolean is_custom, boolean is_abstract, byte flags, org.omg.CORBA.ValueDef base_value, boolean has_safe_base, org.omg.CORBA.ValueDef[] abstract_base_values, org.omg.CORBA.InterfaceDef[] supported_interfaces, org.omg.CORBA.Initializer[] initializers);

  // orbos 98-01-18: Objects By Value
  org.omg.CORBA.ValueBoxDef create_value_box (String id, String name, String version, org.omg.CORBA.IDLType original_type_def);
  org.omg.CORBA.NativeDef create_native (String id, String name, String version);
} // interface ContainerOperations