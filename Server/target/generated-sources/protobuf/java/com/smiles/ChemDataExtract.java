// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChemDataExtract.proto

package com.smiles;

public final class ChemDataExtract {
  private ChemDataExtract() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_smiles_controller_Biblio_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_smiles_controller_Biblio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_smiles_controller_Molecule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_smiles_controller_Molecule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_smiles_controller_CreateMoleculeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_smiles_controller_CreateMoleculeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_smiles_controller_CreateMoleculeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_smiles_controller_CreateMoleculeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_smiles_controller_ReadMoleculeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_smiles_controller_ReadMoleculeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_smiles_controller_ReadMoleculeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_smiles_controller_ReadMoleculeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_smiles_controller_UpdateMoleculeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_smiles_controller_UpdateMoleculeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_smiles_controller_UpdateMoleculeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_smiles_controller_UpdateMoleculeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_smiles_controller_DeleteMoleculeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_smiles_controller_DeleteMoleculeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_smiles_controller_DeleteMoleculeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_smiles_controller_DeleteMoleculeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_smiles_controller_ListMoleculeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_smiles_controller_ListMoleculeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_smiles_controller_ListMoleculeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_smiles_controller_ListMoleculeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_smiles_controller_GetMoleculeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_smiles_controller_GetMoleculeRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025ChemDataExtract.proto\022\025com.smiles.cont" +
      "roller\032\034google/protobuf/struct.proto\"p\n\006" +
      "Biblio\022\020\n\003doi\030\002 \001(\tH\000\210\001\001\022\033\n\016published_da" +
      "te\030\003 \001(\tH\001\210\001\001\022\022\n\005title\030\004 \001(\tH\002\210\001\001B\006\n\004_do" +
      "iB\021\n\017_published_dateB\010\n\006_title\"Q\n\010Molecu" +
      "le\022\017\n\002id\030\001 \001(\tH\000\210\001\001\022-\n\006biblio\030\002 \001(\0132\035.co" +
      "m.smiles.controller.BiblioB\005\n\003_id\"J\n\025Cre" +
      "ateMoleculeRequest\0221\n\010molecule\030\001 \001(\0132\037.c" +
      "om.smiles.controller.Molecule\"K\n\026CreateM" +
      "oleculeResponse\0221\n\010molecule\030\001 \001(\0132\037.com." +
      "smiles.controller.Molecule\"!\n\023ReadMolecu" +
      "leRequest\022\n\n\002id\030\001 \001(\t\"I\n\024ReadMoleculeRes" +
      "ponse\0221\n\010molecule\030\001 \001(\0132\037.com.smiles.con" +
      "troller.Molecule\"J\n\025UpdateMoleculeReques" +
      "t\0221\n\010molecule\030\001 \001(\0132\037.com.smiles.control" +
      "ler.Molecule\"K\n\026UpdateMoleculeResponse\0221" +
      "\n\010molecule\030\001 \001(\0132\037.com.smiles.controller" +
      ".Molecule\",\n\025DeleteMoleculeRequest\022\023\n\013mo" +
      "lecule_id\030\001 \001(\t\"-\n\026DeleteMoleculeRespons" +
      "e\022\023\n\013molecule_id\030\001 \001(\t\"\025\n\023ListMoleculeRe" +
      "quest\"I\n\024ListMoleculeResponse\0221\n\010molecul" +
      "e\030\001 \001(\0132\037.com.smiles.controller.Molecule" +
      "\"\024\n\022GetMoleculeRequest2\217\005\n\017MoleculeServi" +
      "ce\022o\n\016CreateMolecule\022,.com.smiles.contro" +
      "ller.CreateMoleculeRequest\032-.com.smiles." +
      "controller.CreateMoleculeResponse\"\000\022i\n\014R" +
      "eadMolecule\022*.com.smiles.controller.Read" +
      "MoleculeRequest\032+.com.smiles.controller." +
      "ReadMoleculeResponse\"\000\022o\n\016UpdateMolecule" +
      "\022,.com.smiles.controller.UpdateMoleculeR" +
      "equest\032-.com.smiles.controller.UpdateMol" +
      "eculeResponse\"\000\022o\n\016DeleteMolecule\022,.com." +
      "smiles.controller.DeleteMoleculeRequest\032" +
      "-.com.smiles.controller.DeleteMoleculeRe" +
      "sponse\"\000\022i\n\014ListMolecule\022*.com.smiles.co" +
      "ntroller.ListMoleculeRequest\032+.com.smile" +
      "s.controller.ListMoleculeResponse\"\000\022S\n\013G" +
      "etMolecule\022).com.smiles.controller.GetMo" +
      "leculeRequest\032\027.google.protobuf.Struct\"\000" +
      "B\016\n\ncom.smilesP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_com_smiles_controller_Biblio_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_smiles_controller_Biblio_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_smiles_controller_Biblio_descriptor,
        new java.lang.String[] { "Doi", "PublishedDate", "Title", "Doi", "PublishedDate", "Title", });
    internal_static_com_smiles_controller_Molecule_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_smiles_controller_Molecule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_smiles_controller_Molecule_descriptor,
        new java.lang.String[] { "Id", "Biblio", "Id", });
    internal_static_com_smiles_controller_CreateMoleculeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_smiles_controller_CreateMoleculeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_smiles_controller_CreateMoleculeRequest_descriptor,
        new java.lang.String[] { "Molecule", });
    internal_static_com_smiles_controller_CreateMoleculeResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_smiles_controller_CreateMoleculeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_smiles_controller_CreateMoleculeResponse_descriptor,
        new java.lang.String[] { "Molecule", });
    internal_static_com_smiles_controller_ReadMoleculeRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_smiles_controller_ReadMoleculeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_smiles_controller_ReadMoleculeRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_smiles_controller_ReadMoleculeResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_smiles_controller_ReadMoleculeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_smiles_controller_ReadMoleculeResponse_descriptor,
        new java.lang.String[] { "Molecule", });
    internal_static_com_smiles_controller_UpdateMoleculeRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_smiles_controller_UpdateMoleculeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_smiles_controller_UpdateMoleculeRequest_descriptor,
        new java.lang.String[] { "Molecule", });
    internal_static_com_smiles_controller_UpdateMoleculeResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_smiles_controller_UpdateMoleculeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_smiles_controller_UpdateMoleculeResponse_descriptor,
        new java.lang.String[] { "Molecule", });
    internal_static_com_smiles_controller_DeleteMoleculeRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_com_smiles_controller_DeleteMoleculeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_smiles_controller_DeleteMoleculeRequest_descriptor,
        new java.lang.String[] { "MoleculeId", });
    internal_static_com_smiles_controller_DeleteMoleculeResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_com_smiles_controller_DeleteMoleculeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_smiles_controller_DeleteMoleculeResponse_descriptor,
        new java.lang.String[] { "MoleculeId", });
    internal_static_com_smiles_controller_ListMoleculeRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_com_smiles_controller_ListMoleculeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_smiles_controller_ListMoleculeRequest_descriptor,
        new java.lang.String[] { });
    internal_static_com_smiles_controller_ListMoleculeResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_com_smiles_controller_ListMoleculeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_smiles_controller_ListMoleculeResponse_descriptor,
        new java.lang.String[] { "Molecule", });
    internal_static_com_smiles_controller_GetMoleculeRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_com_smiles_controller_GetMoleculeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_smiles_controller_GetMoleculeRequest_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
