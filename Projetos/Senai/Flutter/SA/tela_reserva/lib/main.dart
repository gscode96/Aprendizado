import 'package:flutter/material.dart';
import 'package:tela_reserva/botao.dart';
import 'package:tela_reserva/input_texto.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatefulWidget {
  const MyApp({super.key});

  @override
  State<MyApp> createState() => _MyAppState();
}

final _formKey = GlobalKey<FormState>();
final numero = TextEditingController();
final tipo = TextEditingController();
final valorDiaria = TextEditingController();

class _MyAppState extends State<MyApp> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: const Text(
            'Cadastro de reserva',
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
                        controller: numero,
                        msgerro: 'Digite o numero',
                        senha: false,
                        texto: 'Numero',
                      ),
                    ),
                    Expanded(
                      child: Input_Texto(
                        controller: tipo,
                        msgerro: 'Digite o tipo',
                        senha: false,
                        texto: 'Tipo de quarto',
                      ),
                    )
                  ],
                ),
                Row(
                  children: [
                    Expanded(
                      child: Input_Texto(
                        controller: valorDiaria,
                        msgerro: 'Digite o nome ou id do cliente',
                        senha: false,
                        texto: 'Cliente',
                      ),
                    ),
                  ],
                ),
                Row(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    Expanded(
                      child: Botao(
                          funcaoBotao: () {},
                          tamanhoTexto: 20,
                          textoBotao: 'Reservar'),
                    ),
                  ],
                ),
              ],
            )),
      ),
    );
  }
}
