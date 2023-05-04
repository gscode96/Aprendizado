import 'package:atividade18_04/componentes/botao.dart';
import 'package:flutter/material.dart';
import 'package:flutter/src/widgets/framework.dart';
import 'package:flutter/src/widgets/placeholder.dart';

class TelaInicio extends StatefulWidget {
  const TelaInicio({super.key});

  @override
  State<TelaInicio> createState() => _TelaInicioState();
}

class _TelaInicioState extends State<TelaInicio> {
  @override
  Widget build(BuildContext context) {
    Proximo() {
      Navigator.pushNamed(context, '/TelaBasico');
    }

    Lista() {
      Navigator.pushNamed(context, '/TelaLista');
    }

    return Scaffold(
      body: Padding(
        padding: const EdgeInsets.all(30),
        child: Expanded(
            child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Botao(
                  funcaoBotao: Proximo,
                  tamanhoTexto: 30,
                  textoBotao: 'Cadastrar',
                ),
              ],
            ),
            Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Botao(
                  funcaoBotao: Lista,
                  tamanhoTexto: 30,
                  textoBotao: 'Listar',
                ),
              ],
            ),
          ],
        )),
      ),
    );
  }
}
