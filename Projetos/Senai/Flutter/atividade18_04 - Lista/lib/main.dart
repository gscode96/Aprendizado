import 'package:atividade18_04/telas/tela_basico.dart';
import 'package:atividade18_04/telas/tela_inicio.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatefulWidget {
  const MyApp({super.key});

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      initialRoute: '/TelaInicio',
      routes: {
        '/TelaInicio': (context) => const TelaInicio(),
        '/TelaBasico': (context) => const TelaBasico(),
      },
    );
  }
}
