package org.omg.CORBA;


/**
* org/omg/CORBA/EnumDefHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/russgold/projects/glassfish/glassfish-corba/target/checkout/omgapi/src/main/idl/ir.idl
* Friday, July 14, 2017 11:15:15 AM EDT
*/

abstract public class EnumDefHelper
{
  private static String  _id = "IDL:omg.org/CORBA/EnumDef:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.CORBA.EnumDef that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.CORBA.EnumDef extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (org.omg.CORBA.EnumDefHelper.id (), "EnumDef");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.CORBA.EnumDef read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_EnumDefStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.CORBA.EnumDef value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static org.omg.CORBA.EnumDef narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.CORBA.EnumDef)
      return (org.omg.CORBA.EnumDef)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.omg.CORBA._EnumDefStub stub = new org.omg.CORBA._EnumDefStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static org.omg.CORBA.EnumDef unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.CORBA.EnumDef)
      return (org.omg.CORBA.EnumDef)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.omg.CORBA._EnumDefStub stub = new org.omg.CORBA._EnumDefStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
