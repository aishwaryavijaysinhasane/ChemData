// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChemDataExtract.proto

package com.smiles;

public interface MoleculeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.smiles.controller.Molecule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>optional string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>optional string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>.com.smiles.controller.Biblio biblio = 2;</code>
   * @return Whether the biblio field is set.
   */
  boolean hasBiblio();
  /**
   * <code>.com.smiles.controller.Biblio biblio = 2;</code>
   * @return The biblio.
   */
  com.smiles.Biblio getBiblio();
  /**
   * <code>.com.smiles.controller.Biblio biblio = 2;</code>
   */
  com.smiles.BiblioOrBuilder getBiblioOrBuilder();
}