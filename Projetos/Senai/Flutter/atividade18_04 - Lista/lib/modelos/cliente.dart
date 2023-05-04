import 'package:atividade18_04/util/bandeira.dart';
import 'package:atividade18_04/util/sexo.dart';

class Cliente {
  int id;
  String nome;
  Sexo sexo;
  DateTime data;
  String rua;
  String bairro;
  String cidade;
  String cep;
  int numCartao;
  DateTime validade;
  int codSeguranca;
  Bandeira bandeira;

  Cliente(
      this.id,
      this.nome,
      this.sexo,
      this.data,
      this.rua,
      this.bairro,
      this.cidade,
      this.cep,
      this.numCartao,
      this.validade,
      this.codSeguranca,
      this.bandeira);
}
