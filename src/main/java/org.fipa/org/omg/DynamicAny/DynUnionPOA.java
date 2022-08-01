package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynUnionPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/DynamicAny.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/


/**
    * DynUnion objects support the manipulation of IDL unions.
    * A union can have only two valid current positions:
    * <UL>
    * <LI>zero, which denotes the discriminator
    * <LI>one, which denotes the active member
    * </UL>
    * The component_count value for a union depends on the current discriminator:
    * it is 2 for a union whose discriminator indicates a named member, and 1 otherwise.
    */
public abstract class DynUnionPOA extends org.omg.PortableServer.Servant
 implements org.omg.DynamicAny.DynUnionOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("get_discriminator", new java.lang.Integer (0));
    _methods.put ("set_discriminator", new java.lang.Integer (1));
    _methods.put ("set_to_default_member", new java.lang.Integer (2));
    _methods.put ("set_to_no_active_member", new java.lang.Integer (3));
    _methods.put ("has_no_active_member", new java.lang.Integer (4));
    _methods.put ("discriminator_kind", new java.lang.Integer (5));
    _methods.put ("member_kind", new java.lang.Integer (6));
    _methods.put ("member", new java.lang.Integer (7));
    _methods.put ("member_name", new java.lang.Integer (8));
    _methods.put ("type", new java.lang.Integer (9));
    _methods.put ("assign", new java.lang.Integer (10));
    _methods.put ("from_any", new java.lang.Integer (11));
    _methods.put ("to_any", new java.lang.Integer (12));
    _methods.put ("equal", new java.lang.Integer (13));
    _methods.put ("destroy", new java.lang.Integer (14));
    _methods.put ("copy", new java.lang.Integer (15));
    _methods.put ("insert_boolean", new java.lang.Integer (16));
    _methods.put ("insert_octet", new java.lang.Integer (17));
    _methods.put ("insert_char", new java.lang.Integer (18));
    _methods.put ("insert_short", new java.lang.Integer (19));
    _methods.put ("insert_ushort", new java.lang.Integer (20));
    _methods.put ("insert_long", new java.lang.Integer (21));
    _methods.put ("insert_ulong", new java.lang.Integer (22));
    _methods.put ("insert_float", new java.lang.Integer (23));
    _methods.put ("insert_double", new java.lang.Integer (24));
    _methods.put ("insert_string", new java.lang.Integer (25));
    _methods.put ("insert_reference", new java.lang.Integer (26));
    _methods.put ("insert_typecode", new java.lang.Integer (27));
    _methods.put ("insert_longlong", new java.lang.Integer (28));
    _methods.put ("insert_ulonglong", new java.lang.Integer (29));
    _methods.put ("insert_wchar", new java.lang.Integer (30));
    _methods.put ("insert_wstring", new java.lang.Integer (31));
    _methods.put ("insert_any", new java.lang.Integer (32));
    _methods.put ("insert_dyn_any", new java.lang.Integer (33));
    _methods.put ("insert_val", new java.lang.Integer (34));
    _methods.put ("get_boolean", new java.lang.Integer (35));
    _methods.put ("get_octet", new java.lang.Integer (36));
    _methods.put ("get_char", new java.lang.Integer (37));
    _methods.put ("get_short", new java.lang.Integer (38));
    _methods.put ("get_ushort", new java.lang.Integer (39));
    _methods.put ("get_long", new java.lang.Integer (40));
    _methods.put ("get_ulong", new java.lang.Integer (41));
    _methods.put ("get_float", new java.lang.Integer (42));
    _methods.put ("get_double", new java.lang.Integer (43));
    _methods.put ("get_string", new java.lang.Integer (44));
    _methods.put ("get_reference", new java.lang.Integer (45));
    _methods.put ("get_typecode", new java.lang.Integer (46));
    _methods.put ("get_longlong", new java.lang.Integer (47));
    _methods.put ("get_ulonglong", new java.lang.Integer (48));
    _methods.put ("get_wchar", new java.lang.Integer (49));
    _methods.put ("get_wstring", new java.lang.Integer (50));
    _methods.put ("get_any", new java.lang.Integer (51));
    _methods.put ("get_dyn_any", new java.lang.Integer (52));
    _methods.put ("get_val", new java.lang.Integer (53));
    _methods.put ("seek", new java.lang.Integer (54));
    _methods.put ("rewind", new java.lang.Integer (55));
    _methods.put ("next", new java.lang.Integer (56));
    _methods.put ("component_count", new java.lang.Integer (57));
    _methods.put ("current_component", new java.lang.Integer (58));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    throw new org.omg.CORBA.BAD_OPERATION();
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/DynamicAny/DynUnion:1.0", 
    "IDL:omg.org/DynamicAny/DynAny:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public DynUnion _this() 
  {
    return DynUnionHelper.narrow(
    super._this_object());
  }

  public DynUnion _this(org.omg.CORBA.ORB orb) 
  {
    return DynUnionHelper.narrow(
    super._this_object(orb));
  }


} // class DynUnionPOA