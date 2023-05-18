import 'package:flutter/material.dart';

import 'package:prova_modelagem/components/button.dart';
import 'package:prova_modelagem/components/item_components.dart';
import 'package:prova_modelagem/components/simple_Text.dart';
import 'package:prova_modelagem/core/finance.dart';

class ViewStock extends StatefulWidget {
  const ViewStock({super.key});

  @override
  State<ViewStock> createState() => _ViewCoinState();
}

class _ViewCoinState extends State<ViewStock> {
  List <Finance> list = [];

  proximo() {

    Navigator.pushNamed(context, '/ViewBitcoin', arguments: list);
  }

  @override
  Widget build(BuildContext context) {
    List<Finance> args =
        ModalRoute.of(context)?.settings.arguments as List<Finance>;
    Finance finance = args[0];
    dynamic stock = finance.stock;
   list.add(finance);

    return Scaffold(
      appBar: AppBar(
          backgroundColor: Colors.green,
          title: const Text(
            'Finanças Hoje',
            style: TextStyle(fontSize: 30, color: Colors.white),
          )),
      body: Column(
        children: [
          const SimpleText(
              text: 'Ações', tamanho: 40, negrito: FontWeight.bold),
          Padding(
            padding: const EdgeInsets.all(30),
            child: Center(
              widthFactor: 500,
              child: Container(
                margin: EdgeInsets.all(100),
                padding: EdgeInsets.all(30),
                decoration: BoxDecoration(
                    border: Border.all(color: Colors.black),
                    borderRadius: BorderRadius.circular(30)),
                child: Column(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    const Row(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: [
                        Expanded(
                          child: SimpleText(
                            text: 'IBOVESPA',
                            tamanho: 20,
                            negrito: null,
                          ),
                        ),
                        Expanded(
                          child: SimpleText(
                            text: 'IFIX',
                            tamanho: 20,
                            negrito: null,
                          ),
                        )
                      ],
                    ),
                    Row(mainAxisAlignment: MainAxisAlignment.center, children: [
                      Expanded(
                        child: ItemComponent(
                          currenc: stock.ibovespa,
                          currencVar: stock.varIbovespa,
                        ),
                      ),
                      Expanded(
                          child: ItemComponent(
                        currenc: stock.ifix,
                        currencVar: stock.varIfix,
                      )),
                    ]),
                    const Row(
                      children: [
                        Expanded(
                          child: SimpleText(
                            text: 'NASDAQ',
                            tamanho: 20,
                            negrito: null,
                          ),
                        ),
                        Expanded(
                            child: SimpleText(
                          text: 'DOWJONES',
                          tamanho: 20,
                          negrito: null,
                        )),
                      ],
                    ),
                    Row(
                      children: [
                        Expanded(
                          child: ItemComponent(
                            currenc: stock.nasdaq,
                            currencVar: stock.varNasdaq,
                          ),
                        ),
                        Expanded(
                            child: ItemComponent(
                          currenc: stock.dowJones,
                          currencVar: stock.varDowJones,
                        ))
                      ],
                    ),
                    const Row(
                      children: [
                        Expanded(
                          child: SimpleText(
                            text: 'CAC',
                            tamanho: 20,
                            negrito: null,
                          ),
                        ),
                        Expanded(
                            child: SimpleText(
                          text: 'NIKKEI',
                          tamanho: 20,
                          negrito: null,
                        )),
                      ],
                    ),
                    Row(
                      children: [
                        Expanded(
                          child: ItemComponent(
                            currenc: stock.cac,
                            currencVar: stock.varCac,
                          ),
                        ),
                        Expanded(
                            child: ItemComponent(
                          currenc: stock.nikkei,
                          currencVar: stock.varNikkei,
                        ))
                      ],
                    ),
                    Row(
                      mainAxisAlignment: MainAxisAlignment.end,
                      children: [
                        Botao(
                          funcaoBotao: proximo,
                          tamanhoTexto: 20,
                          textoBotao: 'Ir para Bitcoin',
                        ),
                      ],
                    ),
                  ],
                ),
              ),
            ),
          ),
        ],
      ),
    );
  }
}
