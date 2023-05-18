import 'dart:convert';

import 'package:flutter/material.dart';

import 'package:http/http.dart';
import 'package:prova_modelagem/components/button.dart';
import 'package:prova_modelagem/components/item_components.dart';
import 'package:prova_modelagem/components/simple_Text.dart';
import 'package:prova_modelagem/core/bitcoin.dart';
import 'package:prova_modelagem/core/curence.dart';
import 'package:prova_modelagem/core/finance.dart';
import 'package:prova_modelagem/core/stock.dart';

class ViewCoin extends StatefulWidget {
  const ViewCoin({super.key});

  @override
  State<ViewCoin> createState() => _ViewCoinState();
}

class _ViewCoinState extends State<ViewCoin> {
  double txtDollar = 0.0;
  double txtVarDollar = 0.0;
  double txtEuro = 0.0;
  double txtVarEuro = 0.0;
  double txtYen = 0.0;
  double txtVarYen = 0.0;
  double txtPeso = 0.0;
  double txtVarPeso = 0.0;
  List<Finance>? list = [];

  getFinance() async {
    const String urlViaHbg =
        'https://api.hgbrasil.com/finance?format=json-cors&key=0e7b952e';
    Response respost = await get(Uri.parse(urlViaHbg));
    Map address = jsonDecode(respost.body);

    txtDollar = address['results']['currencies']['USD']['buy'];
    txtVarDollar = address['results']['currencies']['USD']['variation'];
    txtEuro = address['results']['currencies']['EUR']['buy'];
    txtVarEuro = address['results']['currencies']['EUR']['variation'];
    txtYen = address['results']['currencies']['JPY']['buy'];
    txtVarYen = address['results']['currencies']['JPY']['variation'];
    txtPeso = address['results']['currencies']['ARS']['buy'];
    txtVarPeso = address['results']['currencies']['ARS']['variation'];

    dynamic ibovespa = address['results']['stocks']['IBOVESPA']['points'];
    dynamic varIbovespa = address['results']['stocks']['IBOVESPA']['variation'];
    dynamic ifix = address['results']['stocks']['IFIX']['points'];
    dynamic varIfix = address['results']['stocks']['IFIX']['variation'];
    dynamic nasdaq = address['results']['stocks']['NASDAQ']['points'];
    dynamic varNasdaq = address['results']['stocks']['NASDAQ']['variation'];
    dynamic dowJones = address['results']['stocks']['DOWJONES']['points'];
    dynamic varDowJones = address['results']['stocks']['DOWJONES']['variation'];
    dynamic cac = address['results']['stocks']['CAC']['points'];
    dynamic varCac = address['results']['stocks']['CAC']['variation'];
    dynamic nikkei = address['results']['stocks']['NIKKEI']['points'];
    dynamic varNikkei = address['results']['stocks']['NIKKEI']['variation'];

    dynamic blockchain =
        address['results']['bitcoin']['blockchain_info']['buy'];
    dynamic varBlockchain =
        address['results']['bitcoin']['blockchain_info']['variation'];
    dynamic coinbase = address['results']['bitcoin']['coinbase']['last'];
    dynamic varCoinbase =
        address['results']['bitcoin']['coinbase']['variation'];
    dynamic bitstamp = address['results']['bitcoin']['bitstamp']['buy'];
    dynamic varBitstamp =
        address['results']['bitcoin']['bitstamp']['variation'];
    dynamic foxbit = address['results']['bitcoin']['foxbit']['last'];
    dynamic varFoxbit = address['results']['bitcoin']['foxbit']['variation'];
    dynamic mbitcoin = address['results']['bitcoin']['mercadobitcoin']['buy'];
    dynamic varBitcoin =
        address['results']['bitcoin']['mercadobitcoin']['variation'];

    Stock stock = new Stock(ibovespa, varIbovespa, ifix, varIfix, nasdaq,
        varNasdaq, dowJones, varDowJones, cac, varCac, nikkei, varNikkei);

    Currenc currenc = new Currenc(txtDollar, txtVarDollar, txtEuro, txtVarEuro,
        txtPeso, txtVarPeso, txtYen, txtVarYen);

    Bitcoin bitcoin = new Bitcoin(
        blockchain,
        varBlockchain,
        coinbase,
        varCoinbase,
        bitstamp,
        varBitstamp,
        foxbit,
        varFoxbit,
        mbitcoin,
        varBitcoin);
    Finance finance = new Finance(currenc, stock, bitcoin);
    list!.add(finance);

    setState(() {});
  }

  proximo() {
    Navigator.pushNamed(context, '/ViewStock', arguments: list);
  }

  @override
  Widget build(BuildContext context) {
    getFinance();
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
              text: 'Moedas', tamanho: 40, negrito: FontWeight.bold),
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
                            text: 'Dólar',
                            tamanho: 20,
                            negrito: null,
                          ),
                        ),
                        Expanded(
                          child: SimpleText(
                            text: 'Euro',
                            tamanho: 20,
                            negrito: null,
                          ),
                        )
                      ],
                    ),
                    Row(mainAxisAlignment: MainAxisAlignment.center, children: [
                      Expanded(
                        child: ItemComponent(
                          currenc: txtDollar,
                          currencVar: txtVarDollar,
                        ),
                      ),
                      Expanded(
                          child: ItemComponent(
                        currenc: txtEuro,
                        currencVar: txtVarEuro,
                      )),
                    ]),
                    const Row(
                      children: [
                        Expanded(
                          child: SimpleText(
                            text: 'Peso',
                            tamanho: 20,
                            negrito: null,
                          ),
                        ),
                        Expanded(
                            child: SimpleText(
                          text: 'Yen',
                          tamanho: 20,
                          negrito: null,
                        )),
                      ],
                    ),
                    Row(
                      children: [
                        Expanded(
                          child: ItemComponent(
                            currenc: txtPeso,
                            currencVar: txtVarPeso,
                          ),
                        ),
                        Expanded(
                            child: ItemComponent(
                          currenc: txtYen,
                          currencVar: txtVarYen,
                        ))
                      ],
                    ),
                    Row(
                      mainAxisAlignment: MainAxisAlignment.end,
                      children: [
                        Botao(
                        funcaoBotao: proximo,
                        tamanhoTexto: 20,
                        textoBotao: 'Ir para ações',
                        )
                       
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
