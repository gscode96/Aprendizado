import 'package:flutter/material.dart';
import 'package:flutter/src/widgets/framework.dart';

class Botao extends StatefulWidget {
  const Botao({
    super.key,
    this.funcaoBotao,
    this.tamanhoTexto,
    this.textoBotao,
  });

  final textoBotao;
  final funcaoBotao;
  final tamanhoTexto;

  @override
  State<Botao> createState() => _BotaoState();
}

class _BotaoState extends State<Botao> {
  @override
  Widget build(BuildContext context) {
    return Expanded(
      child: Padding(
        padding: const EdgeInsets.all(30),
        child: ElevatedButton(
          onPressed: widget.funcaoBotao,
          style: ElevatedButton.styleFrom(
            backgroundColor: Colors.green,
            elevation: 30,
            shape: RoundedRectangleBorder(
              borderRadius: BorderRadius.circular(10),
            ),
            minimumSize: const Size(40, 60),
            padding: EdgeInsets.all(10),
          ),
          child: Text(widget.textoBotao),
        ),
      ),
    );
  }
}
