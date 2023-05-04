import 'package:atividade18_04/util/sexo.dart';
import 'package:flutter/material.dart';

class RadioBut extends StatefulWidget {
  Sexo? controlador;
  RadioBut({super.key, this.controlador});

  @override
  State<RadioBut> createState() => _RadioState();
}

class _RadioState extends State<RadioBut> {
  @override
  Widget build(BuildContext context) {
    return Row(
      children: [
        Expanded(
          child: ListTile(
            title: const Text('Masculino'),
            leading: Radio<Sexo>(
              value: Sexo.masculino,
              groupValue: widget.controlador,
              onChanged: (Sexo? value) {
                setState(() {
                  widget.controlador = value!;
                });
              },
            ),
          ),
        ),
        Expanded(
          child: ListTile(
            title: const Text('Feminino'),
            leading: Radio<Sexo>(
              value: Sexo.feminino,
              groupValue: widget.controlador,
              onChanged: (Sexo? value) {
                setState(() {
                  widget.controlador = value!;
                });
              },
            ),
          ),
        ),
      ],
    );
  }
}
