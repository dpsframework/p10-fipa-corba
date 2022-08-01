package org.omg.Messaging;


/**
* org/omg/Messaging/SyncScopePolicyHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/Messaging.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

abstract public class SyncScopePolicyHelper
{
  private static String  _id = "IDL:omg.org/Messaging/SyncScopePolicy:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.Messaging.SyncScopePolicy that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.Messaging.SyncScopePolicy extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (org.omg.Messaging.SyncScopePolicyHelper.id (), "SyncScopePolicy");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.Messaging.SyncScopePolicy read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_SyncScopePolicyStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.Messaging.SyncScopePolicy value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static org.omg.Messaging.SyncScopePolicy narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.Messaging.SyncScopePolicy)
      return (org.omg.Messaging.SyncScopePolicy)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.omg.Messaging._SyncScopePolicyStub stub = new org.omg.Messaging._SyncScopePolicyStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static org.omg.Messaging.SyncScopePolicy unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.Messaging.SyncScopePolicy)
      return (org.omg.Messaging.SyncScopePolicy)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.omg.Messaging._SyncScopePolicyStub stub = new org.omg.Messaging._SyncScopePolicyStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
