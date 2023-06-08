import 'package:flutter/material.dart';
import 'package:tela_cadastro_quarto/botao.dart';
import 'package:tela_cadastro_quarto/input_texto.dart';

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
            'Cadastro de Quartos',
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
                        msgerro: 'Digite o valor da diaria',
                        senha: false,
                        texto: 'Valor',
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
                          textoBotao: 'Salvar'),
                    ),
                    Expanded(
                      child: Botao(
                          funcaoBotao: () {},
                          tamanhoTexto: 20,
                          textoBotao: 'Pesquisar'),
                    ),
                    Expanded(
                      child: Botao(
                          funcaoBotao: () {},
                          tamanhoTexto: 20,
                          textoBotao: 'Alterar'),
                    ),
                    Expanded(
                      child: Botao(
                          funcaoBotao: () {},
                          tamanhoTexto: 20,
                          textoBotao: 'Deletar'),
                    ),
                  ],
                ),
              ],
            )),
      ),
    );
  }
}
