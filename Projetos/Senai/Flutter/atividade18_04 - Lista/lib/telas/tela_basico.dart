import 'package:atividade18_04/componentes/botao.dart';
import 'package:atividade18_04/componentes/input_texto.dart';
import 'package:atividade18_04/componentes/radio_botton.dart';
import 'package:atividade18_04/util/sexo.dart';
import 'package:flutter/material.dart';

class TelaBasico extends StatefulWidget {
  const TelaBasico({super.key});

  @override
  State<TelaBasico> createState() => _TelaBasicoState();
}

final _formKey = GlobalKey<FormState>();
final txtNome = TextEditingController();
final txtdata = TextEditingController();
Sexo Cbsexo = Sexo.masculino;

class _TelaBasicoState extends State<TelaBasico> {
  @override
  Widget build(BuildContext context) {
    RadioBut sexo = RadioBut(controlador: Cbsexo);
    return Scaffold(
      appBar: AppBar(
        title: const Text('Cadastro Basico'),
      ),
      body: Form(
        key: _formKey,
        child: Column(
          children: [
            Row(
              children: [
                Input_Texto(
                  controller: txtNome,
                  msgerro: 'Digite o nome',
                  senha: false,
                  texto: 'Nome',
                ),
                Input_Texto(
                  controller: txtdata,
                  msgerro: 'Digite a data',
                  senha: false,
                  texto: 'Data',
                )
              ],
            ),
            Row(
              children: [
                RadioBut(
                  controlador: sexo.controlador,
                ),
              ],
            ),
            Row(
              children: [
                Botao(
                  funcaoBotao: null,
                  tamanhoTexto: 30,
                  textoBotao: 'Próximo',
                ),
              ],
            )
          ],
        ),
      ),
    );
  }
}
