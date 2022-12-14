# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ChemDataExtract.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x15\x43hemDataExtract.proto\x12\x15\x63om.smiles.controller\x1a\x1cgoogle/protobuf/struct.proto\"p\n\x06\x42iblio\x12\x10\n\x03\x64oi\x18\x02 \x01(\tH\x00\x88\x01\x01\x12\x1b\n\x0epublished_date\x18\x03 \x01(\tH\x01\x88\x01\x01\x12\x12\n\x05title\x18\x04 \x01(\tH\x02\x88\x01\x01\x42\x06\n\x04_doiB\x11\n\x0f_published_dateB\x08\n\x06_title\"Q\n\x08Molecule\x12\x0f\n\x02id\x18\x01 \x01(\tH\x00\x88\x01\x01\x12-\n\x06\x62iblio\x18\x02 \x01(\x0b\x32\x1d.com.smiles.controller.BiblioB\x05\n\x03_id\"J\n\x15\x43reateMoleculeRequest\x12\x31\n\x08molecule\x18\x01 \x01(\x0b\x32\x1f.com.smiles.controller.Molecule\"K\n\x16\x43reateMoleculeResponse\x12\x31\n\x08molecule\x18\x01 \x01(\x0b\x32\x1f.com.smiles.controller.Molecule\"!\n\x13ReadMoleculeRequest\x12\n\n\x02id\x18\x01 \x01(\t\"I\n\x14ReadMoleculeResponse\x12\x31\n\x08molecule\x18\x01 \x01(\x0b\x32\x1f.com.smiles.controller.Molecule\"J\n\x15UpdateMoleculeRequest\x12\x31\n\x08molecule\x18\x01 \x01(\x0b\x32\x1f.com.smiles.controller.Molecule\"K\n\x16UpdateMoleculeResponse\x12\x31\n\x08molecule\x18\x01 \x01(\x0b\x32\x1f.com.smiles.controller.Molecule\",\n\x15\x44\x65leteMoleculeRequest\x12\x13\n\x0bmolecule_id\x18\x01 \x01(\t\"-\n\x16\x44\x65leteMoleculeResponse\x12\x13\n\x0bmolecule_id\x18\x01 \x01(\t\"\x15\n\x13ListMoleculeRequest\"I\n\x14ListMoleculeResponse\x12\x31\n\x08molecule\x18\x01 \x01(\x0b\x32\x1f.com.smiles.controller.Molecule\"\x14\n\x12GetMoleculeRequest2\x8f\x05\n\x0fMoleculeService\x12o\n\x0e\x43reateMolecule\x12,.com.smiles.controller.CreateMoleculeRequest\x1a-.com.smiles.controller.CreateMoleculeResponse\"\x00\x12i\n\x0cReadMolecule\x12*.com.smiles.controller.ReadMoleculeRequest\x1a+.com.smiles.controller.ReadMoleculeResponse\"\x00\x12o\n\x0eUpdateMolecule\x12,.com.smiles.controller.UpdateMoleculeRequest\x1a-.com.smiles.controller.UpdateMoleculeResponse\"\x00\x12o\n\x0e\x44\x65leteMolecule\x12,.com.smiles.controller.DeleteMoleculeRequest\x1a-.com.smiles.controller.DeleteMoleculeResponse\"\x00\x12i\n\x0cListMolecule\x12*.com.smiles.controller.ListMoleculeRequest\x1a+.com.smiles.controller.ListMoleculeResponse\"\x00\x12S\n\x0bGetMolecule\x12).com.smiles.controller.GetMoleculeRequest\x1a\x17.google.protobuf.Struct\"\x00\x62\x06proto3')



_BIBLIO = DESCRIPTOR.message_types_by_name['Biblio']
_MOLECULE = DESCRIPTOR.message_types_by_name['Molecule']
_CREATEMOLECULEREQUEST = DESCRIPTOR.message_types_by_name['CreateMoleculeRequest']
_CREATEMOLECULERESPONSE = DESCRIPTOR.message_types_by_name['CreateMoleculeResponse']
_READMOLECULEREQUEST = DESCRIPTOR.message_types_by_name['ReadMoleculeRequest']
_READMOLECULERESPONSE = DESCRIPTOR.message_types_by_name['ReadMoleculeResponse']
_UPDATEMOLECULEREQUEST = DESCRIPTOR.message_types_by_name['UpdateMoleculeRequest']
_UPDATEMOLECULERESPONSE = DESCRIPTOR.message_types_by_name['UpdateMoleculeResponse']
_DELETEMOLECULEREQUEST = DESCRIPTOR.message_types_by_name['DeleteMoleculeRequest']
_DELETEMOLECULERESPONSE = DESCRIPTOR.message_types_by_name['DeleteMoleculeResponse']
_LISTMOLECULEREQUEST = DESCRIPTOR.message_types_by_name['ListMoleculeRequest']
_LISTMOLECULERESPONSE = DESCRIPTOR.message_types_by_name['ListMoleculeResponse']
_GETMOLECULEREQUEST = DESCRIPTOR.message_types_by_name['GetMoleculeRequest']
Biblio = _reflection.GeneratedProtocolMessageType('Biblio', (_message.Message,), {
  'DESCRIPTOR' : _BIBLIO,
  '__module__' : 'ChemDataExtract_pb2'
  # @@protoc_insertion_point(class_scope:com.smiles.controller.Biblio)
  })
_sym_db.RegisterMessage(Biblio)

Molecule = _reflection.GeneratedProtocolMessageType('Molecule', (_message.Message,), {
  'DESCRIPTOR' : _MOLECULE,
  '__module__' : 'ChemDataExtract_pb2'
  # @@protoc_insertion_point(class_scope:com.smiles.controller.Molecule)
  })
_sym_db.RegisterMessage(Molecule)

CreateMoleculeRequest = _reflection.GeneratedProtocolMessageType('CreateMoleculeRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATEMOLECULEREQUEST,
  '__module__' : 'ChemDataExtract_pb2'
  # @@protoc_insertion_point(class_scope:com.smiles.controller.CreateMoleculeRequest)
  })
_sym_db.RegisterMessage(CreateMoleculeRequest)

CreateMoleculeResponse = _reflection.GeneratedProtocolMessageType('CreateMoleculeResponse', (_message.Message,), {
  'DESCRIPTOR' : _CREATEMOLECULERESPONSE,
  '__module__' : 'ChemDataExtract_pb2'
  # @@protoc_insertion_point(class_scope:com.smiles.controller.CreateMoleculeResponse)
  })
_sym_db.RegisterMessage(CreateMoleculeResponse)

ReadMoleculeRequest = _reflection.GeneratedProtocolMessageType('ReadMoleculeRequest', (_message.Message,), {
  'DESCRIPTOR' : _READMOLECULEREQUEST,
  '__module__' : 'ChemDataExtract_pb2'
  # @@protoc_insertion_point(class_scope:com.smiles.controller.ReadMoleculeRequest)
  })
_sym_db.RegisterMessage(ReadMoleculeRequest)

ReadMoleculeResponse = _reflection.GeneratedProtocolMessageType('ReadMoleculeResponse', (_message.Message,), {
  'DESCRIPTOR' : _READMOLECULERESPONSE,
  '__module__' : 'ChemDataExtract_pb2'
  # @@protoc_insertion_point(class_scope:com.smiles.controller.ReadMoleculeResponse)
  })
_sym_db.RegisterMessage(ReadMoleculeResponse)

UpdateMoleculeRequest = _reflection.GeneratedProtocolMessageType('UpdateMoleculeRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEMOLECULEREQUEST,
  '__module__' : 'ChemDataExtract_pb2'
  # @@protoc_insertion_point(class_scope:com.smiles.controller.UpdateMoleculeRequest)
  })
_sym_db.RegisterMessage(UpdateMoleculeRequest)

UpdateMoleculeResponse = _reflection.GeneratedProtocolMessageType('UpdateMoleculeResponse', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEMOLECULERESPONSE,
  '__module__' : 'ChemDataExtract_pb2'
  # @@protoc_insertion_point(class_scope:com.smiles.controller.UpdateMoleculeResponse)
  })
_sym_db.RegisterMessage(UpdateMoleculeResponse)

DeleteMoleculeRequest = _reflection.GeneratedProtocolMessageType('DeleteMoleculeRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEMOLECULEREQUEST,
  '__module__' : 'ChemDataExtract_pb2'
  # @@protoc_insertion_point(class_scope:com.smiles.controller.DeleteMoleculeRequest)
  })
_sym_db.RegisterMessage(DeleteMoleculeRequest)

DeleteMoleculeResponse = _reflection.GeneratedProtocolMessageType('DeleteMoleculeResponse', (_message.Message,), {
  'DESCRIPTOR' : _DELETEMOLECULERESPONSE,
  '__module__' : 'ChemDataExtract_pb2'
  # @@protoc_insertion_point(class_scope:com.smiles.controller.DeleteMoleculeResponse)
  })
_sym_db.RegisterMessage(DeleteMoleculeResponse)

ListMoleculeRequest = _reflection.GeneratedProtocolMessageType('ListMoleculeRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTMOLECULEREQUEST,
  '__module__' : 'ChemDataExtract_pb2'
  # @@protoc_insertion_point(class_scope:com.smiles.controller.ListMoleculeRequest)
  })
_sym_db.RegisterMessage(ListMoleculeRequest)

ListMoleculeResponse = _reflection.GeneratedProtocolMessageType('ListMoleculeResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTMOLECULERESPONSE,
  '__module__' : 'ChemDataExtract_pb2'
  # @@protoc_insertion_point(class_scope:com.smiles.controller.ListMoleculeResponse)
  })
_sym_db.RegisterMessage(ListMoleculeResponse)

GetMoleculeRequest = _reflection.GeneratedProtocolMessageType('GetMoleculeRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETMOLECULEREQUEST,
  '__module__' : 'ChemDataExtract_pb2'
  # @@protoc_insertion_point(class_scope:com.smiles.controller.GetMoleculeRequest)
  })
_sym_db.RegisterMessage(GetMoleculeRequest)

_MOLECULESERVICE = DESCRIPTOR.services_by_name['MoleculeService']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  _BIBLIO._serialized_start=78
  _BIBLIO._serialized_end=190
  _MOLECULE._serialized_start=192
  _MOLECULE._serialized_end=273
  _CREATEMOLECULEREQUEST._serialized_start=275
  _CREATEMOLECULEREQUEST._serialized_end=349
  _CREATEMOLECULERESPONSE._serialized_start=351
  _CREATEMOLECULERESPONSE._serialized_end=426
  _READMOLECULEREQUEST._serialized_start=428
  _READMOLECULEREQUEST._serialized_end=461
  _READMOLECULERESPONSE._serialized_start=463
  _READMOLECULERESPONSE._serialized_end=536
  _UPDATEMOLECULEREQUEST._serialized_start=538
  _UPDATEMOLECULEREQUEST._serialized_end=612
  _UPDATEMOLECULERESPONSE._serialized_start=614
  _UPDATEMOLECULERESPONSE._serialized_end=689
  _DELETEMOLECULEREQUEST._serialized_start=691
  _DELETEMOLECULEREQUEST._serialized_end=735
  _DELETEMOLECULERESPONSE._serialized_start=737
  _DELETEMOLECULERESPONSE._serialized_end=782
  _LISTMOLECULEREQUEST._serialized_start=784
  _LISTMOLECULEREQUEST._serialized_end=805
  _LISTMOLECULERESPONSE._serialized_start=807
  _LISTMOLECULERESPONSE._serialized_end=880
  _GETMOLECULEREQUEST._serialized_start=882
  _GETMOLECULEREQUEST._serialized_end=902
  _MOLECULESERVICE._serialized_start=905
  _MOLECULESERVICE._serialized_end=1560
# @@protoc_insertion_point(module_scope)
