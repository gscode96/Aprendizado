import 'package:flutter/material.dart';
import 'package:telas_sa/botao.dart';
import 'package:telas_sa/input_texto.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatefulWidget {
  const MyApp({super.key});

  @override
  State<MyApp> createState() => _MyAppState();
}

final _formKey = GlobalKey<FormState>();
final login = TextEditingController();
final senha = TextEditingController();

class _MyAppState extends State<MyApp> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: const Text(
            'Login',
          ),
          centerTitle: true,
        ),
        body: Form(
            key: _formKey,
            child: Column(
              children: [
                Row(
                  children: [
                    Expanded(
                      child: Input_Texto(
                        controller: login,
                        msgerro: 'Login invalido',
                        senha: false,
                        texto: 'Digite seu login',
                      ),
                    ),
                    Expanded(
                      child: Input_Texto(
                        controller: senha,
                        msgerro: 'Senha invalida',
                        senha: true,
                        texto: 'Digite sua senha',
                      ),
                    )
                  ],
                ),
                Row(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    Expanded(
                      child: Botao(
                          funcaoBotao: () {},
                          tamanhoTexto: 20,
                          textoBotao: 'Logar'),
                    ),
                    Expanded(
                      child: Botao(
                          funcaoBotao: () {},
                          tamanhoTexto: 20,
                          textoBotao: 'Ja tenho cadastro'),
                    ),
                  ],
                ),
              ],
            )),
      ),
    );
  }
}
