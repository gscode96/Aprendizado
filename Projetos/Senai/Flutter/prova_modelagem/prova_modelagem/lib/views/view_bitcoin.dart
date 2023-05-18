import 'package:flutter/material.dart';

import 'package:prova_modelagem/components/button.dart';
import 'package:prova_modelagem/components/item_components.dart';
import 'package:prova_modelagem/components/simple_Text.dart';
import 'package:prova_modelagem/core/finance.dart';

class ViewBitCoin extends StatefulWidget {
  const ViewBitCoin({super.key});

  @override
  State<ViewBitCoin> createState() => _ViewCoinState();
}

class _ViewCoinState extends State<ViewBitCoin> {
  proximo() {
    Navigator.pushNamed(context, '/ViewCoin');
  }

  @override
  Widget build(BuildContext context) {
    List<Finance> args =
        ModalRoute.of(context)?.settings.arguments as List<Finance>;
    Finance finance = args[0];
    dynamic bitcoin = finance.bitcoin;

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
              text: 'BitCoin', tamanho: 40, negrito: FontWeight.bold),
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
                            text: 'Blockchain.info',
                            tamanho: 20,
                            negrito: null,
                          ),
                        ),
                        Expanded(
                          child: SimpleText(
                            text: 'Coinbase',
                            tamanho: 20,
                            negrito: null,
                          ),
                        )
                      ],
                    ),
                    Row(mainAxisAlignment: MainAxisAlignment.center, children: [
                      Expanded(
                        child: ItemComponent(
                          currenc: finance.bitcoin.blockChain,
                          currencVar: finance.bitcoin.varblockChain,
                        ),
                      ),
                      Expanded(
                          child: ItemComponent(
                        currenc: bitcoin.coinbase,
                        currencVar: bitcoin.varCoinbase,
                      )),
                    ]),
                    const Row(
                      children: [
                        Expanded(
                          child: SimpleText(
                            text: 'BitStamp',
                            tamanho: 20,
                            negrito: null,
                          ),
                        ),
                        Expanded(
                            child: SimpleText(
                          text: 'FoxBit',
                          tamanho: 20,
                          negrito: null,
                        )),
                      ],
                    ),
                    Row(
                      children: [
                        Expanded(
                          child: ItemComponent(
                            currenc: finance.bitcoin.bitStamp,
                            currencVar: finance.bitcoin.varBitStamp,
                          ),
                        ),
                        Expanded(
                            child: ItemComponent(
                          currenc: finance.bitcoin.foxBit,
                          currencVar: finance.bitcoin.varFoxbit,
                        ))
                      ],
                    ),
                    const Row(
                      children: [
                        Expanded(
                          child: SimpleText(
                            text: 'Mercado Bitcoin',
                            tamanho: 20,
                            negrito: null,
                          ),
                        ),
                      ],
                    ),
                    Row(
                      children: [
                        Expanded(
                          child: ItemComponent(
                              currenc: finance.bitcoin.bitcoin,
                              currencVar: finance.bitcoin.varBitcoin),
                        ),
                      ],
                    ),
                    Row(
                      mainAxisAlignment: MainAxisAlignment.end,
                      children: [
                        Botao(
                          funcaoBotao: proximo,
                          tamanhoTexto: 20,
                          textoBotao: 'Página Principal',
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
