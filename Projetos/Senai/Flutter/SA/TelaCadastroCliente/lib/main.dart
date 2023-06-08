import 'package:flutter/material.dart';
import 'package:tela_cadastro_cliente/botao.dart';
import 'package:tela_cadastro_cliente/input_texto.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatefulWidget {
  const MyApp({super.key});

  @override
  State<MyApp> createState() => _MyAppState();
}

final _formKey = GlobalKey<FormState>();
final nome = TextEditingController();
final telefone = TextEditingController();
final endereco = TextEditingController();

class _MyAppState extends State<MyApp> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: const Text(
            'Cadastro de cliente',
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
                        controller: nome,
                        msgerro: 'Digite seu nome',
                        senha: false,
                        texto: 'Nome',
                      ),
                    ),
                    Expanded(
                      child: Input_Texto(
                        controller: telefone,
                        msgerro: 'Digite o telefone',
                        senha: true,
                        texto: 'Telefone',
                      ),
                    )
                  ],
                ),
                Row(
                  children: [
                    Expanded(
                      child: Input_Texto(
                        controller: endereco,
                        msgerro: 'Digite o endereco',
                        senha: false,
                        texto: 'Endereço',
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
