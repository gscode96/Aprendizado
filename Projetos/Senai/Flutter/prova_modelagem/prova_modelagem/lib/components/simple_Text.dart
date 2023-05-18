import 'package:flutter/material.dart';
import 'package:flutter/src/widgets/framework.dart';
import 'package:flutter/src/widgets/placeholder.dart';

class SimpleText extends StatefulWidget {
  const SimpleText({super.key, this.text, this.tamanho, this.negrito});
  final text;
  final tamanho;
  final negrito;

  @override
  State<SimpleText> createState() => _SimpleTextState();
}

class _SimpleTextState extends State<SimpleText> {
  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(5),
      child: Text(
        widget.text,
        style: TextStyle(
            fontSize: widget.tamanho, color: Colors.black, fontWeight: widget.negrito),
      ),
    );
  }
}
